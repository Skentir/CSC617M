import Expression

class Pitch(Expression):

    letter = ""

    def __init__(self, letter):
        self.letter = letter

    def toString(self):
        return self.letter