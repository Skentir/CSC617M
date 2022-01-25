import sys
from antlr4 import *
from antlr4.tree.Trees import Trees
from dist2.MyGrammerLexer import MyGrammerLexer
from dist2.MyGrammerParser import MyGrammerParser
from dist2.MyGrammerVisitor import MyGrammerVisitor
from dist2.MyGrammerListener import MyGrammerListener
from MusicNodes import *


class MyVisitor(MyGrammerVisitor):
    variables = {}

    # def visitExpr_note(self, ctx: MyGrammerParser.Expr_chordContext):
    #     val = ctx.INTEGER()
    #     val2 = val.getText()

    #     if not (int(val2) != 0 and (int(val2) & (int(val2) - 1)) == 0):
    #         # print(type(val), val2)
    #         print("[line:%d,col:%d] Note argument is not a power of 2" %
    #               (val.getPayload().line, val.getPayload().column))

    # def visitDeclare_note(self, ctx: MyGrammerParser.Declare_noteContext):
    #     identifier = ctx.IDENTIFIER().getText()
    #     identifier_line = ctx.IDENTIFIER().getSymbol().line
    #     identifier_column = ctx.IDENTIFIER().getSymbol().column
    #     if (identifier in self.variables):
    #         print("Error: Variable name '" + identifier +
    #               "' has already been declared (" + str(identifier_line) +
    #               "," + str(identifier_column) + ")")
    #     else:
    #         self.variables.append(identifier)
    #     return self.visitChildren(ctx)
    #     # return int(val2)

    # def visitNoteExpression(self, ctx: MyGrammerParser.NoteExpressionContext):
    #     return self.visitChildren(ctx)

    # def visitDeclare_staff(self, ctx: MyGrammerParser.Declare_staffContext):
    #     beats_per_measure = int(ctx.INTEGER(0).getText())
    #     beats_per_measure_line = ctx.INTEGER(0).getSymbol().line
    #     beats_per_measure_column = ctx.INTEGER(0).getSymbol().column
    #     note_value = int(ctx.INTEGER(1).getText())
    #     note_value_line = ctx.INTEGER(1).getSymbol().line
    #     note_value_column = ctx.INTEGER(1).getSymbol().column
    #     if not (note_value != 0 and (note_value & (note_value - 1)) == 0):
    #         print("Error: Note argument is not a power of 2 (" +
    #               str(note_value_line) + "," + str(note_value_column) + ")")
    #     return self.visitChildren(ctx)

    def visitDeclaredNotes(self, ctx):
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

        print("variables", self.variables)

    def visitDeclaredChords(self, ctx):
        print(ctx)

    def visit(self, node):
        # BPM Value
        print("bpm (" + str(node.bpm) + ")")

        # DECLARED NOTES
        self.visitDeclaredNotes(node.notes)  # Returns NoteExpression Objects
        # DECLARE CHORDS
        self.visitDeclaredChords(node.chords)
        # for chord in declared_chords:
        # TO DO: Chord
        return "MIDI FILE"


if __name__ == "__main__":

    # data = InputStream(input(">>> "))
    file = input("Input filename.sht: ")
    with open(file + ".sht") as f:
        data = InputStream(f.read())

    # lexer
    lexer = MyGrammerLexer(data)
    stream = CommonTokenStream(lexer)
    # stream.fill()
    # for token in stream.tokens:
    #     if token.text != "<EOF>":
    #         print(token.text, lexer.symbolicNames[token.type])

    # parser
    parser = MyGrammerParser(stream)
    tree = parser.prog()
    # print(parser.getCurrentToken())

    # print(tree.toStringTree())
    # evaluator
    # print(type(tree), tree)
    try:
        ast = MyGrammerVisitor().visitProg(tree)
        output = MyVisitor().visit(ast)
    except Exception as err:
        print("Caught Error: %s in line:%d col:%d" %
              (err.args[0], err.args[1], err.args[2]))

    # printer = MyGrammerPrintListener()
    # walker = ParseTreeWalker()
    # walker.walk(printer, tree)