// Generated from /Users/gabminamedez/Desktop/CSC617M/MyGrammer.g4 by ANTLR 4.8
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
		CHORD=8, CONTINUOUS=9, DOUBLE=10, FULL=11, HALF=12, QUARTER=13, EIGHTH=14, 
		SIXTEENTH=15, DOTTED=16, INTEGER=17, FRACTION=18, PITCH=19, ACCIDENTAL=20, 
		IDENTIFIER=21, OPEN_BRACKET=22, CLOSE_BRACKET=23, COMMA_SEP=24, OPEN_PAR=25, 
		CLOSE_PAR=26, EQUAL_OPER=27, WS=28;
	public static final int
		RULE_keyword = 0, RULE_note_value = 1, RULE_bpm = 2, RULE_prog = 3, RULE_declare_note = 4, 
		RULE_declare_chord = 5, RULE_declare_melody = 6, RULE_declare_continuous = 7, 
		RULE_declare_measures = 8, RULE_expr = 9, RULE_expr_note = 10, RULE_expr_chord = 11, 
		RULE_expr_add_note = 12, RULE_expr_var = 13, RULE_expr_acc = 14, RULE_expr_add_acc = 15, 
		RULE_declare_repeat = 16, RULE_declare_repeat_end = 17, RULE_repeat_end_expr = 18, 
		RULE_declare_staff = 19, RULE_staff_block = 20, RULE_repeat_block = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"keyword", "note_value", "bpm", "prog", "declare_note", "declare_chord", 
			"declare_melody", "declare_continuous", "declare_measures", "expr", "expr_note", 
			"expr_chord", "expr_add_note", "expr_var", "expr_acc", "expr_add_acc", 
			"declare_repeat", "declare_repeat_end", "repeat_end_expr", "declare_staff", 
			"staff_block", "repeat_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bpm'", "'staff'", "'measure'", "'melody'", "'accidental'", "'repstart'", 
			"'repend'", "'chord'", "'continuous'", "'double'", "'full'", "'half'", 
			"'quarter'", "'eighth'", "'sixteenth'", "'*'", null, null, null, null, 
			null, null, "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BPM", "STAFF", "MEASURE", "MELODY", "ACCIDENTAL_KEY", "REPSTART", 
			"REPEND", "CHORD", "CONTINUOUS", "DOUBLE", "FULL", "HALF", "QUARTER", 
			"EIGHTH", "SIXTEENTH", "DOTTED", "INTEGER", "FRACTION", "PITCH", "ACCIDENTAL", 
			"IDENTIFIER", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA_SEP", "OPEN_PAR", 
			"CLOSE_PAR", "EQUAL_OPER", "WS"
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode BPM() { return getToken(MyGrammerParser.BPM, 0); }
		public TerminalNode STAFF() { return getToken(MyGrammerParser.STAFF, 0); }
		public TerminalNode MEASURE() { return getToken(MyGrammerParser.MEASURE, 0); }
		public TerminalNode MELODY() { return getToken(MyGrammerParser.MELODY, 0); }
		public TerminalNode ACCIDENTAL_KEY() { return getToken(MyGrammerParser.ACCIDENTAL_KEY, 0); }
		public TerminalNode REPSTART() { return getToken(MyGrammerParser.REPSTART, 0); }
		public TerminalNode REPEND() { return getToken(MyGrammerParser.REPEND, 0); }
		public TerminalNode CHORD() { return getToken(MyGrammerParser.CHORD, 0); }
		public TerminalNode CONTINUOUS() { return getToken(MyGrammerParser.CONTINUOUS, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BPM) | (1L << STAFF) | (1L << MEASURE) | (1L << MELODY) | (1L << ACCIDENTAL_KEY) | (1L << REPSTART) | (1L << REPEND) | (1L << CHORD) | (1L << CONTINUOUS))) != 0)) ) {
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
		enterRule(_localctx, 2, RULE_note_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
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
		enterRule(_localctx, 4, RULE_bpm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(BPM);
			setState(49);
			match(OPEN_PAR);
			setState(50);
			match(INTEGER);
			setState(51);
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
		public List<Declare_melodyContext> declare_melody() {
			return getRuleContexts(Declare_melodyContext.class);
		}
		public Declare_melodyContext declare_melody(int i) {
			return getRuleContext(Declare_melodyContext.class,i);
		}
		public List<Declare_staffContext> declare_staff() {
			return getRuleContexts(Declare_staffContext.class);
		}
		public Declare_staffContext declare_staff(int i) {
			return getRuleContext(Declare_staffContext.class,i);
		}
		public List<Expr_varContext> expr_var() {
			return getRuleContexts(Expr_varContext.class);
		}
		public Expr_varContext expr_var(int i) {
			return getRuleContext(Expr_varContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			bpm();
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(57);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(54);
						declare_note();
						}
						break;
					case 2:
						{
						setState(55);
						declare_chord();
						}
						break;
					case 3:
						{
						setState(56);
						declare_melody();
						}
						break;
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAFF:
					{
					setState(62);
					declare_staff();
					}
					break;
				case IDENTIFIER:
					{
					setState(63);
					expr_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAFF || _la==IDENTIFIER );
			setState(68);
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
		enterRule(_localctx, 8, RULE_declare_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IDENTIFIER);
			setState(71);
			match(EQUAL_OPER);
			setState(72);
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
		enterRule(_localctx, 10, RULE_declare_chord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IDENTIFIER);
			setState(75);
			match(EQUAL_OPER);
			setState(76);
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
		enterRule(_localctx, 12, RULE_declare_melody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(MELODY);
			setState(79);
			match(IDENTIFIER);
			setState(80);
			match(OPEN_BRACKET);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				declare_staff();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAFF );
			setState(86);
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
		enterRule(_localctx, 14, RULE_declare_continuous);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(CONTINUOUS);
			setState(89);
			match(OPEN_BRACKET);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				expr();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL_KEY) | (1L << CHORD) | (1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH) | (1L << IDENTIFIER))) != 0) );
			setState(95);
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
		enterRule(_localctx, 16, RULE_declare_measures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(MEASURE);
			setState(98);
			match(OPEN_BRACKET);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(101);
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
					setState(99);
					expr();
					}
					break;
				case CONTINUOUS:
					{
					setState(100);
					declare_continuous();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL_KEY) | (1L << CHORD) | (1L << CONTINUOUS) | (1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH) | (1L << IDENTIFIER))) != 0) );
			setState(105);
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
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(111);
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
				setState(107);
				expr_note();
				}
				break;
			case CHORD:
				_localctx = new ChordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				expr_chord();
				}
				break;
			case IDENTIFIER:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				expr_var();
				}
				break;
			case ACCIDENTAL_KEY:
				_localctx = new AccidentalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
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
		enterRule(_localctx, 20, RULE_expr_note);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				note_value();
				setState(114);
				match(OPEN_PAR);
				setState(115);
				match(PITCH);
				setState(116);
				match(COMMA_SEP);
				setState(117);
				match(INTEGER);
				setState(118);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				note_value();
				setState(121);
				match(OPEN_PAR);
				setState(122);
				match(PITCH);
				setState(123);
				match(COMMA_SEP);
				setState(124);
				match(INTEGER);
				setState(125);
				match(CLOSE_PAR);
				setState(126);
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
		enterRule(_localctx, 22, RULE_expr_chord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(CHORD);
			setState(131);
			match(OPEN_PAR);
			setState(132);
			expr_note();
			setState(133);
			expr_add_note();
			setState(134);
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
		enterRule(_localctx, 24, RULE_expr_add_note);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(COMMA_SEP);
				setState(137);
				expr_note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(COMMA_SEP);
				setState(139);
				expr_note();
				setState(140);
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
		enterRule(_localctx, 26, RULE_expr_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		enterRule(_localctx, 28, RULE_expr_acc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ACCIDENTAL_KEY);
			setState(147);
			match(OPEN_PAR);
			setState(148);
			expr_add_acc();
			setState(149);
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
		enterRule(_localctx, 30, RULE_expr_add_acc);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(ACCIDENTAL);
				setState(152);
				match(PITCH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(ACCIDENTAL);
				setState(154);
				match(PITCH);
				setState(155);
				match(COMMA_SEP);
				setState(156);
				expr_add_acc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(PITCH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(PITCH);
				setState(159);
				match(COMMA_SEP);
				setState(160);
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
		enterRule(_localctx, 32, RULE_declare_repeat);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(REPSTART);
				setState(164);
				staff_block(0);
				setState(165);
				declare_repeat_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				staff_block(0);
				setState(168);
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
		enterRule(_localctx, 34, RULE_declare_repeat_end);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				repeat_end_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				repeat_end_expr();
				setState(174);
				staff_block(0);
				setState(175);
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
		enterRule(_localctx, 36, RULE_repeat_end_expr);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(REPEND);
				setState(180);
				match(OPEN_PAR);
				setState(181);
				match(INTEGER);
				setState(182);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(REPEND);
				setState(184);
				match(OPEN_PAR);
				setState(185);
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
		enterRule(_localctx, 38, RULE_declare_staff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(STAFF);
			setState(189);
			match(OPEN_PAR);
			setState(190);
			match(INTEGER);
			setState(191);
			match(COMMA_SEP);
			setState(192);
			match(INTEGER);
			setState(193);
			match(CLOSE_PAR);
			setState(194);
			match(OPEN_BRACKET);
			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				staff_block(0);
				}
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEASURE) | (1L << ACCIDENTAL_KEY) | (1L << REPSTART))) != 0) );
			setState(200);
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
		public Declare_measuresContext declare_measures() {
			return getRuleContext(Declare_measuresContext.class,0);
		}
		public TerminalNode REPSTART() { return getToken(MyGrammerParser.REPSTART, 0); }
		public Repeat_blockContext repeat_block() {
			return getRuleContext(Repeat_blockContext.class,0);
		}
		public TerminalNode REPEND() { return getToken(MyGrammerParser.REPEND, 0); }
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_staff_block, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(203);
				expr_acc();
				setState(204);
				staff_block(8);
				}
				break;
			case 2:
				{
				setState(206);
				declare_measures();
				setState(207);
				staff_block(6);
				}
				break;
			case 3:
				{
				setState(209);
				declare_measures();
				}
				break;
			case 4:
				{
				setState(210);
				match(REPSTART);
				setState(211);
				repeat_block(0);
				setState(212);
				match(REPEND);
				setState(213);
				staff_block(3);
				}
				break;
			case 5:
				{
				setState(215);
				match(REPSTART);
				setState(216);
				repeat_block(0);
				setState(217);
				match(REPEND);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(221);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(222);
						expr_acc();
						}
						break;
					case 2:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(223);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(224);
						declare_measures();
						}
						break;
					case 3:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(225);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(226);
						match(REPSTART);
						setState(227);
						repeat_block(0);
						setState(228);
						match(REPEND);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class Repeat_blockContext extends ParserRuleContext {
		public Expr_accContext expr_acc() {
			return getRuleContext(Expr_accContext.class,0);
		}
		public Repeat_blockContext repeat_block() {
			return getRuleContext(Repeat_blockContext.class,0);
		}
		public Declare_measuresContext declare_measures() {
			return getRuleContext(Declare_measuresContext.class,0);
		}
		public Repeat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_block; }
	}

	public final Repeat_blockContext repeat_block() throws RecognitionException {
		return repeat_block(0);
	}

	private Repeat_blockContext repeat_block(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Repeat_blockContext _localctx = new Repeat_blockContext(_ctx, _parentState);
		Repeat_blockContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_repeat_block, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(236);
				expr_acc();
				setState(237);
				repeat_block(5);
				}
				break;
			case 2:
				{
				setState(239);
				declare_measures();
				setState(240);
				repeat_block(3);
				}
				break;
			case 3:
				{
				setState(242);
				declare_measures();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(249);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Repeat_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_repeat_block);
						setState(245);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(246);
						expr_acc();
						}
						break;
					case 2:
						{
						_localctx = new Repeat_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_repeat_block);
						setState(247);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(248);
						declare_measures();
						}
						break;
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		case 20:
			return staff_block_sempred((Staff_blockContext)_localctx, predIndex);
		case 21:
			return repeat_block_sempred((Repeat_blockContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean staff_block_sempred(Staff_blockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean repeat_block_sempred(Repeat_blockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0101\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\6\5C"+
		"\n\5\r\5\16\5D\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\6\bU\n\b\r\b\16\bV\3\b\3\b\3\t\3\t\3\t\6\t^\n\t\r\t\16\t_\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\6\nh\n\n\r\n\16\ni\3\n\3\n\3\13\3\13\3\13\3\13\5\13r\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0083"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0091"+
		"\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00a4\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00ad\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00b4\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u00bd\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\6\25\u00c7\n\25\r\25\16\25\u00c8\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5"+
		"\26\u00de\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00e9"+
		"\n\26\f\26\16\26\u00ec\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u00f6\n\27\3\27\3\27\3\27\3\27\7\27\u00fc\n\27\f\27\16\27\u00ff\13"+
		"\27\3\27\2\4*,\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\4\3"+
		"\2\3\13\3\2\f\21\2\u010a\2.\3\2\2\2\4\60\3\2\2\2\6\62\3\2\2\2\b\67\3\2"+
		"\2\2\nH\3\2\2\2\fL\3\2\2\2\16P\3\2\2\2\20Z\3\2\2\2\22c\3\2\2\2\24q\3\2"+
		"\2\2\26\u0082\3\2\2\2\30\u0084\3\2\2\2\32\u0090\3\2\2\2\34\u0092\3\2\2"+
		"\2\36\u0094\3\2\2\2 \u00a3\3\2\2\2\"\u00ac\3\2\2\2$\u00b3\3\2\2\2&\u00bc"+
		"\3\2\2\2(\u00be\3\2\2\2*\u00dd\3\2\2\2,\u00f5\3\2\2\2./\t\2\2\2/\3\3\2"+
		"\2\2\60\61\t\3\2\2\61\5\3\2\2\2\62\63\7\3\2\2\63\64\7\33\2\2\64\65\7\23"+
		"\2\2\65\66\7\34\2\2\66\7\3\2\2\2\67=\5\6\4\28<\5\n\6\29<\5\f\7\2:<\5\16"+
		"\b\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>B\3\2"+
		"\2\2?=\3\2\2\2@C\5(\25\2AC\5\34\17\2B@\3\2\2\2BA\3\2\2\2CD\3\2\2\2DB\3"+
		"\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\2\2\3G\t\3\2\2\2HI\7\27\2\2IJ\7\35\2\2"+
		"JK\5\26\f\2K\13\3\2\2\2LM\7\27\2\2MN\7\35\2\2NO\5\30\r\2O\r\3\2\2\2PQ"+
		"\7\6\2\2QR\7\27\2\2RT\7\30\2\2SU\5(\25\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2"+
		"VW\3\2\2\2WX\3\2\2\2XY\7\31\2\2Y\17\3\2\2\2Z[\7\13\2\2[]\7\30\2\2\\^\5"+
		"\24\13\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\31\2\2"+
		"b\21\3\2\2\2cd\7\5\2\2dg\7\30\2\2eh\5\24\13\2fh\5\20\t\2ge\3\2\2\2gf\3"+
		"\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\31\2\2l\23\3\2\2\2"+
		"mr\5\26\f\2nr\5\30\r\2or\5\34\17\2pr\5\36\20\2qm\3\2\2\2qn\3\2\2\2qo\3"+
		"\2\2\2qp\3\2\2\2r\25\3\2\2\2st\5\4\3\2tu\7\33\2\2uv\7\25\2\2vw\7\32\2"+
		"\2wx\7\23\2\2xy\7\34\2\2y\u0083\3\2\2\2z{\5\4\3\2{|\7\33\2\2|}\7\25\2"+
		"\2}~\7\32\2\2~\177\7\23\2\2\177\u0080\7\34\2\2\u0080\u0081\7\22\2\2\u0081"+
		"\u0083\3\2\2\2\u0082s\3\2\2\2\u0082z\3\2\2\2\u0083\27\3\2\2\2\u0084\u0085"+
		"\7\n\2\2\u0085\u0086\7\33\2\2\u0086\u0087\5\26\f\2\u0087\u0088\5\32\16"+
		"\2\u0088\u0089\7\34\2\2\u0089\31\3\2\2\2\u008a\u008b\7\32\2\2\u008b\u0091"+
		"\5\26\f\2\u008c\u008d\7\32\2\2\u008d\u008e\5\26\f\2\u008e\u008f\5\32\16"+
		"\2\u008f\u0091\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008c\3\2\2\2\u0091\33"+
		"\3\2\2\2\u0092\u0093\7\27\2\2\u0093\35\3\2\2\2\u0094\u0095\7\7\2\2\u0095"+
		"\u0096\7\33\2\2\u0096\u0097\5 \21\2\u0097\u0098\7\34\2\2\u0098\37\3\2"+
		"\2\2\u0099\u009a\7\26\2\2\u009a\u00a4\7\25\2\2\u009b\u009c\7\26\2\2\u009c"+
		"\u009d\7\25\2\2\u009d\u009e\7\32\2\2\u009e\u00a4\5 \21\2\u009f\u00a4\7"+
		"\25\2\2\u00a0\u00a1\7\25\2\2\u00a1\u00a2\7\32\2\2\u00a2\u00a4\5 \21\2"+
		"\u00a3\u0099\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a0"+
		"\3\2\2\2\u00a4!\3\2\2\2\u00a5\u00a6\7\b\2\2\u00a6\u00a7\5*\26\2\u00a7"+
		"\u00a8\5$\23\2\u00a8\u00ad\3\2\2\2\u00a9\u00aa\5*\26\2\u00aa\u00ab\5&"+
		"\24\2\u00ab\u00ad\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad"+
		"#\3\2\2\2\u00ae\u00b4\5&\24\2\u00af\u00b0\5&\24\2\u00b0\u00b1\5*\26\2"+
		"\u00b1\u00b2\5$\23\2\u00b2\u00b4\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00af"+
		"\3\2\2\2\u00b4%\3\2\2\2\u00b5\u00b6\7\t\2\2\u00b6\u00b7\7\33\2\2\u00b7"+
		"\u00b8\7\23\2\2\u00b8\u00bd\7\34\2\2\u00b9\u00ba\7\t\2\2\u00ba\u00bb\7"+
		"\33\2\2\u00bb\u00bd\7\34\2\2\u00bc\u00b5\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd"+
		"\'\3\2\2\2\u00be\u00bf\7\4\2\2\u00bf\u00c0\7\33\2\2\u00c0\u00c1\7\23\2"+
		"\2\u00c1\u00c2\7\32\2\2\u00c2\u00c3\7\23\2\2\u00c3\u00c4\7\34\2\2\u00c4"+
		"\u00c6\7\30\2\2\u00c5\u00c7\5*\26\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3"+
		"\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\7\31\2\2\u00cb)\3\2\2\2\u00cc\u00cd\b\26\1\2\u00cd\u00ce\5\36\20"+
		"\2\u00ce\u00cf\5*\26\n\u00cf\u00de\3\2\2\2\u00d0\u00d1\5\22\n\2\u00d1"+
		"\u00d2\5*\26\b\u00d2\u00de\3\2\2\2\u00d3\u00de\5\22\n\2\u00d4\u00d5\7"+
		"\b\2\2\u00d5\u00d6\5,\27\2\u00d6\u00d7\7\t\2\2\u00d7\u00d8\5*\26\5\u00d8"+
		"\u00de\3\2\2\2\u00d9\u00da\7\b\2\2\u00da\u00db\5,\27\2\u00db\u00dc\7\t"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00cc\3\2\2\2\u00dd\u00d0\3\2\2\2\u00dd"+
		"\u00d3\3\2\2\2\u00dd\u00d4\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de\u00ea\3\2"+
		"\2\2\u00df\u00e0\f\t\2\2\u00e0\u00e9\5\36\20\2\u00e1\u00e2\f\7\2\2\u00e2"+
		"\u00e9\5\22\n\2\u00e3\u00e4\f\4\2\2\u00e4\u00e5\7\b\2\2\u00e5\u00e6\5"+
		",\27\2\u00e6\u00e7\7\t\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8"+
		"\u00e1\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb+\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee"+
		"\b\27\1\2\u00ee\u00ef\5\36\20\2\u00ef\u00f0\5,\27\7\u00f0\u00f6\3\2\2"+
		"\2\u00f1\u00f2\5\22\n\2\u00f2\u00f3\5,\27\5\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f6\5\22\n\2\u00f5\u00ed\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f4\3"+
		"\2\2\2\u00f6\u00fd\3\2\2\2\u00f7\u00f8\f\6\2\2\u00f8\u00fc\5\36\20\2\u00f9"+
		"\u00fa\f\4\2\2\u00fa\u00fc\5\22\n\2\u00fb\u00f7\3\2\2\2\u00fb\u00f9\3"+
		"\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"-\3\2\2\2\u00ff\u00fd\3\2\2\2\30;=BDV_giq\u0082\u0090\u00a3\u00ac\u00b3"+
		"\u00bc\u00c8\u00dd\u00e8\u00ea\u00f5\u00fb\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}