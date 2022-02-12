// Generated from MyGrammer.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#note_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote_value(MyGrammerParser.Note_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#instruments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruments(MyGrammerParser.InstrumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#bpm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBpm(MyGrammerParser.BpmContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#instrument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrument(MyGrammerParser.InstrumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MyGrammerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#declare_note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_note(MyGrammerParser.Declare_noteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#declare_chord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_chord(MyGrammerParser.Declare_chordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#declare_melody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_melody(MyGrammerParser.Declare_melodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#declare_continuous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_continuous(MyGrammerParser.Declare_continuousContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#declare_measures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_measures(MyGrammerParser.Declare_measuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#repeat_measure_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_measure_block(MyGrammerParser.Repeat_measure_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#measure_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasure_block(MyGrammerParser.Measure_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoteExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoteExpression(MyGrammerParser.NoteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChordExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChordExpression(MyGrammerParser.ChordExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(MyGrammerParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccidentalExpression}
	 * labeled alternative in {@link MyGrammerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccidentalExpression(MyGrammerParser.AccidentalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#expr_note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_note(MyGrammerParser.Expr_noteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#expr_chord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_chord(MyGrammerParser.Expr_chordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#expr_add_note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_add_note(MyGrammerParser.Expr_add_noteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#expr_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_var(MyGrammerParser.Expr_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#expr_acc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_acc(MyGrammerParser.Expr_accContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#expr_add_acc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_add_acc(MyGrammerParser.Expr_add_accContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#declare_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_repeat(MyGrammerParser.Declare_repeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#declare_repeat_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_repeat_end(MyGrammerParser.Declare_repeat_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#declare_staff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_staff(MyGrammerParser.Declare_staffContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammerParser#staff_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaff_block(MyGrammerParser.Staff_blockContext ctx);
}