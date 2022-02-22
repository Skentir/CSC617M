// Generated from /Users/MacBookAir/github/CSC617M/MyGrammer.g4 by ANTLR 4.8
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
		REPSTART=8, REPEND=9, ENDSTART=10, ENDEND=11, CHORD=12, TUPLET=13, DOUBLE=14, 
		FULL=15, HALF=16, QUARTER=17, EIGHTH=18, SIXTEENTH=19, THIRTYSECOND=20, 
		INSTRUMENT=21, DOTTED=22, REST=23, FIXED_CHORD=24, CLARINET=25, FLUTE=26, 
		ORGAN=27, PIANO=28, RECORDER=29, SAXOPHONE=30, TRUMPET=31, GUITAR=32, 
		ACOUSTICGUITAR=33, ELECTRICGUITAR=34, UKULELE=35, VIOLIN=36, XYLOPHONE=37, 
		INTEGER=38, FRACTION=39, PITCH=40, ACCIDENTAL=41, IDENTIFIER=42, OPEN_BRACKET=43, 
		CLOSE_BRACKET=44, COMMA_SEP=45, OPEN_PAR=46, CLOSE_PAR=47, EQUAL_OPER=48, 
		WS=49;
	public static final int
		RULE_note_value = 0, RULE_instruments = 1, RULE_bpm = 2, RULE_instrument = 3, 
		RULE_prog = 4, RULE_declare_note = 5, RULE_declare_chord = 6, RULE_declare_melody = 7, 
		RULE_declare_pattern = 8, RULE_declare_measures = 9, RULE_declare_measures_up = 10, 
		RULE_declare_measures_down = 11, RULE_measure_block = 12, RULE_expr = 13, 
		RULE_expr_note = 14, RULE_expr_chord = 15, RULE_expr_add_note = 16, RULE_expr_var = 17, 
		RULE_expr_acc = 18, RULE_expr_add_acc = 19, RULE_expr_rest = 20, RULE_declare_repeat = 21, 
		RULE_declare_repeat_end = 22, RULE_declare_ending = 23, RULE_declare_ending_end = 24, 
		RULE_declare_staff = 25, RULE_staff_block = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"note_value", "instruments", "bpm", "instrument", "prog", "declare_note", 
			"declare_chord", "declare_melody", "declare_pattern", "declare_measures", 
			"declare_measures_up", "declare_measures_down", "measure_block", "expr", 
			"expr_note", "expr_chord", "expr_add_note", "expr_var", "expr_acc", "expr_add_acc", 
			"expr_rest", "declare_repeat", "declare_repeat_end", "declare_ending", 
			"declare_ending_end", "declare_staff", "staff_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'*'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BPM", "STAFF", "MEASURE", "MEASUREUP", "MEASUREDOWN", "MELODY", 
			"ACCIDENTAL_KEY", "REPSTART", "REPEND", "ENDSTART", "ENDEND", "CHORD", 
			"TUPLET", "DOUBLE", "FULL", "HALF", "QUARTER", "EIGHTH", "SIXTEENTH", 
			"THIRTYSECOND", "INSTRUMENT", "DOTTED", "REST", "FIXED_CHORD", "CLARINET", 
			"FLUTE", "ORGAN", "PIANO", "RECORDER", "SAXOPHONE", "TRUMPET", "GUITAR", 
			"ACOUSTICGUITAR", "ELECTRICGUITAR", "UKULELE", "VIOLIN", "XYLOPHONE", 
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
		public TerminalNode THIRTYSECOND() { return getToken(MyGrammerParser.THIRTYSECOND, 0); }
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
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH) | (1L << THIRTYSECOND))) != 0)) ) {
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
			setState(56);
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
			setState(58);
			match(BPM);
			setState(59);
			match(OPEN_PAR);
			setState(60);
			match(INTEGER);
			setState(61);
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
			setState(63);
			match(INSTRUMENT);
			setState(64);
			match(OPEN_PAR);
			setState(65);
			instruments();
			setState(66);
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
			setState(68);
			bpm();
			setState(69);
			instrument();
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(70);
						declare_note();
						}
						break;
					case 2:
						{
						setState(71);
						declare_chord();
						}
						break;
					case 3:
						{
						setState(72);
						declare_melody();
						}
						break;
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAFF:
					{
					setState(78);
					declare_staff();
					}
					break;
				case IDENTIFIER:
					{
					setState(79);
					expr_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAFF || _la==IDENTIFIER );
			setState(84);
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
			setState(86);
			match(IDENTIFIER);
			setState(87);
			match(EQUAL_OPER);
			setState(88);
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
			setState(90);
			match(IDENTIFIER);
			setState(91);
			match(EQUAL_OPER);
			setState(92);
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
			setState(94);
			match(MELODY);
			setState(95);
			match(IDENTIFIER);
			setState(96);
			match(OPEN_BRACKET);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				declare_staff();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAFF );
			setState(102);
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

	public static class Declare_patternContext extends ParserRuleContext {
		public TerminalNode TUPLET() { return getToken(MyGrammerParser.TUPLET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MyGrammerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MyGrammerParser.CLOSE_BRACKET, 0); }
		public List<Expr_noteContext> expr_note() {
			return getRuleContexts(Expr_noteContext.class);
		}
		public Expr_noteContext expr_note(int i) {
			return getRuleContext(Expr_noteContext.class,i);
		}
		public Declare_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_pattern; }
	}

	public final Declare_patternContext declare_pattern() throws RecognitionException {
		Declare_patternContext _localctx = new Declare_patternContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declare_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(TUPLET);
			setState(105);
			match(OPEN_BRACKET);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				expr_note();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH) | (1L << THIRTYSECOND))) != 0) );
			setState(111);
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
			setState(113);
			match(MEASURE);
			setState(114);
			match(OPEN_BRACKET);
			setState(115);
			measure_block();
			setState(116);
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
			setState(118);
			match(MEASUREUP);
			setState(119);
			match(OPEN_BRACKET);
			setState(120);
			measure_block();
			setState(121);
			match(CLOSE_BRACKET);
			setState(122);
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
			setState(124);
			match(MEASUREDOWN);
			setState(125);
			match(OPEN_BRACKET);
			setState(126);
			measure_block();
			setState(127);
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
		public Declare_endingContext declare_ending() {
			return getRuleContext(Declare_endingContext.class,0);
		}
		public Declare_repeatContext declare_repeat() {
			return getRuleContext(Declare_repeatContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Declare_patternContext> declare_pattern() {
			return getRuleContexts(Declare_patternContext.class);
		}
		public Declare_patternContext declare_pattern(int i) {
			return getRuleContext(Declare_patternContext.class,i);
		}
		public Declare_repeat_endContext declare_repeat_end() {
			return getRuleContext(Declare_repeat_endContext.class,0);
		}
		public Declare_ending_endContext declare_ending_end() {
			return getRuleContext(Declare_ending_endContext.class,0);
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
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENDSTART) {
				{
				setState(129);
				declare_ending();
				}
			}

			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPSTART) {
				{
				setState(132);
				declare_repeat();
				}
			}

			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(137);
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
				case THIRTYSECOND:
				case IDENTIFIER:
					{
					setState(135);
					expr();
					}
					break;
				case TUPLET:
					{
					setState(136);
					declare_pattern();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL_KEY) | (1L << CHORD) | (1L << TUPLET) | (1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH) | (1L << THIRTYSECOND) | (1L << IDENTIFIER))) != 0) );
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPEND) {
				{
				setState(141);
				declare_repeat_end();
				}
			}

			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENDEND) {
				{
				setState(144);
				declare_ending_end();
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
	public static class RestExpressionContext extends ExprContext {
		public Expr_restContext expr_rest() {
			return getRuleContext(Expr_restContext.class,0);
		}
		public RestExpressionContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new NoteExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				expr_note();
				}
				break;
			case 2:
				_localctx = new ChordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				expr_chord();
				}
				break;
			case 3:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				expr_var();
				}
				break;
			case 4:
				_localctx = new AccidentalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				expr_acc();
				}
				break;
			case 5:
				_localctx = new RestExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				expr_rest();
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
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			note_value();
			setState(155);
			match(OPEN_PAR);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(156);
				match(ACCIDENTAL);
				}
			}

			setState(159);
			match(PITCH);
			setState(160);
			match(COMMA_SEP);
			setState(161);
			match(INTEGER);
			setState(162);
			match(CLOSE_PAR);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTTED) {
				{
				setState(163);
				match(DOTTED);
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

	public static class Expr_chordContext extends ParserRuleContext {
		public TerminalNode CHORD() { return getToken(MyGrammerParser.CHORD, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(MyGrammerParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(MyGrammerParser.OPEN_PAR, i);
		}
		public Expr_noteContext expr_note() {
			return getRuleContext(Expr_noteContext.class,0);
		}
		public Expr_add_noteContext expr_add_note() {
			return getRuleContext(Expr_add_noteContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(MyGrammerParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(MyGrammerParser.CLOSE_PAR, i);
		}
		public Note_valueContext note_value() {
			return getRuleContext(Note_valueContext.class,0);
		}
		public TerminalNode FIXED_CHORD() { return getToken(MyGrammerParser.FIXED_CHORD, 0); }
		public TerminalNode COMMA_SEP() { return getToken(MyGrammerParser.COMMA_SEP, 0); }
		public TerminalNode INTEGER() { return getToken(MyGrammerParser.INTEGER, 0); }
		public TerminalNode DOTTED() { return getToken(MyGrammerParser.DOTTED, 0); }
		public Expr_chordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_chord; }
	}

	public final Expr_chordContext expr_chord() throws RecognitionException {
		Expr_chordContext _localctx = new Expr_chordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_chord);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(CHORD);
				setState(167);
				match(OPEN_PAR);
				setState(168);
				expr_note();
				setState(169);
				expr_add_note();
				setState(170);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(CHORD);
				setState(173);
				match(OPEN_PAR);
				setState(174);
				note_value();
				setState(175);
				match(OPEN_PAR);
				setState(176);
				match(FIXED_CHORD);
				setState(177);
				match(CLOSE_PAR);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOTTED) {
					{
					setState(178);
					match(DOTTED);
					}
				}

				setState(181);
				match(COMMA_SEP);
				setState(182);
				match(INTEGER);
				setState(183);
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
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(COMMA_SEP);
				setState(188);
				expr_note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(COMMA_SEP);
				setState(190);
				expr_note();
				setState(191);
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
			setState(195);
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
			setState(197);
			match(ACCIDENTAL_KEY);
			setState(198);
			match(OPEN_PAR);
			setState(199);
			expr_add_acc();
			setState(200);
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(ACCIDENTAL);
				setState(203);
				match(PITCH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(ACCIDENTAL);
				setState(205);
				match(PITCH);
				setState(206);
				match(COMMA_SEP);
				setState(207);
				expr_add_acc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(PITCH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(PITCH);
				setState(210);
				match(COMMA_SEP);
				setState(211);
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

	public static class Expr_restContext extends ParserRuleContext {
		public Note_valueContext note_value() {
			return getRuleContext(Note_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(MyGrammerParser.OPEN_PAR, 0); }
		public TerminalNode REST() { return getToken(MyGrammerParser.REST, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MyGrammerParser.CLOSE_PAR, 0); }
		public TerminalNode DOTTED() { return getToken(MyGrammerParser.DOTTED, 0); }
		public Expr_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_rest; }
	}

	public final Expr_restContext expr_rest() throws RecognitionException {
		Expr_restContext _localctx = new Expr_restContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_rest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			note_value();
			setState(215);
			match(OPEN_PAR);
			setState(216);
			match(REST);
			setState(217);
			match(CLOSE_PAR);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTTED) {
				{
				setState(218);
				match(DOTTED);
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

	public static class Declare_repeatContext extends ParserRuleContext {
		public TerminalNode REPSTART() { return getToken(MyGrammerParser.REPSTART, 0); }
		public Declare_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_repeat; }
	}

	public final Declare_repeatContext declare_repeat() throws RecognitionException {
		Declare_repeatContext _localctx = new Declare_repeatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declare_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		enterRule(_localctx, 44, RULE_declare_repeat_end);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(REPEND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(REPEND);
				setState(225);
				match(OPEN_PAR);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(226);
					match(INTEGER);
					}
				}

				setState(229);
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

	public static class Declare_endingContext extends ParserRuleContext {
		public TerminalNode ENDSTART() { return getToken(MyGrammerParser.ENDSTART, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MyGrammerParser.OPEN_PAR, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(MyGrammerParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(MyGrammerParser.INTEGER, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MyGrammerParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA_SEP() { return getTokens(MyGrammerParser.COMMA_SEP); }
		public TerminalNode COMMA_SEP(int i) {
			return getToken(MyGrammerParser.COMMA_SEP, i);
		}
		public Declare_endingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_ending; }
	}

	public final Declare_endingContext declare_ending() throws RecognitionException {
		Declare_endingContext _localctx = new Declare_endingContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declare_ending);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(ENDSTART);
			setState(233);
			match(OPEN_PAR);
			setState(234);
			match(INTEGER);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SEP) {
				{
				{
				setState(235);
				match(COMMA_SEP);
				setState(236);
				match(INTEGER);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
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

	public static class Declare_ending_endContext extends ParserRuleContext {
		public TerminalNode ENDEND() { return getToken(MyGrammerParser.ENDEND, 0); }
		public Declare_ending_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_ending_end; }
	}

	public final Declare_ending_endContext declare_ending_end() throws RecognitionException {
		Declare_ending_endContext _localctx = new Declare_ending_endContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declare_ending_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(ENDEND);
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
		enterRule(_localctx, 50, RULE_declare_staff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(STAFF);
			setState(247);
			match(OPEN_PAR);
			setState(248);
			match(INTEGER);
			setState(249);
			match(COMMA_SEP);
			setState(250);
			match(INTEGER);
			setState(251);
			match(CLOSE_PAR);
			setState(252);
			match(OPEN_BRACKET);
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				staff_block(0);
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEASURE) | (1L << MEASUREUP) | (1L << ACCIDENTAL_KEY))) != 0) );
			setState(258);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_staff_block, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(261);
				expr_acc();
				setState(262);
				staff_block(8);
				}
				break;
			case 2:
				{
				setState(264);
				declare_measures();
				setState(265);
				staff_block(6);
				}
				break;
			case 3:
				{
				setState(267);
				declare_measures();
				}
				break;
			case 4:
				{
				setState(268);
				declare_measures_up();
				setState(269);
				staff_block(3);
				}
				break;
			case 5:
				{
				setState(271);
				declare_measures_up();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(280);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(274);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(275);
						expr_acc();
						}
						break;
					case 2:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(276);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(277);
						declare_measures();
						}
						break;
					case 3:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(278);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(279);
						declare_measures_up();
						}
						break;
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		case 26:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0120\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6\3\6\6"+
		"\6S\n\6\r\6\16\6T\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\6\te\n\t\r\t\16\tf\3\t\3\t\3\n\3\n\3\n\6\nn\n\n\r\n\16\no\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\5\16\u0085\n\16\3\16\5\16\u0088\n\16\3\16\3\16\6\16\u008c\n\16\r"+
		"\16\16\16\u008d\3\16\5\16\u0091\n\16\3\16\5\16\u0094\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u009b\n\17\3\20\3\20\3\20\5\20\u00a0\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00a7\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00b6\n\21\3\21\3\21\3\21\3\21\5\21\u00bc"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c4\n\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00d7\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u00de\n\26\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\5\30\u00e6\n\30\3\30\5\30\u00e9\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u00f0\n\31\f\31\16\31\u00f3\13\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u0101\n\33\r\33\16\33\u0102\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u0113\n\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u011b\n\34\f\34\16\34"+
		"\u011e\13\34\3\34\2\3\66\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\66\2\4\3\2\20\26\3\2\33\'\2\u0129\28\3\2\2\2\4:\3\2\2"+
		"\2\6<\3\2\2\2\bA\3\2\2\2\nF\3\2\2\2\fX\3\2\2\2\16\\\3\2\2\2\20`\3\2\2"+
		"\2\22j\3\2\2\2\24s\3\2\2\2\26x\3\2\2\2\30~\3\2\2\2\32\u0084\3\2\2\2\34"+
		"\u009a\3\2\2\2\36\u009c\3\2\2\2 \u00bb\3\2\2\2\"\u00c3\3\2\2\2$\u00c5"+
		"\3\2\2\2&\u00c7\3\2\2\2(\u00d6\3\2\2\2*\u00d8\3\2\2\2,\u00df\3\2\2\2."+
		"\u00e8\3\2\2\2\60\u00ea\3\2\2\2\62\u00f6\3\2\2\2\64\u00f8\3\2\2\2\66\u0112"+
		"\3\2\2\289\t\2\2\29\3\3\2\2\2:;\t\3\2\2;\5\3\2\2\2<=\7\3\2\2=>\7\60\2"+
		"\2>?\7(\2\2?@\7\61\2\2@\7\3\2\2\2AB\7\27\2\2BC\7\60\2\2CD\5\4\3\2DE\7"+
		"\61\2\2E\t\3\2\2\2FG\5\6\4\2GM\5\b\5\2HL\5\f\7\2IL\5\16\b\2JL\5\20\t\2"+
		"KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NR\3\2\2\2"+
		"OM\3\2\2\2PS\5\64\33\2QS\5$\23\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2"+
		"\2TU\3\2\2\2UV\3\2\2\2VW\7\2\2\3W\13\3\2\2\2XY\7,\2\2YZ\7\62\2\2Z[\5\36"+
		"\20\2[\r\3\2\2\2\\]\7,\2\2]^\7\62\2\2^_\5 \21\2_\17\3\2\2\2`a\7\b\2\2"+
		"ab\7,\2\2bd\7-\2\2ce\5\64\33\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2"+
		"gh\3\2\2\2hi\7.\2\2i\21\3\2\2\2jk\7\17\2\2km\7-\2\2ln\5\36\20\2ml\3\2"+
		"\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7.\2\2r\23\3\2\2\2st\7"+
		"\5\2\2tu\7-\2\2uv\5\32\16\2vw\7.\2\2w\25\3\2\2\2xy\7\6\2\2yz\7-\2\2z{"+
		"\5\32\16\2{|\7.\2\2|}\5\30\r\2}\27\3\2\2\2~\177\7\7\2\2\177\u0080\7-\2"+
		"\2\u0080\u0081\5\32\16\2\u0081\u0082\7.\2\2\u0082\31\3\2\2\2\u0083\u0085"+
		"\5\60\31\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2"+
		"\u0086\u0088\5,\27\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u008c\5\34\17\2\u008a\u008c\5\22\n\2\u008b\u0089\3\2\2"+
		"\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0091\5.\30\2\u0090\u008f\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0094\5\62\32\2\u0093\u0092\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\33\3\2\2\2\u0095\u009b\5\36\20\2\u0096"+
		"\u009b\5 \21\2\u0097\u009b\5$\23\2\u0098\u009b\5&\24\2\u0099\u009b\5*"+
		"\26\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\35\3\2\2\2\u009c\u009d\5\2\2"+
		"\2\u009d\u009f\7\60\2\2\u009e\u00a0\7+\2\2\u009f\u009e\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7*\2\2\u00a2\u00a3\7/\2\2\u00a3"+
		"\u00a4\7(\2\2\u00a4\u00a6\7\61\2\2\u00a5\u00a7\7\30\2\2\u00a6\u00a5\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\37\3\2\2\2\u00a8\u00a9\7\16\2\2\u00a9"+
		"\u00aa\7\60\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac\5\"\22\2\u00ac\u00ad"+
		"\7\61\2\2\u00ad\u00bc\3\2\2\2\u00ae\u00af\7\16\2\2\u00af\u00b0\7\60\2"+
		"\2\u00b0\u00b1\5\2\2\2\u00b1\u00b2\7\60\2\2\u00b2\u00b3\7\32\2\2\u00b3"+
		"\u00b5\7\61\2\2\u00b4\u00b6\7\30\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\u00b9\7(\2\2\u00b9"+
		"\u00ba\7\61\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00a8\3\2\2\2\u00bb\u00ae\3"+
		"\2\2\2\u00bc!\3\2\2\2\u00bd\u00be\7/\2\2\u00be\u00c4\5\36\20\2\u00bf\u00c0"+
		"\7/\2\2\u00c0\u00c1\5\36\20\2\u00c1\u00c2\5\"\22\2\u00c2\u00c4\3\2\2\2"+
		"\u00c3\u00bd\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4#\3\2\2\2\u00c5\u00c6\7"+
		",\2\2\u00c6%\3\2\2\2\u00c7\u00c8\7\t\2\2\u00c8\u00c9\7\60\2\2\u00c9\u00ca"+
		"\5(\25\2\u00ca\u00cb\7\61\2\2\u00cb\'\3\2\2\2\u00cc\u00cd\7+\2\2\u00cd"+
		"\u00d7\7*\2\2\u00ce\u00cf\7+\2\2\u00cf\u00d0\7*\2\2\u00d0\u00d1\7/\2\2"+
		"\u00d1\u00d7\5(\25\2\u00d2\u00d7\7*\2\2\u00d3\u00d4\7*\2\2\u00d4\u00d5"+
		"\7/\2\2\u00d5\u00d7\5(\25\2\u00d6\u00cc\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6"+
		"\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7)\3\2\2\2\u00d8\u00d9\5\2\2\2"+
		"\u00d9\u00da\7\60\2\2\u00da\u00db\7\31\2\2\u00db\u00dd\7\61\2\2\u00dc"+
		"\u00de\7\30\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de+\3\2\2\2"+
		"\u00df\u00e0\7\n\2\2\u00e0-\3\2\2\2\u00e1\u00e9\7\13\2\2\u00e2\u00e3\7"+
		"\13\2\2\u00e3\u00e5\7\60\2\2\u00e4\u00e6\7(\2\2\u00e5\u00e4\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7\61\2\2\u00e8\u00e1\3"+
		"\2\2\2\u00e8\u00e2\3\2\2\2\u00e9/\3\2\2\2\u00ea\u00eb\7\f\2\2\u00eb\u00ec"+
		"\7\60\2\2\u00ec\u00f1\7(\2\2\u00ed\u00ee\7/\2\2\u00ee\u00f0\7(\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5"+
		"\61\3\2\2\2\u00f6\u00f7\7\r\2\2\u00f7\63\3\2\2\2\u00f8\u00f9\7\4\2\2\u00f9"+
		"\u00fa\7\60\2\2\u00fa\u00fb\7(\2\2\u00fb\u00fc\7/\2\2\u00fc\u00fd\7(\2"+
		"\2\u00fd\u00fe\7\61\2\2\u00fe\u0100\7-\2\2\u00ff\u0101\5\66\34\2\u0100"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7.\2\2\u0105\65\3\2\2\2\u0106\u0107"+
		"\b\34\1\2\u0107\u0108\5&\24\2\u0108\u0109\5\66\34\n\u0109\u0113\3\2\2"+
		"\2\u010a\u010b\5\24\13\2\u010b\u010c\5\66\34\b\u010c\u0113\3\2\2\2\u010d"+
		"\u0113\5\24\13\2\u010e\u010f\5\26\f\2\u010f\u0110\5\66\34\5\u0110\u0113"+
		"\3\2\2\2\u0111\u0113\5\26\f\2\u0112\u0106\3\2\2\2\u0112\u010a\3\2\2\2"+
		"\u0112\u010d\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u011c"+
		"\3\2\2\2\u0114\u0115\f\t\2\2\u0115\u011b\5&\24\2\u0116\u0117\f\7\2\2\u0117"+
		"\u011b\5\24\13\2\u0118\u0119\f\4\2\2\u0119\u011b\5\26\f\2\u011a\u0114"+
		"\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\67\3\2\2\2\u011e\u011c\3\2\2"+
		"\2\35KMRTfo\u0084\u0087\u008b\u008d\u0090\u0093\u009a\u009f\u00a6\u00b5"+
		"\u00bb\u00c3\u00d6\u00dd\u00e5\u00e8\u00f1\u0102\u0112\u011a\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}