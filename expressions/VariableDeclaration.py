import Expression

class VariableDeclaration(Expression):

    id = ""
    type = ""
    value = None

    def __init__(self, id, type, value):
        self.id = id
        self.type = type
        self.value = value

    def toString(self):
        return self.id + " = " + self.value.toString()