from html.entities import name2codepoint
from numpy import isin
from MyGrammerParser import MyGrammerParser
from MyGrammerVisitor import MyGrammerVisitor
from MusicNodes import *
from music21 import *
import string
import copy


def appendInstrument(part, instru):
    switcher = {
        "clarinet": instrument.Clarinet(),
        "flute": instrument.Flute(),
        "organ": instrument.Organ(),
        "piano": instrument.Piano(),
        "recorder": instrument.Recorder(),
        "saxophone": instrument.Saxophone(),
        "trumpet": instrument.Trumpet(),
        "guitar": instrument.Guitar(),
        "acoustic guitar": instrument.AcousticGuitar(),
        "electric guitar": instrument.ElectricGuitar(),
        "ukulele": instrument.Ukulele(),
        "violin": instrument.Violin(),
        "xylophone": instrument.Xylophone(),
    }
    part.append(switcher[instru.getText().lower()])

def createChord(note_arr, val):
    arr = []
    for num, pitch, accidental in note_arr:
        if accidental == "_":
            accidental = "-"
        elif accidental == "None":
            accidental = ""
        arr.append(str(pitch) + str(accidental) + str(num))
    print("chord arr", arr)
    new_chord = chord.Chord(arr)
    if val == "eighth":
        d = duration.Duration(type="eighth")
        new_chord.quarterLength = d.quarterLength
    if val == "sixteenth":
        new_chord.quarterLength = 0.25
    if val == "thirtysecond":
        new_chord.quarterLength = 0.125
    if val == "full":
        d = duration.Duration(type="whole")
        new_chord.quarterLength = d.quarterLength
    if val == "double":
        new_chord.quarterLength = 2.0
    if val == "half":
        d = duration.Duration(type="half")
        new_chord.quarterLength = d.quarterLength
    return new_chord


def printExprNote(note: ExprNoteNode):
    print(note.note_value, note.pitch, note.num, note.dotted)


def printExprRest(note: ExprRestNode):
    print(note.note_value, note.dotted)


def createNote(num, accidental, pitch, val, dotted):
    if accidental == "_":
        accidental = "-"
    elif accidental == "None":
        accidental = ""
    test = pitch + accidental + num
    print("create note", test)
    m_note = note.Note(pitch + accidental + num)
    #update note duration
    if val == "eighth":
        d = duration.Duration(type="eighth")
        m_note.quarterLength = d.quarterLength
    if val == "sixteenth":
        m_note.quarterLength = 0.25
    if val == "thirtysecond":
        m_note.quarterLength = 0.125
    if val == "full":
        d = duration.Duration(type="whole")
        m_note.quarterLength = d.quarterLength
    if val == "double":
        m_note.quarterLength = 2.0
    if val == "half":
        d = duration.Duration(type="half")
        m_note.quarterLength = d.quarterLength
    if dotted:
        m_note.quarterLength = m_note.quarterLength + (m_note.quarterLength /
                                                       2)
    return m_note

def createFixedChord(note_value, num, fixed_chord, dotted):
    chords = ExprFixedChordNode.chords[fixed_chord.lower()]
    chords = [chord + num for chord in chords]

    new_chord = chord.Chord(chords)
    if note_value == "eighth":
        d = duration.Duration(type="eighth")
        new_chord.quarterLength = d.quarterLength
    if note_value == "sixteenth":
        new_chord.quarterLength = 0.25
    if note_value == "thirtysecond":
        new_chord.quarterLength = 0.125
    if note_value == "full":
        d = duration.Duration(type="whole")
        new_chord.quarterLength = d.quarterLength
    if note_value == "double":
        new_chord.quarterLength = 2.0
    if note_value == "half":
        d = duration.Duration(type="half")
        new_chord.quarterLength = d.quarterLength
    if dotted:
        new_chord.quarterLength = new_chord.quarterLength + (new_chord.quarterLength / 2)
    return new_chord

def createRest(val, dotted):
    m_rest = note.Rest()
    #update rest duration
    if val == "eighth":
        d = duration.Duration(type="eighth")
        m_rest.quarterLength = d.quarterLength
    if val == "sixteenth":
        m_rest.quarterLength = 0.25
    if val == "thirtysecond":
        m_rest.quarterLength = 0.125
    if val == "full":
        d = duration.Duration(type="whole")
        m_rest.quarterLength = d.quarterLength
    if val == "double":
        m_rest.quarterLength = 2.0
    if val == "half":
        d = duration.Duration(type="half")
        m_rest.quarterLength = d.quarterLength
    if dotted:
        m_rest.quarterLength = m_rest.quarterLength + (m_rest.quarterLength /
                                                       2)
    return m_rest


def printExprChord(chord: ExprChordNode):
    print("chord (")
    for note in chord.notes:
        printExprNote(note)
    print(")")


def valToBeat(cur_val, bottom, dotted):
    beat_num = 0

    if cur_val == "thirtysecond":
        beat_num = bottom / 32
    if cur_val == "sixteenth":
        beat_num = bottom / 16
    elif cur_val == "eighth":
        beat_num = bottom / 8
    elif cur_val == "quarter":
        beat_num = bottom / 4
    elif cur_val == "half":
        beat_num = bottom / 2
    elif cur_val == "full":
        beat_num = bottom
    elif cur_val == "double":
        beat_num = bottom * 2

    if dotted:
        beat_num += beat_num / 2

    return beat_num


def processExprChord(chord_notes, type):
    expected_note_val = ""
    is_dotted = False

    for idx, n in enumerate(
            chord_notes
    ):  # Checking if all notes in chord have same note_value
        if type == "EXPR":
            if bool(n.dotted):
                is_dotted = True

            if idx == 0:
                expected_note_val = str(n.note_value)
            else:
                if str(n.note_value) != expected_note_val:
                    line = n.note_value.getSymbol().line
                    col = n.note_value.getSymbol().column

                    raise Exception(
                        "Mismatch in note values, all notes within a chord must have the same note value",
                        line, col)
        else:
            if bool(n[3]):
                is_dotted = True

            if idx == 0:
                expected_note_val = str(n[0])
            else:
                if str(n[0]) != expected_note_val:
                    line = chord_notes.getSymbol().line
                    col = chord_notes.getSymbol().column

                    raise Exception(
                        "Mismatch in note values, all notes within a chord must have the same note value",
                        line, col)

    return expected_note_val, is_dotted


class Staff():
    def __init__(self, beats_per_measure, note_value, melodyVariable):
        self.melodyVariable = melodyVariable
        self.beats_per_measure = beats_per_measure
        self.note_value = note_value
        self.expressions = []


class MusicEvaluator(MyGrammerVisitor):
    bpm = None
    instrument = None
    checkInst = None
    grandInst = ["organ", "piano"]
    variables = {}
    staffs = []
    music_stream = stream.Score()
    repeat_ctr = []
    ending_ctr = []
    ending_values = []

    def evaluateExprNoteNode(self, ctx: ExprNoteNode):
        note_value = ctx.note_value.getText()
        accidental = None
        if ctx.accidental is not None:
            accidental = ctx.accidental.getText()
        pitch = ctx.pitch.getText()
        num = ctx.num.getText()
        dotted = ctx.dotted

        return note_value, accidental, pitch, num, dotted

    def evaluateDeclaredNotes(self, ctx: MyGrammerParser.Declare_noteContext):
        # DECLARED NOTES
        for note in ctx:
            # Get all the DeclareNoteNodes
            temp = MyGrammerVisitor().visitDeclare_note(note)

            if temp.identifier.getText() not in self.variables:
                note_value, accidental, pitch, num, dotted = self.evaluateExprNoteNode(
                    temp.note)

                self.variables[temp.identifier.getText()] = ("NOTE",
                                                             note_value,
                                                             accidental, pitch,
                                                             num, dotted)
            else:
                line = temp.identifier.getSymbol().line
                col = temp.identifier.getSymbol().column
                raise Exception(
                    "Reassignment is not allowed. Use a different identifier",
                    line, col)

    def evaluateDeclaredChords(self,
                               ctx: MyGrammerParser.Declare_chordContext):
        notes = []

        for chord in ctx:
            temp = MyGrammerVisitor().visitDeclare_chord(chord)

            if temp.identifier.getText() not in self.variables:
                # TODO: CHECK IF ERROR WHEN DECLARING FIXED CHORD
                if isinstance(temp.chord, ExprChordNode):
                    for x in temp.chord.notes:
                        notes.append(self.evaluateExprNoteNode(x))
                    self.variables[temp.identifier.getText()] = ("CHORD", notes)
                else: # FIXED CHORD
                    self.variables[temp.identifier.getText()] = ("FIXED_CHORD", temp.chord)
            else:
                line = temp.identifier.getSymbol().line
                col = temp.identifier.getSymbol().column
                raise Exception(
                    "Reassignment is not allowed. Use a different identifier",
                    line, col)

    def evaluateDeclaredStaffs(self, ctx: list, instru):
        # print("Declaring Staff", len(ctx.getChildren(), " found"))
        right = stream.Part()
        left = stream.Part()
        appendInstrument(right, instru)
        appendInstrument(left, instru)

        for idx, i in enumerate(ctx):
            # Gets a staff from music sheet
            first_staff = False
            last_staff = False
            if idx == 0:
                first_staff = True
            if idx == len(ctx) - 1:
                last_staff = True
            if i.__class__.__name__ == 'Declare_staffContext':
                staff = MyGrammerVisitor().visitDeclare_staff(i)
                top = staff.beats_per_measure
                if int(top.getText()) <= 0:
                    line = top.getSymbol().line
                    col = top.getSymbol().column
                    raise Exception(
                        "Number of beats in staff must be greater than 0",
                        line, col)
                bottom = staff.note_value
                if int(bottom.getText()) <= 0:
                    line = bottom.getSymbol().line
                    col = bottom.getSymbol().column
                    raise Exception(
                        "Note value of whole beats in staff must be greater than 0",
                        line, col)

                staffUp = Staff(top.getText(), bottom.getText(), None)
                staffDown = Staff(top.getText(), bottom.getText(), None)
                ending_id = []
                for expr in staff.expressions:
                    self.evaluateStaffBlock(expr, top.getText(),
                                            bottom.getText(), staffUp,
                                            staffDown, first_staff, last_staff, ending_id)
                    # for x in expr:
                    #     newStaff.expressions.append(x)
                for measure in staffUp.expressions:
                    right.append(measure)
                for measure in staffDown.expressions:
                    left.append(measure)

                up_idx = None
                down_idx = None
                for id in ending_id:
                    if id[0] == "UP_START":
                        up_idx = right.index(id[1])
                    elif id[0] == "UP_END":
                        repeat.insertRepeatEnding(right, up_idx, right.index(id[1]), endingNumber=id[2])
                for id in ending_id:
                    if id[0] == "DOWN_START":
                        down_idx = left.index(id[1])
                    elif id[0] == "DOWN_END":
                        repeat.insertRepeatEnding(left, down_idx, left.index(id[1]), endingNumber=id[2])

                print(ending_id)

                # self.staffs.append(staff1)

            else:  # Variable Expression checking
                melodyVariable = MyGrammerVisitor().visitExpr_var(i)
                if (not self.checkInListContext(i)):
                    # if isinstance(self.variables[melodyVariable.getText()], tuple): #note
                    #     line = i.IDENTIFIER().getSymbol().line
                    #     col = i.IDENTIFIER().getSymbol().column
                    #     raise Exception("Variable must be melody but a note is called", line, col)
                    # elif isinstance(self.variables[melodyVariable.getText()][0], tuple): #chord:
                    #     line = i.IDENTIFIER().getSymbol().line
                    #     col = i.IDENTIFIER().getSymbol().column
                    #     raise Exception("Variable must be melody but a chord is called", line, col)
                    if self.variables[melodyVariable.getText()][0] == "NOTE":  #note
                        line = i.IDENTIFIER().getSymbol().line
                        col = i.IDENTIFIER().getSymbol().column
                        raise Exception(
                            "Variable must be melody but a note is called",
                            line, col)
                    elif self.variables[melodyVariable.getText()][0] == "CHORD":  #chord:
                        line = i.IDENTIFIER().getSymbol().line
                        col = i.IDENTIFIER().getSymbol().column
                        raise Exception("Variable must be melody but a chord is called", line, col)
                    elif self.variables[melodyVariable.getText()][0] == "FIXED_CHORD": #chord:
                        line = i.IDENTIFIER().getSymbol().line
                        col = i.IDENTIFIER().getSymbol().column
                        raise Exception("Variable must be melody but a chord is called", line, col)

                for idx2, pair in enumerate(
                        self.variables[melodyVariable.getText()]):
                    # melodyStaffUp = self.variables[melodyVariable.getText()][0][0]
                    # melodyStaffDown = self.variables[melodyVariable.getText()][0][1]
                    right.append(copy.deepcopy(pair[0]))
                    left.append(copy.deepcopy(pair[1]))

                # self.staffs.append(Staff(None, None, melodyVariable.getText()))

        self.music_stream.insert(0, right)
        if self.checkInst in self.grandInst:
            self.music_stream.insert(0, left)

    def checkInListContext(self, ctx):
        line = ctx.IDENTIFIER().getSymbol().line
        col = ctx.IDENTIFIER().getSymbol().column
        if ctx.IDENTIFIER().getText() not in self.variables:
            raise Exception("Variable called but not declared", line, col)
        return False

    def checkInListNode(self, node):
        line = node.getSymbol().line
        col = node.getSymbol().column
        if node.getText() not in self.variables:
            raise Exception("Variable called but not declared", line, col)
        return False

    def evaluateDeclaredMelody(self,
                               ctx: MyGrammerParser.Declare_melodyContext, instru):
        # print("Declaring Melody", len(ctx.getChildren(), " found"))
        for i in ctx:
            # Gets a staff from music sheet
            melody = MyGrammerVisitor().visitDeclare_melody(i)
            identifier = melody.identifier
            staffs = melody.staffs
            melodyStaffs = []
            print(identifier)

            if melody.identifier.getText(
            ) not in self.variables:  # If not then store the corresponding notes of a chord in a list each note is stored as tuple of values for each property of a note
                for staff in staffs:
                    top = staff.beats_per_measure
                    if int(top.getText()) <= 0:
                        line = top.getSymbol().line
                        col = top.getSymbol().column
                        raise Exception(
                            "Number of beats in staff must be greater than 0",
                            line, col)
                    bottom = staff.note_value
                    if int(bottom.getText()) <= 0:
                        line = bottom.getSymbol().line
                        col = bottom.getSymbol().column
                        raise Exception(
                            "Note value of whole beats in staff must be greater than 0",
                            line, col)

                    staffUp = Staff(top.getText(), bottom.getText(), None)
                    staffDown = Staff(top.getText(), bottom.getText(), None)
                    ending_id = []
                    for expr in staff.expressions:
                        self.evaluateStaffBlock(expr, top.getText(),
                                                bottom.getText(), staffUp,
                                                staffDown, False, False, ending_id)
                        # for x in expr:
                        #     newStaff.expressions.append(x)
                    right = stream.Part()
                    left = stream.Part()
                    appendInstrument(right, instru)
                    appendInstrument(left, instru)
                    for measure in staffUp.expressions:
                        right.append(measure)
                    for measure in staffDown.expressions:
                        left.append(measure)

                    up_idx = None
                    down_idx = None
                    for id in ending_id:
                        if id[0] == "UP_START":
                            up_idx = right.index(id[1])
                        elif id[0] == "UP_END":
                            repeat.insertRepeatEnding(right, up_idx, right.index(id[1]), endingNumber=id[2])
                    for id in ending_id:
                        if id[0] == "DOWN_START":
                            down_idx = left.index(id[1])
                        elif id[0] == "DOWN_END":
                            repeat.insertRepeatEnding(left, down_idx, left.index(id[1]), endingNumber=id[2])

                    melodyStaffs.append((right, left))

                self.variables[melody.identifier.getText()] = melodyStaffs
            else:  # Else if reassignment of a chord variable is attempted raise an exception
                line = melody.identifier.getSymbol().line
                col = melody.identifier.getSymbol().column
                raise Exception(
                    "Reassignment is not allowed. Use a different identifier",
                    line, col)

    def evaluateStaffBlock(self, ctx: list, beats_per_measure, note_value,
                           staffUp, staffDown, first_staff,
                           last_staff, ending_id):  # List of Expressions of a staff block
        staff_accidentals = {}
        first_measure = False
        last_measure = False
        cur_beats_up = 0
        for idx, x in enumerate(ctx):
            measureUp = stream.Measure()
            measureDown = stream.Measure()
            cur_beats = 0
            if first_staff:
                first_staff = False
                first_measure = True
            if last_staff:
                if idx == len(ctx) - 1 or all(isinstance(y, AccidentalExpressionNode) for y in ctx[idx + 1:]):
                    last_staff = False
                    last_measure = True
            if isinstance(x, DeclareMeasuresNode) or isinstance(
                    x, DeclareMeasuresGrandNode):
                # measureUp = stream.Measure()
                # measureDown = stream.Measure()
                measureUp.insert(0, meter.TimeSignature(beats_per_measure + "/" + note_value))
                measureDown.insert(0, meter.TimeSignature(beats_per_measure + "/" + note_value))
                
                if x.ending_start is not None:
                    if isinstance(x, DeclareMeasuresNode) and len(self.ending_ctr) > 0 or isinstance(x, DeclareMeasuresGrandNode) and len(self.ending_ctr) > 1:
                        line = x.ending_start.ENDSTART().getSymbol().line
                        col = x.ending_start.ENDSTART().getSymbol().column
                        raise(Exception("Endings should be ended first before declaring another", line, col))
                    else:
                        if isinstance(
                            x,
                            DeclareMeasuresGrandNode):
                            if x.direction == "UP":
                                ending_id.append(("UP_START", measureUp, [int(ending.getText()) for ending in x.ending_start.INTEGER()]))
                            else:
                                ending_id.append(("DOWN_START", measureDown, [int(ending.getText()) for ending in x.ending_start.INTEGER()]))
                            self.ending_ctr.append(x.ending_start)
                        else:
                            ending_id.append(measureUp)
                            self.ending_ctr.append(x.ending_start)
                        # ending_id.append(measureUp)
                        # self.ending_ctr.append(x.ending_start)
                        
                    if isinstance(
                            x,
                            DeclareMeasuresGrandNode) and x.direction == "UP":
                        expDown = ctx[idx + 1]
                        if expDown.ending_start is None:
                            line = expDown.expressions[0].note_value.getSymbol(
                            ).line - 1
                            col = expDown.expressions[0].note_value.getSymbol(
                            ).column
                            raise Exception(
                                "measureUp and measureDown pairs must both have endingstart",
                                line, col)
                        else:
                            up_numbers = [int(ending.getText()) for ending in x.ending_start.INTEGER()]
                            down_numbers = [int(ending.getText()) for ending in expDown.ending_start.INTEGER()]
                            up_numbers.sort()
                            down_numbers.sort()
                            if up_numbers != down_numbers:
                                line = expDown.expressions[0].note_value.getSymbol(
                                ).line - 1
                                col = expDown.expressions[0].note_value.getSymbol(
                                ).column
                                raise Exception(
                                    "measureUp and measureDown pairs must both have the same ending numbers",
                                    line, col)
                            else:
                                for i in up_numbers:
                                    self.ending_values.append((i, x.ending_start.INTEGER()))

                if x.ending_end is not None:
                    if len(self.ending_ctr) == 0:
                        line = x.ending_end.ENDEND().getSymbol().line
                        col = x.ending_end.ENDEND().getSymbol().column
                        raise Exception("Invalid ending placement", line, col)
                    if isinstance(
                        x,
                        DeclareMeasuresGrandNode):
                        if x.direction == "UP":
                            ending_id.append(("UP_END", measureUp, [int(ending.getText()) for ending in x.ending_start.INTEGER()]))
                        else:
                            ending_id.append(("DOWN_END", measureDown, [int(ending.getText()) for ending in x.ending_start.INTEGER()]))
                    else:
                        ending_id.append(measureUp)

                    if isinstance(
                            x,
                            DeclareMeasuresGrandNode) and x.direction == "UP":
                        expDown = ctx[idx + 1]
                        if expDown.ending_end is None:
                            line = expDown.expressions[0].note_value.getSymbol(
                            ).line - 1
                            col = expDown.expressions[0].note_value.getSymbol(
                            ).column
                            raise Exception(
                                "measureUp and measureDown pairs must both have endingend",
                                line, col)
                        
                    del self.ending_ctr[-1]


                if x.repeat_start is not None:
                    if isinstance(x, DeclareMeasuresGrandNode) and x.direction == "UP":
                        measureUp.leftBarline = bar.Repeat(direction='start')
                    else:
                        measureDown.leftBarline = bar.Repeat(direction='start')
                    self.repeat_ctr.append(x.repeat_start)
                    if isinstance(
                            x,
                            DeclareMeasuresGrandNode) and x.direction == "UP":
                        expDown = ctx[idx + 1]
                        if expDown.repeat_start is None:
                            line = expDown.expressions[0].note_value.getSymbol(
                            ).line - 1
                            col = expDown.expressions[0].note_value.getSymbol(
                            ).column
                            raise Exception(
                                "measureUp and measureDown pairs must both have repstart",
                                line, col)

                if x.repeat_end is not None:
                    repeat_times = None
                    if x.repeat_end.INTEGER() is None:
                        repeat_times = 1
                    else:
                        repeat_times = int(x.repeat_end.INTEGER().getText())
                    if repeat_times < 0 or repeat_times > 10:  # TODO: should we even count for this i think ok lang na wala restriction
                        line = x.repeat_end.INTEGER().getSymbol().line
                        col = x.repeat_end.INTEGER().getSymbol().column
                        raise Exception(
                            "Number of repeats must be less than or equal to 10",
                            line, col)
                    else:
                        if isinstance(x, DeclareMeasuresGrandNode) and x.direction == "UP":
                            measureUp.rightBarline = bar.Repeat(
                                direction='end', times = repeat_times + 1)
                        else:
                            measureDown.rightBarline = bar.Repeat(
                                direction='end', times = repeat_times + 1)
                        if len(self.repeat_ctr) > 0:
                            del self.repeat_ctr[-1]
                    if isinstance(
                            x,
                            DeclareMeasuresGrandNode) and x.direction == "UP":
                        expDown = ctx[idx + 1]
                        if expDown.repeat_end is None:
                            line = expDown.expressions[0].note_value.getSymbol(
                            ).line - 1
                            col = expDown.expressions[0].note_value.getSymbol(
                            ).column
                            raise Exception(
                                "measureUp and measureDown pairs must both have repend",
                                line, col)
                        if repeat_times != int(expDown.repeat_end.INTEGER().getText()):
                            line = expDown.repeat_end.INTEGER().getSymbol(
                            ).line
                            col = expDown.repeat_end.INTEGER().getSymbol(
                            ).column
                            raise Exception(
                                "measureUp and measureDown pairs must both have the same number of repeats",
                                line, col)

                if x.repeat_start is None and isinstance(
                        x, DeclareMeasuresGrandNode) and x.direction == "UP":
                    expDown = ctx[idx + 1]
                    if expDown.repeat_start is not None:
                        line = x.expressions[0].note_value.getSymbol().line - 1
                        col = x.expressions[0].note_value.getSymbol().column
                        raise Exception(
                            "measureUp and measureDown pairs must both have repend",
                            line, col)

                if x.repeat_end is None and isinstance(
                        x, DeclareMeasuresGrandNode) and x.direction == "UP":
                    expDown = ctx[idx + 1]
                    if expDown.repeat_end is not None:
                        line = x.expressions[0].note_value.getSymbol().line - 1
                        col = x.expressions[0].note_value.getSymbol().column
                        raise Exception(
                            "measureUp and measureDown pairs must both have repend",
                            line, col)

                if isinstance(x, DeclareMeasuresGrandNode
                              ) and self.checkInst not in self.grandInst:
                    line = x.expressions[0].note_value.getSymbol().line - 1
                    col = x.expressions[0].note_value.getSymbol().column
                    raise Exception(
                        "Grand staff directions are only allowed for keyboard instruments",
                        line, col)
                elif isinstance(x, DeclareMeasuresNode
                                ) and self.checkInst in self.grandInst:
                    line = x.expressions[0].note_value.getSymbol().line - 1
                    col = x.expressions[0].note_value.getSymbol().column
                    raise Exception(
                        "Grand staff directions are required for keyboard instruments",
                        line, col)

                measure_accidentals = {}
                print("--------- MEASURE -------")
                for mIdx, m_expr in enumerate(x.expressions):
                    if isinstance(m_expr, ExprNoteNode):
                        cur_beats += valToBeat(str(m_expr.note_value),
                                               float(note_value),
                                               bool(m_expr.dotted))
                        if cur_beats > float(beats_per_measure):
                            line = m_expr.note_value.getSymbol().line
                            col = m_expr.note_value.getSymbol().column
                            raise Exception(
                                "Number of beats in measure has exceeded amount required within staff",
                                line, col)
                        else:
                            if isinstance(x, DeclareMeasuresGrandNode
                                          ) and x.direction == "DOWN":
                                print("down")
                                pitch  = m_expr.pitch.getText()
                                octave =  m_expr.num.getText()
                                
                                if (pitch, octave) in measure_accidentals:
                                    updated_acc = measure_accidentals[((pitch, octave))]
                                elif (pitch,octave) in staff_accidentals:
                                    updated_acc = staff_accidentals[((pitch, octave))]
                                else:
                                    updated_acc = m_expr.accidental
                                
                                measureDown.append(
                                    createNote(str(m_expr.num),
                                               str(m_expr.accidental),
                                               str(m_expr.pitch),
                                               str(m_expr.note_value),
                                               bool(m_expr.dotted)))
                            else:
                                pitch  = m_expr.pitch.getText()
                                octave =  m_expr.num.getText()
                                if (pitch, octave) in measure_accidentals:
                                    updated_acc = measure_accidentals[((pitch, octave))]
                                elif (pitch,octave) in staff_accidentals:
                                    updated_acc = staff_accidentals[((pitch, octave))]
                                else:
                                    updated_acc = m_expr.accidental
                                measureUp.append(
                                    createNote(str(m_expr.num),
                                               str(updated_acc),
                                               str(m_expr.pitch),
                                               str(m_expr.note_value),
                                               bool(m_expr.dotted)))
                            # printExprNote(m_expr)

                    elif isinstance(m_expr, ExprChordNode):
                        expected_note_val, is_dotted = processExprChord(m_expr.notes, "EXPR")
                        cur_beats += valToBeat(expected_note_val,
                                               float(note_value), is_dotted)
                        if cur_beats > float(beats_per_measure):
                            line = m_expr.notes[0].note_value.getSymbol().line
                            col = m_expr.notes[0].note_value.getSymbol().column

                            raise Exception(
                                "Number of beats in measure has exceeded amount required within staff",
                                line, col)
                        else:
                            new_notes = []
                            for n in m_expr.notes:
                                pitch  = n.pitch.getText()
                                octave =  n.num.getText()

                                if (pitch, octave) in measure_accidentals:
                                    n.accidental = measure_accidentals[((pitch, octave))]
                                elif (pitch,octave) in staff_accidentals:
                                    n.accidental = staff_accidentals[((pitch, octave))]
                    
                                new_notes.append((str(n.num), str(n.pitch), str(n.accidental)))
                            if isinstance(x, DeclareMeasuresGrandNode) and x.direction == "DOWN":
                                measureDown.append(createChord(new_notes, expected_note_val))
                            else:
                                measureUp.append(createChord(new_notes, expected_note_val))
                            printExprChord(m_expr)

                    elif isinstance(m_expr, ExprFixedChordNode):
                        cur_beats += valToBeat(str(m_expr.note_value), float(note_value), bool(m_expr.dotted))
                        if cur_beats > float(beats_per_measure):
                            line = m_expr.note_value.getSymbol().line
                            col = m_expr.note_value.getSymbol().column
                            raise Exception("Number of beats in measure has exceeded amount required within staff", line, col)
                        else:
                            if isinstance(x, DeclareMeasuresGrandNode) and x.direction == "DOWN":
                                measureDown.append(createFixedChord(str(m_expr.note_value), str(m_expr.num), str(m_expr.fixed_chord), bool(m_expr.dotted)))
                            else:
                                measureUp.append(createFixedChord(str(m_expr.note_value), str(m_expr.num), str(m_expr.fixed_chord), bool(m_expr.dotted)))
                            print(m_expr)

                    elif isinstance(m_expr, ExprRestNode):
                        cur_beats += valToBeat(str(m_expr.note_value),
                                               float(note_value),
                                               bool(m_expr.dotted))
                        if cur_beats > float(beats_per_measure):
                            line = m_expr.note_value.getSymbol().line
                            col = m_expr.note_value.getSymbol().column
                            raise Exception(
                                "Number of beats in measure has exceeded amount required within staff",
                                line, col)
                        else:
                            if isinstance(x, DeclareMeasuresGrandNode
                                          ) and x.direction == "DOWN":
                                measureDown.append(
                                    createRest(str(m_expr.note_value),
                                               bool(m_expr.dotted)))
                            else:
                                measureUp.append(
                                    createRest(str(m_expr.note_value),
                                               bool(m_expr.dotted)))
                            printExprRest(m_expr)

                    elif isinstance(m_expr, AccidentalExpressionNode):
                        # print("accidental")
                        for i in m_expr.accidentals:  # List of AccidentalNodes
                            print("measure accie")
                            measure_accidentals[(i.pitch.getText(),i.octave.getText())] = i.accidental.getText() if i.accidental is not None else ""
                            # print("axie",
                            #       staff_accidentals[(i.pitch, i.octave)],
                            #       i.pitch, i.octave)

                    elif isinstance(m_expr, DeclareContinousNode):
                        for continuous_expr in m_expr.expressions:
                            if isinstance(continuous_expr, ExprNoteNode):
                                cur_beats += valToBeat(
                                    str(continuous_expr.note_value),
                                    float(note_value),
                                    bool(continuous_expr.dotted))
                                if cur_beats > float(beats_per_measure):
                                    line = continuous_expr.note_value.getSymbol(
                                    ).line
                                    col = continuous_expr.note_value.getSymbol(
                                    ).column

                                    raise Exception(
                                        "Number of beats in measure has exceeded amount required within staff",
                                        line, col)
                                else:
                                    if isinstance(x, DeclareMeasuresGrandNode) and x.direction == "DOWN":
                                        measureDown.append(
                                            createNote(
                                                str(continuous_expr.num),
                                                str(continuous_expr.accidental
                                                    ),
                                                str(continuous_expr.pitch),
                                                str(continuous_expr.note_value)
                                            ))
                                    else:
                                        measureUp.append(
                                            createNote(
                                                str(continuous_expr.num),
                                                str(continuous_expr.accidental
                                                    ),
                                                str(continuous_expr.pitch),
                                                str(continuous_expr.note_value)
                                            ))
                                    # printExprNote(continuous_expr)

                            elif isinstance(continuous_expr, ExprChordNode):
                                expected_note_val, is_dotted = processExprChord(
                                    continuous_expr.notes, "EXPR")
                                cur_beats += valToBeat(expected_note_val,
                                                       float(note_value),
                                                       is_dotted)
                                if cur_beats > float(beats_per_measure):
                                    line = m_expr.notes[0].note_value.getSymbol().line
                                    col = m_expr.notes[0].note_value.getSymbol().column

                                    raise Exception(
                                        "Number of beats in measure has exceeded amount required within staff",
                                        line, col)
                                else:
                                    new_notes = []
                                    for n in continuous_expr.notes:
                                        new_notes.append(
                                            (str(n.num), str(n.pitch)))
                                    if isinstance(x, DeclareMeasuresGrandNode) and x.direction == "DOWN":
                                        measureDown.append(
                                            createChord(
                                                new_notes, expected_note_val))
                                    else:
                                        measureUp.append(
                                            createChord(
                                                new_notes, expected_note_val))
                                    printExprChord(continuous_expr)

                            elif isinstance(continuous_expr, AccidentalExpressionNode):
                                print("Continuous Accidental")

                            else:
                                if (not self.checkInListNode(continuous_expr)):  # Error checking identifier and if melody
                                    if isinstance(
                                            self.variables[
                                                continuous_expr.getText()][0],
                                            Staff):
                                        line = continuous_expr.getSymbol().line
                                        col = continuous_expr.getSymbol(
                                        ).column
                                        raise Exception(
                                            "Variable must be note or chord but a melody is called",
                                            line, col)

                                    elif self.variables[
                                            continuous_expr.getText(
                                            )][0] == "NOTE":
                                        cur_beats += valToBeat(
                                            str(self.variables[
                                                continuous_expr.getText()][1]),
                                            float(note_value),
                                            bool(self.variables[
                                                continuous_expr.getText()][4]))
                                        if cur_beats > float(beats_per_measure):
                                            line = continuous_expr.getSymbol().line
                                            col = continuous_expr.getSymbol().column

                                            raise Exception(
                                                "Number of beats in measure has exceeded amount required within staff",
                                                line, col)
                                        else:
                                            if isinstance(
                                                    x, DeclareMeasuresGrandNode
                                            ) and x.direction == "DOWN":
                                                measureDown.append(
                                                    createNote(
                                                        str(self.variables[
                                                            continuous_expr.
                                                            getText()][4]),
                                                        str(self.variables[
                                                            continuous_expr.
                                                            getText()][2]),
                                                        str(self.variables[
                                                            continuous_expr.
                                                            getText()][3]),
                                                        str(self.variables[
                                                            continuous_expr.
                                                            getText()][1])))
                                            else:
                                                measureUp.append(
                                                    createNote(
                                                        str(self.variables[
                                                            continuous_expr.
                                                            getText()][4]),
                                                        str(self.variables[
                                                            continuous_expr.
                                                            getText()][2]),
                                                        str(self.variables[
                                                            continuous_expr.
                                                            getText()][3]),
                                                        str(self.variables[
                                                            continuous_expr.
                                                            getText()][1])))

                                    elif self.variables[
                                            continuous_expr.getText(
                                            )][0] == "CHORD":
                                        expected_note_val, is_dotted = processExprChord(
                                            self.variables[
                                                continuous_expr.getText()][1],
                                            "VAR")
                                        cur_beats += valToBeat(
                                            expected_note_val,
                                            float(note_value), is_dotted)
                                        if cur_beats > float(
                                                beats_per_measure):
                                            line = continuous_expr.getSymbol(
                                            ).line
                                            col = continuous_expr.getSymbol(
                                            ).column

                                            raise Exception(
                                                "Number of beats in measure has exceeded amount required within staff",
                                                line, col)
                                        else:
                                            new_notes = []
                                            for n in self.variables[
                                                    continuous_expr.getText(
                                                    )][1]:
                                                new_notes.append(
                                                    (str(n[2]), str(n[1])))
                                            if isinstance(
                                                    x, DeclareMeasuresGrandNode
                                            ) and x.direction == "DOWN":
                                                measureDown.append(
                                                    createChord(
                                                        new_notes,
                                                        expected_note_val))
                                            else:
                                                measureUp.append(
                                                    createChord(
                                                        new_notes,
                                                        expected_note_val))

                        # print(m_expr.expressions)
                        # print(m_expr)
                    else:
                        if (not self.checkInListNode(m_expr)
                            ):  # Error checking identifier and if melody
                            if isinstance(self.variables[m_expr.getText()][0],
                                          Staff):
                                line = m_expr.getSymbol().line
                                col = m_expr.getSymbol().column
                                raise Exception(
                                    "Variable must be note or chord but a melody is called",
                                    line, col)

                            elif self.variables[m_expr.getText()][0] == "NOTE":
                                # print(self.variables[m_expr.getText()])
                                cur_beats += valToBeat(
                                    str(self.variables[m_expr.getText()][1]),
                                    float(note_value),
                                    bool(self.variables[m_expr.getText()][5]))
                                if cur_beats > float(beats_per_measure):
                                    line = m_expr.getSymbol().line
                                    col = m_expr.getSymbol().column

                                    raise Exception(
                                        "Number of beats in measure has exceeded amount required within staff",
                                        line, col)
                                else:
                                    if isinstance(x, DeclareMeasuresGrandNode
                                                  ) and x.direction == "DOWN":
                                        
                                        pitch = self.variables[m_expr.getText()][3]
                                        octave = self.variables[m_expr.getText()][4]
                                        if (pitch, octave) in measure_accidentals:
                                            updated_acc = measure_accidentals[((pitch, octave))]
                                        elif (pitch,octave) in staff_accidentals:
                                            updated_acc = staff_accidentals[(pitch, octave)]
                                        else:
                                            updated_acc = self.variables[m_expr.getText()][2]

                                        measureDown.append(
                                            createNote(
                                                str(self.variables[
                                                    m_expr.getText()][4]),
                                                str(updated_acc),
                                                str(self.variables[
                                                    m_expr.getText()][3]),
                                                str(self.variables[
                                                    m_expr.getText()][1]),
                                                bool(self.variables[
                                                    m_expr.getText()][5])))
                                    else:
                                        pitch = self.variables[m_expr.getText()][3]
                                        octave = self.variables[m_expr.getText()][4]
                                        if (pitch, octave) in measure_accidentals:
                                            updated_acc = measure_accidentals[((pitch, octave))]
                                        elif (pitch,octave) in staff_accidentals:
                                            updated_acc = staff_accidentals[(pitch, octave)]
                                        else:
                                            updated_acc = self.variables[m_expr.getText()][2]
                                            
                                        measureUp.append(
                                            createNote(
                                                str(self.variables[m_expr.getText()][4]),
                                                str(updated_acc),
                                                str(self.variables[ m_expr.getText()][3]),
                                                str(self.variables[m_expr.getText()][1]),
                                                bool(self.variables[m_expr.getText()][5])))

                            elif self.variables[
                                    m_expr.getText()][0] == "CHORD":
                                expected_note_val, is_dotted = processExprChord(
                                    self.variables[m_expr.getText()][1], "VAR")
                                cur_beats += valToBeat(expected_note_val,
                                                       float(note_value),
                                                       is_dotted)
                                if cur_beats > float(beats_per_measure):
                                    line = m_expr.getSymbol().line
                                    col = m_expr.getSymbol().column

                                    raise Exception(
                                        "Number of beats in measure has exceeded amount required within staff",
                                        line, col)
                                else:
                                    new_notes = []
                                    for n in self.variables[
                                            m_expr.getText()][1]:
                                        new_notes.append(
                                            (str(n[2]), str(n[1])))
                                    if isinstance(x, DeclareMeasuresGrandNode
                                                  ) and x.direction == "DOWN":
                                        measureDown.append(
                                            createChord(
                                                new_notes, expected_note_val))
                                    else:
                                        measureUp.append(createChord(new_notes, expected_note_val))
                            elif self.variables[m_expr.getText()][0] == "FIXED_CHORD":
                                fixed = self.variables[m_expr.getText()][1]
                                cur_beats += valToBeat(str(fixed.note_value), float(note_value), bool(fixed.dotted))
                                if cur_beats > float(beats_per_measure):
                                    line = fixed.note_value.getSymbol().line
                                    col = fixed.note_value.getSymbol().column
                                    raise Exception("Number of beats in measure has exceeded amount required within staff", line, col)
                                else:
                                    if isinstance(x, DeclareMeasuresGrandNode) and x.direction == "DOWN":
                                        measureDown.append(createFixedChord(str(fixed.note_value), str(fixed.num), str(fixed.fixed_chord), bool(fixed.dotted)))
                                    else:
                                        measureUp.append(createFixedChord(str(fixed.note_value), str(fixed.num), str(fixed.fixed_chord), bool(fixed.dotted)))
                        print(m_expr)

                # if (not first_measure and not last_measure) and mIdx == len(x.expressions) - 1 and cur_beats < float(beats_per_measure):
                #     # If not a terminal node 
                #     if x.expressions[0].__class__.__name__ != "TerminalNodeImpl":
                #         line = x.expressions[0].note_value.getSymbol().line - 1
                #         col = x.expressions[0].note_value.getSymbol().column
                #     else:
                #         line = x.expressions[0].getSymbol().line - 1
                #         col = x.expressions[0].getSymbol().column
                #     raise Exception(
                #         "Number of beats in measure did not meet amount required within staff",
                #         line, col)
                if isinstance(x, DeclareMeasuresGrandNode) and x.direction == "UP":
                    cur_beats_up = cur_beats
                else:
                    if cur_beats != cur_beats_up:
                        if x.expressions[0].__class__.__name__ != "TerminalNodeImpl":
                            line = x.expressions[0].note_value.getSymbol().line - 1
                            col = x.expressions[0].note_value.getSymbol().column
                        else:
                            line = x.expressions[0].getSymbol().line - 1
                            col = x.expressions[0].getSymbol().column
                        raise Exception(
                            "Number of beats are unequal between grand measures",
                            line, col)
                if first_measure:
                    if isinstance(x, DeclareMeasuresGrandNode) and x.direction == "DOWN":
                        first_measure = False
                        measureUp.padAsAnacrusis(useGaps=True)
                        measureDown.padAsAnacrusis(useGaps=True)
                if last_measure:
                    if isinstance(x, DeclareMeasuresGrandNode) and x.direction == "DOWN":
                        last_measure = False

            elif isinstance(x, AccidentalExpressionNode):
                print("accidental")
                for acc_expr in x.accidentals:
                    # Assign an accidental for a particular pitch and octave
                    pitch = acc_expr.pitch.getText()
                    octave = acc_expr.octave.getText()
                    staff_accidentals[(pitch, octave)] = acc_expr.accidental.getText() if acc_expr.accidental is not None else ""
                    print("out axie", pitch, octave, staff_accidentals[(pitch, octave)])
                    # print(
                    #     staff_accidentals[(acc_expr.pitch.getText(),
                    #                        acc_expr.octave.getText())],
                    #     acc_expr.pitch.getText(), acc_expr.octave.getText())

            staffUp.expressions.append(measureUp)
            staffDown.expressions.append(measureDown)

    def evaluate(self, node):
        self.bpm = node.bpm
        self.instrument = node.instrument
        self.checkInst = self.instrument.getText().lower()

        if (int(self.bpm.getText()) > 300):
            line = self.bpm.getSymbol().line
            col = self.bpm.getSymbol().column

            raise Exception("Invalid BPM value not in range 300", line, col)

        elif (int(self.bpm.getText()) < 0):
            line = self.bpm.getSymbol().line
            col = self.bpm.getSymbol().column

            raise Exception("Invalid BPM value, cannot be less than 0", line,
                            col)
        else:
            print("bpm (" + str(self.bpm) + ")")

        print(node.instrument.getText())
        self.music_stream.append(tempo.MetronomeMark(number=int(self.bpm.getText())))

        self.evaluateDeclaredNotes(
            node.notes)  # Returns NoteExpression Objects
        self.evaluateDeclaredChords(
            node.chords)  # Returns ChordExpression Objects
        self.evaluateDeclaredMelody(node.melodies, self.instrument)
        self.evaluateDeclaredStaffs(node.staffs, self.instrument)

        if len(self.repeat_ctr):
            rep = self.repeat_ctr[0]
            line = rep.REPSTART().getSymbol().line
            col = rep.REPSTART().getSymbol().column
            raise Exception("Invalid repeat placement", line, col)
        if len(self.ending_ctr):
            end = self.ending_ctr[0]
            line = end.REPSTART().getSymbol().line
            col = end.REPSTART().getSymbol().column
            raise Exception("Invalid ending placement", line, col)
        for idx, i in enumerate(self.ending_values):
            if idx + 1 != i[0]:
                line = i[1][0].getSymbol().line
                col = i[1][0].getSymbol().column
                raise Exception("Invalid ending number", line, col)

        self.music_stream.write('midi', fp='test.midi')

        return "MIDI FILE"
