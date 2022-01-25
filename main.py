import sys
from antlr4 import *
from antlr4.tree.Trees import Trees
from dist.MyGrammerLexer import MyGrammerLexer
from dist.MyGrammerParser import MyGrammerParser
from dist.MyGrammerVisitor import MyGrammerVisitor
from dist.MyGrammerListener import MyGrammerListener

class MyVisitor(MyGrammerVisitor):
    # errorlist = []
    def visitBpm(self, ctx:MyGrammerParser.BpmContext):
        val = ctx.INTEGER() # TerminalNde
        
        sourceInterval = ctx.getSourceInterval();
        firstToken = CommonTokenStream.getToken(0,3);
        line = firstToken.getLine();
        
        
        val2 = val.getText()
        # accept, depth, getAltNumber, getPayload, getRuleContext, getRuleIndex, getText, isEmpty, setAltNumber, setParent, toString, toString, toString, toString, toString, toStringTree, toStringTree, toStringTree

        if(int(val2)>300):
            # errorlist.append("Error: BPM value exceeds 300")
            print(type(val), val2)
        return self.visitChildren(ctx)
        # return int(val2)
    



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