// Generated from /Users/gabminamedez/Desktop/CSC617M/MyGrammer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammerLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KEYWORD", "BPM", "STAFF", "MEASURE", "MELODY", "ACCIDENTAL_KEY", "REPSTART", 
			"REPEND", "CHORD", "CONTINUOUS", "NOTE_VALUE", "DOUBLE", "FULL", "HALF", 
			"QUARTER", "EIGHTH", "SIXTEENTH", "DOTTED", "INTEGER", "FRACTION", "PITCH", 
			"ACCIDENTAL", "IDENTIFIER", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA_SEP", 
			"OPEN_PAR", "CLOSE_PAR", "EQUAL_OPER", "WS"
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


	public MyGrammerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0102\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2I\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0096\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\6\24\u00c5\n\24\r\24\16\24\u00c6\3\25\3\25\7\25\u00cb"+
		"\n\25\f\25\16\25\u00ce\13\25\3\25\7\25\u00d1\n\25\f\25\16\25\u00d4\13"+
		"\25\3\25\3\25\7\25\u00d8\n\25\f\25\16\25\u00db\13\25\3\25\3\25\7\25\u00df"+
		"\n\25\f\25\16\25\u00e2\13\25\3\26\3\26\3\27\5\27\u00e7\n\27\3\30\3\30"+
		"\7\30\u00eb\n\30\f\30\16\30\u00ee\13\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\6\37\u00fd\n\37\r\37\16\37\u00fe\3"+
		"\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= \3\2\r\3\2\62;\3\2\63;\3\2CI\4\2%%aa\4\2C\\c|\6\2\62;"+
		"C\\aac|\3\2}}\3\2**\3\2++\3\2??\5\2\13\f\17\17\"\"\2\u0115\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\3H\3\2\2\2\5J\3\2\2\2\7N\3\2\2\2\tT\3\2\2\2\13\\\3\2\2\2\rc\3\2\2"+
		"\2\17n\3\2\2\2\21w\3\2\2\2\23~\3\2\2\2\25\u0084\3\2\2\2\27\u0095\3\2\2"+
		"\2\31\u0097\3\2\2\2\33\u009e\3\2\2\2\35\u00a3\3\2\2\2\37\u00a8\3\2\2\2"+
		"!\u00b0\3\2\2\2#\u00b7\3\2\2\2%\u00c1\3\2\2\2\'\u00c4\3\2\2\2)\u00c8\3"+
		"\2\2\2+\u00e3\3\2\2\2-\u00e6\3\2\2\2/\u00e8\3\2\2\2\61\u00ef\3\2\2\2\63"+
		"\u00f1\3\2\2\2\65\u00f3\3\2\2\2\67\u00f5\3\2\2\29\u00f7\3\2\2\2;\u00f9"+
		"\3\2\2\2=\u00fc\3\2\2\2?I\5\5\3\2@I\5\7\4\2AI\5\t\5\2BI\5\13\6\2CI\5\r"+
		"\7\2DI\5\17\b\2EI\5\21\t\2FI\5\23\n\2GI\5\25\13\2H?\3\2\2\2H@\3\2\2\2"+
		"HA\3\2\2\2HB\3\2\2\2HC\3\2\2\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2"+
		"I\4\3\2\2\2JK\7d\2\2KL\7r\2\2LM\7o\2\2M\6\3\2\2\2NO\7u\2\2OP\7v\2\2PQ"+
		"\7c\2\2QR\7h\2\2RS\7h\2\2S\b\3\2\2\2TU\7o\2\2UV\7g\2\2VW\7c\2\2WX\7u\2"+
		"\2XY\7w\2\2YZ\7t\2\2Z[\7g\2\2[\n\3\2\2\2\\]\7o\2\2]^\7g\2\2^_\7n\2\2_"+
		"`\7q\2\2`a\7f\2\2ab\7{\2\2b\f\3\2\2\2cd\7c\2\2de\7e\2\2ef\7e\2\2fg\7k"+
		"\2\2gh\7f\2\2hi\7g\2\2ij\7p\2\2jk\7v\2\2kl\7c\2\2lm\7n\2\2m\16\3\2\2\2"+
		"no\7t\2\2op\7g\2\2pq\7r\2\2qr\7u\2\2rs\7v\2\2st\7c\2\2tu\7t\2\2uv\7v\2"+
		"\2v\20\3\2\2\2wx\7t\2\2xy\7g\2\2yz\7r\2\2z{\7g\2\2{|\7p\2\2|}\7f\2\2}"+
		"\22\3\2\2\2~\177\7e\2\2\177\u0080\7j\2\2\u0080\u0081\7q\2\2\u0081\u0082"+
		"\7t\2\2\u0082\u0083\7f\2\2\u0083\24\3\2\2\2\u0084\u0085\7e\2\2\u0085\u0086"+
		"\7q\2\2\u0086\u0087\7p\2\2\u0087\u0088\7v\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7p\2\2\u008a\u008b\7w\2\2\u008b\u008c\7q\2\2\u008c\u008d\7w\2\2"+
		"\u008d\u008e\7u\2\2\u008e\26\3\2\2\2\u008f\u0096\5\31\r\2\u0090\u0096"+
		"\5\33\16\2\u0091\u0096\5\35\17\2\u0092\u0096\5\37\20\2\u0093\u0096\5!"+
		"\21\2\u0094\u0096\5#\22\2\u0095\u008f\3\2\2\2\u0095\u0090\3\2\2\2\u0095"+
		"\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\30\3\2\2\2\u0097\u0098\7f\2\2\u0098\u0099\7q\2\2\u0099\u009a"+
		"\7w\2\2\u009a\u009b\7d\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d"+
		"\32\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7n\2\2\u00a1"+
		"\u00a2\7n\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7c\2\2\u00a5"+
		"\u00a6\7n\2\2\u00a6\u00a7\7h\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7s\2\2\u00a9"+
		"\u00aa\7w\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7v\2\2"+
		"\u00ad\u00ae\7g\2\2\u00ae\u00af\7t\2\2\u00af \3\2\2\2\u00b0\u00b1\7g\2"+
		"\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7i\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5"+
		"\7v\2\2\u00b5\u00b6\7j\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9"+
		"\7k\2\2\u00b9\u00ba\7z\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7g\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7j\2\2"+
		"\u00c0$\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2&\3\2\2\2\u00c3\u00c5\t\2\2\2"+
		"\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7(\3\2\2\2\u00c8\u00cc\t\3\2\2\u00c9\u00cb\t\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00d2\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\5=\37\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d9\7\61\2\2\u00d6"+
		"\u00d8\5=\37\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00e0\t\3\2\2\u00dd\u00df\t\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1*\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00e4\t\4\2\2\u00e4,\3\2\2\2\u00e5\u00e7\t\5\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7.\3\2\2\2\u00e8\u00ec\t\6\2\2\u00e9\u00eb\t\7\2\2"+
		"\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\60\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\t\b\2\2\u00f0"+
		"\62\3\2\2\2\u00f1\u00f2\7\177\2\2\u00f2\64\3\2\2\2\u00f3\u00f4\7.\2\2"+
		"\u00f4\66\3\2\2\2\u00f5\u00f6\t\t\2\2\u00f68\3\2\2\2\u00f7\u00f8\t\n\2"+
		"\2\u00f8:\3\2\2\2\u00f9\u00fa\t\13\2\2\u00fa<\3\2\2\2\u00fb\u00fd\t\f"+
		"\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b\37\2\2\u0101>\3\2\2\2"+
		"\r\2H\u0095\u00c6\u00cc\u00d2\u00d9\u00e0\u00e6\u00ec\u00fe\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}