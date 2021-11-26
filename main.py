import sys
from antlr4 import *
from dist.MyGrammerLexer import MyGrammerLexer
from dist.MyGrammerParser import MyGrammerParser
# from dist.MyGrammerVisitor import MyGrammerVisitor
from dist.MyGrammerListener import MyGrammerListener


def get_username():
    from pwd import getpwuid
    from os import getuid
    return getpwuid(getuid())[ 0 ]


if __name__ == "__main__":

    while 1:
        data =  InputStream(input(">>> "))
        # lexer
        lexer = MyGrammerLexer(data)
        stream = CommonTokenStream(lexer)
        stream.fill()
        for token in stream.tokens:
            if token.text != '<EOF>':
                print(token.text, lexer.symbolicNames[token.type])
        
    file = input("Input file")
    
        # parser
        # parser = MyGrammerParser(stream)
        # tree = parser.expr()
        # print(parser.getCurrentToken())
        # evaluator
        # visitor = MyGrammerVisitor()
        # output = visitor.visit(tree)
        
        # printer = MyGrammerListener()
        # walker = ParseTreeWalker()
        # walker.walk(printer, tree)