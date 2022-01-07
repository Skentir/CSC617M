import Expression

class NoteValue(Expression):

    val = ""

    def __init__(self, val):
        self.val = val

    def toString(self):
        return self.val