import sys
from antlr4 import *
from antlr4.tree.Trees import Trees
from MyGrammerLexer import MyGrammerLexer
from MyGrammerParser import MyGrammerParser
from MyGrammerVisitor import MyGrammerVisitor
# from dist2.MyGrammerListener import MyGrammerListener
# from MusicNodes import *
from music21 import *

from MusicEvaluator import MusicEvaluator

if __name__ == "__main__":

    # data = InputStream(input(">>> "))
    file = input("Input filename.sht: ")
    with open(file + ".sht") as f:
        data = InputStream(f.read())

        # lexer
        # try:
        lexer = MyGrammerLexer(data)
    # except Exception as err:
    #     print(err)

    stream = CommonTokenStream(lexer)
    # stream.fill()
    # for token in stream.tokens:
    #     if token.text != "<EOF>":
    #         print(token.text, lexer.symbolicNames[token.type])

    # parser

    parser = MyGrammerParser(stream)
    tree = parser.prog()
    if parser._syntaxErrors == 0:
        # print(parser.getCurrentToken())

        # print(tree.toStringTree())
        # evaluator
        # print(type(tree), tree)
        try:

            ast = MyGrammerVisitor().visitProg(tree)
            output = MusicEvaluator().evaluate(ast)

        except Exception as err:
            print("Caught Error: %s in line:%d col:%d" %
                  (err.args[0], err.args[1], err.args[2]))
    else:
        print("Failed to parse")

    fp = 'test.midi'
    mf = midi.MidiFile()
    mf.open(fp)
    mf.read()
    mf.close()
    print(mf.tracks[0])
    sp = converter.parse('test.midi')
    sp = midi.realtime.StreamPlayer(sp)
    sp.play()

    # try:
    #     ast = MyGrammerVisitor().visitProg(tree)
    #     output = MyVisitor().visit(ast)

    # except Exception as err:
    #     print("Caught Error: %s in line:%d col:%d" %
    #         (err.args[0], err.args[1], err.args[2]))
    # printer = MyGrammerPrintListener()
    # walker = ParseTreeWalker()
    # walker.walk(printer, tree)