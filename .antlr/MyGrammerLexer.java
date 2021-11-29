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
		KEYWORD=1, INTEGER=2, FRACTION=3, PITCH=4, ACCIDENTAL=5, IDENTIFIER=6, 
		OPEN_BRACKET=7, CLOSE_BRACKET=8, COMMA_SEP=9, OPEN_PAR=10, CLOSE_PAR=11, 
		WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KEYWORD", "INTEGER", "FRACTION", "PITCH", "ACCIDENTAL", "IDENTIFIER", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "COMMA_SEP", "OPEN_PAR", "CLOSE_PAR", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORD", "INTEGER", "FRACTION", "PITCH", "ACCIDENTAL", "IDENTIFIER", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "COMMA_SEP", "OPEN_PAR", "CLOSE_PAR", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2V\n\2\3\3\6\3Y\n\3\r\3\16"+
		"\3Z\3\4\3\4\3\4\3\4\3\5\3\5\3\6\5\6d\n\6\3\7\3\7\7\7h\n\7\f\7\16\7k\13"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\6\rx\n\r\r\r\16\ry\3"+
		"\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\3\2\13\3\2\62;\3\2CI\4\2%%aa\4\2C\\c|\6\2\62;C\\aac|\3\2}}\3\2**\3\2"+
		"++\5\2\13\f\17\17\"\"\2\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3U\3\2\2\2\5X\3\2\2\2\7\\\3"+
		"\2\2\2\t`\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17l\3\2\2\2\21n\3\2\2\2\23p\3"+
		"\2\2\2\25r\3\2\2\2\27t\3\2\2\2\31w\3\2\2\2\33\34\7d\2\2\34\35\7r\2\2\35"+
		"V\7o\2\2\36\37\7u\2\2\37 \7v\2\2 !\7c\2\2!\"\7h\2\2\"V\7h\2\2#$\7o\2\2"+
		"$%\7g\2\2%&\7c\2\2&\'\7u\2\2\'(\7w\2\2()\7t\2\2)V\7g\2\2*+\7c\2\2+,\7"+
		"e\2\2,-\7e\2\2-.\7k\2\2./\7f\2\2/\60\7g\2\2\60\61\7p\2\2\61\62\7v\2\2"+
		"\62\63\7c\2\2\63V\7n\2\2\64\65\7p\2\2\65\66\7q\2\2\66\67\7v\2\2\67V\7"+
		"g\2\289\7t\2\29:\7g\2\2:;\7r\2\2;<\7u\2\2<=\7v\2\2=>\7c\2\2>?\7t\2\2?"+
		"V\7v\2\2@A\7t\2\2AB\7g\2\2BC\7r\2\2CD\7g\2\2DE\7p\2\2EV\7f\2\2FG\7e\2"+
		"\2GH\7j\2\2HI\7q\2\2IJ\7t\2\2JV\7f\2\2KL\7e\2\2LM\7q\2\2MN\7p\2\2NO\7"+
		"v\2\2OP\7k\2\2PQ\7p\2\2QR\7w\2\2RS\7q\2\2ST\7w\2\2TV\7u\2\2U\33\3\2\2"+
		"\2U\36\3\2\2\2U#\3\2\2\2U*\3\2\2\2U\64\3\2\2\2U8\3\2\2\2U@\3\2\2\2UF\3"+
		"\2\2\2UK\3\2\2\2V\4\3\2\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z["+
		"\3\2\2\2[\6\3\2\2\2\\]\5\5\3\2]^\7\61\2\2^_\5\5\3\2_\b\3\2\2\2`a\t\3\2"+
		"\2a\n\3\2\2\2bd\t\4\2\2cb\3\2\2\2d\f\3\2\2\2ei\t\5\2\2fh\t\6\2\2gf\3\2"+
		"\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\16\3\2\2\2ki\3\2\2\2lm\t\7\2\2m\20"+
		"\3\2\2\2no\7\177\2\2o\22\3\2\2\2pq\7.\2\2q\24\3\2\2\2rs\t\b\2\2s\26\3"+
		"\2\2\2tu\t\t\2\2u\30\3\2\2\2vx\t\n\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2y"+
		"z\3\2\2\2z{\3\2\2\2{|\b\r\2\2|\32\3\2\2\2\b\2UZciy\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}