// Generated from c:\Users\DeLL\OneDrive\Documents\GitHub\CSC617M\MyGrammer.g4 by ANTLR 4.8
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
		EQUAL_OPER=12, WS=13;
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
			"EQUAL_OPER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0081\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2X\n\2\3\3"+
		"\6\3[\n\3\r\3\16\3\\\3\4\3\4\3\4\3\4\3\5\3\5\3\6\5\6f\n\6\3\7\3\7\7\7"+
		"j\n\7\f\7\16\7m\13\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\6\16|\n\16\r\16\16\16}\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\f\3\2\62;\3\2CI\4\2%%aa\4\2"+
		"C\\c|\6\2\62;C\\aac|\3\2}}\3\2**\3\2++\3\2??\5\2\13\f\17\17\"\"\2\u008b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\3W\3\2\2\2\5Z\3\2\2\2\7^\3\2\2\2\tb\3\2\2\2"+
		"\13e\3\2\2\2\rg\3\2\2\2\17n\3\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25t\3\2\2"+
		"\2\27v\3\2\2\2\31x\3\2\2\2\33{\3\2\2\2\35\36\7d\2\2\36\37\7r\2\2\37X\7"+
		"o\2\2 !\7u\2\2!\"\7v\2\2\"#\7c\2\2#$\7h\2\2$X\7h\2\2%&\7o\2\2&\'\7g\2"+
		"\2\'(\7c\2\2()\7u\2\2)*\7w\2\2*+\7t\2\2+X\7g\2\2,-\7c\2\2-.\7e\2\2./\7"+
		"e\2\2/\60\7k\2\2\60\61\7f\2\2\61\62\7g\2\2\62\63\7p\2\2\63\64\7v\2\2\64"+
		"\65\7c\2\2\65X\7n\2\2\66\67\7p\2\2\678\7q\2\289\7v\2\29X\7g\2\2:;\7t\2"+
		"\2;<\7g\2\2<=\7r\2\2=>\7u\2\2>?\7v\2\2?@\7c\2\2@A\7t\2\2AX\7v\2\2BC\7"+
		"t\2\2CD\7g\2\2DE\7r\2\2EF\7g\2\2FG\7p\2\2GX\7f\2\2HI\7e\2\2IJ\7j\2\2J"+
		"K\7q\2\2KL\7t\2\2LX\7f\2\2MN\7e\2\2NO\7q\2\2OP\7p\2\2PQ\7v\2\2QR\7k\2"+
		"\2RS\7p\2\2ST\7w\2\2TU\7q\2\2UV\7w\2\2VX\7u\2\2W\35\3\2\2\2W \3\2\2\2"+
		"W%\3\2\2\2W,\3\2\2\2W\66\3\2\2\2W:\3\2\2\2WB\3\2\2\2WH\3\2\2\2WM\3\2\2"+
		"\2X\4\3\2\2\2Y[\t\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\6"+
		"\3\2\2\2^_\5\5\3\2_`\7\61\2\2`a\5\5\3\2a\b\3\2\2\2bc\t\3\2\2c\n\3\2\2"+
		"\2df\t\4\2\2ed\3\2\2\2f\f\3\2\2\2gk\t\5\2\2hj\t\6\2\2ih\3\2\2\2jm\3\2"+
		"\2\2ki\3\2\2\2kl\3\2\2\2l\16\3\2\2\2mk\3\2\2\2no\t\7\2\2o\20\3\2\2\2p"+
		"q\7\177\2\2q\22\3\2\2\2rs\7.\2\2s\24\3\2\2\2tu\t\b\2\2u\26\3\2\2\2vw\t"+
		"\t\2\2w\30\3\2\2\2xy\t\n\2\2y\32\3\2\2\2z|\t\13\2\2{z\3\2\2\2|}\3\2\2"+
		"\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\b\16\2\2\u0080\34\3\2\2"+
		"\2\b\2W\\ek}\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}