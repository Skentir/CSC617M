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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2^\n\2\3\3\6\3a\n\3\r\3\16\3b\3\4\3\4\7\4g\n\4\f\4\16\4j"+
		"\13\4\3\4\7\4m\n\4\f\4\16\4p\13\4\3\4\3\4\7\4t\n\4\f\4\16\4w\13\4\3\4"+
		"\3\4\7\4{\n\4\f\4\16\4~\13\4\3\5\3\5\3\6\5\6\u0083\n\6\3\7\3\7\7\7\u0087"+
		"\n\7\f\7\16\7\u008a\13\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\6\16\u0099\n\16\r\16\16\16\u009a\3\16\3\16\2\2\17\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\r\3\2\62;\3"+
		"\2\63;\3\2CI\4\2%%aa\4\2C\\c|\6\2\62;C\\aac|\3\2}}\3\2**\3\2++\3\2??\5"+
		"\2\13\f\17\17\"\"\2\u00ad\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3]\3\2\2\2\5`\3\2\2"+
		"\2\7d\3\2\2\2\t\177\3\2\2\2\13\u0082\3\2\2\2\r\u0084\3\2\2\2\17\u008b"+
		"\3\2\2\2\21\u008d\3\2\2\2\23\u008f\3\2\2\2\25\u0091\3\2\2\2\27\u0093\3"+
		"\2\2\2\31\u0095\3\2\2\2\33\u0098\3\2\2\2\35\36\7d\2\2\36\37\7r\2\2\37"+
		"^\7o\2\2 !\7u\2\2!\"\7v\2\2\"#\7c\2\2#$\7h\2\2$^\7h\2\2%&\7o\2\2&\'\7"+
		"g\2\2\'(\7c\2\2()\7u\2\2)*\7w\2\2*+\7t\2\2+^\7g\2\2,-\7o\2\2-.\7g\2\2"+
		"./\7n\2\2/\60\7q\2\2\60\61\7f\2\2\61^\7{\2\2\62\63\7c\2\2\63\64\7e\2\2"+
		"\64\65\7e\2\2\65\66\7k\2\2\66\67\7f\2\2\678\7g\2\289\7p\2\29:\7v\2\2:"+
		";\7c\2\2;^\7n\2\2<=\7p\2\2=>\7q\2\2>?\7v\2\2?^\7g\2\2@A\7t\2\2AB\7g\2"+
		"\2BC\7r\2\2CD\7u\2\2DE\7v\2\2EF\7c\2\2FG\7t\2\2G^\7v\2\2HI\7t\2\2IJ\7"+
		"g\2\2JK\7r\2\2KL\7g\2\2LM\7p\2\2M^\7f\2\2NO\7e\2\2OP\7j\2\2PQ\7q\2\2Q"+
		"R\7t\2\2R^\7f\2\2ST\7e\2\2TU\7q\2\2UV\7p\2\2VW\7v\2\2WX\7k\2\2XY\7p\2"+
		"\2YZ\7w\2\2Z[\7q\2\2[\\\7w\2\2\\^\7u\2\2]\35\3\2\2\2] \3\2\2\2]%\3\2\2"+
		"\2],\3\2\2\2]\62\3\2\2\2]<\3\2\2\2]@\3\2\2\2]H\3\2\2\2]N\3\2\2\2]S\3\2"+
		"\2\2^\4\3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\6\3"+
		"\2\2\2dh\t\3\2\2eg\t\2\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2in\3"+
		"\2\2\2jh\3\2\2\2km\5\33\16\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o"+
		"q\3\2\2\2pn\3\2\2\2qu\7\61\2\2rt\5\33\16\2sr\3\2\2\2tw\3\2\2\2us\3\2\2"+
		"\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2x|\t\3\2\2y{\t\2\2\2zy\3\2\2\2{~\3\2\2"+
		"\2|z\3\2\2\2|}\3\2\2\2}\b\3\2\2\2~|\3\2\2\2\177\u0080\t\4\2\2\u0080\n"+
		"\3\2\2\2\u0081\u0083\t\5\2\2\u0082\u0081\3\2\2\2\u0083\f\3\2\2\2\u0084"+
		"\u0088\t\6\2\2\u0085\u0087\t\7\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\16\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008c\t\b\2\2\u008c\20\3\2\2\2\u008d\u008e\7\177\2\2\u008e"+
		"\22\3\2\2\2\u008f\u0090\7.\2\2\u0090\24\3\2\2\2\u0091\u0092\t\t\2\2\u0092"+
		"\26\3\2\2\2\u0093\u0094\t\n\2\2\u0094\30\3\2\2\2\u0095\u0096\t\13\2\2"+
		"\u0096\32\3\2\2\2\u0097\u0099\t\f\2\2\u0098\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\b\16\2\2\u009d\34\3\2\2\2\f\2]bhnu|\u0082\u0088\u009a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}