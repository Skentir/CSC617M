import sys
from antlr4 import *
from antlr4.tree.Trees import Trees
from dist.MyGrammerLexer import MyGrammerLexer
from dist.MyGrammerParser import MyGrammerParser
from dist.MyGrammerVisitor import MyGrammerVisitor
from dist.MyGrammerListener import MyGrammerListener


class MyVisitor(MyGrammerVisitor):
    variables = []
    # errorlist = []
<<<<<<< HEAD
    def visitBpm(self, ctx: MyGrammerParser.BpmContext):
        val = ctx.INTEGER()  # TerminalNde
        # sourceInterval = ctx.getSourceInterval();
        # firstToken = CommonTokenStream.getToken(0,3);
        # line = firstToken.getLine();

        val2 = val.getText()
        # accept, depth, getAltNumber, getPayload, getRuleContext, getRuleIndex, getText, isEmpty, setAltNumber, setParent, toString, toString, toString, toString, toString, toStringTree, toStringTree, toStringTree

        if (int(val2) > 300):
            # errorlist.append("Error: BPM value exceeds 300")
            # print(type(val), val2)
            print("[line:%d,col:%d] BPM value exceeds 300" %
                  (val.getPayload().line, val.getPayload().column))
=======
    def visitBpm(self, ctx:MyGrammerParser.BpmContext):
        bpm = int(ctx.INTEGER().getText()) # TerminalNde
        bpm_line = ctx.INTEGER().getSymbol().line
        bpm_column = ctx.INTEGER().getSymbol().column
        # val = ctx.INTEGER()
        # sourceInterval = ctx.getSourceInterval();
        # firstToken = CommonTokenStream.getToken(0,3);
        # line = firstToken.getLine();
        # val2 = val.getText()
        # accept, depth, getAltNumber, getPayload, getRuleContext, getRuleIndex, getText, isEmpty, setAltNumber, setParent, toString, toString, toString, toString, toString, toStringTree, toStringTree, toStringTree

        if(bpm > 300):
            # errorlist.append("Error: BPM value exceeds 300")
            # print(type(val), val2)

            # print(ctx.INTEGER().getSymbol().text, bpm)
            print("Error: BPM value exceeds 300 (" + str(bpm_line) + "," + str(bpm_column) + ")")
>>>>>>> 8f89b52a900cbac69cf2b60394940c775837e890
        return self.visitChildren(ctx)
        # return int(val2)

    def visitExpr_note(self, ctx: MyGrammerParser.Expr_chordContext):
        val = ctx.INTEGER()
        val2 = val.getText()

<<<<<<< HEAD
        if not (int(val2) != 0 and (int(val2) & (int(val2) - 1)) == 0):
            # print(type(val), val2)
            print("[line:%d,col:%d] Note argument is not a power of 2" %
                  (val.getPayload().line, val.getPayload().column))
=======
        # if not (int(val2) != 0 and (int(val2) & (int(val2) - 1)) == 0):
        #     print(type(val), val2)
        #     print("Error: Note argument is not a power of 2")
        return self.visitChildren(ctx)
>>>>>>> 8f89b52a900cbac69cf2b60394940c775837e890

    def visitDeclare_note(self, ctx:MyGrammerParser.Declare_noteContext):
        identifier = ctx.IDENTIFIER().getText()
        identifier_line = ctx.IDENTIFIER().getSymbol().line
        identifier_column = ctx.IDENTIFIER().getSymbol().column
        if (identifier in self.variables):
            print("Error: Variable name '" + identifier + "' has already been declared (" + str(identifier_line) + "," + str(identifier_column) + ")")
        else:
            self.variables.append(identifier)
        return self.visitChildren(ctx)
        # return int(val2)

        
    def visitNoteExpression(self, ctx:MyGrammerParser.NoteExpressionContext):
        return self.visitChildren(ctx)

        
    def visitDeclare_staff(self, ctx:MyGrammerParser.Declare_staffContext):
        beats_per_measure = int(ctx.INTEGER(0).getText())
        beats_per_measure_line = ctx.INTEGER(0).getSymbol().line
        beats_per_measure_column = ctx.INTEGER(0).getSymbol().column
        note_value = int(ctx.INTEGER(1).getText())
        note_value_line = ctx.INTEGER(1).getSymbol().line
        note_value_column = ctx.INTEGER(1).getSymbol().column
        if not (note_value != 0 and (note_value & (note_value - 1)) == 0):
            print("Error: Note argument is not a power of 2 (" + str(note_value_line) + "," + str(note_value_column) + ")")
        return self.visitChildren(ctx)


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
    visitor = MyVisitor()
    output = visitor.visit(tree)
    print(output)

    # printer = MyGrammerPrintListener()
    # walker = ParseTreeWalker()
    # walker.walk(printer, tree)