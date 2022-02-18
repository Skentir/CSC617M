// Generated from MyGrammer.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammerParser}.
 */
public interface MyGrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#note_value}.
	 * @param ctx the parse tree
	 */
	void enterNote_value(MyGrammerParser.Note_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#note_value}.
	 * @param ctx the parse tree
	 */
	void exitNote_value(MyGrammerParser.Note_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#instruments}.
	 * @param ctx the parse tree
	 */
	void enterInstruments(MyGrammerParser.InstrumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#instruments}.
	 * @param ctx the parse tree
	 */
	void exitInstruments(MyGrammerParser.InstrumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#bpm}.
	 * @param ctx the parse tree
	 */
	void enterBpm(MyGrammerParser.BpmContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#bpm}.
	 * @param ctx the parse tree
	 */
	void exitBpm(MyGrammerParser.BpmContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#instrument}.
	 * @param ctx the parse tree
	 */
	void enterInstrument(MyGrammerParser.InstrumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#instrument}.
	 * @param ctx the parse tree
	 */
	void exitInstrument(MyGrammerParser.InstrumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MyGrammerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MyGrammerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#declare_note}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_note(MyGrammerParser.Declare_noteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#declare_note}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_note(MyGrammerParser.Declare_noteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#declare_chord}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_chord(MyGrammerParser.Declare_chordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#declare_chord}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_chord(MyGrammerParser.Declare_chordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#declare_melody}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_melody(MyGrammerParser.Declare_melodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#declare_melody}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_melody(MyGrammerParser.Declare_melodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#declare_continuous}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_continuous(MyGrammerParser.Declare_continuousContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#declare_continuous}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_continuous(MyGrammerParser.Declare_continuousContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#declare_measures}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_measures(MyGrammerParser.Declare_measuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#declare_measures}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_measures(MyGrammerParser.Declare_measuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#declare_measures_up}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_measures_up(MyGrammerParser.Declare_measures_upContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#declare_measures_up}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_measures_up(MyGrammerParser.Declare_measures_upContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#declare_measures_down}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_measures_down(MyGrammerParser.Declare_measures_downContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#declare_measures_down}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_measures_down(MyGrammerParser.Declare_measures_downContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#measure_block}.
	 * @param ctx the parse tree
	 */
	void enterMeasure_block(MyGrammerParser.Measure_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#measure_block}.
	 * @param ctx the parse tree
	 */
	void exitMeasure_block(MyGrammerParser.Measure_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoteExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNoteExpression(MyGrammerParser.NoteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoteExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNoteExpression(MyGrammerParser.NoteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChordExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChordExpression(MyGrammerParser.ChordExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChordExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChordExpression(MyGrammerParser.ChordExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(MyGrammerParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(MyGrammerParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccidentalExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAccidentalExpression(MyGrammerParser.AccidentalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccidentalExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAccidentalExpression(MyGrammerParser.AccidentalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RestExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRestExpression(MyGrammerParser.RestExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RestExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRestExpression(MyGrammerParser.RestExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#expr_note}.
	 * @param ctx the parse tree
	 */
	void enterExpr_note(MyGrammerParser.Expr_noteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#expr_note}.
	 * @param ctx the parse tree
	 */
	void exitExpr_note(MyGrammerParser.Expr_noteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#expr_chord}.
	 * @param ctx the parse tree
	 */
	void enterExpr_chord(MyGrammerParser.Expr_chordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#expr_chord}.
	 * @param ctx the parse tree
	 */
	void exitExpr_chord(MyGrammerParser.Expr_chordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#expr_add_note}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add_note(MyGrammerParser.Expr_add_noteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#expr_add_note}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add_note(MyGrammerParser.Expr_add_noteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#expr_var}.
	 * @param ctx the parse tree
	 */
	void enterExpr_var(MyGrammerParser.Expr_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#expr_var}.
	 * @param ctx the parse tree
	 */
	void exitExpr_var(MyGrammerParser.Expr_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#expr_acc}.
	 * @param ctx the parse tree
	 */
	void enterExpr_acc(MyGrammerParser.Expr_accContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#expr_acc}.
	 * @param ctx the parse tree
	 */
	void exitExpr_acc(MyGrammerParser.Expr_accContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#expr_add_acc}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add_acc(MyGrammerParser.Expr_add_accContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#expr_add_acc}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add_acc(MyGrammerParser.Expr_add_accContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#expr_rest}.
	 * @param ctx the parse tree
	 */
	void enterExpr_rest(MyGrammerParser.Expr_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#expr_rest}.
	 * @param ctx the parse tree
	 */
	void exitExpr_rest(MyGrammerParser.Expr_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#declare_repeat}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_repeat(MyGrammerParser.Declare_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#declare_repeat}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_repeat(MyGrammerParser.Declare_repeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#declare_repeat_end}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_repeat_end(MyGrammerParser.Declare_repeat_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#declare_repeat_end}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_repeat_end(MyGrammerParser.Declare_repeat_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#declare_staff}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_staff(MyGrammerParser.Declare_staffContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#declare_staff}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_staff(MyGrammerParser.Declare_staffContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammerParser#staff_block}.
	 * @param ctx the parse tree
	 */
	void enterStaff_block(MyGrammerParser.Staff_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammerParser#staff_block}.
	 * @param ctx the parse tree
	 */
	void exitStaff_block(MyGrammerParser.Staff_blockContext ctx);
}