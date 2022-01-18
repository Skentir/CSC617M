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


    # Enter a parse tree produced by MyGrammerParser#BPMDeclaration.
    def enterBPMDeclaration(self, ctx:MyGrammerParser.BPMDeclarationContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#BPMDeclaration.
    def exitBPMDeclaration(self, ctx:MyGrammerParser.BPMDeclarationContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#bpm.
    def enterBpm(self, ctx:MyGrammerParser.BpmContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#bpm.
    def exitBpm(self, ctx:MyGrammerParser.BpmContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#NoteExpression.
    def enterNoteExpression(self, ctx:MyGrammerParser.NoteExpressionContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#NoteExpression.
    def exitNoteExpression(self, ctx:MyGrammerParser.NoteExpressionContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#ChordExpression.
    def enterChordExpression(self, ctx:MyGrammerParser.ChordExpressionContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#ChordExpression.
    def exitChordExpression(self, ctx:MyGrammerParser.ChordExpressionContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#VariableExpression.
    def enterVariableExpression(self, ctx:MyGrammerParser.VariableExpressionContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#VariableExpression.
    def exitVariableExpression(self, ctx:MyGrammerParser.VariableExpressionContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#AccidentalExpression.
    def enterAccidentalExpression(self, ctx:MyGrammerParser.AccidentalExpressionContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#AccidentalExpression.
    def exitAccidentalExpression(self, ctx:MyGrammerParser.AccidentalExpressionContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#expr_note.
    def enterExpr_note(self, ctx:MyGrammerParser.Expr_noteContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#expr_note.
    def exitExpr_note(self, ctx:MyGrammerParser.Expr_noteContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#expr_chord.
    def enterExpr_chord(self, ctx:MyGrammerParser.Expr_chordContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#expr_chord.
    def exitExpr_chord(self, ctx:MyGrammerParser.Expr_chordContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#expr_add_note.
    def enterExpr_add_note(self, ctx:MyGrammerParser.Expr_add_noteContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#expr_add_note.
    def exitExpr_add_note(self, ctx:MyGrammerParser.Expr_add_noteContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#expr_var.
    def enterExpr_var(self, ctx:MyGrammerParser.Expr_varContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#expr_var.
    def exitExpr_var(self, ctx:MyGrammerParser.Expr_varContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#expr_acc.
    def enterExpr_acc(self, ctx:MyGrammerParser.Expr_accContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#expr_acc.
    def exitExpr_acc(self, ctx:MyGrammerParser.Expr_accContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#expr_add_acc.
    def enterExpr_add_acc(self, ctx:MyGrammerParser.Expr_add_accContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#expr_add_acc.
    def exitExpr_add_acc(self, ctx:MyGrammerParser.Expr_add_accContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#declare_repeat.
    def enterDeclare_repeat(self, ctx:MyGrammerParser.Declare_repeatContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#declare_repeat.
    def exitDeclare_repeat(self, ctx:MyGrammerParser.Declare_repeatContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#declare_repeat_end.
    def enterDeclare_repeat_end(self, ctx:MyGrammerParser.Declare_repeat_endContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#declare_repeat_end.
    def exitDeclare_repeat_end(self, ctx:MyGrammerParser.Declare_repeat_endContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#repeat_end_expr.
    def enterRepeat_end_expr(self, ctx:MyGrammerParser.Repeat_end_exprContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#repeat_end_expr.
    def exitRepeat_end_expr(self, ctx:MyGrammerParser.Repeat_end_exprContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#declare_melody.
    def enterDeclare_melody(self, ctx:MyGrammerParser.Declare_melodyContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#declare_melody.
    def exitDeclare_melody(self, ctx:MyGrammerParser.Declare_melodyContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#declare_staff.
    def enterDeclare_staff(self, ctx:MyGrammerParser.Declare_staffContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#declare_staff.
    def exitDeclare_staff(self, ctx:MyGrammerParser.Declare_staffContext):
        pass


    # Enter a parse tree produced by MyGrammerParser#declare_measures.
    def enterDeclare_measures(self, ctx:MyGrammerParser.Declare_measuresContext):
        pass

    # Exit a parse tree produced by MyGrammerParser#declare_measures.
    def exitDeclare_measures(self, ctx:MyGrammerParser.Declare_measuresContext):
        pass



del MyGrammerParser