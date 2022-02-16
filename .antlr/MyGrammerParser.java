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
		BPM=1, STAFF=2, MEASURE=3, MEASUREUP=4, MEASUREDOWN=5, MELODY=6, ACCIDENTAL_KEY=7, 
		REPSTART=8, REPEND=9, CHORD=10, CONTINUOUS=11, DOUBLE=12, FULL=13, HALF=14, 
		QUARTER=15, EIGHTH=16, SIXTEENTH=17, INSTRUMENT=18, DOTTED=19, CLARINET=20, 
		FLUTE=21, ORGAN=22, PIANO=23, RECORDER=24, SAXOPHONE=25, TRUMPET=26, GUITAR=27, 
		ACOUSTICGUITAR=28, ELECTRICGUITAR=29, UKULELE=30, VIOLIN=31, XYLOPHONE=32, 
		INTEGER=33, FRACTION=34, PITCH=35, ACCIDENTAL=36, IDENTIFIER=37, OPEN_BRACKET=38, 
		CLOSE_BRACKET=39, COMMA_SEP=40, OPEN_PAR=41, CLOSE_PAR=42, EQUAL_OPER=43, 
		WS=44;
	public static final int
		RULE_note_value = 0, RULE_instruments = 1, RULE_bpm = 2, RULE_instrument = 3, 
		RULE_prog = 4, RULE_declare_note = 5, RULE_declare_chord = 6, RULE_declare_melody = 7, 
		RULE_declare_continuous = 8, RULE_declare_measures = 9, RULE_declare_measures_up = 10, 
		RULE_declare_measures_down = 11, RULE_measure_block = 12, RULE_expr = 13, 
		RULE_expr_note = 14, RULE_expr_chord = 15, RULE_expr_add_note = 16, RULE_expr_var = 17, 
		RULE_expr_acc = 18, RULE_expr_add_acc = 19, RULE_declare_repeat = 20, 
		RULE_declare_repeat_end = 21, RULE_declare_staff = 22, RULE_staff_block = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"note_value", "instruments", "bpm", "instrument", "prog", "declare_note", 
			"declare_chord", "declare_melody", "declare_continuous", "declare_measures", 
			"declare_measures_up", "declare_measures_down", "measure_block", "expr", 
			"expr_note", "expr_chord", "expr_add_note", "expr_var", "expr_acc", "expr_add_acc", 
			"declare_repeat", "declare_repeat_end", "declare_staff", "staff_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'*'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BPM", "STAFF", "MEASURE", "MEASUREUP", "MEASUREDOWN", "MELODY", 
			"ACCIDENTAL_KEY", "REPSTART", "REPEND", "CHORD", "CONTINUOUS", "DOUBLE", 
			"FULL", "HALF", "QUARTER", "EIGHTH", "SIXTEENTH", "INSTRUMENT", "DOTTED", 
			"CLARINET", "FLUTE", "ORGAN", "PIANO", "RECORDER", "SAXOPHONE", "TRUMPET", 
			"GUITAR", "ACOUSTICGUITAR", "ELECTRICGUITAR", "UKULELE", "VIOLIN", "XYLOPHONE", 
			"INTEGER", "FRACTION", "PITCH", "ACCIDENTAL", "IDENTIFIER", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "COMMA_SEP", "OPEN_PAR", "CLOSE_PAR", "EQUAL_OPER", 
			"WS"
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
			setState(48);
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

	public static class InstrumentsContext extends ParserRuleContext {
		public TerminalNode CLARINET() { return getToken(MyGrammerParser.CLARINET, 0); }
		public TerminalNode FLUTE() { return getToken(MyGrammerParser.FLUTE, 0); }
		public TerminalNode ORGAN() { return getToken(MyGrammerParser.ORGAN, 0); }
		public TerminalNode PIANO() { return getToken(MyGrammerParser.PIANO, 0); }
		public TerminalNode RECORDER() { return getToken(MyGrammerParser.RECORDER, 0); }
		public TerminalNode SAXOPHONE() { return getToken(MyGrammerParser.SAXOPHONE, 0); }
		public TerminalNode TRUMPET() { return getToken(MyGrammerParser.TRUMPET, 0); }
		public TerminalNode GUITAR() { return getToken(MyGrammerParser.GUITAR, 0); }
		public TerminalNode ACOUSTICGUITAR() { return getToken(MyGrammerParser.ACOUSTICGUITAR, 0); }
		public TerminalNode ELECTRICGUITAR() { return getToken(MyGrammerParser.ELECTRICGUITAR, 0); }
		public TerminalNode UKULELE() { return getToken(MyGrammerParser.UKULELE, 0); }
		public TerminalNode VIOLIN() { return getToken(MyGrammerParser.VIOLIN, 0); }
		public TerminalNode XYLOPHONE() { return getToken(MyGrammerParser.XYLOPHONE, 0); }
		public InstrumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruments; }
	}

	public final InstrumentsContext instruments() throws RecognitionException {
		InstrumentsContext _localctx = new InstrumentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLARINET) | (1L << FLUTE) | (1L << ORGAN) | (1L << PIANO) | (1L << RECORDER) | (1L << SAXOPHONE) | (1L << TRUMPET) | (1L << GUITAR) | (1L << ACOUSTICGUITAR) | (1L << ELECTRICGUITAR) | (1L << UKULELE) | (1L << VIOLIN) | (1L << XYLOPHONE))) != 0)) ) {
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
			setState(52);
			match(BPM);
			setState(53);
			match(OPEN_PAR);
			setState(54);
			match(INTEGER);
			setState(55);
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

	public static class InstrumentContext extends ParserRuleContext {
		public TerminalNode INSTRUMENT() { return getToken(MyGrammerParser.INSTRUMENT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MyGrammerParser.OPEN_PAR, 0); }
		public InstrumentsContext instruments() {
			return getRuleContext(InstrumentsContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MyGrammerParser.CLOSE_PAR, 0); }
		public InstrumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrument; }
	}

	public final InstrumentContext instrument() throws RecognitionException {
		InstrumentContext _localctx = new InstrumentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(INSTRUMENT);
			setState(58);
			match(OPEN_PAR);
			setState(59);
			instruments();
			setState(60);
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
		public InstrumentContext instrument() {
			return getRuleContext(InstrumentContext.class,0);
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
		enterRule(_localctx, 8, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			bpm();
			setState(63);
			instrument();
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(67);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(64);
						declare_note();
						}
						break;
					case 2:
						{
						setState(65);
						declare_chord();
						}
						break;
					case 3:
						{
						setState(66);
						declare_melody();
						}
						break;
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAFF:
					{
					setState(72);
					declare_staff();
					}
					break;
				case IDENTIFIER:
					{
					setState(73);
					expr_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAFF || _la==IDENTIFIER );
			setState(78);
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
		enterRule(_localctx, 10, RULE_declare_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(IDENTIFIER);
			setState(81);
			match(EQUAL_OPER);
			setState(82);
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
		enterRule(_localctx, 12, RULE_declare_chord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(IDENTIFIER);
			setState(85);
			match(EQUAL_OPER);
			setState(86);
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
		enterRule(_localctx, 14, RULE_declare_melody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(MELODY);
			setState(89);
			match(IDENTIFIER);
			setState(90);
			match(OPEN_BRACKET);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				declare_staff();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAFF );
			setState(96);
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
		enterRule(_localctx, 16, RULE_declare_continuous);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(CONTINUOUS);
			setState(99);
			match(OPEN_BRACKET);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				expr();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL_KEY) | (1L << CHORD) | (1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH) | (1L << IDENTIFIER))) != 0) );
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

	public static class Declare_measuresContext extends ParserRuleContext {
		public TerminalNode MEASURE() { return getToken(MyGrammerParser.MEASURE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyGrammerParser.OPEN_BRACKET, 0); }
		public Measure_blockContext measure_block() {
			return getRuleContext(Measure_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(MyGrammerParser.CLOSE_BRACKET, 0); }
		public Declare_measuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_measures; }
	}

	public final Declare_measuresContext declare_measures() throws RecognitionException {
		Declare_measuresContext _localctx = new Declare_measuresContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declare_measures);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(MEASURE);
			setState(108);
			match(OPEN_BRACKET);
			setState(109);
			measure_block();
			setState(110);
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

	public static class Declare_measures_upContext extends ParserRuleContext {
		public TerminalNode MEASUREUP() { return getToken(MyGrammerParser.MEASUREUP, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyGrammerParser.OPEN_BRACKET, 0); }
		public Measure_blockContext measure_block() {
			return getRuleContext(Measure_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(MyGrammerParser.CLOSE_BRACKET, 0); }
		public Declare_measures_downContext declare_measures_down() {
			return getRuleContext(Declare_measures_downContext.class,0);
		}
		public Declare_measures_upContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_measures_up; }
	}

	public final Declare_measures_upContext declare_measures_up() throws RecognitionException {
		Declare_measures_upContext _localctx = new Declare_measures_upContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declare_measures_up);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(MEASUREUP);
			setState(113);
			match(OPEN_BRACKET);
			setState(114);
			measure_block();
			setState(115);
			match(CLOSE_BRACKET);
			setState(116);
			declare_measures_down();
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

	public static class Declare_measures_downContext extends ParserRuleContext {
		public TerminalNode MEASUREDOWN() { return getToken(MyGrammerParser.MEASUREDOWN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyGrammerParser.OPEN_BRACKET, 0); }
		public Measure_blockContext measure_block() {
			return getRuleContext(Measure_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(MyGrammerParser.CLOSE_BRACKET, 0); }
		public Declare_measures_downContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_measures_down; }
	}

	public final Declare_measures_downContext declare_measures_down() throws RecognitionException {
		Declare_measures_downContext _localctx = new Declare_measures_downContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declare_measures_down);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(MEASUREDOWN);
			setState(119);
			match(OPEN_BRACKET);
			setState(120);
			measure_block();
			setState(121);
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

	public static class Measure_blockContext extends ParserRuleContext {
		public Declare_repeatContext declare_repeat() {
			return getRuleContext(Declare_repeatContext.class,0);
		}
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
		public Declare_repeat_endContext declare_repeat_end() {
			return getRuleContext(Declare_repeat_endContext.class,0);
		}
		public Measure_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure_block; }
	}

	public final Measure_blockContext measure_block() throws RecognitionException {
		Measure_blockContext _localctx = new Measure_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_measure_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPSTART) {
				{
				setState(123);
				declare_repeat();
				}
			}

			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(128);
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
					setState(126);
					expr();
					}
					break;
				case CONTINUOUS:
					{
					setState(127);
					declare_continuous();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL_KEY) | (1L << CHORD) | (1L << CONTINUOUS) | (1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH) | (1L << IDENTIFIER))) != 0) );
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPEND) {
				{
				setState(132);
				declare_repeat_end();
				}
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
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(139);
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
				setState(135);
				expr_note();
				}
				break;
			case CHORD:
				_localctx = new ChordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				expr_chord();
				}
				break;
			case IDENTIFIER:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				expr_var();
				}
				break;
			case ACCIDENTAL_KEY:
				_localctx = new AccidentalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
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
		public TerminalNode ACCIDENTAL() { return getToken(MyGrammerParser.ACCIDENTAL, 0); }
		public TerminalNode DOTTED() { return getToken(MyGrammerParser.DOTTED, 0); }
		public Expr_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_note; }
	}

	public final Expr_noteContext expr_note() throws RecognitionException {
		Expr_noteContext _localctx = new Expr_noteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_note);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				note_value();
				setState(142);
				match(OPEN_PAR);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACCIDENTAL) {
					{
					setState(143);
					match(ACCIDENTAL);
					}
				}

				setState(146);
				match(PITCH);
				setState(147);
				match(COMMA_SEP);
				setState(148);
				match(INTEGER);
				setState(149);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				note_value();
				setState(152);
				match(OPEN_PAR);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACCIDENTAL) {
					{
					setState(153);
					match(ACCIDENTAL);
					}
				}

				setState(156);
				match(PITCH);
				setState(157);
				match(COMMA_SEP);
				setState(158);
				match(INTEGER);
				setState(159);
				match(CLOSE_PAR);
				setState(160);
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
		enterRule(_localctx, 30, RULE_expr_chord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(CHORD);
			setState(165);
			match(OPEN_PAR);
			setState(166);
			expr_note();
			setState(167);
			expr_add_note();
			setState(168);
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
		enterRule(_localctx, 32, RULE_expr_add_note);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(COMMA_SEP);
				setState(171);
				expr_note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(COMMA_SEP);
				setState(173);
				expr_note();
				setState(174);
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
		enterRule(_localctx, 34, RULE_expr_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
		enterRule(_localctx, 36, RULE_expr_acc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ACCIDENTAL_KEY);
			setState(181);
			match(OPEN_PAR);
			setState(182);
			expr_add_acc();
			setState(183);
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
		enterRule(_localctx, 38, RULE_expr_add_acc);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(ACCIDENTAL);
				setState(186);
				match(PITCH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(ACCIDENTAL);
				setState(188);
				match(PITCH);
				setState(189);
				match(COMMA_SEP);
				setState(190);
				expr_add_acc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(PITCH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(PITCH);
				setState(193);
				match(COMMA_SEP);
				setState(194);
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
		public Declare_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_repeat; }
	}

	public final Declare_repeatContext declare_repeat() throws RecognitionException {
		Declare_repeatContext _localctx = new Declare_repeatContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declare_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(REPSTART);
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
		public TerminalNode REPEND() { return getToken(MyGrammerParser.REPEND, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MyGrammerParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MyGrammerParser.CLOSE_PAR, 0); }
		public TerminalNode INTEGER() { return getToken(MyGrammerParser.INTEGER, 0); }
		public Declare_repeat_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_repeat_end; }
	}

	public final Declare_repeat_endContext declare_repeat_end() throws RecognitionException {
		Declare_repeat_endContext _localctx = new Declare_repeat_endContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declare_repeat_end);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(REPEND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(REPEND);
				setState(201);
				match(OPEN_PAR);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(202);
					match(INTEGER);
					}
				}

				setState(205);
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
		enterRule(_localctx, 44, RULE_declare_staff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(STAFF);
			setState(209);
			match(OPEN_PAR);
			setState(210);
			match(INTEGER);
			setState(211);
			match(COMMA_SEP);
			setState(212);
			match(INTEGER);
			setState(213);
			match(CLOSE_PAR);
			setState(214);
			match(OPEN_BRACKET);
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				staff_block(0);
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEASURE) | (1L << MEASUREUP) | (1L << ACCIDENTAL_KEY))) != 0) );
			setState(220);
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
		public Declare_measures_upContext declare_measures_up() {
			return getRuleContext(Declare_measures_upContext.class,0);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_staff_block, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(223);
				expr_acc();
				setState(224);
				staff_block(8);
				}
				break;
			case 2:
				{
				setState(226);
				declare_measures();
				setState(227);
				staff_block(6);
				}
				break;
			case 3:
				{
				setState(229);
				declare_measures();
				}
				break;
			case 4:
				{
				setState(230);
				declare_measures_up();
				setState(231);
				staff_block(3);
				}
				break;
			case 5:
				{
				setState(233);
				declare_measures_up();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(236);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(237);
						expr_acc();
						}
						break;
					case 2:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(238);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(239);
						declare_measures();
						}
						break;
					case 3:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(241);
						declare_measures_up();
						}
						break;
					}
					} 
				}
				setState(246);
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
		case 23:
			return staff_block_sempred((Staff_blockContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\7\6F\n\6\f\6\16\6I\13\6\3\6\3\6\6\6M\n\6\r\6\16\6N\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\6\t_\n\t\r\t\16\t`\3\t\3"+
		"\t\3\n\3\n\3\n\6\nh\n\n\r\n\16\ni\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\5\16\177\n\16\3\16\3\16"+
		"\6\16\u0083\n\16\r\16\16\16\u0084\3\16\5\16\u0088\n\16\3\17\3\17\3\17"+
		"\3\17\5\17\u008e\n\17\3\20\3\20\3\20\5\20\u0093\n\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u009d\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00a5\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00b3\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c6\n\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\5\27\u00ce\n\27\3\27\5\27\u00d1\n\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\6\30\u00db\n\30\r\30\16\30\u00dc\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ed\n\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u00f5\n\31\f\31\16\31\u00f8\13\31\3\31"+
		"\2\3\60\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\4\3\2"+
		"\16\23\3\2\26\"\2\u0100\2\62\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\b;\3\2"+
		"\2\2\n@\3\2\2\2\fR\3\2\2\2\16V\3\2\2\2\20Z\3\2\2\2\22d\3\2\2\2\24m\3\2"+
		"\2\2\26r\3\2\2\2\30x\3\2\2\2\32~\3\2\2\2\34\u008d\3\2\2\2\36\u00a4\3\2"+
		"\2\2 \u00a6\3\2\2\2\"\u00b2\3\2\2\2$\u00b4\3\2\2\2&\u00b6\3\2\2\2(\u00c5"+
		"\3\2\2\2*\u00c7\3\2\2\2,\u00d0\3\2\2\2.\u00d2\3\2\2\2\60\u00ec\3\2\2\2"+
		"\62\63\t\2\2\2\63\3\3\2\2\2\64\65\t\3\2\2\65\5\3\2\2\2\66\67\7\3\2\2\67"+
		"8\7+\2\289\7#\2\29:\7,\2\2:\7\3\2\2\2;<\7\24\2\2<=\7+\2\2=>\5\4\3\2>?"+
		"\7,\2\2?\t\3\2\2\2@A\5\6\4\2AG\5\b\5\2BF\5\f\7\2CF\5\16\b\2DF\5\20\t\2"+
		"EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HL\3\2\2\2"+
		"IG\3\2\2\2JM\5.\30\2KM\5$\23\2LJ\3\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2"+
		"NO\3\2\2\2OP\3\2\2\2PQ\7\2\2\3Q\13\3\2\2\2RS\7\'\2\2ST\7-\2\2TU\5\36\20"+
		"\2U\r\3\2\2\2VW\7\'\2\2WX\7-\2\2XY\5 \21\2Y\17\3\2\2\2Z[\7\b\2\2[\\\7"+
		"\'\2\2\\^\7(\2\2]_\5.\30\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3"+
		"\2\2\2bc\7)\2\2c\21\3\2\2\2de\7\r\2\2eg\7(\2\2fh\5\34\17\2gf\3\2\2\2h"+
		"i\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7)\2\2l\23\3\2\2\2mn\7\5\2\2"+
		"no\7(\2\2op\5\32\16\2pq\7)\2\2q\25\3\2\2\2rs\7\6\2\2st\7(\2\2tu\5\32\16"+
		"\2uv\7)\2\2vw\5\30\r\2w\27\3\2\2\2xy\7\7\2\2yz\7(\2\2z{\5\32\16\2{|\7"+
		")\2\2|\31\3\2\2\2}\177\5*\26\2~}\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2"+
		"\2\u0080\u0083\5\34\17\2\u0081\u0083\5\22\n\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0088\5,\27\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\33\3\2\2\2\u0089\u008e\5\36\20\2\u008a\u008e\5 \21"+
		"\2\u008b\u008e\5$\23\2\u008c\u008e\5&\24\2\u008d\u0089\3\2\2\2\u008d\u008a"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\35\3\2\2\2\u008f"+
		"\u0090\5\2\2\2\u0090\u0092\7+\2\2\u0091\u0093\7&\2\2\u0092\u0091\3\2\2"+
		"\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7%\2\2\u0095\u0096"+
		"\7*\2\2\u0096\u0097\7#\2\2\u0097\u0098\7,\2\2\u0098\u00a5\3\2\2\2\u0099"+
		"\u009a\5\2\2\2\u009a\u009c\7+\2\2\u009b\u009d\7&\2\2\u009c\u009b\3\2\2"+
		"\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7%\2\2\u009f\u00a0"+
		"\7*\2\2\u00a0\u00a1\7#\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a3\7\25\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u008f\3\2\2\2\u00a4\u0099\3\2\2\2\u00a5\37\3\2\2"+
		"\2\u00a6\u00a7\7\f\2\2\u00a7\u00a8\7+\2\2\u00a8\u00a9\5\36\20\2\u00a9"+
		"\u00aa\5\"\22\2\u00aa\u00ab\7,\2\2\u00ab!\3\2\2\2\u00ac\u00ad\7*\2\2\u00ad"+
		"\u00b3\5\36\20\2\u00ae\u00af\7*\2\2\u00af\u00b0\5\36\20\2\u00b0\u00b1"+
		"\5\"\22\2\u00b1\u00b3\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ae\3\2\2\2"+
		"\u00b3#\3\2\2\2\u00b4\u00b5\7\'\2\2\u00b5%\3\2\2\2\u00b6\u00b7\7\t\2\2"+
		"\u00b7\u00b8\7+\2\2\u00b8\u00b9\5(\25\2\u00b9\u00ba\7,\2\2\u00ba\'\3\2"+
		"\2\2\u00bb\u00bc\7&\2\2\u00bc\u00c6\7%\2\2\u00bd\u00be\7&\2\2\u00be\u00bf"+
		"\7%\2\2\u00bf\u00c0\7*\2\2\u00c0\u00c6\5(\25\2\u00c1\u00c6\7%\2\2\u00c2"+
		"\u00c3\7%\2\2\u00c3\u00c4\7*\2\2\u00c4\u00c6\5(\25\2\u00c5\u00bb\3\2\2"+
		"\2\u00c5\u00bd\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6)"+
		"\3\2\2\2\u00c7\u00c8\7\n\2\2\u00c8+\3\2\2\2\u00c9\u00d1\7\13\2\2\u00ca"+
		"\u00cb\7\13\2\2\u00cb\u00cd\7+\2\2\u00cc\u00ce\7#\2\2\u00cd\u00cc\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\7,\2\2\u00d0"+
		"\u00c9\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d1-\3\2\2\2\u00d2\u00d3\7\4\2\2"+
		"\u00d3\u00d4\7+\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6\7*\2\2\u00d6\u00d7"+
		"\7#\2\2\u00d7\u00d8\7,\2\2\u00d8\u00da\7(\2\2\u00d9\u00db\5\60\31\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7)\2\2\u00df/\3\2\2\2\u00e0\u00e1"+
		"\b\31\1\2\u00e1\u00e2\5&\24\2\u00e2\u00e3\5\60\31\n\u00e3\u00ed\3\2\2"+
		"\2\u00e4\u00e5\5\24\13\2\u00e5\u00e6\5\60\31\b\u00e6\u00ed\3\2\2\2\u00e7"+
		"\u00ed\5\24\13\2\u00e8\u00e9\5\26\f\2\u00e9\u00ea\5\60\31\5\u00ea\u00ed"+
		"\3\2\2\2\u00eb\u00ed\5\26\f\2\u00ec\u00e0\3\2\2\2\u00ec\u00e4\3\2\2\2"+
		"\u00ec\u00e7\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f6"+
		"\3\2\2\2\u00ee\u00ef\f\t\2\2\u00ef\u00f5\5&\24\2\u00f0\u00f1\f\7\2\2\u00f1"+
		"\u00f5\5\24\13\2\u00f2\u00f3\f\4\2\2\u00f3\u00f5\5\26\f\2\u00f4\u00ee"+
		"\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\61\3\2\2\2\u00f8\u00f6\3\2\2"+
		"\2\30EGLN`i~\u0082\u0084\u0087\u008d\u0092\u009c\u00a4\u00b2\u00c5\u00cd"+
		"\u00d0\u00dc\u00ec\u00f4\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}