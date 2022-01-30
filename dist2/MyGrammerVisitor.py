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
        return ctx.getChild(0)

    # Visit a parse tree produced by MyGrammerParser#bpm.
    def visitBpm(self, ctx: MyGrammerParser.BpmContext):
        val = ctx.INTEGER()

        if (int(val.getText()) > 300):
            line = val.getSymbol().line
            col = val.getSymbol().column

            raise Exception("Invalid BPM value not in range 300", line, col)
        
        elif (int(val.getText()) <0):
            line = val.getSymbol().line
            col = val.getSymbol().column

            raise Exception("Invalid BPM value, cannot be less than 0", line, col)

        return val

    # Visit a parse tree produced by MyGrammerParser#prog.
    def visitProg(self, ctx: MyGrammerParser.ProgContext):
        bpm = None
        notes = []
        chords = []
        staffs = []
        melodies = []

        for child_node in ctx.getChildren():
            node_type = child_node.__class__.__name__
            # print(node_type, child_node)
            if node_type == "BpmContext":
                bpm = self.visitBpm(child_node)
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
        note = self.visitExpr_note(expr)
        # Create an instance of DeclareNoteNode
        node = DeclareNoteNode(ctx.IDENTIFIER(), note)
        return node

    # Visit a parse tree produced by MyGrammerParser#declare_chord.
    def visitDeclare_chord(self, ctx: MyGrammerParser.Declare_chordContext):
        expr = ctx.expr_chord()
        
        notes = self.visitExpr_chord(expr)
        node = DeclareChordNode(ctx.IDENTIFIER(), notes)
        return node
        # return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#declare_melody.
    def visitDeclare_melody(self, ctx: MyGrammerParser.Declare_melodyContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#declare_continuous.
    def visitDeclare_continuous(
            self, ctx: MyGrammerParser.Declare_continuousContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#declare_measures.
    def visitDeclare_measures(self, ctx: MyGrammerParser.Declare_measuresContext):
        print("visitor declare measure", ctx.getChildren())
        for child_node in ctx.getChildren():
            node_type = child_node.__class__.__name__
            
            if node_type == "NoteExpressionContext":
                # Obtain the pitch and num values
                expr = child_node.expr_note()
                note = self.visitExpr_note(expr)
                print("note in measure", note) # ExprNoteNode() object
            # elif node_type == "ChordExpressionContext":
            #     chords.append(child_node)
            elif node_type == "VariableExpressionContext":
                expr = child_node.expr_var()
                print(expr,type(expr))
                var = self.visitExpr_var(expr)
                print("var in measure",var)
            else:
                pass


        return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#NoteExpression.
    def visitNoteExpression(self, ctx: MyGrammerParser.NoteExpressionContext):
        return self.visitChildren(ctx)

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
        note_value = self.visitNote_value(ctx.note_value())
        pitch = ctx.PITCH()
        num = ctx.INTEGER()
        dotted = ctx.DOTTED() if ctx.DOTTED() else None
        node = ExprNoteNode(note_value, pitch, num, dotted)
        return node

    # Visit a parse tree produced by MyGrammerParser#expr_chord.
    def visitExpr_chord(self, ctx: MyGrammerParser.Expr_chordContext):
        # list for all notes in an expr chord
        notes = []
        # empty list to pass to function add_expr_note
        add_notes = []
        
        #get a MusicNodes.ExprNoteNode Context from the chord declaration
        note = self.visitExpr_note(ctx.expr_note())

        #append it to the list
        notes.append(note)

        #get the additional note declarations
        add_note = self.visitExpr_add_note(ctx.expr_add_note(), add_notes)

        #combine the two lists
        notes = notes + add_note
        
        #store in a node containing the notes for a chord expression
        node = ExprChordNode(notes)

        #return
        return node
        # return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#expr_add_note.
    def visitExpr_add_note(self, ctx: MyGrammerParser.Expr_add_noteContext, notes):
        #recursive function that adds to a list after visting each additional add note production
        
        #copy the list 
        noteList = notes

        #append the MusicNodes.ExprNote.Node from the expr_note production
        noteList.append(self.visitExpr_note(ctx.expr_note()))
        
        #if there is an add_note production produced visit that as well
        if ctx.expr_add_note() is not None:
            self.visitExpr_add_note(ctx.expr_add_note(), noteList)

        #return the list of notes
        return noteList

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
        print("In visitor", ctx.getChildren())
        # for child in ctx.getChildren():

        staff_blocks = ctx.staff_block()
        # expressions = self.visitStaff_block(s)
        beats_per_measure = int(ctx.INTEGER(0).getText())
        beats_per_measure_line = ctx.INTEGER(0).getSymbol().line
        beats_per_measure_column = ctx.INTEGER(0).getSymbol().column
        note_value = int(ctx.INTEGER(1).getText())
        note_value_line = ctx.INTEGER(1).getSymbol().line
        note_value_column = ctx.INTEGER(1).getSymbol().column
        if not (note_value != 0 and (note_value & (note_value - 1)) == 0):
           raise Exception("Error: Note argument is not a power of 2",
                  note_value_line, note_value_column)
        
       
        node = DeclareStaffNode(beats_per_measure, staff_blocks, note_value, None)
        return node

        # return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#staff_block.
    def visitStaff_block(self, ctx: MyGrammerParser.Staff_blockContext):
        print("Visitor staff block")
        measures = self.visitDeclare_measures(ctx.declare_measures())
        node = StaffBlockNode(None, measures, None)
        return node
        # return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#repeat_block.
    def visitRepeat_block(self, ctx: MyGrammerParser.Repeat_blockContext):
        return self.visitChildren(ctx)


del MyGrammerParser