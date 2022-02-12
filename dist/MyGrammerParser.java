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
		BPM=1, STAFF=2, MEASURE=3, MELODY=4, ACCIDENTAL_KEY=5, REPSTART=6, REPEND=7, 
		CHORD=8, CONTINUOUS=9, DOUBLE=10, FULL=11, HALF=12, QUARTER=13, EIGHTH=14, 
		SIXTEENTH=15, INSTRUMENT=16, DOTTED=17, CLARINET=18, FLUTE=19, ORGAN=20, 
		PIANO=21, RECORDER=22, SAXOPHONE=23, TRUMPET=24, GUITAR=25, ACOUSTICGUITAR=26, 
		ELECTRICGUITAR=27, UKULELE=28, VIOLIN=29, XYLOPHONE=30, INTEGER=31, FRACTION=32, 
		PITCH=33, ACCIDENTAL=34, IDENTIFIER=35, OPEN_BRACKET=36, CLOSE_BRACKET=37, 
		COMMA_SEP=38, OPEN_PAR=39, CLOSE_PAR=40, EQUAL_OPER=41, WS=42;
	public static final int
		RULE_note_value = 0, RULE_instruments = 1, RULE_bpm = 2, RULE_instrument = 3, 
		RULE_prog = 4, RULE_declare_note = 5, RULE_declare_chord = 6, RULE_declare_melody = 7, 
		RULE_declare_continuous = 8, RULE_declare_measures = 9, RULE_repeat_measure_block = 10, 
		RULE_measure_block = 11, RULE_expr = 12, RULE_expr_note = 13, RULE_expr_chord = 14, 
		RULE_expr_add_note = 15, RULE_expr_var = 16, RULE_expr_acc = 17, RULE_expr_add_acc = 18, 
		RULE_declare_repeat = 19, RULE_declare_repeat_end = 20, RULE_declare_staff = 21, 
		RULE_staff_block = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"note_value", "instruments", "bpm", "instrument", "prog", "declare_note", 
			"declare_chord", "declare_melody", "declare_continuous", "declare_measures", 
			"repeat_measure_block", "measure_block", "expr", "expr_note", "expr_chord", 
			"expr_add_note", "expr_var", "expr_acc", "expr_add_acc", "declare_repeat", 
			"declare_repeat_end", "declare_staff", "staff_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'*'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BPM", "STAFF", "MEASURE", "MELODY", "ACCIDENTAL_KEY", "REPSTART", 
			"REPEND", "CHORD", "CONTINUOUS", "DOUBLE", "FULL", "HALF", "QUARTER", 
			"EIGHTH", "SIXTEENTH", "INSTRUMENT", "DOTTED", "CLARINET", "FLUTE", "ORGAN", 
			"PIANO", "RECORDER", "SAXOPHONE", "TRUMPET", "GUITAR", "ACOUSTICGUITAR", 
			"ELECTRICGUITAR", "UKULELE", "VIOLIN", "XYLOPHONE", "INTEGER", "FRACTION", 
			"PITCH", "ACCIDENTAL", "IDENTIFIER", "OPEN_BRACKET", "CLOSE_BRACKET", 
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
			setState(48);
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
			setState(50);
			match(BPM);
			setState(51);
			match(OPEN_PAR);
			setState(52);
			match(INTEGER);
			setState(53);
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
			setState(55);
			match(INSTRUMENT);
			setState(56);
			match(OPEN_PAR);
			setState(57);
			instruments();
			setState(58);
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
			setState(60);
			bpm();
			setState(61);
			instrument();
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(62);
						declare_note();
						}
						break;
					case 2:
						{
						setState(63);
						declare_chord();
						}
						break;
					case 3:
						{
						setState(64);
						declare_melody();
						}
						break;
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAFF:
					{
					setState(70);
					declare_staff();
					}
					break;
				case IDENTIFIER:
					{
					setState(71);
					expr_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAFF || _la==IDENTIFIER );
			setState(76);
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
			setState(78);
			match(IDENTIFIER);
			setState(79);
			match(EQUAL_OPER);
			setState(80);
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
			setState(82);
			match(IDENTIFIER);
			setState(83);
			match(EQUAL_OPER);
			setState(84);
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
			setState(86);
			match(MELODY);
			setState(87);
			match(IDENTIFIER);
			setState(88);
			match(OPEN_BRACKET);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				declare_staff();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAFF );
			setState(94);
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
			setState(96);
			match(CONTINUOUS);
			setState(97);
			match(OPEN_BRACKET);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				expr();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL_KEY) | (1L << CHORD) | (1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH) | (1L << IDENTIFIER))) != 0) );
			setState(103);
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
		public Repeat_measure_blockContext repeat_measure_block() {
			return getRuleContext(Repeat_measure_blockContext.class,0);
		}
		public Measure_blockContext measure_block() {
			return getRuleContext(Measure_blockContext.class,0);
		}
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
			setState(105);
			match(MEASURE);
			setState(106);
			match(OPEN_BRACKET);
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPSTART:
				{
				setState(107);
				repeat_measure_block();
				}
				break;
			case ACCIDENTAL_KEY:
			case CHORD:
			case CONTINUOUS:
			case DOUBLE:
			case FULL:
			case HALF:
			case QUARTER:
			case EIGHTH:
			case SIXTEENTH:
			case IDENTIFIER:
				{
				setState(108);
				measure_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class Repeat_measure_blockContext extends ParserRuleContext {
		public Declare_repeatContext declare_repeat() {
			return getRuleContext(Declare_repeatContext.class,0);
		}
		public Measure_blockContext measure_block() {
			return getRuleContext(Measure_blockContext.class,0);
		}
		public Declare_repeat_endContext declare_repeat_end() {
			return getRuleContext(Declare_repeat_endContext.class,0);
		}
		public Repeat_measure_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_measure_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).enterRepeat_measure_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammerListener ) ((MyGrammerListener)listener).exitRepeat_measure_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammerVisitor ) return ((MyGrammerVisitor<? extends T>)visitor).visitRepeat_measure_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_measure_blockContext repeat_measure_block() throws RecognitionException {
		Repeat_measure_blockContext _localctx = new Repeat_measure_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repeat_measure_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			declare_repeat();
			setState(114);
			measure_block();
			setState(115);
			declare_repeat_end();
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
		enterRule(_localctx, 22, RULE_measure_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(119);
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
					setState(117);
					expr();
					}
					break;
				case CONTINUOUS:
					{
					setState(118);
					declare_continuous();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL_KEY) | (1L << CHORD) | (1L << CONTINUOUS) | (1L << DOUBLE) | (1L << FULL) | (1L << HALF) | (1L << QUARTER) | (1L << EIGHTH) | (1L << SIXTEENTH) | (1L << IDENTIFIER))) != 0) );
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

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			setState(127);
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
				setState(123);
				expr_note();
				}
				break;
			case CHORD:
				_localctx = new ChordExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				expr_chord();
				}
				break;
			case IDENTIFIER:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				expr_var();
				}
				break;
			case ACCIDENTAL_KEY:
				_localctx = new AccidentalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
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
		enterRule(_localctx, 26, RULE_expr_note);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				note_value();
				setState(130);
				match(OPEN_PAR);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACCIDENTAL) {
					{
					setState(131);
					match(ACCIDENTAL);
					}
				}

				setState(134);
				match(PITCH);
				setState(135);
				match(COMMA_SEP);
				setState(136);
				match(INTEGER);
				setState(137);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				note_value();
				setState(140);
				match(OPEN_PAR);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACCIDENTAL) {
					{
					setState(141);
					match(ACCIDENTAL);
					}
				}

				setState(144);
				match(PITCH);
				setState(145);
				match(COMMA_SEP);
				setState(146);
				match(INTEGER);
				setState(147);
				match(CLOSE_PAR);
				setState(148);
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
		enterRule(_localctx, 28, RULE_expr_chord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(CHORD);
			setState(153);
			match(OPEN_PAR);
			setState(154);
			expr_note();
			setState(155);
			expr_add_note();
			setState(156);
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
		enterRule(_localctx, 30, RULE_expr_add_note);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(COMMA_SEP);
				setState(159);
				expr_note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(COMMA_SEP);
				setState(161);
				expr_note();
				setState(162);
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
		enterRule(_localctx, 32, RULE_expr_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
		enterRule(_localctx, 34, RULE_expr_acc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ACCIDENTAL_KEY);
			setState(169);
			match(OPEN_PAR);
			setState(170);
			expr_add_acc();
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
		enterRule(_localctx, 36, RULE_expr_add_acc);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(ACCIDENTAL);
				setState(174);
				match(PITCH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(ACCIDENTAL);
				setState(176);
				match(PITCH);
				setState(177);
				match(COMMA_SEP);
				setState(178);
				expr_add_acc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(PITCH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(PITCH);
				setState(181);
				match(COMMA_SEP);
				setState(182);
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
		enterRule(_localctx, 38, RULE_declare_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		enterRule(_localctx, 40, RULE_declare_repeat_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(REPEND);
			setState(188);
			match(OPEN_PAR);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(189);
				match(INTEGER);
				}
			}

			setState(192);
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
		enterRule(_localctx, 42, RULE_declare_staff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(STAFF);
			setState(195);
			match(OPEN_PAR);
			setState(196);
			match(INTEGER);
			setState(197);
			match(COMMA_SEP);
			setState(198);
			match(INTEGER);
			setState(199);
			match(CLOSE_PAR);
			setState(200);
			match(OPEN_BRACKET);
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				staff_block(0);
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MEASURE || _la==ACCIDENTAL_KEY );
			setState(206);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_staff_block, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(209);
				expr_acc();
				setState(210);
				staff_block(5);
				}
				break;
			case 2:
				{
				setState(212);
				declare_measures();
				setState(213);
				staff_block(3);
				}
				break;
			case 3:
				{
				setState(215);
				declare_measures();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(218);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(219);
						expr_acc();
						}
						break;
					case 2:
						{
						_localctx = new Staff_blockContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_staff_block);
						setState(220);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(221);
						declare_measures();
						}
						break;
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		case 22:
			return staff_block_sempred((Staff_blockContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean staff_block_sempred(Staff_blockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6"+
		"D\n\6\f\6\16\6G\13\6\3\6\3\6\6\6K\n\6\r\6\16\6L\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\6\t]\n\t\r\t\16\t^\3\t\3\t\3\n\3\n"+
		"\3\n\6\nf\n\n\r\n\16\ng\3\n\3\n\3\13\3\13\3\13\3\13\5\13p\n\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\6\rz\n\r\r\r\16\r{\3\16\3\16\3\16\3\16\5\16"+
		"\u0082\n\16\3\17\3\17\3\17\5\17\u0087\n\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0091\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0099"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00a7\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00ba\n\24\3\25\3\25\3\26\3\26\3\26\5\26"+
		"\u00c1\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u00cd"+
		"\n\27\r\27\16\27\u00ce\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u00db\n\30\3\30\3\30\3\30\3\30\7\30\u00e1\n\30\f\30\16\30\u00e4"+
		"\13\30\3\30\2\3.\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2"+
		"\4\3\2\f\21\3\2\24 \2\u00e8\2\60\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2\2\b9"+
		"\3\2\2\2\n>\3\2\2\2\fP\3\2\2\2\16T\3\2\2\2\20X\3\2\2\2\22b\3\2\2\2\24"+
		"k\3\2\2\2\26s\3\2\2\2\30y\3\2\2\2\32\u0081\3\2\2\2\34\u0098\3\2\2\2\36"+
		"\u009a\3\2\2\2 \u00a6\3\2\2\2\"\u00a8\3\2\2\2$\u00aa\3\2\2\2&\u00b9\3"+
		"\2\2\2(\u00bb\3\2\2\2*\u00bd\3\2\2\2,\u00c4\3\2\2\2.\u00da\3\2\2\2\60"+
		"\61\t\2\2\2\61\3\3\2\2\2\62\63\t\3\2\2\63\5\3\2\2\2\64\65\7\3\2\2\65\66"+
		"\7)\2\2\66\67\7!\2\2\678\7*\2\28\7\3\2\2\29:\7\22\2\2:;\7)\2\2;<\5\4\3"+
		"\2<=\7*\2\2=\t\3\2\2\2>?\5\6\4\2?E\5\b\5\2@D\5\f\7\2AD\5\16\b\2BD\5\20"+
		"\t\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FJ\3\2"+
		"\2\2GE\3\2\2\2HK\5,\27\2IK\5\"\22\2JH\3\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3"+
		"\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\2\2\3O\13\3\2\2\2PQ\7%\2\2QR\7+\2\2RS\5"+
		"\34\17\2S\r\3\2\2\2TU\7%\2\2UV\7+\2\2VW\5\36\20\2W\17\3\2\2\2XY\7\6\2"+
		"\2YZ\7%\2\2Z\\\7&\2\2[]\5,\27\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2"+
		"\2\2_`\3\2\2\2`a\7\'\2\2a\21\3\2\2\2bc\7\13\2\2ce\7&\2\2df\5\32\16\2e"+
		"d\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\'\2\2j\23\3\2\2"+
		"\2kl\7\5\2\2lo\7&\2\2mp\5\26\f\2np\5\30\r\2om\3\2\2\2on\3\2\2\2pq\3\2"+
		"\2\2qr\7\'\2\2r\25\3\2\2\2st\5(\25\2tu\5\30\r\2uv\5*\26\2v\27\3\2\2\2"+
		"wz\5\32\16\2xz\5\22\n\2yw\3\2\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2"+
		"\2\2|\31\3\2\2\2}\u0082\5\34\17\2~\u0082\5\36\20\2\177\u0082\5\"\22\2"+
		"\u0080\u0082\5$\23\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\33\3\2\2\2\u0083\u0084\5\2\2\2\u0084\u0086\7)\2\2"+
		"\u0085\u0087\7$\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\7#\2\2\u0089\u008a\7(\2\2\u008a\u008b\7!\2\2\u008b"+
		"\u008c\7*\2\2\u008c\u0099\3\2\2\2\u008d\u008e\5\2\2\2\u008e\u0090\7)\2"+
		"\2\u008f\u0091\7$\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\7#\2\2\u0093\u0094\7(\2\2\u0094\u0095\7!\2\2\u0095"+
		"\u0096\7*\2\2\u0096\u0097\7\23\2\2\u0097\u0099\3\2\2\2\u0098\u0083\3\2"+
		"\2\2\u0098\u008d\3\2\2\2\u0099\35\3\2\2\2\u009a\u009b\7\n\2\2\u009b\u009c"+
		"\7)\2\2\u009c\u009d\5\34\17\2\u009d\u009e\5 \21\2\u009e\u009f\7*\2\2\u009f"+
		"\37\3\2\2\2\u00a0\u00a1\7(\2\2\u00a1\u00a7\5\34\17\2\u00a2\u00a3\7(\2"+
		"\2\u00a3\u00a4\5\34\17\2\u00a4\u00a5\5 \21\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a0\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7!\3\2\2\2\u00a8\u00a9\7%\2\2\u00a9"+
		"#\3\2\2\2\u00aa\u00ab\7\7\2\2\u00ab\u00ac\7)\2\2\u00ac\u00ad\5&\24\2\u00ad"+
		"\u00ae\7*\2\2\u00ae%\3\2\2\2\u00af\u00b0\7$\2\2\u00b0\u00ba\7#\2\2\u00b1"+
		"\u00b2\7$\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4\7(\2\2\u00b4\u00ba\5&\24"+
		"\2\u00b5\u00ba\7#\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b8\7(\2\2\u00b8\u00ba"+
		"\5&\24\2\u00b9\u00af\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9"+
		"\u00b6\3\2\2\2\u00ba\'\3\2\2\2\u00bb\u00bc\7\b\2\2\u00bc)\3\2\2\2\u00bd"+
		"\u00be\7\t\2\2\u00be\u00c0\7)\2\2\u00bf\u00c1\7!\2\2\u00c0\u00bf\3\2\2"+
		"\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7*\2\2\u00c3+\3"+
		"\2\2\2\u00c4\u00c5\7\4\2\2\u00c5\u00c6\7)\2\2\u00c6\u00c7\7!\2\2\u00c7"+
		"\u00c8\7(\2\2\u00c8\u00c9\7!\2\2\u00c9\u00ca\7*\2\2\u00ca\u00cc\7&\2\2"+
		"\u00cb\u00cd\5.\30\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\'\2\2\u00d1"+
		"-\3\2\2\2\u00d2\u00d3\b\30\1\2\u00d3\u00d4\5$\23\2\u00d4\u00d5\5.\30\7"+
		"\u00d5\u00db\3\2\2\2\u00d6\u00d7\5\24\13\2\u00d7\u00d8\5.\30\5\u00d8\u00db"+
		"\3\2\2\2\u00d9\u00db\5\24\13\2\u00da\u00d2\3\2\2\2\u00da\u00d6\3\2\2\2"+
		"\u00da\u00d9\3\2\2\2\u00db\u00e2\3\2\2\2\u00dc\u00dd\f\6\2\2\u00dd\u00e1"+
		"\5$\23\2\u00de\u00df\f\4\2\2\u00df\u00e1\5\24\13\2\u00e0\u00dc\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3/\3\2\2\2\u00e4\u00e2\3\2\2\2\26CEJL^goy{\u0081\u0086\u0090"+
		"\u0098\u00a6\u00b9\u00c0\u00ce\u00da\u00e0\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}