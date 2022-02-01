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

        elif (int(val.getText()) < 0):
            line = val.getSymbol().line
            col = val.getSymbol().column

            raise Exception("Invalid BPM value, cannot be less than 0", line,
                            col)

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
            elif node_type == "Declare_staffContext" or node_type == "Expr_varContext":
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
        expr = ctx.declare_staff()
        staffs = []
        if isinstance(expr, list):
            for staff in expr:
                staffs.append(self.visitDeclare_staff(staff))
        else:
            staffs = self.visitDeclare_staff(expr)
        node = DeclareMelodyNode(ctx.IDENTIFIER(), staffs)
        return node

    # Visit a parse tree produced by MyGrammerParser#declare_continuous.
    def visitDeclare_continuous(
            self, ctx: MyGrammerParser.Declare_continuousContext):

        expr_list = []
        for child_node in ctx.expr():
            node_type = child_node.__class__.__name__
            if node_type == "NoteExpressionContext":
                # Obtain the pitch and num values
                expr = child_node.expr_note()
                note = self.visitExpr_note(expr)  # ExprNoteNode() object
                expr_list.append(note)
            elif node_type == "ChordExpressionContext":
                expr = child_node.expr_chord()
                chord = self.visitExpr_chord(expr)  # ExprChordNode() object
                expr_list.append(chord)
            elif node_type == "VariableExpressionContext":
                expr = child_node.expr_var()
                var = self.visitExpr_var(expr)  # IDENTFIER, TerminalNodeImpl
                expr_list.append(var)
        node = DeclareContinousNode(expr_list)
        return node

    # Visit a parse tree produced by MyGrammerParser#declare_measures.
    def visitDeclare_measures(self,
                              ctx: MyGrammerParser.Declare_measuresContext):
        expr_list = []
        for child_node in ctx.getChildren():
            node_type = child_node.__class__.__name__

            if node_type == "NoteExpressionContext":
                # Obtain the pitch and num values
                expr = child_node.expr_note()
                note = self.visitExpr_note(expr)  # ExprNoteNode() object
                expr_list.append(note)
            elif node_type == "ChordExpressionContext":
                expr = child_node.expr_chord()
                chord = self.visitExpr_chord(expr)  # ExprChordNode() object
                expr_list.append(chord)
            elif node_type == "VariableExpressionContext":
                expr = child_node.expr_var()
                var = self.visitExpr_var(expr)  # IDENTFIER, TerminalNodeImpl
                expr_list.append(var)
            elif node_type == "Declare_continuousContext":
                cont = self.visitDeclare_continuous(child_node)
                expr_list.append(cont)
            else:
                pass

        node = DeclareMeasuresNode(expr_list)
        return node

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
    def visitExpr_add_note(self, ctx: MyGrammerParser.Expr_add_noteContext,
                           notes):
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
        return ctx.IDENTIFIER()
        # return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#expr_acc.
    def visitExpr_acc(self, ctx: MyGrammerParser.Expr_accContext):
        # List of accidentals
        acc_list = []
        # for child in ctx.getChildren(): # Expr_add_accContext
        #     print(child, type(child))
        add_acc = self.visitExpr_add_acc(ctx.expr_add_acc(), acc_list)
        node = AccidentalExpressionNode(add_acc)
        return node
        # return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#expr_add_acc.
    def visitExpr_add_acc(self, ctx: MyGrammerParser.Expr_add_accContext,
                          accs):

        #copy the list of accidental nodes
        accList = accs
        node = AccidentalNode(ctx.PITCH(), ctx.ACCIDENTAL())

        accList.append(node)

        if ctx.expr_add_acc() is not None:
            self.visitExpr_add_acc(ctx.expr_add_acc(), accList)

        #return the list of notes
        return accList

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

        beats_per_measure = ctx.INTEGER(0).getText()
        note_value = ctx.INTEGER(1).getText()
        expressions = []
        for child_node in ctx.getChildren():
            node_type = child_node.__class__.__name__
            if node_type == 'Staff_blockContext':
                staff_block_list = []
                expressions.append(
                    self.visitStaff_block(child_node, staff_block_list))
        # TO DO:MOVE THIS TO EVALUATOR
        # if not (note_value != 0 and (note_value & (note_value - 1)) == 0):
        #    raise Exception("Error: Note argument is not a power of 2",
        #           note_value_line, note_value_column)

        node = DeclareStaffNode(beats_per_measure, expressions, note_value)
        return node

        # return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#staff_block.
    def visitStaff_block(self, ctx: MyGrammerParser.Staff_blockContext,
                         staff_block_list):
        sbl = []

        sbl = staff_block_list
        # print("Visitor staff block")

        for child_node in ctx.getChildren():
            node_type = child_node.__class__.__name__
            # print("child : ", child_node, type(child_node))

            if node_type == 'Expr_accContext':
                accidentals = self.visitExpr_acc(
                    child_node)  # AccidentalNode()
                sbl.append(accidentals)
                # for acc in accidentals:
                # if acc.accidental is not None:
                # print(acc.accidental, acc.pitch)
                # else:
                # print(acc.pitch)
            elif node_type == 'Declare_measuresContext':
                measures = self.visitDeclare_measures(
                    child_node)  # DeclareMeasureNode()
                sbl.append(measures)
                # print("sub measure", measures)
            elif node_type == 'Staff_blockContext':
                self.visitStaff_block(child_node,
                                      sbl)  # Expand staff_block production
                # print("recurse here")

            # else:
            # print("Hulaan !! Gawan ng bagong elif nalang hehe")

            # elif child_node.staff_block() is not None:
            #     print("recurse here")
        # print("---")
        # node = StaffBlockNode(None, measures, None)
        # node = StaffBlockNode(accidentals, None, None)
        return staff_block_list
        # return self.visitChildren(ctx)

    # Visit a parse tree produced by MyGrammerParser#repeat_block.
    def visitRepeat_block(self, ctx: MyGrammerParser.Repeat_blockContext):
        return self.visitChildren(ctx)


del MyGrammerParser