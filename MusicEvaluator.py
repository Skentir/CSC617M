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
        declared_chords = {}
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
                declared_chords[temp.identifier.getText()] = (notes)
            
            #else if reassignment of a chord variable is attempted raise an exception 
            else:
                line = temp.identifier.getSymbol().line
                col = temp.identifier.getSymbol().column
                raise Exception(
                    "Reassignment is not allowed. Use a different identifier",
                    line, col)

        # print(self.variables)
        return declared_chords


    def evaluateDeclaredStaffs(self, ctx: MyGrammerParser.Declare_staffContext):
        # print("Declaring Staff", len(ctx.getChildren(), " found"))

        for i in ctx:
            # Gets a staff from music sheet
            staff = MyGrammerVisitor().visitDeclare_staff(i)
            top = staff.beats_per_measure # 2
            bottom = staff.note_value # 8
            
            for expr in staff.expressions:
                for x in expr:
                    if isinstance(x, DeclareMeasuresNode):
                        cur_beats = 0

                        for m_expr in x.expressions:
                            if isinstance(m_expr, ExprNoteNode):
                                val = m_expr.note_value
                                dotted = m_expr.dotted

                                cur_beats += valToBeat(str(val), float(bottom), bool(dotted))
                                if cur_beats > float(top):
                                    line = m_expr.note_value.getSymbol().line
                                    col = m_expr.note_value.getSymbol().column

                                    raise Exception("Number of beats in measure has exceeded amount allowed within staff", line, col)

                                printExprNote(m_expr)

                            elif isinstance(m_expr, ExprChordNode):
                                notes = m_expr.notes
                                expected_note_val = ""
                                is_dotted = False

                                for idx, n in enumerate(notes): # Checking if all notes in chord have same note_value
                                    if bool(n.dotted):
                                        is_dotted = True
                                        
                                    if idx == 0:
                                        expected_note_val = str(n.note_value)
                                    else:
                                        if str(n.note_value) != expected_note_val:
                                            line = n.note_value.getSymbol().line
                                            col = n.note_value.getSymbol().column

                                            raise Exception("Mismatch in note values, all notes within a chord must have the same note value", line, col)

                                cur_beats += valToBeat(expected_note_val, float(bottom), is_dotted)
                                if cur_beats > float(top):
                                    line = m_expr.note_value.getSymbol().line
                                    col = m_expr.note_value.getSymbol().column

                                    raise Exception("Number of beats in measure has exceeded amount allowed within staff", line, col)
                                
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
        chords = []
        bpm = node.bpm

        if (int(bpm.getText()) > 300):
            line = bpm.getSymbol().line
            col = bpm.getSymbol().column

            raise Exception("Invalid BPM value not in range 300", line, col)
        
        elif (int(bpm.getText()) < 0):
            line = bpm.getSymbol().line
            col = bpm.getSymbol().column

            raise Exception("Invalid BPM value, cannot be less than 0", line, col)
        else:
            print("bpm (" + str(bpm) + ")")

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
                d = duration.Duration(type="eighth")
                v.quarterLength = d.quarterLength
            if val == "sixteenth":
                v.quarterLength = 0.25
            if val == "full":
                d = duration.Duration(type="whole")
                v.quarterLength = d.quarterLength
            if val == "double":
                v.quarterLength = 2.0
            if val == "half":
                d = duration.Duration(type="half")
                v.quarterLength = d.quarterLength
            notes.append(v)
                
        # DECLARE CHORDS
        chord_vars = self.evaluateDeclaredChords(node.chords)
        
        for x in chord_vars:
            cur_notes = []
            for n in chord_vars[x]:
                num = n[2]
                pitch = n[1]
                val = n[0]

                # create notes
                v = note.Note(pitch+num)
                #update note duration
                if val == "eighth":
                    d = duration.Duration(type="eighth")
                    v.quarterLength = d.quarterLength
                if val == "sixteenth":
                    v.quarterLength = 0.25
                if val == "full":
                    d = duration.Duration(type="whole")
                    v.quarterLength = d.quarterLength
                if val == "double":
                    v.quarterLength = 2.0
                if val == "half":
                    d = duration.Duration(type="half")
                    v.quarterLength = d.quarterLength
                cur_notes.append(v)

            chords.append(chord.Chord(cur_notes))

        self.evaluateDeclaredStaffs(node.staffs)

        #add to stream
        for x in notes:
            self.music_stream.append(x)
        self.music_stream.write('midi', fp='test.midi')
        return "MIDI FILE"