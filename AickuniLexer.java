// Generated from Aickuni.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AickuniLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPARIT=1, OPREL=2, OPBOOL=3, BOOL=4, PARA=5, ENQUANTO=6, SE=7, ENTAO=8, 
		SENAO=9, FUNCR=10, FUNSR=11, ES=12, ABLOCO=13, FBLOCO=14, TIPO=15, APAREN=16, 
		FPAREN=17, RETORNA=18, NUM=19, ID=20, TEXTO=21, SEP=22, ATR=23, DELIM=24, 
		A=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "OPARIT", "OPREL", "OPBOOL", "BOOL", "PARA", "ENQUANTO", 
			"SE", "ENTAO", "SENAO", "FUNCR", "FUNSR", "ES", "ABLOCO", "FBLOCO", "TIPO", 
			"APAREN", "FPAREN", "RETORNA", "NUM", "ID", "TEXTO", "SEP", "ATR", "DELIM", 
			"A", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'PARA'", "'ENQUANTO'", "'SE'", "'ENTAO'", 
			"'SENAO'", "'FUNCAORETORNO'", "'FUNCAOSEMRETORNO'", null, "'{'", "'}'", 
			null, "'('", "')'", "'RETORNA'", null, null, null, "','", "'ATRIBUI'", 
			"';'", "'A'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPARIT", "OPREL", "OPBOOL", "BOOL", "PARA", "ENQUANTO", "SE", 
			"ENTAO", "SENAO", "FUNCR", "FUNSR", "ES", "ABLOCO", "FBLOCO", "TIPO", 
			"APAREN", "FPAREN", "RETORNA", "NUM", "ID", "TEXTO", "SEP", "ATR", "DELIM", 
			"A", "WS"
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


	public AickuniLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Aickuni.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 27:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u001a\u014b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002]\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u008b\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0096\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a7\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00f0\b\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0106\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0003\u0014\u0115\b\u0014\u0001\u0014\u0004\u0014"+
		"\u0118\b\u0014\u000b\u0014\f\u0014\u0119\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u011e\b\u0014\n\u0014\f\u0014\u0121\t\u0014\u0003\u0014\u0123\b"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0128\b\u0015\n"+
		"\u0015\f\u0015\u012b\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0004\u0016\u0131\b\u0016\u000b\u0016\f\u0016\u0132\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0004\u001b\u0146\b\u001b"+
		"\u000b\u001b\f\u001b\u0147\u0001\u001b\u0001\u001b\u0000\u0000\u001c\u0001"+
		"\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005"+
		"\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d"+
		"\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015/\u0016"+
		"1\u00173\u00185\u00197\u001a\u0001\u0000\u0004\u0003\u0000  AZaz\u0001"+
		"\u000009\u0001\u0000az\u0003\u0000\t\n\r\r  \u0164\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00019\u0001\u0000\u0000"+
		"\u0000\u0003;\u0001\u0000\u0000\u0000\u0005\\\u0001\u0000\u0000\u0000"+
		"\u0007\u008a\u0001\u0000\u0000\u0000\t\u0095\u0001\u0000\u0000\u0000\u000b"+
		"\u00a6\u0001\u0000\u0000\u0000\r\u00a8\u0001\u0000\u0000\u0000\u000f\u00ad"+
		"\u0001\u0000\u0000\u0000\u0011\u00b6\u0001\u0000\u0000\u0000\u0013\u00b9"+
		"\u0001\u0000\u0000\u0000\u0015\u00bf\u0001\u0000\u0000\u0000\u0017\u00c5"+
		"\u0001\u0000\u0000\u0000\u0019\u00d3\u0001\u0000\u0000\u0000\u001b\u00ef"+
		"\u0001\u0000\u0000\u0000\u001d\u00f1\u0001\u0000\u0000\u0000\u001f\u00f3"+
		"\u0001\u0000\u0000\u0000!\u0105\u0001\u0000\u0000\u0000#\u0107\u0001\u0000"+
		"\u0000\u0000%\u0109\u0001\u0000\u0000\u0000\'\u010b\u0001\u0000\u0000"+
		"\u0000)\u0114\u0001\u0000\u0000\u0000+\u0124\u0001\u0000\u0000\u0000-"+
		"\u012c\u0001\u0000\u0000\u0000/\u0136\u0001\u0000\u0000\u00001\u0138\u0001"+
		"\u0000\u0000\u00003\u0140\u0001\u0000\u0000\u00005\u0142\u0001\u0000\u0000"+
		"\u00007\u0145\u0001\u0000\u0000\u00009:\u0007\u0000\u0000\u0000:\u0002"+
		"\u0001\u0000\u0000\u0000;<\u0007\u0001\u0000\u0000<\u0004\u0001\u0000"+
		"\u0000\u0000=>\u0005M\u0000\u0000>?\u0005A\u0000\u0000?@\u0005I\u0000"+
		"\u0000@]\u0005S\u0000\u0000AB\u0005M\u0000\u0000BC\u0005E\u0000\u0000"+
		"CD\u0005N\u0000\u0000DE\u0005O\u0000\u0000E]\u0005S\u0000\u0000FG\u0005"+
		"M\u0000\u0000GH\u0005U\u0000\u0000HI\u0005L\u0000\u0000I]\u0005T\u0000"+
		"\u0000JK\u0005D\u0000\u0000KL\u0005I\u0000\u0000LM\u0005V\u0000\u0000"+
		"MN\u0005R\u0000\u0000NO\u0005E\u0000\u0000OP\u0005A\u0000\u0000P]\u0005"+
		"L\u0000\u0000QR\u0005D\u0000\u0000RS\u0005I\u0000\u0000ST\u0005V\u0000"+
		"\u0000TU\u0005I\u0000\u0000UV\u0005N\u0000\u0000V]\u0005T\u0000\u0000"+
		"WX\u0005R\u0000\u0000XY\u0005E\u0000\u0000YZ\u0005S\u0000\u0000Z[\u0005"+
		"T\u0000\u0000[]\u0005O\u0000\u0000\\=\u0001\u0000\u0000\u0000\\A\u0001"+
		"\u0000\u0000\u0000\\F\u0001\u0000\u0000\u0000\\J\u0001\u0000\u0000\u0000"+
		"\\Q\u0001\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000]\u0006\u0001\u0000"+
		"\u0000\u0000^_\u0005I\u0000\u0000_`\u0005G\u0000\u0000`a\u0005U\u0000"+
		"\u0000ab\u0005A\u0000\u0000b\u008b\u0005L\u0000\u0000cd\u0005M\u0000\u0000"+
		"de\u0005E\u0000\u0000ef\u0005N\u0000\u0000fg\u0005O\u0000\u0000g\u008b"+
		"\u0005R\u0000\u0000hi\u0005M\u0000\u0000ij\u0005E\u0000\u0000jk\u0005"+
		"N\u0000\u0000kl\u0005O\u0000\u0000lm\u0005R\u0000\u0000mn\u0005I\u0000"+
		"\u0000no\u0005G\u0000\u0000op\u0005U\u0000\u0000pq\u0005A\u0000\u0000"+
		"q\u008b\u0005L\u0000\u0000rs\u0005M\u0000\u0000st\u0005A\u0000\u0000t"+
		"u\u0005I\u0000\u0000uv\u0005O\u0000\u0000v\u008b\u0005R\u0000\u0000wx"+
		"\u0005M\u0000\u0000xy\u0005A\u0000\u0000yz\u0005I\u0000\u0000z{\u0005"+
		"O\u0000\u0000{|\u0005R\u0000\u0000|}\u0005I\u0000\u0000}~\u0005G\u0000"+
		"\u0000~\u007f\u0005U\u0000\u0000\u007f\u0080\u0005A\u0000\u0000\u0080"+
		"\u008b\u0005L\u0000\u0000\u0081\u0082\u0005D\u0000\u0000\u0082\u0083\u0005"+
		"I\u0000\u0000\u0083\u0084\u0005F\u0000\u0000\u0084\u0085\u0005E\u0000"+
		"\u0000\u0085\u0086\u0005R\u0000\u0000\u0086\u0087\u0005E\u0000\u0000\u0087"+
		"\u0088\u0005N\u0000\u0000\u0088\u0089\u0005T\u0000\u0000\u0089\u008b\u0005"+
		"E\u0000\u0000\u008a^\u0001\u0000\u0000\u0000\u008ac\u0001\u0000\u0000"+
		"\u0000\u008ah\u0001\u0000\u0000\u0000\u008ar\u0001\u0000\u0000\u0000\u008a"+
		"w\u0001\u0000\u0000\u0000\u008a\u0081\u0001\u0000\u0000\u0000\u008b\b"+
		"\u0001\u0000\u0000\u0000\u008c\u0096\u0005E\u0000\u0000\u008d\u008e\u0005"+
		"O\u0000\u0000\u008e\u0096\u0005U\u0000\u0000\u008f\u0090\u0005O\u0000"+
		"\u0000\u0090\u0091\u0005U\u0000\u0000\u0091\u0096\u0005X\u0000\u0000\u0092"+
		"\u0093\u0005N\u0000\u0000\u0093\u0094\u0005A\u0000\u0000\u0094\u0096\u0005"+
		"O\u0000\u0000\u0095\u008c\u0001\u0000\u0000\u0000\u0095\u008d\u0001\u0000"+
		"\u0000\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0092\u0001\u0000"+
		"\u0000\u0000\u0096\n\u0001\u0000\u0000\u0000\u0097\u0098\u0005V\u0000"+
		"\u0000\u0098\u0099\u0005E\u0000\u0000\u0099\u009a\u0005R\u0000\u0000\u009a"+
		"\u009b\u0005D\u0000\u0000\u009b\u009c\u0005A\u0000\u0000\u009c\u009d\u0005"+
		"D\u0000\u0000\u009d\u009e\u0005E\u0000\u0000\u009e\u009f\u0005I\u0000"+
		"\u0000\u009f\u00a0\u0005R\u0000\u0000\u00a0\u00a7\u0005O\u0000\u0000\u00a1"+
		"\u00a2\u0005F\u0000\u0000\u00a2\u00a3\u0005A\u0000\u0000\u00a3\u00a4\u0005"+
		"L\u0000\u0000\u00a4\u00a5\u0005S\u0000\u0000\u00a5\u00a7\u0005O\u0000"+
		"\u0000\u00a6\u0097\u0001\u0000\u0000\u0000\u00a6\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a7\f\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005P\u0000\u0000"+
		"\u00a9\u00aa\u0005A\u0000\u0000\u00aa\u00ab\u0005R\u0000\u0000\u00ab\u00ac"+
		"\u0005A\u0000\u0000\u00ac\u000e\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"E\u0000\u0000\u00ae\u00af\u0005N\u0000\u0000\u00af\u00b0\u0005Q\u0000"+
		"\u0000\u00b0\u00b1\u0005U\u0000\u0000\u00b1\u00b2\u0005A\u0000\u0000\u00b2"+
		"\u00b3\u0005N\u0000\u0000\u00b3\u00b4\u0005T\u0000\u0000\u00b4\u00b5\u0005"+
		"O\u0000\u0000\u00b5\u0010\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005S\u0000"+
		"\u0000\u00b7\u00b8\u0005E\u0000\u0000\u00b8\u0012\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0005E\u0000\u0000\u00ba\u00bb\u0005N\u0000\u0000\u00bb\u00bc"+
		"\u0005T\u0000\u0000\u00bc\u00bd\u0005A\u0000\u0000\u00bd\u00be\u0005O"+
		"\u0000\u0000\u00be\u0014\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005S\u0000"+
		"\u0000\u00c0\u00c1\u0005E\u0000\u0000\u00c1\u00c2\u0005N\u0000\u0000\u00c2"+
		"\u00c3\u0005A\u0000\u0000\u00c3\u00c4\u0005O\u0000\u0000\u00c4\u0016\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005F\u0000\u0000\u00c6\u00c7\u0005U\u0000"+
		"\u0000\u00c7\u00c8\u0005N\u0000\u0000\u00c8\u00c9\u0005C\u0000\u0000\u00c9"+
		"\u00ca\u0005A\u0000\u0000\u00ca\u00cb\u0005O\u0000\u0000\u00cb\u00cc\u0005"+
		"R\u0000\u0000\u00cc\u00cd\u0005E\u0000\u0000\u00cd\u00ce\u0005T\u0000"+
		"\u0000\u00ce\u00cf\u0005O\u0000\u0000\u00cf\u00d0\u0005R\u0000\u0000\u00d0"+
		"\u00d1\u0005N\u0000\u0000\u00d1\u00d2\u0005O\u0000\u0000\u00d2\u0018\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005F\u0000\u0000\u00d4\u00d5\u0005U\u0000"+
		"\u0000\u00d5\u00d6\u0005N\u0000\u0000\u00d6\u00d7\u0005C\u0000\u0000\u00d7"+
		"\u00d8\u0005A\u0000\u0000\u00d8\u00d9\u0005O\u0000\u0000\u00d9\u00da\u0005"+
		"S\u0000\u0000\u00da\u00db\u0005E\u0000\u0000\u00db\u00dc\u0005M\u0000"+
		"\u0000\u00dc\u00dd\u0005R\u0000\u0000\u00dd\u00de\u0005E\u0000\u0000\u00de"+
		"\u00df\u0005T\u0000\u0000\u00df\u00e0\u0005O\u0000\u0000\u00e0\u00e1\u0005"+
		"R\u0000\u0000\u00e1\u00e2\u0005N\u0000\u0000\u00e2\u00e3\u0005O\u0000"+
		"\u0000\u00e3\u001a\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005L\u0000\u0000"+
		"\u00e5\u00e6\u0005E\u0000\u0000\u00e6\u00f0\u0005R\u0000\u0000\u00e7\u00e8"+
		"\u0005E\u0000\u0000\u00e8\u00e9\u0005S\u0000\u0000\u00e9\u00ea\u0005C"+
		"\u0000\u0000\u00ea\u00eb\u0005R\u0000\u0000\u00eb\u00ec\u0005E\u0000\u0000"+
		"\u00ec\u00ed\u0005V\u0000\u0000\u00ed\u00ee\u0005E\u0000\u0000\u00ee\u00f0"+
		"\u0005R\u0000\u0000\u00ef\u00e4\u0001\u0000\u0000\u0000\u00ef\u00e7\u0001"+
		"\u0000\u0000\u0000\u00f0\u001c\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"{\u0000\u0000\u00f2\u001e\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005}\u0000"+
		"\u0000\u00f4 \u0001\u0000\u0000\u0000\u00f5\u00f6\u0005R\u0000\u0000\u00f6"+
		"\u00f7\u0005E\u0000\u0000\u00f7\u00f8\u0005A\u0000\u0000\u00f8\u0106\u0005"+
		"L\u0000\u0000\u00f9\u00fa\u0005I\u0000\u0000\u00fa\u00fb\u0005N\u0000"+
		"\u0000\u00fb\u0106\u0005T\u0000\u0000\u00fc\u00fd\u0005T\u0000\u0000\u00fd"+
		"\u00fe\u0005E\u0000\u0000\u00fe\u00ff\u0005X\u0000\u0000\u00ff\u0100\u0005"+
		"T\u0000\u0000\u0100\u0106\u0005O\u0000\u0000\u0101\u0102\u0005B\u0000"+
		"\u0000\u0102\u0103\u0005O\u0000\u0000\u0103\u0104\u0005O\u0000\u0000\u0104"+
		"\u0106\u0005L\u0000\u0000\u0105\u00f5\u0001\u0000\u0000\u0000\u0105\u00f9"+
		"\u0001\u0000\u0000\u0000\u0105\u00fc\u0001\u0000\u0000\u0000\u0105\u0101"+
		"\u0001\u0000\u0000\u0000\u0106\"\u0001\u0000\u0000\u0000\u0107\u0108\u0005"+
		"(\u0000\u0000\u0108$\u0001\u0000\u0000\u0000\u0109\u010a\u0005)\u0000"+
		"\u0000\u010a&\u0001\u0000\u0000\u0000\u010b\u010c\u0005R\u0000\u0000\u010c"+
		"\u010d\u0005E\u0000\u0000\u010d\u010e\u0005T\u0000\u0000\u010e\u010f\u0005"+
		"O\u0000\u0000\u010f\u0110\u0005R\u0000\u0000\u0110\u0111\u0005N\u0000"+
		"\u0000\u0111\u0112\u0005A\u0000\u0000\u0112(\u0001\u0000\u0000\u0000\u0113"+
		"\u0115\u0005-\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0118"+
		"\u0003\u0003\u0001\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u0122\u0001\u0000\u0000\u0000\u011b\u011f"+
		"\u0005.\u0000\u0000\u011c\u011e\u0003\u0003\u0001\u0000\u011d\u011c\u0001"+
		"\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0123\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u011b\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123*\u0001\u0000"+
		"\u0000\u0000\u0124\u0129\u0007\u0002\u0000\u0000\u0125\u0128\u0003\u0001"+
		"\u0000\u0000\u0126\u0128\u0003\u0003\u0001\u0000\u0127\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a,\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012c\u0130\u0005\"\u0000\u0000\u012d\u0131\u0003\u0001\u0000\u0000"+
		"\u012e\u0131\u0003\u0003\u0001\u0000\u012f\u0131\u00037\u001b\u0000\u0130"+
		"\u012d\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0005\"\u0000\u0000\u0135."+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0005,\u0000\u0000\u01370\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0005A\u0000\u0000\u0139\u013a\u0005T\u0000\u0000"+
		"\u013a\u013b\u0005R\u0000\u0000\u013b\u013c\u0005I\u0000\u0000\u013c\u013d"+
		"\u0005B\u0000\u0000\u013d\u013e\u0005U\u0000\u0000\u013e\u013f\u0005I"+
		"\u0000\u0000\u013f2\u0001\u0000\u0000\u0000\u0140\u0141\u0005;\u0000\u0000"+
		"\u01414\u0001\u0000\u0000\u0000\u0142\u0143\u0005A\u0000\u0000\u01436"+
		"\u0001\u0000\u0000\u0000\u0144\u0146\u0007\u0003\u0000\u0000\u0145\u0144"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0145"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0006\u001b\u0000\u0000\u014a8\u0001"+
		"\u0000\u0000\u0000\u0010\u0000\\\u008a\u0095\u00a6\u00ef\u0105\u0114\u0119"+
		"\u011f\u0122\u0127\u0129\u0130\u0132\u0147\u0001\u0001\u001b\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}