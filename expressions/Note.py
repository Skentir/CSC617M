import Expression

class Note(Expression):

    noteValue = None
    pitch = None
    num = 0
    isDotted = False

    def __init__(self, noteValue, pitch, num, isDotted):
        self.noteValue = noteValue
        self.pitch = pitch
        self.num = 0
        self.isDotted = isDotted

    def toString(self):
        if self.isDotted:
            return self.noteValue.toString() + "( " + self.pitch.toString() + ", " + self.num.toString() + ")*"
        else:
            return self.noteValue.toString() + "( " + self.pitch.toString() + ", " + self.num.toString() + ")"