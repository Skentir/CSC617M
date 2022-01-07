import Expression

class Variable(Expression):

    id = ""

    def __init__(self, id):
        self.id = id

    def toString(self):
        return self.id