from dist2.MyGrammerParser import MyGrammerParser
from dist2.MyGrammerVisitor import MyGrammerVisitor
from MusicNodes import *
from music21 import *


def printExprNote(note: ExprNoteNode):
    print(note.note_value, note.pitch, note.num, note.dotted)


def printExprChord(chord: ExprChordNode):
    print("chord (")
    for note in chord.notes:
        printExprNote(note)
    print(")")


class MusicEvaluator(MyGrammerVisitor):
    variables = {}
    music_stream = stream.Stream()

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

                self.variables[temp.identifier.getText()] = (note_value, pitch,
                                                             num, dotted)
            else:
                line = temp.identifier.getSymbol().line
                col = temp.identifier.getSymbol().column
                raise Exception(
                    "Reassignment is not allowed. Use a different identifier",
                    line, col)

    def evaluateDeclaredChords(self,
                               ctx: MyGrammerParser.Declare_chordContext):

        #declare a list
        notes = []
        #for each chord in declare chord
        for chord in ctx:

            #use visitor method to traverse the visit declare chord subtree
            temp = MyGrammerVisitor().visitDeclare_chord(chord)

            # check if the identifier for the chord has already been declared
            if temp.identifier.getText() not in self.variables:
                #if not then store the corresponding notes of a chord in a list
                #each note is stored as tuple of values for each property of a note
                for x in temp.chord.notes:
                    notes.append(self.evaluateExprNoteNode(x))

                self.variables[temp.identifier.getText()] = (notes)

            #else if reassignment of a chord variable is attempted raise an exception
            else:
                line = temp.identifier.getSymbol().line
                col = temp.identifier.getSymbol().column
                raise Exception(
                    "Reassignment is not allowed. Use a different identifier",
                    line, col)

    def evaluateDeclaredStaffs(self, ctx: list):
        # print("Declaring Staff", len(ctx.getChildren(), " found"))
        for expr in ctx:
            if expr.__class__.__name__ == 'Declare_staffContext':
                # Gets a staff from music sheet
                staff = MyGrammerVisitor().visitDeclare_staff(expr)
                top = staff.beats_per_measure
                bottom = staff.note_value

                for block in staff.expressions:
                    self.evaluateStaffBlock(block)
            else:
                self.checkInList(expr)

            # Check the contents of each staff
            # print("staff blocks",len(staff.staff_blocks), " found") # Always 1?
    def checkInList(self, ctx):
        line = ctx.IDENTIFIER().getSymbol().line
        col = ctx.IDENTIFIER().getSymbol().column
        if ctx.IDENTIFIER().getText() not in self.variables:
            raise Exception("Variable called but not declared", line, col)

    def evaluateDeclaredMelody(self,
                               ctx: MyGrammerParser.Declare_melodyContext):
        # print("Declaring Melody", len(ctx.getChildren(), " found"))

        for i in ctx:
            # Gets a staff from music sheet
            melody = MyGrammerVisitor().visitDeclare_melody(i)
            identifier = melody.identifier
            staffs = melody.staffs
            print(identifier)
            for staff in staffs:
                top = staff.beats_per_measure
                bottom = staff.note_value

                print(top, bottom)
                for expr in staff.expressions:
                    self.evaluateStaffBlock(expr)
            # Check the contents of each staff
            # print("staff blocks",len(staff.staff_blocks), " found") # Always 1?

    def evaluateMelodyVar(self, ctx: MyGrammerParser.Expr_varContext):
        pass

    def evaluateStaffBlock(self,
                           ctx: list):  # List of Expressions of a staff block
        for x in ctx:
            if isinstance(x, DeclareMeasuresNode):
                for m_expr in x.expressions:
                    if isinstance(m_expr, ExprNoteNode):
                        printExprNote(m_expr)
                    elif isinstance(m_expr, ExprChordNode):
                        printExprChord(m_expr)
                    else:
                        print(m_expr)
            elif isinstance(x, AccidentalExpressionNode):
                print("accidental")
                for acc_expr in x.accidentals:
                    print(acc_expr.accidental, acc_expr.pitch)

    def evaluate(self, node):
        # BPM Value
        notes = []
        print("bpm (" + str(node.bpm) + ")")

        # DECLARED NOTES
        self.evaluateDeclaredNotes(
            node.notes)  # Returns NoteExpression Objects

        for x in self.variables:
            print(x)
            num = self.variables[x][2]
            pitch = self.variables[x][1]
            val = self.variables[x][0]

            # create notes
            v = note.Note(pitch + num)
            #update note duration
            if val == "eighth":
                d = duration.Duration(type="eigth")
                v.quarterLength = d.quarterLength
            if val == "sixteenth":
                v.quarterLength = 0.25
            if val == "full":
                d = duration.Duration(type="whole")
                v.quarterLength = d.quarterLength
            if val == "double":
                d = duration.Duration(type="double")
                v.quarterLength = d.quarterLength
            if val == "half":
                d = duration.Duration(type="half")
                v.quarterLength = d.quarterLength
            notes.append(v)

        # DECLARE CHORDS
        self.evaluateDeclaredChords(node.chords)
        # for chord in declared_chords:
        # TO DO: Chord

        self.evaluateDeclaredMelody(node.melodies)

        self.evaluateDeclaredStaffs(node.staffs)

        #add to stream
        # for x in notes:
        #     self.music_stream.append(x)
        # self.music_stream.write('midi', fp='test.midi')
        # return "MIDI FILE"
