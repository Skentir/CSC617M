import sys
from antlr4 import *
from antlr4.tree.Trees import Trees
from dist.MyGrammerLexer import MyGrammerLexer
from dist.MyGrammerParser import MyGrammerParser
from dist.MyGrammerVisitor import MyGrammerVisitor
from dist.MyGrammerListener import MyGrammerListener


def get_username():
    from pwd import getpwuid
    from os import getuid
    return getpwuid(getuid())[ 0 ]

class MyGrammerPrintListener(MyGrammerListener):
    def enterHi(self, ctx):
        print("Hello: %s" % ctx.ID())


if __name__ == "__main__":

    # data = InputStream(input(">>> "))
    file = input("Input filename.sht: ")
    with open(file + ".sht") as f:
        data = InputStream(f.read())

    # lexer
    lexer = MyGrammerLexer(data)
    stream = CommonTokenStream(lexer)
    stream.fill()
    for token in stream.tokens:
        if token.text != "<EOF>":
            print(token.text, lexer.symbolicNames[token.type])

    # parser
    parser = MyGrammerParser(stream)
    tree = parser.prog()
    print(parser.getCurrentToken())
    
    print(tree.toStringTree())
    # evaluator
    # visitor = MyGrammerVisitor()
    # output = visitor.visit(tree)
    
    # printer = MyGrammerPrintListener()
    # walker = ParseTreeWalker()
    # walker.walk(printer, tree)