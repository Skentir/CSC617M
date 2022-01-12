class StaffDeclaration():
    top = None
    bottom =  None
    expressions = []
    def _init__(self, top, bottom, expressions):
        self.top = top
        self.bottom = bottom
        self.expressions.add(expressions)