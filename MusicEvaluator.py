from html.entities import name2codepoint
from numpy import isin
from MyGrammerParser import MyGrammerParser
from MyGrammerVisitor import MyGrammerVisitor
from MusicNodes import *
from music21 import *

def createChord(note_arr, val):
    arr = []
    for num, pitch in note_arr:
        arr.append(str(pitch) + str(num))
    new_chord = chord.Chord(arr)
    if val == "eighth":
        d = duration.Duration(type="eighth")
        new_chord.quarterLength = d.quarterLength
    if val == "sixteenth":
        new_chord.quarterLength = 0.25
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

def createNote(num, pitch, val, dotted):
    m_note = note.Note(pitch + num)
        #update note duration
    if val == "eighth":
        d = duration.Duration(type="eighth")
        m_note.quarterLength = d.quarterLength
    if val == "sixteenth":
        m_note.quarterLength = 0.25
    if val == "full":
        d = duration.Duration(type="whole")
        m_note.quarterLength = d.quarterLength
    if val == "double":
        m_note.quarterLength = 2.0
    if val == "half":
        d = duration.Duration(type="half")
        m_note.quarterLength = d.quarterLength
    if dotted:
        m_note.quarterLength = m_note.quarterLength + (m_note.quarterLength / 2)
    return m_note

def createRest(val, dotted):
    m_rest = note.Rest()
        #update rest duration
    if val == "eighth":
        d = duration.Duration(type="eighth")
        m_rest.quarterLength = d.quarterLength
    if val == "sixteenth":
        m_rest.quarterLength = 0.25
    if val == "full":
        d = duration.Duration(type="whole")
        m_rest.quarterLength = d.quarterLength
    if val == "double":
        m_rest.quarterLength = 2.0
    if val == "half":
        d = duration.Duration(type="half")
        m_rest.quarterLength = d.quarterLength
    if dotted:
        m_rest.quarterLength = m_rest.quarterLength + (m_rest.quarterLength / 2)
    return m_rest

def createChord(note_arr, val):
    arr = []
    for num, pitch in note_arr:
        arr.append(str(pitch) + str(num))
    new_chord = chord.Chord(arr)
    if val == "eighth":
        d = duration.Duration(type="eighth")
        new_chord.quarterLength = d.quarterLength
    if val == "sixteenth":
        new_chord.quarterLength = 0.25
    if val == "full":
        d = duration.Duration(type="whole")
        new_chord.quarterLength = d.quarterLength
    if val == "double":
        new_chord.quarterLength = 2.0
    if val == "half":
        d = duration.Duration(type="half")
        new_chord.quarterLength = d.quarterLength
    return new_chord

def printExprChord(chord: ExprChordNode):
    print("chord (")
    for note in chord.notes:
        printExprNote(note)
    print(")")

def valToBeat(cur_val, bottom, dotted):
    beat_num = 0

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

    for idx, n in enumerate(chord_notes): # Checking if all notes in chord have same note_value
        if type == "EXPR":
            if bool(n.dotted):
                is_dotted = True
                
            if idx == 0:
                expected_note_val = str(n.note_value)
            else:
                if str(n.note_value) != expected_note_val:
                    line = n.note_value.getSymbol().line
                    col = n.note_value.getSymbol().column

                    raise Exception("Mismatch in note values, all notes within a chord must have the same note value", line, col)
        else:
            if bool(n[3]):
                is_dotted = True
                
            if idx == 0:
                expected_note_val = str(n[0])
            else:
                if str(n[0]) != expected_note_val:
                    line = chord_notes.getSymbol().line
                    col = chord_notes.getSymbol().column

                    raise Exception("Mismatch in note values, all notes within a chord must have the same note value", line, col)

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
    variables = {}
    staffs = []
    music_stream = stream.Stream()
    repeat_ctr = []

    def evaluateExprNoteNode(self, ctx: ExprNoteNode):
        note_value = ctx.note_value.getText()
        pitch = ctx.pitch.getText()
        num = ctx.num.getText()
        dotted = ctx.dotted

        return note_value, pitch, num, dotted

    def evaluateDeclaredNotes(self, ctx: MyGrammerParser.Declare_noteContext):
        # DECLARED NOTES
        for note in ctx:
            # Get all the DeclareNoteNodes
            temp = MyGrammerVisitor().visitDeclare_note(note)

            if temp.identifier.getText() not in self.variables:
                note_value, pitch, num, dotted = self.evaluateExprNoteNode(
                    temp.note)

                self.variables[temp.identifier.getText()] = ("NOTE", note_value, pitch,
                                num, dotted)
            else:
                line = temp.identifier.getSymbol().line
                col = temp.identifier.getSymbol().column
                raise Exception(
                    "Reassignment is not allowed. Use a different identifier",
                    line, col)


    def evaluateDeclaredChords(self, ctx: MyGrammerParser.Declare_chordContext):
        notes = []

        for chord in ctx:
            temp = MyGrammerVisitor().visitDeclare_chord(chord)

            if temp.identifier.getText() not in self.variables:
                for x in temp.chord.notes:
                    notes.append(self.evaluateExprNoteNode(x))
                self.variables[temp.identifier.getText()] = ("CHORD", notes)
            else:
                line = temp.identifier.getSymbol().line
                col = temp.identifier.getSymbol().column
                raise Exception("Reassignment is not allowed. Use a different identifier", line, col)

    def evaluateDeclaredStaffs(self, ctx: list):
        # print("Declaring Staff", len(ctx.getChildren(), " found"))
        for i in ctx:
            # Gets a staff from music sheet
            if i.__class__.__name__ == 'Declare_staffContext':
                staff = MyGrammerVisitor().visitDeclare_staff(i)
                top = staff.beats_per_measure
                bottom = staff.note_value
                newStaff = Staff(top, bottom, None)
                staff1 = layout.Staff()
                for expr in staff.expressions:
                    self.evaluateStaffBlock(expr, top, bottom, newStaff)
                    # for x in expr:
                    #     newStaff.expressions.append(x)
                for measure in newStaff.expressions:
                    staff1.append(measure)
                self.staffs.append(staff1)
                
            else: # Variable Expression checking
                melodyVariable = MyGrammerVisitor().visitExpr_var(i)
                if (not self.checkInListContext(i)):
                    if isinstance(self.variables[melodyVariable.getText()], tuple): #note
                        line = i.IDENTIFIER().getSymbol().line
                        col = i.IDENTIFIER().getSymbol().column
                        raise Exception("Variable must be melody but a note is called", line, col)
                    elif isinstance(self.variables[melodyVariable.getText()][0], tuple): #chord:
                        line = i.IDENTIFIER().getSymbol().line
                        col = i.IDENTIFIER().getSymbol().column
                        raise Exception("Variable must be melody but a chord is called", line, col)
                self.staffs.append(Staff(None, None, melodyVariable.getText()))
                        
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

    def evaluateDeclaredMelody(self, ctx: MyGrammerParser.Declare_melodyContext):
        # print("Declaring Melody", len(ctx.getChildren(), " found"))
        for i in ctx:
            # Gets a staff from music sheet
            melody = MyGrammerVisitor().visitDeclare_melody(i)
            identifier = melody.identifier
            staffs = melody.staffs
            melodyStaffs = []
            print(identifier)

            if melody.identifier.getText() not in self.variables: # If not then store the corresponding notes of a chord in a list each note is stored as tuple of values for each property of a note
                for staff in staffs:
                    top = staff.beats_per_measure
                    bottom = staff.note_value
                    newStaff = Staff(top, bottom, None)
                    for expr in staff.expressions:
                        self.evaluateStaffBlock(expr, top, bottom, newStaff)
                        # for x in expr:
                        #     newStaff.expressions.append(x)
                    melodyStaffs.append(newStaff)

                self.variables[melody.identifier.getText()] = melodyStaffs
            else: # Else if reassignment of a chord variable is attempted raise an exception 
                line = melody.identifier.getSymbol().line
                col = melody.identifier.getSymbol().column
                raise Exception(
                    "Reassignment is not allowed. Use a different identifier",
                    line, col)

    def evaluateMelodyVar(self, ctx: list):
        pass

    def evaluateStaffBlock(self,ctx: list, beats_per_measure, note_value, staff): # List of Expressions of a staff block
        for x in ctx:
            if isinstance(x, DeclareMeasuresNode):
                measure = stream.Measure()
                measure.insert(0, meter.TimeSignature(beats_per_measure + "/" + note_value))
                if x.repeat_start is not None:
                    measure.leftBarline = bar.Repeat(direction = 'start')
                    self.repeat_ctr.append(x.repeat_start)
                if x.repeat_end is not None:
                    repeat_times = None
                    if x.repeat_end.INTEGER() is None:
                        repeat_times = 1
                    else:
                        repeat_times = int(x.repeat_end.INTEGER().getText())
                    if repeat_times < 0 or repeat_times > 10: # TODO: should we even count for this i think ok lang na wala restriction
                        line = x.repeat_end.INTEGER().getSymbol().line
                        col = x.repeat_end.INTEGER().getSymbol().column
                        raise Exception("Number of repeats must be less than or equal to 10", line, col)
                    else:
                        measure.rightBarline = bar.Repeat(direction = 'end', times = repeat_times + 1)
                        if len(self.repeat_ctr) > 0:
                            del self.repeat_ctr[-1]
                cur_beats = 0
                for m_expr in x.expressions:
                    if isinstance(m_expr, ExprNoteNode):
                        cur_beats += valToBeat(str(m_expr.note_value), float(note_value), bool(m_expr.dotted))
                        if cur_beats > float(beats_per_measure):
                            line = m_expr.note_value.getSymbol().line
                            col = m_expr.note_value.getSymbol().column
                            raise Exception("Number of beats in measure has exceeded amount allowed within staff", line, col)
                        else:
                            measure.append(createNote(str(m_expr.num), str(m_expr.pitch), str(m_expr.note_value), bool(m_expr.dotted)))
                            printExprNote(m_expr)

                    elif isinstance(m_expr, ExprChordNode):
                        expected_note_val, is_dotted = processExprChord(m_expr.notes, "EXPR")
                        cur_beats += valToBeat(expected_note_val, float(note_value), is_dotted)
                        if cur_beats > float(beats_per_measure):
                            line = m_expr.notes[0].note_value.getSymbol().line
                            col = m_expr.notes[0].note_value.getSymbol().column

                            raise Exception("Number of beats in measure has exceeded amount allowed within staff", line, col)
                        else:
                            new_notes = []
                            for n in m_expr.notes:
                                new_notes.append((str(n.num), str(n.pitch)))
                            measure.append(createChord(new_notes, expected_note_val))
                            printExprChord(m_expr)
                    
                    elif isinstance(m_expr, ExprRestNode):
                        cur_beats += valToBeat(str(m_expr.note_value), float(note_value), bool(m_expr.dotted))
                        if cur_beats > float(beats_per_measure):
                            line = m_expr.note_value.getSymbol().line
                            col = m_expr.note_value.getSymbol().column
                            raise Exception("Number of beats in measure has exceeded amount allowed within staff", line, col)
                        else:
                            measure.append(createRest(str(m_expr.note_value), bool(m_expr.dotted)))
                            printExprRest(m_expr)

                    elif isinstance(m_expr, AccidentalExpressionNode):
                        print("accidental")
                        print(m_expr)

                    elif isinstance(m_expr, DeclareContinousNode):
                        for continuous_expr in m_expr.expressions:
                            if isinstance(continuous_expr, ExprNoteNode):
                                cur_beats += valToBeat(str(continuous_expr.note_value), float(note_value), bool(continuous_expr.dotted))
                                if cur_beats > float(beats_per_measure):
                                    line = continuous_expr.note_value.getSymbol().line
                                    col = continuous_expr.note_value.getSymbol().column

                                    raise Exception("Number of beats in measure has exceeded amount allowed within staff", line, col)
                                else:
                                    measure.append(createNote(str(continuous_expr.num), str(continuous_expr.pitch), str(continuous_expr.note_value)))
                                    printExprNote(continuous_expr)

                            elif isinstance(continuous_expr, ExprChordNode):
                                expected_note_val, is_dotted = processExprChord(continuous_expr.notes, "EXPR")
                                cur_beats += valToBeat(expected_note_val, float(note_value), is_dotted)
                                if cur_beats > float(beats_per_measure):
                                    line = m_expr.notes[0].note_value.getSymbol().line
                                    col = m_expr.notes[0].note_value.getSymbol().column

                                    raise Exception("Number of beats in measure has exceeded amount allowed within staff", line, col)
                                else:
                                    new_notes = []
                                    for n in continuous_expr.notes:
                                        new_notes.append((str(n.num), str(n.pitch)))
                                    measure.append(createChord(new_notes, expected_note_val))
                                    printExprChord(continuous_expr)

                            elif isinstance(continuous_expr, AccidentalExpressionNode):
                                print("Continuous Accidental")

                            else:
                                if (not self.checkInListNode(continuous_expr)): # Error checking identifier and if melody
                                    if isinstance(self.variables[continuous_expr.getText()][0], Staff):
                                        line = continuous_expr.getSymbol().line
                                        col = continuous_expr.getSymbol().column
                                        raise Exception("Variable must be note or chord but a melody is called", line, col)

                                    elif self.variables[continuous_expr.getText()][0] == "NOTE":
                                        cur_beats += valToBeat(str(self.variables[continuous_expr.getText()][1]), float(note_value), bool(self.variables[continuous_expr.getText()][4]))
                                        if cur_beats > float(beats_per_measure):
                                            line = continuous_expr.getSymbol().line
                                            col = continuous_expr.getSymbol().column

                                            raise Exception("Number of beats in measure has exceeded amount allowed within staff", line, col)
                                        else:
                                            measure.append(createNote(str(self.variables[continuous_expr.getText()][3]), str(self.variables[continuous_expr.getText()][2]), str(self.variables[continuous_expr.getText()][1])))

                                    elif self.variables[continuous_expr.getText()][0] == "CHORD":
                                        expected_note_val, is_dotted = processExprChord(self.variables[continuous_expr.getText()][1], "VAR")
                                        cur_beats += valToBeat(expected_note_val, float(note_value), is_dotted)
                                        if cur_beats > float(beats_per_measure):
                                            line = continuous_expr.getSymbol().line
                                            col = continuous_expr.getSymbol().column

                                            raise Exception("Number of beats in measure has exceeded amount allowed within staff", line, col)
                                        else:
                                            new_notes = []
                                            for n in self.variables[continuous_expr.getText()][1]:
                                                new_notes.append((str(n[2]), str(n[1])))
                                            measure.append(createChord(new_notes, expected_note_val))

                        print(m_expr.expressions)
                        print(m_expr)
                    else:
                        if (not self.checkInListNode(m_expr)): # Error checking identifier and if melody
                            if isinstance(self.variables[m_expr.getText()][0], Staff):
                                line = m_expr.getSymbol().line
                                col = m_expr.getSymbol().column
                                raise Exception("Variable must be note or chord but a melody is called", line, col)

                            elif self.variables[m_expr.getText()][0] == "NOTE":
                                cur_beats += valToBeat(str(self.variables[m_expr.getText()][1]), float(note_value), bool(self.variables[m_expr.getText()][4]))
                                if cur_beats > float(beats_per_measure):
                                    line = m_expr.getSymbol().line
                                    col = m_expr.getSymbol().column

                                    raise Exception("Number of beats in measure has exceeded amount allowed within staff", line, col)
                                else:
                                    measure.append(createNote(str(self.variables[m_expr.getText()][3]), str(self.variables[m_expr.getText()][2]), str(self.variables[m_expr.getText()][1]), bool(self.variables[m_expr.getText()][4])))

                            elif self.variables[m_expr.getText()][0] == "CHORD":
                                expected_note_val, is_dotted = processExprChord(self.variables[m_expr.getText()][1], "VAR")
                                cur_beats += valToBeat(expected_note_val, float(note_value), is_dotted)
                                if cur_beats > float(beats_per_measure):
                                    line = m_expr.getSymbol().line
                                    col = m_expr.getSymbol().column

                                    raise Exception("Number of beats in measure has exceeded amount allowed within staff", line, col)
                                else:
                                    new_notes = []
                                    for n in self.variables[m_expr.getText()][1]:
                                        new_notes.append((str(n[2]), str(n[1])))
                                    measure.append(createChord(new_notes, expected_note_val))

                        print(m_expr)
                staff.expressions.append(measure)
            elif isinstance(x, AccidentalExpressionNode):
                print("accidental")
                for acc_expr in x.accidentals:
                    print(acc_expr.accidental, acc_expr.pitch)

            elif isinstance(x, DeclareRepeatStartNode):
                if x.times is not None and int(x.times.getText()) > 100:
                    line = x.times.getSymbol().line
                    col = x.times.getSymbol().column
                    raise Exception("Number must be at most 100 only", line, col)
                elif x.times is not None and int(x.times.getText()) <= 0:
                    line = x.times.getSymbol().line
                    col = x.times.getSymbol().column
                    raise Exception("Number must be greater than 0", line, col)
                print("declare repeat start")

            elif isinstance(x, DeclareRepeatEndNode):
                print("declare repeat end")

    def evaluate(self, node):
        # BPM Value
        notes = []
        chords = []
        self.bpm = node.bpm
        self.instrument = node.instrument
        # print("bpm (" + str(node.bpm) + ")")

        if (int(self.bpm.getText()) > 300):
            line = self.bpm.getSymbol().line
            col = self.bpm.getSymbol().column

            raise Exception("Invalid BPM value not in range 300", line, col)
        
        elif (int(self.bpm.getText()) < 0):
            line = self.bpm.getSymbol().line
            col = self.bpm.getSymbol().column

            raise Exception("Invalid BPM value, cannot be less than 0", line, col)
        else:
            print("bpm (" + str(self.bpm) + ")")

        print(node.instrument.getText())

        self.evaluateDeclaredNotes(node.notes)  # Returns NoteExpression Objects
        self.evaluateDeclaredChords(node.chords)  # Returns ChordExpression Objects

        # for x in self.variables:
        #     if self.variables[x][0] == "NOTE":
        #         print(x, self.variables[x])
        #         num = self.variables[x][3]
        #         pitch = self.variables[x][2]
        #         val = self.variables[x][1]

        #         self.variables[x] = createNote(num, pitch, val)

        #     elif self.variables[x][0] == "CHORD":
        #         cur_notes = []
        #         val = self.variables[x][1][0] # get first note value; all same note value
        #         for n in self.variables[x][1]:
        #             num = n[2]
        #             pitch = n[1]
        #             cur_notes.append((num, pitch))
        #         self.variables[x] = createChord(cur_notes, val)

        self.evaluateDeclaredMelody(node.melodies)

        self.evaluateDeclaredStaffs(node.staffs)

        if len(self.repeat_ctr):
            print(len(self.repeat_ctr))
            rep = self.repeat_ctr[0]
            line = rep.REPSTART().getSymbol().line
            col = rep.REPSTART().getSymbol().column
            raise Exception("Invalid repeat placement", line, col)

        
        for i in self.staffs:
            if isinstance(i, layout.Staff):
                for j in i:
                    self.music_stream.append(j)
            else:
                if isinstance(i, Staff):
                    if i.melodyVariable is not None:
                        for staff in self.variables[i.melodyVariable]:
                            for j in staff.expressions:
                                self.music_stream.append(j)
                    else:
                        pass
        #add to stream
        # for x in notes:
        #     self.music_stream.append(x)
        self.music_stream.write('midi', fp='test.midi')
        
        # return "MIDI FILE"