from dist2.MyGrammerParser import MyGrammerParser
from dist2.MyGrammerVisitor import MyGrammerVisitor
from MusicNodes import * 
from music21 import *


def printExprNote(note:ExprNoteNode):
    print(note.note_value, note.pitch,note.num, note.dotted)
    
def printExprChord(chord:ExprChordNode):
    print("chord (")
    for note in chord.notes:
        printExprNote(note)
    print(")")


class MusicEvaluator(MyGrammerVisitor):
    variables = {}
    music_stream = stream.Stream()

    
    def evaluateDeclaredNotes(self, ctx: MyGrammerParser.Declare_noteContext):
        # DECLARED NOTES
        for note in ctx:
            # Get all the DeclareNoteNodes
            temp = MyGrammerVisitor().visitDeclare_note(note)

            if temp.identifier.getText() not in self.variables:
                note_value = temp.note.note_value.getText()
                pitch = temp.note.pitch.getText()

                num = temp.note.num.getText()

                dotted = temp.note.dotted
                self.variables[temp.identifier.getText()] = (note_value, pitch,
                                                             num, dotted)
            else:
                line = temp.identifier.getSymbol().line
                col = temp.identifier.getSymbol().column
                raise Exception(
                    "Reassignment is not allowed. Use a different identifier",
                    line, col)
            
           
        # print("variables", self.variables)
        return self.variables

    def evaluateDeclaredChords(self, ctx: MyGrammerParser.Declare_chordContext):

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
                    notes.append((x.note_value.getText(), x.pitch.getText(), x.num.getText(), x.dotted))
                
                self.variables[temp.identifier.getText()] = (notes)
            
            #else if reassignment of a chord variable is attempted raise an exception 
            else:
                line = temp.identifier.getSymbol().line
                col = temp.identifier.getSymbol().column
                raise Exception(
                    "Reassignment is not allowed. Use a different identifier",
                    line, col)

        # print(self.variables)
        #return self.variables


    def evaluateDeclaredStaffs(self, ctx: MyGrammerParser.Declare_staffContext):
        # print("Declaring Staff", len(ctx.getChildren(), " found"))

        for i in ctx:
            # Gets a staff from music sheet
            staff = MyGrammerVisitor().visitDeclare_staff(i)
            top = staff.beats_per_measure
            bottom = staff.note_value
            
            for expr in staff.expressions:
                for x in expr:
                    if  isinstance (x, DeclareMeasuresNode):
                        for m_expr in x.expressions:
                            if isinstance(m_expr, ExprNoteNode):
                                printExprNote(m_expr)
                            elif isinstance(m_expr, ExprChordNode):
                                printExprChord(m_expr)
                    elif isinstance(x, AccidentalExpressionNode):
                        print("accidental")
                        for acc_expr in x.accidentals:
                            print(acc_expr.accidental, acc_expr.pitch)

            # Check the contents of each staff
            # print("staff blocks",len(staff.staff_blocks), " found") # Always 1? 
    
            
    
    # def visitDeclaredMeasure(top,bottom,notes):
    #     pass

    def evaluate(self, node):
        # BPM Value
        notes = []
        print("bpm (" + str(node.bpm) + ")")

        # DECLARED NOTES
        note_vars = self.evaluateDeclaredNotes(node.notes)  # Returns NoteExpression Objects
        
        for x in note_vars:
            num  = note_vars[x][2]
            pitch = note_vars[x][1]
            val = note_vars[x][0]

            # create notes
            v= note.Note(pitch+num)
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

        self.evaluateDeclaredStaffs(node.staffs)


        #add to stream
        for x in notes:
            self.music_stream.append(x)
        self.music_stream.write('midi', fp='test.midi')
        return "MIDI FILE"
