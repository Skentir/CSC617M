# Generated from MyGrammer.g4 by ANTLR 4.9.2
from antlr4 import *
from MusicNodes import *
if __name__ is not None and "." in __name__:
    from .MyGrammerParser import MyGrammerParser
else:
    from MyGrammerParser import MyGrammerParser

# This class defines a complete generic visitor for a parse tree produced by MyGrammerParser.


class MyGrammerVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MyGrammerParser#keyword.
    def visitKeyword(self, ctx: MyGrammerParser.KeywordContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#note_value.
    def visitNote_value(self, ctx: MyGrammerParser.Note_valueContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#bpm.
    def visitBpm(self, ctx: MyGrammerParser.BpmContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#prog.
    def visitProg(self, ctx: MyGrammerParser.ProgContext):
        bpm = None
        notes = []
        chords = []
        staffs = []
        melodies = []

        # print(node.bpm)
        for child_node in ctx.getChildren():
            node_type = child_node.__class__.__name__
            print(node_type, child_node)
            if node_type == "BpmContext":
                bpm = child_node
            elif node_type == "Declare_noteContext":
                notes.append(child_node)
            elif node_type == "Declare_chordContext":
                chords.append(child_node)
            elif node_type == "Declare_melodyContext":
                melodies.append(child_node)
            elif node_type == "Declare_staffContext":
                staffs.append(child_node)
            else:
                pass

        node = ProgNode(bpm, notes, chords, melodies, staffs)
        return node
        # print(node)
        # return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#declare_note.
    def visitDeclare_note(self, ctx: MyGrammerParser.Declare_noteContext):
        # Access the expr_note production
        expr = ctx.expr_note()
        # Obtain the pitch and num values
        note = self.visitNoteExpression(expr)
        # Create an instance of DeclareNoteNode
        node = DeclareNoteNode(ctx.IDENTIFIER().getText(), note)
        return node

    # Visit a parse tree produced by MyGrammerParser#declare_chord.
    def visitDeclare_chord(self, ctx: MyGrammerParser.Declare_chordContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#declare_melody.
    def visitDeclare_melody(self, ctx: MyGrammerParser.Declare_melodyContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#declare_continuous.
    def visitDeclare_continuous(
            self, ctx: MyGrammerParser.Declare_continuousContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#declare_measures.
    def visitDeclare_measures(self,
                              ctx: MyGrammerParser.Declare_measuresContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#NoteExpression.
    def visitNoteExpression(self, ctx: MyGrammerParser.NoteExpressionContext):
        pitch = ctx.PITCH().getText()
        num = int(ctx.INTEGER().getText())
        node = NoteExpression(pitch, num)
        return node

    # Visit a parse tree produced by MyGrammerParser#ChordExpression.
    def visitChordExpression(self,
                             ctx: MyGrammerParser.ChordExpressionContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#VariableExpression.
    def visitVariableExpression(
            self, ctx: MyGrammerParser.VariableExpressionContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#AccidentalExpression.
    def visitAccidentalExpression(
            self, ctx: MyGrammerParser.AccidentalExpressionContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#expr_note.
    def visitExpr_note(self, ctx: MyGrammerParser.Expr_noteContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#expr_chord.
    def visitExpr_chord(self, ctx: MyGrammerParser.Expr_chordContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#expr_add_note.
    def visitExpr_add_note(self, ctx: MyGrammerParser.Expr_add_noteContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#expr_var.
    def visitExpr_var(self, ctx: MyGrammerParser.Expr_varContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#expr_acc.
    def visitExpr_acc(self, ctx: MyGrammerParser.Expr_accContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#expr_add_acc.
    def visitExpr_add_acc(self, ctx: MyGrammerParser.Expr_add_accContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#declare_repeat.
    def visitDeclare_repeat(self, ctx: MyGrammerParser.Declare_repeatContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#declare_repeat_end.
    def visitDeclare_repeat_end(
            self, ctx: MyGrammerParser.Declare_repeat_endContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#repeat_end_expr.
    def visitRepeat_end_expr(self,
                             ctx: MyGrammerParser.Repeat_end_exprContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#declare_staff.
    def visitDeclare_staff(self, ctx: MyGrammerParser.Declare_staffContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#staff_block.
    def visitStaff_block(self, ctx: MyGrammerParser.Staff_blockContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#repeat_block.
    def visitRepeat_block(self, ctx: MyGrammerParser.Repeat_blockContext):
        return self.visitChildren(ctx)


del MyGrammerParser