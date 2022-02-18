// Generated from MyGrammer.g4 by ANTLR 4.9.3
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
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BPM=1, STAFF=2, MEASURE=3, MEASUREUP=4, MEASUREDOWN=5, MELODY=6, ACCIDENTAL_KEY=7, 
		REPSTART=8, REPEND=9, CHORD=10, CONTINUOUS=11, DOUBLE=12, FULL=13, HALF=14, 
		QUARTER=15, EIGHTH=16, SIXTEENTH=17, INSTRUMENT=18, DOTTED=19, REST=20, 
		CLARINET=21, FLUTE=22, ORGAN=23, PIANO=24, RECORDER=25, SAXOPHONE=26, 
		TRUMPET=27, GUITAR=28, ACOUSTICGUITAR=29, ELECTRICGUITAR=30, UKULELE=31, 
		VIOLIN=32, XYLOPHONE=33, INTEGER=34, FRACTION=35, PITCH=36, ACCIDENTAL=37, 
		IDENTIFIER=38, OPEN_BRACKET=39, CLOSE_BRACKET=40, COMMA_SEP=41, OPEN_PAR=42, 
		CLOSE_PAR=43, EQUAL_OPER=44, WS=45;
	public static final int
		RULE_note_value = 0, RULE_instruments = 1, RULE_bpm = 2, RULE_instrument = 3, 
		RULE_prog = 4, RULE_declare_note = 5, RULE_declare_chord = 6, RULE_declare_melody = 7, 
		RULE_declare_continuous = 8, RULE_declare_measures = 9, RULE_declare_measures_up = 10, 
		RULE_declare_measures_down = 11, RULE_measure_block = 12, RULE_expr = 13, 
		RULE_expr_note = 14, RULE_expr_chord = 15, RULE_expr_add_note = 16, RULE_expr_var = 17, 
		RULE_expr_acc = 18, RULE_expr_add_acc = 19, RULE_expr_rest = 20, RULE_declare_repeat = 21, 
		RULE_declare_repeat_end = 22, RULE_declare_staff = 23, RULE_staff_block = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"note_value", "instruments", "bpm", "instrument", "prog", "declare_note", 
			"declare_chord", "declare_melody", "declare_continuous", "declare_measures", 
			"declare_measures_up", "declare_measures_down", "measure_block", "expr", 
			"expr_note", "expr_chord", "expr_add_note", "expr_var", "expr_acc", "expr_add_acc", 
			"expr_rest", "declare_repeat", "declare_repeat_end", "declare_staff", 
			"staff_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'*'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BPM", "STAFF", "MEASURE", "MEASUREUP", "MEASUREDOWN", "MELODY", 
			"ACCIDENTAL_KEY", "REPSTART", "REPEND", "CHORD", "CONTINUOUS", "DOUBLE", 
			"FULL", "HALF", "QUARTER", "EIGHTH", "SIXTEENTH", "INSTRUMENT", "DOTTED", 
			"REST", "CLARINET", "FLUTE", "ORGAN", "PIANO", "RECORDER", "SAXOPHONE", 
			"TRUMPET", "GUITAR", "ACOUSTICGUITAR", "ELECTRICGUITAR", "UKULELE", "VIOLIN", 
			"XYLOPHONE", "INTEGER", "FRACTION", "PITCH", "ACCIDENTAL", "IDENTIFIER", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "COMMA_SEP", "OPEN_PAR", "CLOSE_PAR", 
			"EQUAL_OPER", "WS"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterNote_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitNote_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitNote_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Note_valueContext note_value() throws RecognitionException {
		Note_valueContext _localctx = new Note_valueContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_note_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterInstruments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitInstruments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitInstruments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrumentsContext instruments() throws RecognitionException {
		InstrumentsContext _localctx = new InstrumentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterBpm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitBpm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitBpm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BpmContext bpm() throws RecognitionException {
		BpmContext _localctx = new BpmContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bpm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(BPM);
			setState(55);
			match(OPEN_PAR);
			setState(56);
			match(INTEGER);
			setState(57);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterInstrument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitInstrument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitInstrument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrumentContext instrument() throws RecognitionException {
		InstrumentContext _localctx = new InstrumentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(INSTRUMENT);
			setState(60);
			match(OPEN_PAR);
			setState(61);
			instruments();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			bpm();
			setState(65);
			instrument();
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(66);
						declare_note();
						}
						break;
					case 2:
						{
						setState(67);
						declare_chord();
						}
						break;
					case 3:
						{
						setState(68);
						declare_melody();
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(76);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAFF:
					{
					setState(74);
					declare_staff();
					}
					break;
				case IDENTIFIER:
					{
					setState(75);
					expr_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAFF || _la==IDENTIFIER );
			setState(80);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterDeclare_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitDeclare_note(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitDeclare_note(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_noteContext declare_note() throws RecognitionException {
		Declare_noteContext _localctx = new Declare_noteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declare_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IDENTIFIER);
			setState(83);
			match(EQUAL_OPER);
			setState(84);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterDeclare_chord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitDeclare_chord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitDeclare_chord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_chordContext declare_chord() throws RecognitionException {
		Declare_chordContext _localctx = new Declare_chordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declare_chord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(IDENTIFIER);
			setState(87);
			match(EQUAL_OPER);
			setState(88);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterDeclare_melody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitDeclare_melody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitDeclare_melody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_melodyContext declare_melody() throws RecognitionException {
		Declare_melodyContext _localctx = new Declare_melodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declare_melody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(MELODY);
			setState(91);
			match(IDENTIFIER);
			setState(92);
			match(OPEN_BRACKET);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				declare_staff();
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAFF );
			setState(98);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterDeclare_continuous(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitDeclare_continuous(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitDeclare_continuous(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_continuousContext declare_continuous() throws RecognitionException {
		Declare_continuousContext _localctx = new Declare_continuousContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declare_continuous);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(CONTINUOUS);
			setState(101);
			match(OPEN_BRACKET);
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				expr();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL_KEY) | (1L << CHORD) | (1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH) | (1L << IDENTIFIER))) != 0) );
			setState(107);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterDeclare_measures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitDeclare_measures(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitDeclare_measures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_measuresContext declare_measures() throws RecognitionException {
		Declare_measuresContext _localctx = new Declare_measuresContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declare_measures);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(MEASURE);
			setState(110);
			match(OPEN_BRACKET);
			setState(111);
			measure_block();
			setState(112);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterDeclare_measures_up(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitDeclare_measures_up(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitDeclare_measures_up(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_measures_upContext declare_measures_up() throws RecognitionException {
		Declare_measures_upContext _localctx = new Declare_measures_upContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declare_measures_up);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(MEASUREUP);
			setState(115);
			match(OPEN_BRACKET);
			setState(116);
			measure_block();
			setState(117);
			match(CLOSE_BRACKET);
			setState(118);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterDeclare_measures_down(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitDeclare_measures_down(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitDeclare_measures_down(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_measures_downContext declare_measures_down() throws RecognitionException {
		Declare_measures_downContext _localctx = new Declare_measures_downContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declare_measures_down);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(MEASUREDOWN);
			setState(121);
			match(OPEN_BRACKET);
			setState(122);
			measure_block();
			setState(123);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterMeasure_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitMeasure_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitMeasure_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Measure_blockContext measure_block() throws RecognitionException {
		Measure_blockContext _localctx = new Measure_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_measure_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPSTART) {
				{
				setState(125);
				declare_repeat();
				}
			}

			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(130);
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
					setState(128);
					expr();
					}
					break;
				case CONTINUOUS:
					{
					setState(129);
					declare_continuous();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL_KEY) | (1L << CHORD) | (1L << CONTINUOUS) | (1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH) | (1L << IDENTIFIER))) != 0) );
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPEND) {
				{
				setState(134);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterNoteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitNoteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitNoteExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChordExpressionContext extends ExprContext {
		public Expr_chordContext expr_chord() {
			return getRuleContext(Expr_chordContext.class,0);
		}
		public ChordExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterChordExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitChordExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitChordExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AccidentalExpressionContext extends ExprContext {
		public Expr_accContext expr_acc() {
			return getRuleContext(Expr_accContext.class,0);
		}
		public AccidentalExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterAccidentalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitAccidentalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitAccidentalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExpressionContext extends ExprContext {
		public Expr_varContext expr_var() {
			return getRuleContext(Expr_varContext.class,0);
		}
		public VariableExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RestExpressionContext extends ExprContext {
		public Expr_restContext expr_rest() {
			return getRuleContext(Expr_restContext.class,0);
		}
		public RestExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterRestExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitRestExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitRestExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new NoteExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				expr_note();
				}
				break;
			case 2:
				_localctx = new ChordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				expr_chord();
				}
				break;
			case 3:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				expr_var();
				}
				break;
			case 4:
				_localctx = new AccidentalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				expr_acc();
				}
				break;
			case 5:
				_localctx = new RestExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterExpr_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitExpr_note(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitExpr_note(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_noteContext expr_note() throws RecognitionException {
		Expr_noteContext _localctx = new Expr_noteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_note);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				note_value();
				setState(145);
				match(OPEN_PAR);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACCIDENTAL) {
					{
					setState(146);
					match(ACCIDENTAL);
					}
				}

				setState(149);
				match(PITCH);
				setState(150);
				match(COMMA_SEP);
				setState(151);
				match(INTEGER);
				setState(152);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				setState(163);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterExpr_chord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitExpr_chord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitExpr_chord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_chordContext expr_chord() throws RecognitionException {
		Expr_chordContext _localctx = new Expr_chordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_chord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(CHORD);
			setState(168);
			match(OPEN_PAR);
			setState(169);
			expr_note();
			setState(170);
			expr_add_note();
			setState(171);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterExpr_add_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitExpr_add_note(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitExpr_add_note(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_add_noteContext expr_add_note() throws RecognitionException {
		Expr_add_noteContext _localctx = new Expr_add_noteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_add_note);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(COMMA_SEP);
				setState(174);
				expr_note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(COMMA_SEP);
				setState(176);
				expr_note();
				setState(177);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterExpr_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitExpr_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitExpr_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_varContext expr_var() throws RecognitionException {
		Expr_varContext _localctx = new Expr_varContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterExpr_acc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitExpr_acc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitExpr_acc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_accContext expr_acc() throws RecognitionException {
		Expr_accContext _localctx = new Expr_accContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_acc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ACCIDENTAL_KEY);
			setState(184);
			match(OPEN_PAR);
			setState(185);
			expr_add_acc();
			setState(186);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterExpr_add_acc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitExpr_add_acc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitExpr_add_acc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_add_accContext expr_add_acc() throws RecognitionException {
		Expr_add_accContext _localctx = new Expr_add_accContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_add_acc);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(ACCIDENTAL);
				setState(189);
				match(PITCH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(ACCIDENTAL);
				setState(191);
				match(PITCH);
				setState(192);
				match(COMMA_SEP);
				setState(193);
				expr_add_acc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(PITCH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(PITCH);
				setState(196);
				match(COMMA_SEP);
				setState(197);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterExpr_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitExpr_rest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitExpr_rest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_restContext expr_rest() throws RecognitionException {
		Expr_restContext _localctx = new Expr_restContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_rest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			note_value();
			setState(201);
			match(OPEN_PAR);
			setState(202);
			match(REST);
			setState(203);
			match(CLOSE_PAR);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTTED) {
				{
				setState(204);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterDeclare_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitDeclare_repeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitDeclare_repeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_repeatContext declare_repeat() throws RecognitionException {
		Declare_repeatContext _localctx = new Declare_repeatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declare_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterDeclare_repeat_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitDeclare_repeat_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitDeclare_repeat_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_repeat_endContext declare_repeat_end() throws RecognitionException {
		Declare_repeat_endContext _localctx = new Declare_repeat_endContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declare_repeat_end);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(REPEND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(REPEND);
				setState(211);
				match(OPEN_PAR);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(212);
					match(INTEGER);
					}
				}

				setState(215);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterDeclare_staff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitDeclare_staff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitDeclare_staff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_staffContext declare_staff() throws RecognitionException {
		Declare_staffContext _localctx = new Declare_staffContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declare_staff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(STAFF);
			setState(219);
			match(OPEN_PAR);
			setState(220);
			match(INTEGER);
			setState(221);
			match(COMMA_SEP);
			setState(222);
			match(INTEGER);
			setState(223);
			match(CLOSE_PAR);
			setState(224);
			match(OPEN_BRACKET);
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				staff_block(0);
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEASURE) | (1L << MEASUREUP) | (1L << ACCIDENTAL_KEY))) != 0) );
			setState(230);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterStaff_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitStaff_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitStaff_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Staff_blockContext staff_block() throws RecognitionException {
		return staff_block(0);
	}

	private Staff_blockContext staff_block(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Staff_blockContext _localctx = new Staff_blockContext(_ctx, _parentState);
		Staff_blockContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_staff_block, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(233);
				expr_acc();
				setState(234);
				staff_block(8);
				}
				break;
			case 2:
				{
				setState(236);
				declare_measures();
				setState(237);
				staff_block(6);
				}
				break;
			case 3:
				{
				setState(239);
				declare_measures();
				}
				break;
			case 4:
				{
				setState(240);
				declare_measures_up();
				setState(241);
				staff_block(3);
				}
				break;
			case 5:
				{
				setState(243);
				declare_measures_up();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(246);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(247);
						expr_acc();
						}
						break;
					case 2:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(248);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(249);
						declare_measures();
						}
						break;
					case 3:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(250);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(251);
						declare_measures_up();
						}
						break;
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		case 24:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0104\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\6\6O\n\6\r\6\16\6P\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\6\ta\n\t\r\t\16"+
		"\tb\3\t\3\t\3\n\3\n\3\n\6\nj\n\n\r\n\16\nk\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\5\16\u0081\n\16"+
		"\3\16\3\16\6\16\u0085\n\16\r\16\16\16\u0086\3\16\5\16\u008a\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0091\n\17\3\20\3\20\3\20\5\20\u0096\n\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a0\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00a8\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00b6\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c9\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00d0\n\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30"+
		"\u00d8\n\30\3\30\5\30\u00db\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\6\31\u00e5\n\31\r\31\16\31\u00e6\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f7\n\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u00ff\n\32\f\32\16\32\u0102\13\32\3\32\2\3\62\33\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\4\3\2\16\23\3\2\27"+
		"#\2\u010b\2\64\3\2\2\2\4\66\3\2\2\2\68\3\2\2\2\b=\3\2\2\2\nB\3\2\2\2\f"+
		"T\3\2\2\2\16X\3\2\2\2\20\\\3\2\2\2\22f\3\2\2\2\24o\3\2\2\2\26t\3\2\2\2"+
		"\30z\3\2\2\2\32\u0080\3\2\2\2\34\u0090\3\2\2\2\36\u00a7\3\2\2\2 \u00a9"+
		"\3\2\2\2\"\u00b5\3\2\2\2$\u00b7\3\2\2\2&\u00b9\3\2\2\2(\u00c8\3\2\2\2"+
		"*\u00ca\3\2\2\2,\u00d1\3\2\2\2.\u00da\3\2\2\2\60\u00dc\3\2\2\2\62\u00f6"+
		"\3\2\2\2\64\65\t\2\2\2\65\3\3\2\2\2\66\67\t\3\2\2\67\5\3\2\2\289\7\3\2"+
		"\29:\7,\2\2:;\7$\2\2;<\7-\2\2<\7\3\2\2\2=>\7\24\2\2>?\7,\2\2?@\5\4\3\2"+
		"@A\7-\2\2A\t\3\2\2\2BC\5\6\4\2CI\5\b\5\2DH\5\f\7\2EH\5\16\b\2FH\5\20\t"+
		"\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JN\3\2\2"+
		"\2KI\3\2\2\2LO\5\60\31\2MO\5$\23\2NL\3\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2"+
		"\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\2\2\3S\13\3\2\2\2TU\7(\2\2UV\7.\2\2VW\5\36"+
		"\20\2W\r\3\2\2\2XY\7(\2\2YZ\7.\2\2Z[\5 \21\2[\17\3\2\2\2\\]\7\b\2\2]^"+
		"\7(\2\2^`\7)\2\2_a\5\60\31\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c"+
		"d\3\2\2\2de\7*\2\2e\21\3\2\2\2fg\7\r\2\2gi\7)\2\2hj\5\34\17\2ih\3\2\2"+
		"\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7*\2\2n\23\3\2\2\2op\7\5"+
		"\2\2pq\7)\2\2qr\5\32\16\2rs\7*\2\2s\25\3\2\2\2tu\7\6\2\2uv\7)\2\2vw\5"+
		"\32\16\2wx\7*\2\2xy\5\30\r\2y\27\3\2\2\2z{\7\7\2\2{|\7)\2\2|}\5\32\16"+
		"\2}~\7*\2\2~\31\3\2\2\2\177\u0081\5,\27\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0085\5\34\17\2\u0083\u0085\5\22\n"+
		"\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u008a\5.\30\2\u0089"+
		"\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\33\3\2\2\2\u008b\u0091\5\36\20"+
		"\2\u008c\u0091\5 \21\2\u008d\u0091\5$\23\2\u008e\u0091\5&\24\2\u008f\u0091"+
		"\5*\26\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\35\3\2\2\2\u0092\u0093\5\2\2"+
		"\2\u0093\u0095\7,\2\2\u0094\u0096\7\'\2\2\u0095\u0094\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7&\2\2\u0098\u0099\7+\2\2\u0099"+
		"\u009a\7$\2\2\u009a\u009b\7-\2\2\u009b\u00a8\3\2\2\2\u009c\u009d\5\2\2"+
		"\2\u009d\u009f\7,\2\2\u009e\u00a0\7\'\2\2\u009f\u009e\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7&\2\2\u00a2\u00a3\7+\2\2\u00a3"+
		"\u00a4\7$\2\2\u00a4\u00a5\7-\2\2\u00a5\u00a6\7\25\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u0092\3\2\2\2\u00a7\u009c\3\2\2\2\u00a8\37\3\2\2\2\u00a9\u00aa"+
		"\7\f\2\2\u00aa\u00ab\7,\2\2\u00ab\u00ac\5\36\20\2\u00ac\u00ad\5\"\22\2"+
		"\u00ad\u00ae\7-\2\2\u00ae!\3\2\2\2\u00af\u00b0\7+\2\2\u00b0\u00b6\5\36"+
		"\20\2\u00b1\u00b2\7+\2\2\u00b2\u00b3\5\36\20\2\u00b3\u00b4\5\"\22\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6#\3\2\2\2"+
		"\u00b7\u00b8\7(\2\2\u00b8%\3\2\2\2\u00b9\u00ba\7\t\2\2\u00ba\u00bb\7,"+
		"\2\2\u00bb\u00bc\5(\25\2\u00bc\u00bd\7-\2\2\u00bd\'\3\2\2\2\u00be\u00bf"+
		"\7\'\2\2\u00bf\u00c9\7&\2\2\u00c0\u00c1\7\'\2\2\u00c1\u00c2\7&\2\2\u00c2"+
		"\u00c3\7+\2\2\u00c3\u00c9\5(\25\2\u00c4\u00c9\7&\2\2\u00c5\u00c6\7&\2"+
		"\2\u00c6\u00c7\7+\2\2\u00c7\u00c9\5(\25\2\u00c8\u00be\3\2\2\2\u00c8\u00c0"+
		"\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9)\3\2\2\2\u00ca"+
		"\u00cb\5\2\2\2\u00cb\u00cc\7,\2\2\u00cc\u00cd\7\26\2\2\u00cd\u00cf\7-"+
		"\2\2\u00ce\u00d0\7\25\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"+\3\2\2\2\u00d1\u00d2\7\n\2\2\u00d2-\3\2\2\2\u00d3\u00db\7\13\2\2\u00d4"+
		"\u00d5\7\13\2\2\u00d5\u00d7\7,\2\2\u00d6\u00d8\7$\2\2\u00d7\u00d6\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\7-\2\2\u00da"+
		"\u00d3\3\2\2\2\u00da\u00d4\3\2\2\2\u00db/\3\2\2\2\u00dc\u00dd\7\4\2\2"+
		"\u00dd\u00de\7,\2\2\u00de\u00df\7$\2\2\u00df\u00e0\7+\2\2\u00e0\u00e1"+
		"\7$\2\2\u00e1\u00e2\7-\2\2\u00e2\u00e4\7)\2\2\u00e3\u00e5\5\62\32\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9\61\3\2\2\2\u00ea\u00eb"+
		"\b\32\1\2\u00eb\u00ec\5&\24\2\u00ec\u00ed\5\62\32\n\u00ed\u00f7\3\2\2"+
		"\2\u00ee\u00ef\5\24\13\2\u00ef\u00f0\5\62\32\b\u00f0\u00f7\3\2\2\2\u00f1"+
		"\u00f7\5\24\13\2\u00f2\u00f3\5\26\f\2\u00f3\u00f4\5\62\32\5\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f7\5\26\f\2\u00f6\u00ea\3\2\2\2\u00f6\u00ee\3\2\2\2"+
		"\u00f6\u00f1\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u0100"+
		"\3\2\2\2\u00f8\u00f9\f\t\2\2\u00f9\u00ff\5&\24\2\u00fa\u00fb\f\7\2\2\u00fb"+
		"\u00ff\5\24\13\2\u00fc\u00fd\f\4\2\2\u00fd\u00ff\5\26\f\2\u00fe\u00f8"+
		"\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\63\3\2\2\2\u0102\u0100\3\2\2"+
		"\2\31GINPbk\u0080\u0084\u0086\u0089\u0090\u0095\u009f\u00a7\u00b5\u00c8"+
		"\u00cf\u00d7\u00da\u00e6\u00f6\u00fe\u0100";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}