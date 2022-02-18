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
		BPM=1, STAFF=2, MEASURE=3, MEASUREUP=4, MEASUREDOWN=5, MELODY=6, ACCIDENTAL_KEY=7, 
		REPSTART=8, REPEND=9, CHORD=10, CONTINUOUS=11, DOUBLE=12, FULL=13, HALF=14, 
		QUARTER=15, EIGHTH=16, SIXTEENTH=17, INSTRUMENT=18, DOTTED=19, REST=20, 
		CLARINET=21, FLUTE=22, ORGAN=23, PIANO=24, RECORDER=25, SAXOPHONE=26, 
		TRUMPET=27, GUITAR=28, ACOUSTICGUITAR=29, ELECTRICGUITAR=30, UKULELE=31, 
		VIOLIN=32, XYLOPHONE=33, INTEGER=34, FRACTION=35, PITCH=36, ACCIDENTAL=37, 
		IDENTIFIER=38, OPEN_BRACKET=39, CLOSE_BRACKET=40, COMMA_SEP=41, OPEN_PAR=42, 
		CLOSE_PAR=43, EQUAL_OPER=44, WS=45;
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
			"MEASURE", "MEASUREUP", "MEASUREDOWN", "MELODY", "ACCIDENTAL_KEY", "REPSTART", 
			"REPEND", "CHORD", "CONTINUOUS", "DOUBLE", "FULL", "HALF", "QUARTER", 
			"EIGHTH", "SIXTEENTH", "INSTRUMENT", "DOTTED", "REST", "CLARINET", "FLUTE", 
			"ORGAN", "PIANO", "RECORDER", "SAXOPHONE", "TRUMPET", "GUITAR", "ACOUSTICGUITAR", 
			"ELECTRICGUITAR", "UKULELE", "VIOLIN", "XYLOPHONE", "INTEGER", "FRACTION", 
			"PITCH", "ACCIDENTAL", "IDENTIFIER", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"COMMA_SEP", "OPEN_PAR", "CLOSE_PAR", "EQUAL_OPER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0211\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\6=\u01d4\n"+
		"=\r=\16=\u01d5\3>\3>\7>\u01da\n>\f>\16>\u01dd\13>\3>\7>\u01e0\n>\f>\16"+
		">\u01e3\13>\3>\3>\7>\u01e7\n>\f>\16>\u01ea\13>\3>\3>\7>\u01ee\n>\f>\16"+
		">\u01f1\13>\3?\3?\3@\5@\u01f6\n@\3A\3A\7A\u01fa\nA\fA\16A\u01fd\13A\3"+
		"B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\6H\u020c\nH\rH\16H\u020d\3H\3H\2"+
		"\2I\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\bC\tE\nG"+
		"\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34"+
		"k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b"+
		"-\u008d.\u008f/\3\2\'\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh"+
		"\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2Q"+
		"Qqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4"+
		"\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\3\2\63;\3\2CI\4\2%%aa\4\2C\\c|\6\2\62"+
		";C\\aac|\3\2}}\3\2**\3\2++\3\2??\5\2\13\f\17\17\"\"\2\u01fd\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3"+
		"\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2"+
		"\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2"+
		"k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3"+
		"\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2"+
		"\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091\3\2\2\2\5\u0093\3\2\2"+
		"\2\7\u0095\3\2\2\2\t\u0097\3\2\2\2\13\u0099\3\2\2\2\r\u009b\3\2\2\2\17"+
		"\u009d\3\2\2\2\21\u009f\3\2\2\2\23\u00a1\3\2\2\2\25\u00a3\3\2\2\2\27\u00a5"+
		"\3\2\2\2\31\u00a7\3\2\2\2\33\u00a9\3\2\2\2\35\u00ab\3\2\2\2\37\u00ad\3"+
		"\2\2\2!\u00af\3\2\2\2#\u00b1\3\2\2\2%\u00b3\3\2\2\2\'\u00b5\3\2\2\2)\u00b7"+
		"\3\2\2\2+\u00b9\3\2\2\2-\u00bb\3\2\2\2/\u00bd\3\2\2\2\61\u00bf\3\2\2\2"+
		"\63\u00c1\3\2\2\2\65\u00c3\3\2\2\2\67\u00c5\3\2\2\29\u00c9\3\2\2\2;\u00cf"+
		"\3\2\2\2=\u00d7\3\2\2\2?\u00e1\3\2\2\2A\u00ed\3\2\2\2C\u00f4\3\2\2\2E"+
		"\u00ff\3\2\2\2G\u0108\3\2\2\2I\u010f\3\2\2\2K\u0115\3\2\2\2M\u0120\3\2"+
		"\2\2O\u0127\3\2\2\2Q\u012c\3\2\2\2S\u0131\3\2\2\2U\u0139\3\2\2\2W\u0140"+
		"\3\2\2\2Y\u014a\3\2\2\2[\u0155\3\2\2\2]\u0157\3\2\2\2_\u015c\3\2\2\2a"+
		"\u0165\3\2\2\2c\u016b\3\2\2\2e\u0171\3\2\2\2g\u0177\3\2\2\2i\u0180\3\2"+
		"\2\2k\u018a\3\2\2\2m\u0192\3\2\2\2o\u0199\3\2\2\2q\u01a9\3\2\2\2s\u01b9"+
		"\3\2\2\2u\u01c1\3\2\2\2w\u01c8\3\2\2\2y\u01d3\3\2\2\2{\u01d7\3\2\2\2}"+
		"\u01f2\3\2\2\2\177\u01f5\3\2\2\2\u0081\u01f7\3\2\2\2\u0083\u01fe\3\2\2"+
		"\2\u0085\u0200\3\2\2\2\u0087\u0202\3\2\2\2\u0089\u0204\3\2\2\2\u008b\u0206"+
		"\3\2\2\2\u008d\u0208\3\2\2\2\u008f\u020b\3\2\2\2\u0091\u0092\t\2\2\2\u0092"+
		"\4\3\2\2\2\u0093\u0094\t\3\2\2\u0094\6\3\2\2\2\u0095\u0096\t\4\2\2\u0096"+
		"\b\3\2\2\2\u0097\u0098\t\5\2\2\u0098\n\3\2\2\2\u0099\u009a\t\6\2\2\u009a"+
		"\f\3\2\2\2\u009b\u009c\t\7\2\2\u009c\16\3\2\2\2\u009d\u009e\t\b\2\2\u009e"+
		"\20\3\2\2\2\u009f\u00a0\t\t\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\t\n\2\2\u00a2"+
		"\24\3\2\2\2\u00a3\u00a4\t\13\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\t\f\2\2"+
		"\u00a6\30\3\2\2\2\u00a7\u00a8\t\r\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\t\16"+
		"\2\2\u00aa\34\3\2\2\2\u00ab\u00ac\t\17\2\2\u00ac\36\3\2\2\2\u00ad\u00ae"+
		"\t\20\2\2\u00ae \3\2\2\2\u00af\u00b0\t\21\2\2\u00b0\"\3\2\2\2\u00b1\u00b2"+
		"\t\22\2\2\u00b2$\3\2\2\2\u00b3\u00b4\t\23\2\2\u00b4&\3\2\2\2\u00b5\u00b6"+
		"\t\24\2\2\u00b6(\3\2\2\2\u00b7\u00b8\t\25\2\2\u00b8*\3\2\2\2\u00b9\u00ba"+
		"\t\26\2\2\u00ba,\3\2\2\2\u00bb\u00bc\t\27\2\2\u00bc.\3\2\2\2\u00bd\u00be"+
		"\t\30\2\2\u00be\60\3\2\2\2\u00bf\u00c0\t\31\2\2\u00c0\62\3\2\2\2\u00c1"+
		"\u00c2\t\32\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\t\33\2\2\u00c4\66\3\2\2\2"+
		"\u00c5\u00c6\5\5\3\2\u00c6\u00c7\5!\21\2\u00c7\u00c8\5\33\16\2\u00c88"+
		"\3\2\2\2\u00c9\u00ca\5\'\24\2\u00ca\u00cb\5)\25\2\u00cb\u00cc\5\3\2\2"+
		"\u00cc\u00cd\5\r\7\2\u00cd\u00ce\5\r\7\2\u00ce:\3\2\2\2\u00cf\u00d0\5"+
		"\33\16\2\u00d0\u00d1\5\13\6\2\u00d1\u00d2\5\3\2\2\u00d2\u00d3\5\'\24\2"+
		"\u00d3\u00d4\5+\26\2\u00d4\u00d5\5%\23\2\u00d5\u00d6\5\13\6\2\u00d6<\3"+
		"\2\2\2\u00d7\u00d8\5\33\16\2\u00d8\u00d9\5\13\6\2\u00d9\u00da\5\3\2\2"+
		"\u00da\u00db\5\'\24\2\u00db\u00dc\5+\26\2\u00dc\u00dd\5%\23\2\u00dd\u00de"+
		"\5\13\6\2\u00de\u00df\5+\26\2\u00df\u00e0\5!\21\2\u00e0>\3\2\2\2\u00e1"+
		"\u00e2\5\33\16\2\u00e2\u00e3\5\13\6\2\u00e3\u00e4\5\3\2\2\u00e4\u00e5"+
		"\5\'\24\2\u00e5\u00e6\5+\26\2\u00e6\u00e7\5%\23\2\u00e7\u00e8\5\13\6\2"+
		"\u00e8\u00e9\5\t\5\2\u00e9\u00ea\5\37\20\2\u00ea\u00eb\5/\30\2\u00eb\u00ec"+
		"\5\35\17\2\u00ec@\3\2\2\2\u00ed\u00ee\5\33\16\2\u00ee\u00ef\5\13\6\2\u00ef"+
		"\u00f0\5\31\r\2\u00f0\u00f1\5\37\20\2\u00f1\u00f2\5\t\5\2\u00f2\u00f3"+
		"\5\63\32\2\u00f3B\3\2\2\2\u00f4\u00f5\5\3\2\2\u00f5\u00f6\5\7\4\2\u00f6"+
		"\u00f7\5\7\4\2\u00f7\u00f8\5\23\n\2\u00f8\u00f9\5\t\5\2\u00f9\u00fa\5"+
		"\13\6\2\u00fa\u00fb\5\35\17\2\u00fb\u00fc\5)\25\2\u00fc\u00fd\5\3\2\2"+
		"\u00fd\u00fe\5\31\r\2\u00feD\3\2\2\2\u00ff\u0100\5%\23\2\u0100\u0101\5"+
		"\13\6\2\u0101\u0102\5!\21\2\u0102\u0103\5\'\24\2\u0103\u0104\5)\25\2\u0104"+
		"\u0105\5\3\2\2\u0105\u0106\5%\23\2\u0106\u0107\5)\25\2\u0107F\3\2\2\2"+
		"\u0108\u0109\5%\23\2\u0109\u010a\5\13\6\2\u010a\u010b\5!\21\2\u010b\u010c"+
		"\5\13\6\2\u010c\u010d\5\35\17\2\u010d\u010e\5\t\5\2\u010eH\3\2\2\2\u010f"+
		"\u0110\5\7\4\2\u0110\u0111\5\21\t\2\u0111\u0112\5\37\20\2\u0112\u0113"+
		"\5%\23\2\u0113\u0114\5\t\5\2\u0114J\3\2\2\2\u0115\u0116\5\7\4\2\u0116"+
		"\u0117\5\37\20\2\u0117\u0118\5\35\17\2\u0118\u0119\5)\25\2\u0119\u011a"+
		"\5\23\n\2\u011a\u011b\5\35\17\2\u011b\u011c\5+\26\2\u011c\u011d\5\37\20"+
		"\2\u011d\u011e\5+\26\2\u011e\u011f\5\'\24\2\u011fL\3\2\2\2\u0120\u0121"+
		"\5\t\5\2\u0121\u0122\5\37\20\2\u0122\u0123\5+\26\2\u0123\u0124\5\5\3\2"+
		"\u0124\u0125\5\31\r\2\u0125\u0126\5\13\6\2\u0126N\3\2\2\2\u0127\u0128"+
		"\5\r\7\2\u0128\u0129\5+\26\2\u0129\u012a\5\31\r\2\u012a\u012b\5\31\r\2"+
		"\u012bP\3\2\2\2\u012c\u012d\5\21\t\2\u012d\u012e\5\3\2\2\u012e\u012f\5"+
		"\31\r\2\u012f\u0130\5\r\7\2\u0130R\3\2\2\2\u0131\u0132\5#\22\2\u0132\u0133"+
		"\5+\26\2\u0133\u0134\5\3\2\2\u0134\u0135\5%\23\2\u0135\u0136\5)\25\2\u0136"+
		"\u0137\5\13\6\2\u0137\u0138\5%\23\2\u0138T\3\2\2\2\u0139\u013a\5\13\6"+
		"\2\u013a\u013b\5\23\n\2\u013b\u013c\5\17\b\2\u013c\u013d\5\21\t\2\u013d"+
		"\u013e\5)\25\2\u013e\u013f\5\21\t\2\u013fV\3\2\2\2\u0140\u0141\5\'\24"+
		"\2\u0141\u0142\5\23\n\2\u0142\u0143\5\61\31\2\u0143\u0144\5)\25\2\u0144"+
		"\u0145\5\13\6\2\u0145\u0146\5\13\6\2\u0146\u0147\5\35\17\2\u0147\u0148"+
		"\5)\25\2\u0148\u0149\5\21\t\2\u0149X\3\2\2\2\u014a\u014b\5\23\n\2\u014b"+
		"\u014c\5\35\17\2\u014c\u014d\5\'\24\2\u014d\u014e\5)\25\2\u014e\u014f"+
		"\5%\23\2\u014f\u0150\5+\26\2\u0150\u0151\5\33\16\2\u0151\u0152\5\13\6"+
		"\2\u0152\u0153\5\35\17\2\u0153\u0154\5)\25\2\u0154Z\3\2\2\2\u0155\u0156"+
		"\7,\2\2\u0156\\\3\2\2\2\u0157\u0158\5%\23\2\u0158\u0159\5\13\6\2\u0159"+
		"\u015a\5\'\24\2\u015a\u015b\5)\25\2\u015b^\3\2\2\2\u015c\u015d\5\7\4\2"+
		"\u015d\u015e\5\31\r\2\u015e\u015f\5\3\2\2\u015f\u0160\5%\23\2\u0160\u0161"+
		"\5\23\n\2\u0161\u0162\5\35\17\2\u0162\u0163\5\13\6\2\u0163\u0164\5)\25"+
		"\2\u0164`\3\2\2\2\u0165\u0166\5\r\7\2\u0166\u0167\5\31\r\2\u0167\u0168"+
		"\5+\26\2\u0168\u0169\5)\25\2\u0169\u016a\5\13\6\2\u016ab\3\2\2\2\u016b"+
		"\u016c\5\37\20\2\u016c\u016d\5%\23\2\u016d\u016e\5\17\b\2\u016e\u016f"+
		"\5\3\2\2\u016f\u0170\5\35\17\2\u0170d\3\2\2\2\u0171\u0172\5!\21\2\u0172"+
		"\u0173\5\23\n\2\u0173\u0174\5\3\2\2\u0174\u0175\5\35\17\2\u0175\u0176"+
		"\5\37\20\2\u0176f\3\2\2\2\u0177\u0178\5%\23\2\u0178\u0179\5\13\6\2\u0179"+
		"\u017a\5\7\4\2\u017a\u017b\5\37\20\2\u017b\u017c\5%\23\2\u017c\u017d\5"+
		"\t\5\2\u017d\u017e\5\13\6\2\u017e\u017f\5%\23\2\u017fh\3\2\2\2\u0180\u0181"+
		"\5\'\24\2\u0181\u0182\5\3\2\2\u0182\u0183\5\61\31\2\u0183\u0184\5\37\20"+
		"\2\u0184\u0185\5!\21\2\u0185\u0186\5\21\t\2\u0186\u0187\5\37\20\2\u0187"+
		"\u0188\5\35\17\2\u0188\u0189\5\13\6\2\u0189j\3\2\2\2\u018a\u018b\5)\25"+
		"\2\u018b\u018c\5%\23\2\u018c\u018d\5+\26\2\u018d\u018e\5\33\16\2\u018e"+
		"\u018f\5!\21\2\u018f\u0190\5\13\6\2\u0190\u0191\5)\25\2\u0191l\3\2\2\2"+
		"\u0192\u0193\5\17\b\2\u0193\u0194\5+\26\2\u0194\u0195\5\23\n\2\u0195\u0196"+
		"\5)\25\2\u0196\u0197\5\3\2\2\u0197\u0198\5%\23\2\u0198n\3\2\2\2\u0199"+
		"\u019a\5\3\2\2\u019a\u019b\5\7\4\2\u019b\u019c\5\37\20\2\u019c\u019d\5"+
		"+\26\2\u019d\u019e\5\'\24\2\u019e\u019f\5)\25\2\u019f\u01a0\5\23\n\2\u01a0"+
		"\u01a1\5\7\4\2\u01a1\u01a2\5\u008fH\2\u01a2\u01a3\5\17\b\2\u01a3\u01a4"+
		"\5+\26\2\u01a4\u01a5\5\23\n\2\u01a5\u01a6\5)\25\2\u01a6\u01a7\5\3\2\2"+
		"\u01a7\u01a8\5%\23\2\u01a8p\3\2\2\2\u01a9\u01aa\5\13\6\2\u01aa\u01ab\5"+
		"\31\r\2\u01ab\u01ac\5\13\6\2\u01ac\u01ad\5\7\4\2\u01ad\u01ae\5)\25\2\u01ae"+
		"\u01af\5%\23\2\u01af\u01b0\5\23\n\2\u01b0\u01b1\5\7\4\2\u01b1\u01b2\5"+
		"\u008fH\2\u01b2\u01b3\5\17\b\2\u01b3\u01b4\5+\26\2\u01b4\u01b5\5\23\n"+
		"\2\u01b5\u01b6\5)\25\2\u01b6\u01b7\5\3\2\2\u01b7\u01b8\5%\23\2\u01b8r"+
		"\3\2\2\2\u01b9\u01ba\5+\26\2\u01ba\u01bb\5\27\f\2\u01bb\u01bc\5+\26\2"+
		"\u01bc\u01bd\5\31\r\2\u01bd\u01be\5\13\6\2\u01be\u01bf\5\31\r\2\u01bf"+
		"\u01c0\5\13\6\2\u01c0t\3\2\2\2\u01c1\u01c2\5-\27\2\u01c2\u01c3\5\23\n"+
		"\2\u01c3\u01c4\5\37\20\2\u01c4\u01c5\5\31\r\2\u01c5\u01c6\5\23\n\2\u01c6"+
		"\u01c7\5\35\17\2\u01c7v\3\2\2\2\u01c8\u01c9\5\61\31\2\u01c9\u01ca\5\63"+
		"\32\2\u01ca\u01cb\5\31\r\2\u01cb\u01cc\5\37\20\2\u01cc\u01cd\5!\21\2\u01cd"+
		"\u01ce\5\21\t\2\u01ce\u01cf\5\37\20\2\u01cf\u01d0\5\35\17\2\u01d0\u01d1"+
		"\5\13\6\2\u01d1x\3\2\2\2\u01d2\u01d4\t\34\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6z\3\2\2\2"+
		"\u01d7\u01db\t\35\2\2\u01d8\u01da\t\34\2\2\u01d9\u01d8\3\2\2\2\u01da\u01dd"+
		"\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01e1\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01de\u01e0\5\u008fH\2\u01df\u01de\3\2\2\2\u01e0\u01e3"+
		"\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01e8\7\61\2\2\u01e5\u01e7\5\u008fH\2\u01e6\u01e5"+
		"\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ef\t\35\2\2\u01ec\u01ee\t"+
		"\34\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0|\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\t\36\2\2"+
		"\u01f3~\3\2\2\2\u01f4\u01f6\t\37\2\2\u01f5\u01f4\3\2\2\2\u01f6\u0080\3"+
		"\2\2\2\u01f7\u01fb\t \2\2\u01f8\u01fa\t!\2\2\u01f9\u01f8\3\2\2\2\u01fa"+
		"\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0082\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\t\"\2\2\u01ff\u0084\3\2\2\2\u0200"+
		"\u0201\7\177\2\2\u0201\u0086\3\2\2\2\u0202\u0203\7.\2\2\u0203\u0088\3"+
		"\2\2\2\u0204\u0205\t#\2\2\u0205\u008a\3\2\2\2\u0206\u0207\t$\2\2\u0207"+
		"\u008c\3\2\2\2\u0208\u0209\t%\2\2\u0209\u008e\3\2\2\2\u020a\u020c\t&\2"+
		"\2\u020b\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e"+
		"\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\bH\2\2\u0210\u0090\3\2\2\2\13"+
		"\2\u01d5\u01db\u01e1\u01e8\u01ef\u01f5\u01fb\u020d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}