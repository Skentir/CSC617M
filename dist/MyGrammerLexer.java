// Generated from MyGrammer.g4 by ANTLR 4.9.3
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
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BPM=1, STAFF=2, MEASURE=3, MELODY=4, ACCIDENTAL_KEY=5, REPSTART=6, REPEND=7, 
		CHORD=8, CONTINUOUS=9, DOUBLE=10, FULL=11, HALF=12, QUARTER=13, EIGHTH=14, 
		SIXTEENTH=15, INSTRUMENT=16, DOTTED=17, REST=18, CLARINET=19, FLUTE=20, 
		ORGAN=21, PIANO=22, RECORDER=23, SAXOPHONE=24, TRUMPET=25, GUITAR=26, 
		ACOUSTICGUITAR=27, ELECTRICGUITAR=28, UKULELE=29, VIOLIN=30, XYLOPHONE=31, 
		INTEGER=32, FRACTION=33, PITCH=34, ACCIDENTAL=35, IDENTIFIER=36, OPEN_BRACKET=37, 
		CLOSE_BRACKET=38, COMMA_SEP=39, OPEN_PAR=40, CLOSE_PAR=41, EQUAL_OPER=42, 
		WS=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "BPM", "STAFF", 
			"MEASURE", "MELODY", "ACCIDENTAL_KEY", "REPSTART", "REPEND", "CHORD", 
			"CONTINUOUS", "DOUBLE", "FULL", "HALF", "QUARTER", "EIGHTH", "SIXTEENTH", 
			"INSTRUMENT", "DOTTED", "REST", "CLARINET", "FLUTE", "ORGAN", "PIANO", 
			"RECORDER", "SAXOPHONE", "TRUMPET", "GUITAR", "ACOUSTICGUITAR", "ELECTRICGUITAR", 
			"UKULELE", "VIOLIN", "XYLOPHONE", "INTEGER", "FRACTION", "PITCH", "ACCIDENTAL", 
			"IDENTIFIER", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA_SEP", "OPEN_PAR", 
			"CLOSE_PAR", "EQUAL_OPER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'*'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BPM", "STAFF", "MEASURE", "MELODY", "ACCIDENTAL_KEY", "REPSTART", 
			"REPEND", "CHORD", "CONTINUOUS", "DOUBLE", "FULL", "HALF", "QUARTER", 
			"EIGHTH", "SIXTEENTH", "INSTRUMENT", "DOTTED", "REST", "CLARINET", "FLUTE", 
			"ORGAN", "PIANO", "RECORDER", "SAXOPHONE", "TRUMPET", "GUITAR", "ACOUSTICGUITAR", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u01f7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;"+
		"\6;\u01ba\n;\r;\16;\u01bb\3<\3<\7<\u01c0\n<\f<\16<\u01c3\13<\3<\7<\u01c6"+
		"\n<\f<\16<\u01c9\13<\3<\3<\7<\u01cd\n<\f<\16<\u01d0\13<\3<\3<\7<\u01d4"+
		"\n<\f<\16<\u01d7\13<\3=\3=\3>\5>\u01dc\n>\3?\3?\7?\u01e0\n?\f?\16?\u01e3"+
		"\13?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\6F\u01f2\nF\rF\16F\u01f3\3"+
		"F\3F\2\2G\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2"+
		"\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\b"+
		"C\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g"+
		"\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089"+
		",\u008b-\3\2\'\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIi"+
		"i\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\3\2\62;\3\2\63;\3\2CI\4\2%%aa\4\2C\\c|\6\2\62;C\\aac"+
		"|\3\2}}\3\2**\3\2++\3\2??\5\2\13\f\17\17\"\"\2\u01e3\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\3\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u0091\3\2\2\2\t\u0093\3\2\2\2\13"+
		"\u0095\3\2\2\2\r\u0097\3\2\2\2\17\u0099\3\2\2\2\21\u009b\3\2\2\2\23\u009d"+
		"\3\2\2\2\25\u009f\3\2\2\2\27\u00a1\3\2\2\2\31\u00a3\3\2\2\2\33\u00a5\3"+
		"\2\2\2\35\u00a7\3\2\2\2\37\u00a9\3\2\2\2!\u00ab\3\2\2\2#\u00ad\3\2\2\2"+
		"%\u00af\3\2\2\2\'\u00b1\3\2\2\2)\u00b3\3\2\2\2+\u00b5\3\2\2\2-\u00b7\3"+
		"\2\2\2/\u00b9\3\2\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf\3\2\2"+
		"\2\67\u00c1\3\2\2\29\u00c5\3\2\2\2;\u00cb\3\2\2\2=\u00d3\3\2\2\2?\u00da"+
		"\3\2\2\2A\u00e5\3\2\2\2C\u00ee\3\2\2\2E\u00f5\3\2\2\2G\u00fb\3\2\2\2I"+
		"\u0106\3\2\2\2K\u010d\3\2\2\2M\u0112\3\2\2\2O\u0117\3\2\2\2Q\u011f\3\2"+
		"\2\2S\u0126\3\2\2\2U\u0130\3\2\2\2W\u013b\3\2\2\2Y\u013d\3\2\2\2[\u0142"+
		"\3\2\2\2]\u014b\3\2\2\2_\u0151\3\2\2\2a\u0157\3\2\2\2c\u015d\3\2\2\2e"+
		"\u0166\3\2\2\2g\u0170\3\2\2\2i\u0178\3\2\2\2k\u017f\3\2\2\2m\u018f\3\2"+
		"\2\2o\u019f\3\2\2\2q\u01a7\3\2\2\2s\u01ae\3\2\2\2u\u01b9\3\2\2\2w\u01bd"+
		"\3\2\2\2y\u01d8\3\2\2\2{\u01db\3\2\2\2}\u01dd\3\2\2\2\177\u01e4\3\2\2"+
		"\2\u0081\u01e6\3\2\2\2\u0083\u01e8\3\2\2\2\u0085\u01ea\3\2\2\2\u0087\u01ec"+
		"\3\2\2\2\u0089\u01ee\3\2\2\2\u008b\u01f1\3\2\2\2\u008d\u008e\t\2\2\2\u008e"+
		"\4\3\2\2\2\u008f\u0090\t\3\2\2\u0090\6\3\2\2\2\u0091\u0092\t\4\2\2\u0092"+
		"\b\3\2\2\2\u0093\u0094\t\5\2\2\u0094\n\3\2\2\2\u0095\u0096\t\6\2\2\u0096"+
		"\f\3\2\2\2\u0097\u0098\t\7\2\2\u0098\16\3\2\2\2\u0099\u009a\t\b\2\2\u009a"+
		"\20\3\2\2\2\u009b\u009c\t\t\2\2\u009c\22\3\2\2\2\u009d\u009e\t\n\2\2\u009e"+
		"\24\3\2\2\2\u009f\u00a0\t\13\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\t\f\2\2"+
		"\u00a2\30\3\2\2\2\u00a3\u00a4\t\r\2\2\u00a4\32\3\2\2\2\u00a5\u00a6\t\16"+
		"\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\t\17\2\2\u00a8\36\3\2\2\2\u00a9\u00aa"+
		"\t\20\2\2\u00aa \3\2\2\2\u00ab\u00ac\t\21\2\2\u00ac\"\3\2\2\2\u00ad\u00ae"+
		"\t\22\2\2\u00ae$\3\2\2\2\u00af\u00b0\t\23\2\2\u00b0&\3\2\2\2\u00b1\u00b2"+
		"\t\24\2\2\u00b2(\3\2\2\2\u00b3\u00b4\t\25\2\2\u00b4*\3\2\2\2\u00b5\u00b6"+
		"\t\26\2\2\u00b6,\3\2\2\2\u00b7\u00b8\t\27\2\2\u00b8.\3\2\2\2\u00b9\u00ba"+
		"\t\30\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\t\31\2\2\u00bc\62\3\2\2\2\u00bd"+
		"\u00be\t\32\2\2\u00be\64\3\2\2\2\u00bf\u00c0\t\33\2\2\u00c0\66\3\2\2\2"+
		"\u00c1\u00c2\5\5\3\2\u00c2\u00c3\5!\21\2\u00c3\u00c4\5\33\16\2\u00c48"+
		"\3\2\2\2\u00c5\u00c6\5\'\24\2\u00c6\u00c7\5)\25\2\u00c7\u00c8\5\3\2\2"+
		"\u00c8\u00c9\5\r\7\2\u00c9\u00ca\5\r\7\2\u00ca:\3\2\2\2\u00cb\u00cc\5"+
		"\33\16\2\u00cc\u00cd\5\13\6\2\u00cd\u00ce\5\3\2\2\u00ce\u00cf\5\'\24\2"+
		"\u00cf\u00d0\5+\26\2\u00d0\u00d1\5%\23\2\u00d1\u00d2\5\13\6\2\u00d2<\3"+
		"\2\2\2\u00d3\u00d4\5\33\16\2\u00d4\u00d5\5\13\6\2\u00d5\u00d6\5\31\r\2"+
		"\u00d6\u00d7\5\37\20\2\u00d7\u00d8\5\t\5\2\u00d8\u00d9\5\63\32\2\u00d9"+
		">\3\2\2\2\u00da\u00db\5\3\2\2\u00db\u00dc\5\7\4\2\u00dc\u00dd\5\7\4\2"+
		"\u00dd\u00de\5\23\n\2\u00de\u00df\5\t\5\2\u00df\u00e0\5\13\6\2\u00e0\u00e1"+
		"\5\35\17\2\u00e1\u00e2\5)\25\2\u00e2\u00e3\5\3\2\2\u00e3\u00e4\5\31\r"+
		"\2\u00e4@\3\2\2\2\u00e5\u00e6\5%\23\2\u00e6\u00e7\5\13\6\2\u00e7\u00e8"+
		"\5!\21\2\u00e8\u00e9\5\'\24\2\u00e9\u00ea\5)\25\2\u00ea\u00eb\5\3\2\2"+
		"\u00eb\u00ec\5%\23\2\u00ec\u00ed\5)\25\2\u00edB\3\2\2\2\u00ee\u00ef\5"+
		"%\23\2\u00ef\u00f0\5\13\6\2\u00f0\u00f1\5!\21\2\u00f1\u00f2\5\13\6\2\u00f2"+
		"\u00f3\5\35\17\2\u00f3\u00f4\5\t\5\2\u00f4D\3\2\2\2\u00f5\u00f6\5\7\4"+
		"\2\u00f6\u00f7\5\21\t\2\u00f7\u00f8\5\37\20\2\u00f8\u00f9\5%\23\2\u00f9"+
		"\u00fa\5\t\5\2\u00faF\3\2\2\2\u00fb\u00fc\5\7\4\2\u00fc\u00fd\5\37\20"+
		"\2\u00fd\u00fe\5\35\17\2\u00fe\u00ff\5)\25\2\u00ff\u0100\5\23\n\2\u0100"+
		"\u0101\5\35\17\2\u0101\u0102\5+\26\2\u0102\u0103\5\37\20\2\u0103\u0104"+
		"\5+\26\2\u0104\u0105\5\'\24\2\u0105H\3\2\2\2\u0106\u0107\5\t\5\2\u0107"+
		"\u0108\5\37\20\2\u0108\u0109\5+\26\2\u0109\u010a\5\5\3\2\u010a\u010b\5"+
		"\31\r\2\u010b\u010c\5\13\6\2\u010cJ\3\2\2\2\u010d\u010e\5\r\7\2\u010e"+
		"\u010f\5+\26\2\u010f\u0110\5\31\r\2\u0110\u0111\5\31\r\2\u0111L\3\2\2"+
		"\2\u0112\u0113\5\21\t\2\u0113\u0114\5\3\2\2\u0114\u0115\5\31\r\2\u0115"+
		"\u0116\5\r\7\2\u0116N\3\2\2\2\u0117\u0118\5#\22\2\u0118\u0119\5+\26\2"+
		"\u0119\u011a\5\3\2\2\u011a\u011b\5%\23\2\u011b\u011c\5)\25\2\u011c\u011d"+
		"\5\13\6\2\u011d\u011e\5%\23\2\u011eP\3\2\2\2\u011f\u0120\5\13\6\2\u0120"+
		"\u0121\5\23\n\2\u0121\u0122\5\17\b\2\u0122\u0123\5\21\t\2\u0123\u0124"+
		"\5)\25\2\u0124\u0125\5\21\t\2\u0125R\3\2\2\2\u0126\u0127\5\'\24\2\u0127"+
		"\u0128\5\23\n\2\u0128\u0129\5\61\31\2\u0129\u012a\5)\25\2\u012a\u012b"+
		"\5\13\6\2\u012b\u012c\5\13\6\2\u012c\u012d\5\35\17\2\u012d\u012e\5)\25"+
		"\2\u012e\u012f\5\21\t\2\u012fT\3\2\2\2\u0130\u0131\5\23\n\2\u0131\u0132"+
		"\5\35\17\2\u0132\u0133\5\'\24\2\u0133\u0134\5)\25\2\u0134\u0135\5%\23"+
		"\2\u0135\u0136\5+\26\2\u0136\u0137\5\33\16\2\u0137\u0138\5\13\6\2\u0138"+
		"\u0139\5\35\17\2\u0139\u013a\5)\25\2\u013aV\3\2\2\2\u013b\u013c\7,\2\2"+
		"\u013cX\3\2\2\2\u013d\u013e\5%\23\2\u013e\u013f\5\13\6\2\u013f\u0140\5"+
		"\'\24\2\u0140\u0141\5)\25\2\u0141Z\3\2\2\2\u0142\u0143\5\7\4\2\u0143\u0144"+
		"\5\31\r\2\u0144\u0145\5\3\2\2\u0145\u0146\5%\23\2\u0146\u0147\5\23\n\2"+
		"\u0147\u0148\5\35\17\2\u0148\u0149\5\13\6\2\u0149\u014a\5)\25\2\u014a"+
		"\\\3\2\2\2\u014b\u014c\5\r\7\2\u014c\u014d\5\31\r\2\u014d\u014e\5+\26"+
		"\2\u014e\u014f\5)\25\2\u014f\u0150\5\13\6\2\u0150^\3\2\2\2\u0151\u0152"+
		"\5\37\20\2\u0152\u0153\5%\23\2\u0153\u0154\5\17\b\2\u0154\u0155\5\3\2"+
		"\2\u0155\u0156\5\35\17\2\u0156`\3\2\2\2\u0157\u0158\5!\21\2\u0158\u0159"+
		"\5\23\n\2\u0159\u015a\5\3\2\2\u015a\u015b\5\35\17\2\u015b\u015c\5\37\20"+
		"\2\u015cb\3\2\2\2\u015d\u015e\5%\23\2\u015e\u015f\5\13\6\2\u015f\u0160"+
		"\5\7\4\2\u0160\u0161\5\37\20\2\u0161\u0162\5%\23\2\u0162\u0163\5\t\5\2"+
		"\u0163\u0164\5\13\6\2\u0164\u0165\5%\23\2\u0165d\3\2\2\2\u0166\u0167\5"+
		"\'\24\2\u0167\u0168\5\3\2\2\u0168\u0169\5\61\31\2\u0169\u016a\5\37\20"+
		"\2\u016a\u016b\5!\21\2\u016b\u016c\5\21\t\2\u016c\u016d\5\37\20\2\u016d"+
		"\u016e\5\35\17\2\u016e\u016f\5\13\6\2\u016ff\3\2\2\2\u0170\u0171\5)\25"+
		"\2\u0171\u0172\5%\23\2\u0172\u0173\5+\26\2\u0173\u0174\5\33\16\2\u0174"+
		"\u0175\5!\21\2\u0175\u0176\5\13\6\2\u0176\u0177\5)\25\2\u0177h\3\2\2\2"+
		"\u0178\u0179\5\17\b\2\u0179\u017a\5+\26\2\u017a\u017b\5\23\n\2\u017b\u017c"+
		"\5)\25\2\u017c\u017d\5\3\2\2\u017d\u017e\5%\23\2\u017ej\3\2\2\2\u017f"+
		"\u0180\5\3\2\2\u0180\u0181\5\7\4\2\u0181\u0182\5\37\20\2\u0182\u0183\5"+
		"+\26\2\u0183\u0184\5\'\24\2\u0184\u0185\5)\25\2\u0185\u0186\5\23\n\2\u0186"+
		"\u0187\5\7\4\2\u0187\u0188\5\u008bF\2\u0188\u0189\5\17\b\2\u0189\u018a"+
		"\5+\26\2\u018a\u018b\5\23\n\2\u018b\u018c\5)\25\2\u018c\u018d\5\3\2\2"+
		"\u018d\u018e\5%\23\2\u018el\3\2\2\2\u018f\u0190\5\13\6\2\u0190\u0191\5"+
		"\31\r\2\u0191\u0192\5\13\6\2\u0192\u0193\5\7\4\2\u0193\u0194\5)\25\2\u0194"+
		"\u0195\5%\23\2\u0195\u0196\5\23\n\2\u0196\u0197\5\7\4\2\u0197\u0198\5"+
		"\u008bF\2\u0198\u0199\5\17\b\2\u0199\u019a\5+\26\2\u019a\u019b\5\23\n"+
		"\2\u019b\u019c\5)\25\2\u019c\u019d\5\3\2\2\u019d\u019e\5%\23\2\u019en"+
		"\3\2\2\2\u019f\u01a0\5+\26\2\u01a0\u01a1\5\27\f\2\u01a1\u01a2\5+\26\2"+
		"\u01a2\u01a3\5\31\r\2\u01a3\u01a4\5\13\6\2\u01a4\u01a5\5\31\r\2\u01a5"+
		"\u01a6\5\13\6\2\u01a6p\3\2\2\2\u01a7\u01a8\5-\27\2\u01a8\u01a9\5\23\n"+
		"\2\u01a9\u01aa\5\37\20\2\u01aa\u01ab\5\31\r\2\u01ab\u01ac\5\23\n\2\u01ac"+
		"\u01ad\5\35\17\2\u01adr\3\2\2\2\u01ae\u01af\5\61\31\2\u01af\u01b0\5\63"+
		"\32\2\u01b0\u01b1\5\31\r\2\u01b1\u01b2\5\37\20\2\u01b2\u01b3\5!\21\2\u01b3"+
		"\u01b4\5\21\t\2\u01b4\u01b5\5\37\20\2\u01b5\u01b6\5\35\17\2\u01b6\u01b7"+
		"\5\13\6\2\u01b7t\3\2\2\2\u01b8\u01ba\t\34\2\2\u01b9\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcv\3\2\2\2"+
		"\u01bd\u01c1\t\35\2\2\u01be\u01c0\t\34\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c3"+
		"\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c7\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c4\u01c6\5\u008bF\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9"+
		"\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01ca\u01ce\7\61\2\2\u01cb\u01cd\5\u008bF\2\u01cc\u01cb"+
		"\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d5\t\35\2\2\u01d2\u01d4\t"+
		"\34\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6x\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\t\36\2\2"+
		"\u01d9z\3\2\2\2\u01da\u01dc\t\37\2\2\u01db\u01da\3\2\2\2\u01dc|\3\2\2"+
		"\2\u01dd\u01e1\t \2\2\u01de\u01e0\t!\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3"+
		"\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2~\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01e5\t\"\2\2\u01e5\u0080\3\2\2\2\u01e6\u01e7\7\177"+
		"\2\2\u01e7\u0082\3\2\2\2\u01e8\u01e9\7.\2\2\u01e9\u0084\3\2\2\2\u01ea"+
		"\u01eb\t#\2\2\u01eb\u0086\3\2\2\2\u01ec\u01ed\t$\2\2\u01ed\u0088\3\2\2"+
		"\2\u01ee\u01ef\t%\2\2\u01ef\u008a\3\2\2\2\u01f0\u01f2\t&\2\2\u01f1\u01f0"+
		"\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f6\bF\2\2\u01f6\u008c\3\2\2\2\13\2\u01bb\u01c1"+
		"\u01c7\u01ce\u01d5\u01db\u01e1\u01f3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}