# Generated from MyGrammer.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MyGrammerParser import MyGrammerParser
else:
    from MyGrammerParser import MyGrammerParser

# This class defines a complete listener for a parse tree produced by MyGrammerParser.
class MyGrammerListener(ParseTreeListener):

    # Enter a parse tree produced by MyGrammerParser#prog.
    def enterProg(self, ctx:MyGrammerParser.ProgContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#prog.
    def exitProg(self, ctx:MyGrammerParser.ProgContext):
        pass



del MyGrammerParser