// Generated from c:\Users\DeLL\OneDrive\Documents\GitHub\CSC617M\MyGrammer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BPM=1, STAFF=2, MEASURE=3, MELODY=4, ACCIDENTAL_KEY=5, REPSTART=6, REPEND=7, 
		CHORD=8, CONTINUOUS=9, KEYWORD=10, DOUBLE=11, FULL=12, HALF=13, QUARTER=14, 
		EIGHTH=15, SIXTEENTH=16, DOTTED=17, INTEGER=18, FRACTION=19, PITCH=20, 
		ACCIDENTAL=21, IDENTIFIER=22, OPEN_BRACKET=23, CLOSE_BRACKET=24, COMMA_SEP=25, 
		OPEN_PAR=26, CLOSE_PAR=27, EQUAL_OPER=28, WS=29;
	public static final int
		RULE_note_value = 0, RULE_bpm = 1, RULE_prog = 2, RULE_declare_note = 3, 
		RULE_declare_chord = 4, RULE_declare_melody = 5, RULE_declare_continuous = 6, 
		RULE_declare_measures = 7, RULE_expr = 8, RULE_expr_note = 9, RULE_expr_chord = 10, 
		RULE_expr_add_note = 11, RULE_expr_var = 12, RULE_expr_acc = 13, RULE_expr_add_acc = 14, 
		RULE_declare_repeat = 15, RULE_declare_repeat_end = 16, RULE_repeat_end_expr = 17, 
		RULE_declare_staff = 18, RULE_staff_block = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"note_value", "bpm", "prog", "declare_note", "declare_chord", "declare_melody", 
			"declare_continuous", "declare_measures", "expr", "expr_note", "expr_chord", 
			"expr_add_note", "expr_var", "expr_acc", "expr_add_acc", "declare_repeat", 
			"declare_repeat_end", "repeat_end_expr", "declare_staff", "staff_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bpm'", "'staff'", "'measure'", "'melody'", "'accidental'", "'repstart'", 
			"'repend'", "'chord'", "'continuous'", null, "'double'", "'full'", "'half'", 
			"'quarter'", "'eighth'", "'sixteenth'", "'*'", null, null, null, null, 
			null, null, "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BPM", "STAFF", "MEASURE", "MELODY", "ACCIDENTAL_KEY", "REPSTART", 
			"REPEND", "CHORD", "CONTINUOUS", "KEYWORD", "DOUBLE", "FULL", "HALF", 
			"QUARTER", "EIGHTH", "SIXTEENTH", "DOTTED", "INTEGER", "FRACTION", "PITCH", 
			"ACCIDENTAL", "IDENTIFIER", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA_SEP", 
			"OPEN_PAR", "CLOSE_PAR", "EQUAL_OPER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyGrammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Note_valueContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(MyGrammerParser.DOUBLE, 0); }
		public TerminalNode FULL() { return getToken(MyGrammerParser.FULL, 0); }
		public TerminalNode HALF() { return getToken(MyGrammerParser.HALF, 0); }
		public TerminalNode QUARTER() { return getToken(MyGrammerParser.QUARTER, 0); }
		public TerminalNode EIGHTH() { return getToken(MyGrammerParser.EIGHTH, 0); }
		public TerminalNode SIXTEENTH() { return getToken(MyGrammerParser.SIXTEENTH, 0); }
		public Note_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_value; }
	}

	public final Note_valueContext note_value() throws RecognitionException {
		Note_valueContext _localctx = new Note_valueContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_note_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BpmContext extends ParserRuleContext {
		public TerminalNode BPM() { return getToken(MyGrammerParser.BPM, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MyGrammerParser.OPEN_PAR, 0); }
		public TerminalNode INTEGER() { return getToken(MyGrammerParser.INTEGER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MyGrammerParser.CLOSE_PAR, 0); }
		public BpmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bpm; }
	}

	public final BpmContext bpm() throws RecognitionException {
		BpmContext _localctx = new BpmContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bpm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(BPM);
			setState(43);
			match(OPEN_PAR);
			setState(44);
			match(INTEGER);
			setState(45);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgContext extends ParserRuleContext {
		public BpmContext bpm() {
			return getRuleContext(BpmContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MyGrammerParser.EOF, 0); }
		public List<Declare_noteContext> declare_note() {
			return getRuleContexts(Declare_noteContext.class);
		}
		public Declare_noteContext declare_note(int i) {
			return getRuleContext(Declare_noteContext.class,i);
		}
		public List<Declare_chordContext> declare_chord() {
			return getRuleContexts(Declare_chordContext.class);
		}
		public Declare_chordContext declare_chord(int i) {
			return getRuleContext(Declare_chordContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			bpm();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(48);
					declare_note();
					}
					break;
				case 2:
					{
					setState(49);
					declare_chord();
					}
					break;
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_noteContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyGrammerParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL_OPER() { return getToken(MyGrammerParser.EQUAL_OPER, 0); }
		public Expr_noteContext expr_note() {
			return getRuleContext(Expr_noteContext.class,0);
		}
		public Declare_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_note; }
	}

	public final Declare_noteContext declare_note() throws RecognitionException {
		Declare_noteContext _localctx = new Declare_noteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declare_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(IDENTIFIER);
			setState(58);
			match(EQUAL_OPER);
			setState(59);
			expr_note();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_chordContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyGrammerParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL_OPER() { return getToken(MyGrammerParser.EQUAL_OPER, 0); }
		public Expr_chordContext expr_chord() {
			return getRuleContext(Expr_chordContext.class,0);
		}
		public Declare_chordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_chord; }
	}

	public final Declare_chordContext declare_chord() throws RecognitionException {
		Declare_chordContext _localctx = new Declare_chordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declare_chord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IDENTIFIER);
			setState(62);
			match(EQUAL_OPER);
			setState(63);
			expr_chord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_melodyContext extends ParserRuleContext {
		public TerminalNode MELODY() { return getToken(MyGrammerParser.MELODY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyGrammerParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyGrammerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyGrammerParser.CLOSE_BRACKET, 0); }
		public List<Declare_staffContext> declare_staff() {
			return getRuleContexts(Declare_staffContext.class);
		}
		public Declare_staffContext declare_staff(int i) {
			return getRuleContext(Declare_staffContext.class,i);
		}
		public Declare_melodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_melody; }
	}

	public final Declare_melodyContext declare_melody() throws RecognitionException {
		Declare_melodyContext _localctx = new Declare_melodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declare_melody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(MELODY);
			setState(66);
			match(IDENTIFIER);
			setState(67);
			match(OPEN_BRACKET);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				declare_staff();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAFF );
			setState(73);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_continuousContext extends ParserRuleContext {
		public TerminalNode CONTINUOUS() { return getToken(MyGrammerParser.CONTINUOUS, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyGrammerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyGrammerParser.CLOSE_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Declare_continuousContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_continuous; }
	}

	public final Declare_continuousContext declare_continuous() throws RecognitionException {
		Declare_continuousContext _localctx = new Declare_continuousContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declare_continuous);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CONTINUOUS);
			setState(76);
			match(OPEN_BRACKET);
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				expr();
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL_KEY) | (1L << CHORD) | (1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH) | (1L << IDENTIFIER))) != 0) );
			setState(82);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_measuresContext extends ParserRuleContext {
		public TerminalNode MEASURE() { return getToken(MyGrammerParser.MEASURE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyGrammerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyGrammerParser.CLOSE_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Declare_continuousContext> declare_continuous() {
			return getRuleContexts(Declare_continuousContext.class);
		}
		public Declare_continuousContext declare_continuous(int i) {
			return getRuleContext(Declare_continuousContext.class,i);
		}
		public Declare_measuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_measures; }
	}

	public final Declare_measuresContext declare_measures() throws RecognitionException {
		Declare_measuresContext _localctx = new Declare_measuresContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declare_measures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(MEASURE);
			setState(85);
			match(OPEN_BRACKET);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCIDENTAL_KEY:
				case CHORD:
				case DOUBLE:
				case FULL:
				case HALF:
				case QUARTER:
				case EIGHTH:
				case SIXTEENTH:
				case IDENTIFIER:
					{
					setState(86);
					expr();
					}
					break;
				case CONTINUOUS:
					{
					setState(87);
					declare_continuous();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL_KEY) | (1L << CHORD) | (1L << CONTINUOUS) | (1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH) | (1L << IDENTIFIER))) != 0) );
			setState(92);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoteExpressionContext extends ExprContext {
		public Expr_noteContext expr_note() {
			return getRuleContext(Expr_noteContext.class,0);
		}
		public NoteExpressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ChordExpressionContext extends ExprContext {
		public Expr_chordContext expr_chord() {
			return getRuleContext(Expr_chordContext.class,0);
		}
		public ChordExpressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AccidentalExpressionContext extends ExprContext {
		public Expr_accContext expr_acc() {
			return getRuleContext(Expr_accContext.class,0);
		}
		public AccidentalExpressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VariableExpressionContext extends ExprContext {
		public Expr_varContext expr_var() {
			return getRuleContext(Expr_varContext.class,0);
		}
		public VariableExpressionContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
			case FULL:
			case HALF:
			case QUARTER:
			case EIGHTH:
			case SIXTEENTH:
				_localctx = new NoteExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				expr_note();
				}
				break;
			case CHORD:
				_localctx = new ChordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				expr_chord();
				}
				break;
			case IDENTIFIER:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				expr_var();
				}
				break;
			case ACCIDENTAL_KEY:
				_localctx = new AccidentalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				expr_acc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_noteContext extends ParserRuleContext {
		public Note_valueContext note_value() {
			return getRuleContext(Note_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(MyGrammerParser.OPEN_PAR, 0); }
		public TerminalNode PITCH() { return getToken(MyGrammerParser.PITCH, 0); }
		public TerminalNode COMMA_SEP() { return getToken(MyGrammerParser.COMMA_SEP, 0); }
		public TerminalNode INTEGER() { return getToken(MyGrammerParser.INTEGER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MyGrammerParser.CLOSE_PAR, 0); }
		public TerminalNode DOTTED() { return getToken(MyGrammerParser.DOTTED, 0); }
		public Expr_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_note; }
	}

	public final Expr_noteContext expr_note() throws RecognitionException {
		Expr_noteContext _localctx = new Expr_noteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr_note);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				note_value();
				setState(101);
				match(OPEN_PAR);
				setState(102);
				match(PITCH);
				setState(103);
				match(COMMA_SEP);
				setState(104);
				match(INTEGER);
				setState(105);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				note_value();
				setState(108);
				match(OPEN_PAR);
				setState(109);
				match(PITCH);
				setState(110);
				match(COMMA_SEP);
				setState(111);
				match(INTEGER);
				setState(112);
				match(CLOSE_PAR);
				setState(113);
				match(DOTTED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_chordContext extends ParserRuleContext {
		public TerminalNode CHORD() { return getToken(MyGrammerParser.CHORD, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MyGrammerParser.OPEN_PAR, 0); }
		public Expr_noteContext expr_note() {
			return getRuleContext(Expr_noteContext.class,0);
		}
		public Expr_add_noteContext expr_add_note() {
			return getRuleContext(Expr_add_noteContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MyGrammerParser.CLOSE_PAR, 0); }
		public Expr_chordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_chord; }
	}

	public final Expr_chordContext expr_chord() throws RecognitionException {
		Expr_chordContext _localctx = new Expr_chordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_chord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(CHORD);
			setState(118);
			match(OPEN_PAR);
			setState(119);
			expr_note();
			setState(120);
			expr_add_note();
			setState(121);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_add_noteContext extends ParserRuleContext {
		public TerminalNode COMMA_SEP() { return getToken(MyGrammerParser.COMMA_SEP, 0); }
		public Expr_noteContext expr_note() {
			return getRuleContext(Expr_noteContext.class,0);
		}
		public Expr_add_noteContext expr_add_note() {
			return getRuleContext(Expr_add_noteContext.class,0);
		}
		public Expr_add_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add_note; }
	}

	public final Expr_add_noteContext expr_add_note() throws RecognitionException {
		Expr_add_noteContext _localctx = new Expr_add_noteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_add_note);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(COMMA_SEP);
				setState(124);
				expr_note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(COMMA_SEP);
				setState(126);
				expr_note();
				setState(127);
				expr_add_note();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_varContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyGrammerParser.IDENTIFIER, 0); }
		public Expr_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_var; }
	}

	public final Expr_varContext expr_var() throws RecognitionException {
		Expr_varContext _localctx = new Expr_varContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_accContext extends ParserRuleContext {
		public TerminalNode ACCIDENTAL_KEY() { return getToken(MyGrammerParser.ACCIDENTAL_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MyGrammerParser.OPEN_PAR, 0); }
		public Expr_add_accContext expr_add_acc() {
			return getRuleContext(Expr_add_accContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MyGrammerParser.CLOSE_PAR, 0); }
		public Expr_accContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_acc; }
	}

	public final Expr_accContext expr_acc() throws RecognitionException {
		Expr_accContext _localctx = new Expr_accContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_acc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ACCIDENTAL_KEY);
			setState(134);
			match(OPEN_PAR);
			setState(135);
			expr_add_acc();
			setState(136);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_add_accContext extends ParserRuleContext {
		public TerminalNode ACCIDENTAL() { return getToken(MyGrammerParser.ACCIDENTAL, 0); }
		public TerminalNode PITCH() { return getToken(MyGrammerParser.PITCH, 0); }
		public TerminalNode COMMA_SEP() { return getToken(MyGrammerParser.COMMA_SEP, 0); }
		public Expr_add_accContext expr_add_acc() {
			return getRuleContext(Expr_add_accContext.class,0);
		}
		public Expr_add_accContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add_acc; }
	}

	public final Expr_add_accContext expr_add_acc() throws RecognitionException {
		Expr_add_accContext _localctx = new Expr_add_accContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_add_acc);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(ACCIDENTAL);
				setState(139);
				match(PITCH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(ACCIDENTAL);
				setState(141);
				match(PITCH);
				setState(142);
				match(COMMA_SEP);
				setState(143);
				expr_add_acc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(PITCH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(PITCH);
				setState(146);
				match(COMMA_SEP);
				setState(147);
				expr_add_acc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_repeatContext extends ParserRuleContext {
		public TerminalNode REPSTART() { return getToken(MyGrammerParser.REPSTART, 0); }
		public Staff_blockContext staff_block() {
			return getRuleContext(Staff_blockContext.class,0);
		}
		public Declare_repeat_endContext declare_repeat_end() {
			return getRuleContext(Declare_repeat_endContext.class,0);
		}
		public Repeat_end_exprContext repeat_end_expr() {
			return getRuleContext(Repeat_end_exprContext.class,0);
		}
		public Declare_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_repeat; }
	}

	public final Declare_repeatContext declare_repeat() throws RecognitionException {
		Declare_repeatContext _localctx = new Declare_repeatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declare_repeat);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(REPSTART);
				setState(151);
				staff_block(0);
				setState(152);
				declare_repeat_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				staff_block(0);
				setState(155);
				repeat_end_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_repeat_endContext extends ParserRuleContext {
		public Repeat_end_exprContext repeat_end_expr() {
			return getRuleContext(Repeat_end_exprContext.class,0);
		}
		public Staff_blockContext staff_block() {
			return getRuleContext(Staff_blockContext.class,0);
		}
		public Declare_repeat_endContext declare_repeat_end() {
			return getRuleContext(Declare_repeat_endContext.class,0);
		}
		public Declare_repeat_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_repeat_end; }
	}

	public final Declare_repeat_endContext declare_repeat_end() throws RecognitionException {
		Declare_repeat_endContext _localctx = new Declare_repeat_endContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declare_repeat_end);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				repeat_end_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				repeat_end_expr();
				setState(161);
				staff_block(0);
				setState(162);
				declare_repeat_end();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Repeat_end_exprContext extends ParserRuleContext {
		public TerminalNode REPEND() { return getToken(MyGrammerParser.REPEND, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MyGrammerParser.OPEN_PAR, 0); }
		public TerminalNode INTEGER() { return getToken(MyGrammerParser.INTEGER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MyGrammerParser.CLOSE_PAR, 0); }
		public Repeat_end_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_end_expr; }
	}

	public final Repeat_end_exprContext repeat_end_expr() throws RecognitionException {
		Repeat_end_exprContext _localctx = new Repeat_end_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_repeat_end_expr);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(REPEND);
				setState(167);
				match(OPEN_PAR);
				setState(168);
				match(INTEGER);
				setState(169);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(REPEND);
				setState(171);
				match(OPEN_PAR);
				setState(172);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_staffContext extends ParserRuleContext {
		public TerminalNode STAFF() { return getToken(MyGrammerParser.STAFF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MyGrammerParser.OPEN_PAR, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(MyGrammerParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(MyGrammerParser.INTEGER, i);
		}
		public TerminalNode COMMA_SEP() { return getToken(MyGrammerParser.COMMA_SEP, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MyGrammerParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyGrammerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyGrammerParser.CLOSE_BRACKET, 0); }
		public List<Staff_blockContext> staff_block() {
			return getRuleContexts(Staff_blockContext.class);
		}
		public Staff_blockContext staff_block(int i) {
			return getRuleContext(Staff_blockContext.class,i);
		}
		public Declare_staffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_staff; }
	}

	public final Declare_staffContext declare_staff() throws RecognitionException {
		Declare_staffContext _localctx = new Declare_staffContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declare_staff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(STAFF);
			setState(176);
			match(OPEN_PAR);
			setState(177);
			match(INTEGER);
			setState(178);
			match(COMMA_SEP);
			setState(179);
			match(INTEGER);
			setState(180);
			match(CLOSE_PAR);
			setState(181);
			match(OPEN_BRACKET);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				staff_block(0);
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEASURE) | (1L << ACCIDENTAL_KEY) | (1L << REPSTART))) != 0) );
			setState(187);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Staff_blockContext extends ParserRuleContext {
		public Expr_accContext expr_acc() {
			return getRuleContext(Expr_accContext.class,0);
		}
		public Staff_blockContext staff_block() {
			return getRuleContext(Staff_blockContext.class,0);
		}
		public TerminalNode REPSTART() { return getToken(MyGrammerParser.REPSTART, 0); }
		public Declare_repeat_endContext declare_repeat_end() {
			return getRuleContext(Declare_repeat_endContext.class,0);
		}
		public Declare_measuresContext declare_measures() {
			return getRuleContext(Declare_measuresContext.class,0);
		}
		public Repeat_end_exprContext repeat_end_expr() {
			return getRuleContext(Repeat_end_exprContext.class,0);
		}
		public Staff_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staff_block; }
	}

	public final Staff_blockContext staff_block() throws RecognitionException {
		return staff_block(0);
	}

	private Staff_blockContext staff_block(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Staff_blockContext _localctx = new Staff_blockContext(_ctx, _parentState);
		Staff_blockContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_staff_block, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(190);
				expr_acc();
				setState(191);
				staff_block(7);
				}
				break;
			case 2:
				{
				setState(193);
				match(REPSTART);
				setState(194);
				staff_block(0);
				setState(195);
				declare_repeat_end();
				}
				break;
			case 3:
				{
				setState(197);
				declare_measures();
				setState(198);
				staff_block(3);
				}
				break;
			case 4:
				{
				setState(200);
				declare_measures();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(203);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(204);
						expr_acc();
						}
						break;
					case 2:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(205);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(206);
						repeat_end_expr();
						}
						break;
					case 3:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(207);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(208);
						declare_measures();
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return staff_block_sempred((Staff_blockContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean staff_block_sempred(Staff_blockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00d9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\7\4\65\n\4\f\4\16\48\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\6\7H\n\7\r\7\16\7I\3\7\3\7\3\b\3\b\3\b\6\bQ\n\b\r\b\16\b"+
		"R\3\b\3\b\3\t\3\t\3\t\3\t\6\t[\n\t\r\t\16\t\\\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\5\ne\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13v\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0084\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0097\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00a0\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00a7\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b0\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\6\24\u00ba\n\24\r\24\16\24\u00bb\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00cc"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00d4\n\25\f\25\16\25\u00d7\13"+
		"\25\3\25\2\3(\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\3\2"+
		"\r\22\2\u00dc\2*\3\2\2\2\4,\3\2\2\2\6\61\3\2\2\2\b;\3\2\2\2\n?\3\2\2\2"+
		"\fC\3\2\2\2\16M\3\2\2\2\20V\3\2\2\2\22d\3\2\2\2\24u\3\2\2\2\26w\3\2\2"+
		"\2\30\u0083\3\2\2\2\32\u0085\3\2\2\2\34\u0087\3\2\2\2\36\u0096\3\2\2\2"+
		" \u009f\3\2\2\2\"\u00a6\3\2\2\2$\u00af\3\2\2\2&\u00b1\3\2\2\2(\u00cb\3"+
		"\2\2\2*+\t\2\2\2+\3\3\2\2\2,-\7\3\2\2-.\7\34\2\2./\7\24\2\2/\60\7\35\2"+
		"\2\60\5\3\2\2\2\61\66\5\4\3\2\62\65\5\b\5\2\63\65\5\n\6\2\64\62\3\2\2"+
		"\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28"+
		"\66\3\2\2\29:\7\2\2\3:\7\3\2\2\2;<\7\30\2\2<=\7\36\2\2=>\5\24\13\2>\t"+
		"\3\2\2\2?@\7\30\2\2@A\7\36\2\2AB\5\26\f\2B\13\3\2\2\2CD\7\6\2\2DE\7\30"+
		"\2\2EG\7\31\2\2FH\5&\24\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3"+
		"\2\2\2KL\7\32\2\2L\r\3\2\2\2MN\7\13\2\2NP\7\31\2\2OQ\5\22\n\2PO\3\2\2"+
		"\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\32\2\2U\17\3\2\2\2VW\7"+
		"\5\2\2WZ\7\31\2\2X[\5\22\n\2Y[\5\16\b\2ZX\3\2\2\2ZY\3\2\2\2[\\\3\2\2\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\32\2\2_\21\3\2\2\2`e\5\24\13\2ae"+
		"\5\26\f\2be\5\32\16\2ce\5\34\17\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2"+
		"\2\2e\23\3\2\2\2fg\5\2\2\2gh\7\34\2\2hi\7\26\2\2ij\7\33\2\2jk\7\24\2\2"+
		"kl\7\35\2\2lv\3\2\2\2mn\5\2\2\2no\7\34\2\2op\7\26\2\2pq\7\33\2\2qr\7\24"+
		"\2\2rs\7\35\2\2st\7\23\2\2tv\3\2\2\2uf\3\2\2\2um\3\2\2\2v\25\3\2\2\2w"+
		"x\7\n\2\2xy\7\34\2\2yz\5\24\13\2z{\5\30\r\2{|\7\35\2\2|\27\3\2\2\2}~\7"+
		"\33\2\2~\u0084\5\24\13\2\177\u0080\7\33\2\2\u0080\u0081\5\24\13\2\u0081"+
		"\u0082\5\30\r\2\u0082\u0084\3\2\2\2\u0083}\3\2\2\2\u0083\177\3\2\2\2\u0084"+
		"\31\3\2\2\2\u0085\u0086\7\30\2\2\u0086\33\3\2\2\2\u0087\u0088\7\7\2\2"+
		"\u0088\u0089\7\34\2\2\u0089\u008a\5\36\20\2\u008a\u008b\7\35\2\2\u008b"+
		"\35\3\2\2\2\u008c\u008d\7\27\2\2\u008d\u0097\7\26\2\2\u008e\u008f\7\27"+
		"\2\2\u008f\u0090\7\26\2\2\u0090\u0091\7\33\2\2\u0091\u0097\5\36\20\2\u0092"+
		"\u0097\7\26\2\2\u0093\u0094\7\26\2\2\u0094\u0095\7\33\2\2\u0095\u0097"+
		"\5\36\20\2\u0096\u008c\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0092\3\2\2\2"+
		"\u0096\u0093\3\2\2\2\u0097\37\3\2\2\2\u0098\u0099\7\b\2\2\u0099\u009a"+
		"\5(\25\2\u009a\u009b\5\"\22\2\u009b\u00a0\3\2\2\2\u009c\u009d\5(\25\2"+
		"\u009d\u009e\5$\23\2\u009e\u00a0\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u009c"+
		"\3\2\2\2\u00a0!\3\2\2\2\u00a1\u00a7\5$\23\2\u00a2\u00a3\5$\23\2\u00a3"+
		"\u00a4\5(\25\2\u00a4\u00a5\5\"\22\2\u00a5\u00a7\3\2\2\2\u00a6\u00a1\3"+
		"\2\2\2\u00a6\u00a2\3\2\2\2\u00a7#\3\2\2\2\u00a8\u00a9\7\t\2\2\u00a9\u00aa"+
		"\7\34\2\2\u00aa\u00ab\7\24\2\2\u00ab\u00b0\7\35\2\2\u00ac\u00ad\7\t\2"+
		"\2\u00ad\u00ae\7\34\2\2\u00ae\u00b0\7\35\2\2\u00af\u00a8\3\2\2\2\u00af"+
		"\u00ac\3\2\2\2\u00b0%\3\2\2\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3\7\34\2\2"+
		"\u00b3\u00b4\7\24\2\2\u00b4\u00b5\7\33\2\2\u00b5\u00b6\7\24\2\2\u00b6"+
		"\u00b7\7\35\2\2\u00b7\u00b9\7\31\2\2\u00b8\u00ba\5(\25\2\u00b9\u00b8\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\7\32\2\2\u00be\'\3\2\2\2\u00bf\u00c0\b\25\1"+
		"\2\u00c0\u00c1\5\34\17\2\u00c1\u00c2\5(\25\t\u00c2\u00cc\3\2\2\2\u00c3"+
		"\u00c4\7\b\2\2\u00c4\u00c5\5(\25\2\u00c5\u00c6\5\"\22\2\u00c6\u00cc\3"+
		"\2\2\2\u00c7\u00c8\5\20\t\2\u00c8\u00c9\5(\25\5\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00cc\5\20\t\2\u00cb\u00bf\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00c7\3"+
		"\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00d5\3\2\2\2\u00cd\u00ce\f\b\2\2\u00ce"+
		"\u00d4\5\34\17\2\u00cf\u00d0\f\6\2\2\u00d0\u00d4\5$\23\2\u00d1\u00d2\f"+
		"\4\2\2\u00d2\u00d4\5\20\t\2\u00d3\u00cd\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6)\3\2\2\2\u00d7\u00d5\3\2\2\2\23\64\66IRZ\\du\u0083\u0096\u009f"+
		"\u00a6\u00af\u00bb\u00cb\u00d3\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}