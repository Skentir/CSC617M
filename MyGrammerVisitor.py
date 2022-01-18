# Generated from MyGrammer.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MyGrammerParser import MyGrammerParser
else:
    from MyGrammerParser import MyGrammerParser

# This class defines a complete generic visitor for a parse tree produced by MyGrammerParser.

class MyGrammerVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MyGrammerParser#prog.
    def visitProg(self, ctx:MyGrammerParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#BPMDeclaration.
    def visitBPMDeclaration(self, ctx:MyGrammerParser.BPMDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#bpm.
    def visitBpm(self, ctx:MyGrammerParser.BpmContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#NoteExpression.
    def visitNoteExpression(self, ctx:MyGrammerParser.NoteExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#ChordExpression.
    def visitChordExpression(self, ctx:MyGrammerParser.ChordExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#VariableExpression.
    def visitVariableExpression(self, ctx:MyGrammerParser.VariableExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#AccidentalExpression.
    def visitAccidentalExpression(self, ctx:MyGrammerParser.AccidentalExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#expr_note.
    def visitExpr_note(self, ctx:MyGrammerParser.Expr_noteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#expr_chord.
    def visitExpr_chord(self, ctx:MyGrammerParser.Expr_chordContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#expr_add_note.
    def visitExpr_add_note(self, ctx:MyGrammerParser.Expr_add_noteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#expr_var.
    def visitExpr_var(self, ctx:MyGrammerParser.Expr_varContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#expr_acc.
    def visitExpr_acc(self, ctx:MyGrammerParser.Expr_accContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#expr_add_acc.
    def visitExpr_add_acc(self, ctx:MyGrammerParser.Expr_add_accContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#declare_repeat.
    def visitDeclare_repeat(self, ctx:MyGrammerParser.Declare_repeatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#declare_repeat_end.
    def visitDeclare_repeat_end(self, ctx:MyGrammerParser.Declare_repeat_endContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#repeat_end_expr.
    def visitRepeat_end_expr(self, ctx:MyGrammerParser.Repeat_end_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#declare_melody.
    def visitDeclare_melody(self, ctx:MyGrammerParser.Declare_melodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#declare_staff.
    def visitDeclare_staff(self, ctx:MyGrammerParser.Declare_staffContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyGrammerParser#declare_measures.
    def visitDeclare_measures(self, ctx:MyGrammerParser.Declare_measuresContext):
        return self.visitChildren(ctx)



del MyGrammerParser