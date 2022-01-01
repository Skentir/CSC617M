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
		KEYWORD=1, BPM=2, STAFF=3, MEASURE=4, MELODY=5, ACCIDENTAL_KEY=6, REPSTART=7, 
		REPEND=8, CHORD=9, CONTINUOUS=10, NOTE_VALUE=11, DOUBLE=12, FULL=13, HALF=14, 
		QUARTER=15, EIGHTH=16, SIXTEENTH=17, DOTTED=18, INTEGER=19, FRACTION=20, 
		PITCH=21, ACCIDENTAL=22, IDENTIFIER=23, OPEN_BRACKET=24, CLOSE_BRACKET=25, 
		COMMA_SEP=26, OPEN_PAR=27, CLOSE_PAR=28, EQUAL_OPER=29, WS=30;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_bpm = 2, RULE_expr = 3, RULE_expr_note = 4, 
		RULE_expr_chord = 5, RULE_expr_add_note = 6, RULE_expr_var = 7, RULE_expr_acc = 8, 
		RULE_expr_add_acc = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "bpm", "expr", "expr_note", "expr_chord", "expr_add_note", 
			"expr_var", "expr_acc", "expr_add_acc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'bpm'", "'staff'", "'measure'", "'melody'", "'accidental'", 
			"'repstart'", "'repend'", "'chord'", "'continuous'", null, "'double'", 
			"'full'", "'half'", "'quarter'", "'eighth'", "'sixteenth'", "'*'", null, 
			null, null, null, null, null, "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORD", "BPM", "STAFF", "MEASURE", "MELODY", "ACCIDENTAL_KEY", 
			"REPSTART", "REPEND", "CHORD", "CONTINUOUS", "NOTE_VALUE", "DOUBLE", 
			"FULL", "HALF", "QUARTER", "EIGHTH", "SIXTEENTH", "DOTTED", "INTEGER", 
			"FRACTION", "PITCH", "ACCIDENTAL", "IDENTIFIER", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"COMMA_SEP", "OPEN_PAR", "CLOSE_PAR", "EQUAL_OPER", "WS"
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

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyGrammerParser.EOF, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(22);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BPM:
					{
					setState(20);
					decl();
					}
					break;
				case ACCIDENTAL_KEY:
				case CHORD:
				case NOTE_VALUE:
				case IDENTIFIER:
					{
					setState(21);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BPM) | (1L << ACCIDENTAL_KEY) | (1L << CHORD) | (1L << NOTE_VALUE) | (1L << IDENTIFIER))) != 0) );
			setState(26);
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

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BPMDeclarationContext extends DeclContext {
		public BpmContext bpm() {
			return getRuleContext(BpmContext.class,0);
		}
		public BPMDeclarationContext(DeclContext ctx) { copyFrom(ctx); }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			_localctx = new BPMDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			bpm();
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
			setState(30);
			match(BPM);
			setState(31);
			match(OPEN_PAR);
			setState(32);
			match(INTEGER);
			setState(33);
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
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTE_VALUE:
				_localctx = new NoteExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				expr_note();
				}
				break;
			case CHORD:
				_localctx = new ChordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				expr_chord();
				}
				break;
			case IDENTIFIER:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				expr_var();
				}
				break;
			case ACCIDENTAL_KEY:
				_localctx = new AccidentalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
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
		public TerminalNode NOTE_VALUE() { return getToken(MyGrammerParser.NOTE_VALUE, 0); }
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
		enterRule(_localctx, 8, RULE_expr_note);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(NOTE_VALUE);
				setState(42);
				match(OPEN_PAR);
				setState(43);
				match(PITCH);
				setState(44);
				match(COMMA_SEP);
				setState(45);
				match(INTEGER);
				setState(46);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(NOTE_VALUE);
				setState(48);
				match(OPEN_PAR);
				setState(49);
				match(PITCH);
				setState(50);
				match(COMMA_SEP);
				setState(51);
				match(INTEGER);
				setState(52);
				match(CLOSE_PAR);
				setState(53);
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
		public TerminalNode COMMA_SEP() { return getToken(MyGrammerParser.COMMA_SEP, 0); }
		public TerminalNode FRACTION() { return getToken(MyGrammerParser.FRACTION, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MyGrammerParser.CLOSE_PAR, 0); }
		public Expr_chordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_chord; }
	}

	public final Expr_chordContext expr_chord() throws RecognitionException {
		Expr_chordContext _localctx = new Expr_chordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr_chord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(CHORD);
			setState(57);
			match(OPEN_PAR);
			setState(58);
			expr_note();
			setState(59);
			expr_add_note();
			setState(60);
			match(COMMA_SEP);
			setState(61);
			match(FRACTION);
			setState(62);
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
		enterRule(_localctx, 12, RULE_expr_add_note);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(COMMA_SEP);
				setState(65);
				expr_note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(COMMA_SEP);
				setState(67);
				expr_note();
				setState(68);
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
		enterRule(_localctx, 14, RULE_expr_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
		enterRule(_localctx, 16, RULE_expr_acc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ACCIDENTAL_KEY);
			setState(75);
			match(OPEN_PAR);
			setState(76);
			expr_add_acc();
			setState(77);
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
		enterRule(_localctx, 18, RULE_expr_add_acc);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(ACCIDENTAL);
				setState(80);
				match(PITCH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(ACCIDENTAL);
				setState(82);
				match(PITCH);
				setState(83);
				match(COMMA_SEP);
				setState(84);
				expr_add_acc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(PITCH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				match(PITCH);
				setState(87);
				match(COMMA_SEP);
				setState(88);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 ^\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2"+
		"\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\5\5*\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\69\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bI\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\\\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2]"+
		"\2\30\3\2\2\2\4\36\3\2\2\2\6 \3\2\2\2\b)\3\2\2\2\n8\3\2\2\2\f:\3\2\2\2"+
		"\16H\3\2\2\2\20J\3\2\2\2\22L\3\2\2\2\24[\3\2\2\2\26\31\5\4\3\2\27\31\5"+
		"\b\5\2\30\26\3\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3"+
		"\2\2\2\33\34\3\2\2\2\34\35\7\2\2\3\35\3\3\2\2\2\36\37\5\6\4\2\37\5\3\2"+
		"\2\2 !\7\4\2\2!\"\7\35\2\2\"#\7\25\2\2#$\7\36\2\2$\7\3\2\2\2%*\5\n\6\2"+
		"&*\5\f\7\2\'*\5\20\t\2(*\5\22\n\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2"+
		"\2\2*\t\3\2\2\2+,\7\r\2\2,-\7\35\2\2-.\7\27\2\2./\7\34\2\2/\60\7\25\2"+
		"\2\609\7\36\2\2\61\62\7\r\2\2\62\63\7\35\2\2\63\64\7\27\2\2\64\65\7\34"+
		"\2\2\65\66\7\25\2\2\66\67\7\36\2\2\679\7\24\2\28+\3\2\2\28\61\3\2\2\2"+
		"9\13\3\2\2\2:;\7\13\2\2;<\7\35\2\2<=\5\n\6\2=>\5\16\b\2>?\7\34\2\2?@\7"+
		"\26\2\2@A\7\36\2\2A\r\3\2\2\2BC\7\34\2\2CI\5\n\6\2DE\7\34\2\2EF\5\n\6"+
		"\2FG\5\16\b\2GI\3\2\2\2HB\3\2\2\2HD\3\2\2\2I\17\3\2\2\2JK\7\31\2\2K\21"+
		"\3\2\2\2LM\7\b\2\2MN\7\35\2\2NO\5\24\13\2OP\7\36\2\2P\23\3\2\2\2QR\7\30"+
		"\2\2R\\\7\27\2\2ST\7\30\2\2TU\7\27\2\2UV\7\34\2\2V\\\5\24\13\2W\\\7\27"+
		"\2\2XY\7\27\2\2YZ\7\34\2\2Z\\\5\24\13\2[Q\3\2\2\2[S\3\2\2\2[W\3\2\2\2"+
		"[X\3\2\2\2\\\25\3\2\2\2\b\30\32)8H[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}