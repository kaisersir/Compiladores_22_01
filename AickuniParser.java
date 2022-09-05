// Generated from Aickuni.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AickuniParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPARIT=1, OPREL=2, OPBOOL=3, BOOL=4, PARA=5, ENQUANTO=6, SE=7, ENTAO=8, 
		SENAO=9, FUNCR=10, FUNSR=11, ES=12, ABLOCO=13, FBLOCO=14, TIPO=15, APAREN=16, 
		FPAREN=17, RETORNA=18, NUM=19, ID=20, TEXTO=21, SEP=22, ATR=23, DELIM=24, 
		A=25, WS=26, FUNCSR=27;
	public static final int
		RULE_programa = 0, RULE_comando = 1, RULE_declaracao = 2, RULE_atribuicao = 3, 
		RULE_entradasaida = 4, RULE_exprarit = 5, RULE_exprlogi = 6, RULE_exprcomp = 7, 
		RULE_exprcond = 8, RULE_exprrepe = 9, RULE_funcao = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comando", "declaracao", "atribuicao", "entradasaida", "exprarit", 
			"exprlogi", "exprcomp", "exprcond", "exprrepe", "funcao"
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
			"A", "WS", "FUNCSR"
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
	public String getGrammarFileName() { return "Aickuni.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AickuniParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(AickuniParser.DELIM, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(22);
			comando();
			setState(23);
			match(DELIM);
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

	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(AickuniParser.DELIM, 0); }
		public EntradasaidaContext entradasaida() {
			return getRuleContext(EntradasaidaContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public ExprcondContext exprcond() {
			return getRuleContext(ExprcondContext.class,0);
		}
		public ExprrepeContext exprrepe() {
			return getRuleContext(ExprrepeContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ES:
			case TIPO:
			case ATR:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TIPO) {
					{
					{
					setState(25);
					declaracao();
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ES:
					{
					setState(31);
					entradasaida();
					}
					break;
				case ATR:
					{
					setState(32);
					atribuicao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(35);
				match(DELIM);
				}
				break;
			case ENQUANTO:
			case SE:
			case FUNCR:
			case FUNCSR:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SE:
					{
					setState(37);
					exprcond();
					}
					break;
				case ENQUANTO:
					{
					setState(38);
					exprrepe();
					}
					break;
				case FUNCR:
				case FUNCSR:
					{
					setState(39);
					funcao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(AickuniParser.TIPO, 0); }
		public TerminalNode WS() { return getToken(AickuniParser.WS, 0); }
		public TerminalNode ID() { return getToken(AickuniParser.ID, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(TIPO);
			setState(45);
			match(WS);
			setState(46);
			match(ID);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ATR() { return getToken(AickuniParser.ATR, 0); }
		public TerminalNode WS() { return getToken(AickuniParser.WS, 0); }
		public TerminalNode A() { return getToken(AickuniParser.A, 0); }
		public TerminalNode ID() { return getToken(AickuniParser.ID, 0); }
		public TerminalNode NUM() { return getToken(AickuniParser.NUM, 0); }
		public TerminalNode TEXTO() { return getToken(AickuniParser.TEXTO, 0); }
		public ExpraritContext exprarit() {
			return getRuleContext(ExpraritContext.class,0);
		}
		public ExprlogiContext exprlogi() {
			return getRuleContext(ExprlogiContext.class,0);
		}
		public ExprcompContext exprcomp() {
			return getRuleContext(ExprcompContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ATR);
			setState(49);
			match(WS);
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(50);
				match(NUM);
				}
				break;
			case 2:
				{
				setState(51);
				match(TEXTO);
				}
				break;
			case 3:
				{
				setState(52);
				exprarit();
				}
				break;
			case 4:
				{
				setState(53);
				exprlogi();
				}
				break;
			case 5:
				{
				setState(54);
				exprcomp();
				}
				break;
			}
			setState(57);
			match(A);
			setState(58);
			match(ID);
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

	public static class EntradasaidaContext extends ParserRuleContext {
		public TerminalNode ES() { return getToken(AickuniParser.ES, 0); }
		public TerminalNode WS() { return getToken(AickuniParser.WS, 0); }
		public TerminalNode ID() { return getToken(AickuniParser.ID, 0); }
		public TerminalNode NUM() { return getToken(AickuniParser.NUM, 0); }
		public TerminalNode TEXTO() { return getToken(AickuniParser.TEXTO, 0); }
		public ExpraritContext exprarit() {
			return getRuleContext(ExpraritContext.class,0);
		}
		public ExprlogiContext exprlogi() {
			return getRuleContext(ExprlogiContext.class,0);
		}
		public ExprcompContext exprcomp() {
			return getRuleContext(ExprcompContext.class,0);
		}
		public EntradasaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entradasaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterEntradasaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitEntradasaida(this);
		}
	}

	public final EntradasaidaContext entradasaida() throws RecognitionException {
		EntradasaidaContext _localctx = new EntradasaidaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entradasaida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ES);
			setState(61);
			match(WS);
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(62);
				match(ID);
				}
				break;
			case 2:
				{
				setState(63);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(64);
				match(TEXTO);
				}
				break;
			case 4:
				{
				setState(65);
				exprarit();
				}
				break;
			case 5:
				{
				setState(66);
				exprlogi();
				}
				break;
			case 6:
				{
				setState(67);
				exprcomp();
				}
				break;
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

	public static class ExpraritContext extends ParserRuleContext {
		public TerminalNode OPARIT() { return getToken(AickuniParser.OPARIT, 0); }
		public List<TerminalNode> ID() { return getTokens(AickuniParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AickuniParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(AickuniParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(AickuniParser.NUM, i);
		}
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
		}
		public ExpraritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprarit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterExprarit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitExprarit(this);
		}
	}

	public final ExpraritContext exprarit() throws RecognitionException {
		ExpraritContext _localctx = new ExpraritContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprarit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(71);
				match(WS);
				}
			}

			setState(74);
			match(OPARIT);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(75);
				match(WS);
				}
			}

			setState(78);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
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

	public static class ExprlogiContext extends ParserRuleContext {
		public TerminalNode OPBOOL() { return getToken(AickuniParser.OPBOOL, 0); }
		public List<TerminalNode> ID() { return getTokens(AickuniParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AickuniParser.ID, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(AickuniParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(AickuniParser.BOOL, i);
		}
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
		}
		public ExprlogiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlogi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterExprlogi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitExprlogi(this);
		}
	}

	public final ExprlogiContext exprlogi() throws RecognitionException {
		ExprlogiContext _localctx = new ExprlogiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprlogi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(81);
				match(WS);
				}
			}

			setState(84);
			match(OPBOOL);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(85);
				match(WS);
				}
			}

			setState(88);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==ID) ) {
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

	public static class ExprcompContext extends ParserRuleContext {
		public TerminalNode OPREL() { return getToken(AickuniParser.OPREL, 0); }
		public List<TerminalNode> ID() { return getTokens(AickuniParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AickuniParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(AickuniParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(AickuniParser.NUM, i);
		}
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
		}
		public ExprcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterExprcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitExprcomp(this);
		}
	}

	public final ExprcompContext exprcomp() throws RecognitionException {
		ExprcompContext _localctx = new ExprcompContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprcomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(91);
				match(WS);
				}
			}

			setState(94);
			match(OPREL);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(95);
				match(WS);
				}
			}

			setState(98);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
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

	public static class ExprcondContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(AickuniParser.SE, 0); }
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
		}
		public TerminalNode ENTAO() { return getToken(AickuniParser.ENTAO, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ExprlogiContext exprlogi() {
			return getRuleContext(ExprlogiContext.class,0);
		}
		public ExprcompContext exprcomp() {
			return getRuleContext(ExprcompContext.class,0);
		}
		public List<TerminalNode> SENAO() { return getTokens(AickuniParser.SENAO); }
		public TerminalNode SENAO(int i) {
			return getToken(AickuniParser.SENAO, i);
		}
		public List<ExprcondContext> exprcond() {
			return getRuleContexts(ExprcondContext.class);
		}
		public ExprcondContext exprcond(int i) {
			return getRuleContext(ExprcondContext.class,i);
		}
		public List<TerminalNode> DELIM() { return getTokens(AickuniParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(AickuniParser.DELIM, i);
		}
		public ExprcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterExprcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitExprcond(this);
		}
	}

	public final ExprcondContext exprcond() throws RecognitionException {
		ExprcondContext _localctx = new ExprcondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprcond);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(SE);
			setState(101);
			match(WS);
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(102);
				exprlogi();
				}
				break;
			case 2:
				{
				setState(103);
				exprcomp();
				}
				break;
			}
			setState(106);
			match(WS);
			setState(107);
			match(ENTAO);
			setState(108);
			match(WS);
			setState(109);
			comando();
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					match(WS);
					setState(111);
					match(SENAO);
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(112);
						exprcond();
						}
						break;
					case 2:
						{
						setState(118);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(113);
								comando();
								setState(114);
								match(DELIM);
								}
								} 
							}
							setState(120);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
						}
						}
						break;
					}
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ExprrepeContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(AickuniParser.ENQUANTO, 0); }
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
		}
		public TerminalNode ABLOCO() { return getToken(AickuniParser.ABLOCO, 0); }
		public TerminalNode FBLOCO() { return getToken(AickuniParser.FBLOCO, 0); }
		public ExprcompContext exprcomp() {
			return getRuleContext(ExprcompContext.class,0);
		}
		public ExprlogiContext exprlogi() {
			return getRuleContext(ExprlogiContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> DELIM() { return getTokens(AickuniParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(AickuniParser.DELIM, i);
		}
		public ExprrepeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprrepe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterExprrepe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitExprrepe(this);
		}
	}

	public final ExprrepeContext exprrepe() throws RecognitionException {
		ExprrepeContext _localctx = new ExprrepeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprrepe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ENQUANTO);
			setState(129);
			match(WS);
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(130);
				exprcomp();
				}
				break;
			case 2:
				{
				setState(131);
				exprlogi();
				}
				break;
			}
			setState(134);
			match(WS);
			setState(135);
			match(ABLOCO);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENQUANTO) | (1L << SE) | (1L << FUNCR) | (1L << ES) | (1L << TIPO) | (1L << ATR) | (1L << FUNCSR))) != 0)) {
				{
				{
				setState(136);
				comando();
				setState(137);
				match(DELIM);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(FBLOCO);
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

	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode FUNCR() { return getToken(AickuniParser.FUNCR, 0); }
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
		}
		public TerminalNode TIPO() { return getToken(AickuniParser.TIPO, 0); }
		public List<TerminalNode> TEXTO() { return getTokens(AickuniParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(AickuniParser.TEXTO, i);
		}
		public TerminalNode APAREN() { return getToken(AickuniParser.APAREN, 0); }
		public TerminalNode FPAREN() { return getToken(AickuniParser.FPAREN, 0); }
		public TerminalNode ABLOCO() { return getToken(AickuniParser.ABLOCO, 0); }
		public TerminalNode RETORNA() { return getToken(AickuniParser.RETORNA, 0); }
		public TerminalNode FBLOCO() { return getToken(AickuniParser.FBLOCO, 0); }
		public TerminalNode ID() { return getToken(AickuniParser.ID, 0); }
		public TerminalNode NUM() { return getToken(AickuniParser.NUM, 0); }
		public TerminalNode BOOL() { return getToken(AickuniParser.BOOL, 0); }
		public ExpraritContext exprarit() {
			return getRuleContext(ExpraritContext.class,0);
		}
		public ExprlogiContext exprlogi() {
			return getRuleContext(ExprlogiContext.class,0);
		}
		public ExprcompContext exprcomp() {
			return getRuleContext(ExprcompContext.class,0);
		}
		public List<TerminalNode> SEP() { return getTokens(AickuniParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(AickuniParser.SEP, i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode FUNCSR() { return getToken(AickuniParser.FUNCSR, 0); }
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcao);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(FUNCR);
				setState(147);
				match(WS);
				setState(148);
				match(TIPO);
				setState(149);
				match(WS);
				setState(150);
				match(WS);
				setState(151);
				match(TEXTO);
				setState(152);
				match(APAREN);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTO) {
					{
					{
					setState(153);
					match(TEXTO);
					setState(154);
					match(SEP);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(FPAREN);
				setState(161);
				match(WS);
				setState(162);
				match(ABLOCO);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENQUANTO) | (1L << SE) | (1L << FUNCR) | (1L << ES) | (1L << TIPO) | (1L << ATR) | (1L << FUNCSR))) != 0)) {
					{
					{
					setState(163);
					comando();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(RETORNA);
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(170);
					match(ID);
					}
					break;
				case 2:
					{
					setState(171);
					match(NUM);
					}
					break;
				case 3:
					{
					setState(172);
					match(BOOL);
					}
					break;
				case 4:
					{
					setState(173);
					match(TEXTO);
					}
					break;
				case 5:
					{
					setState(174);
					exprarit();
					}
					break;
				case 6:
					{
					setState(175);
					exprlogi();
					}
					break;
				case 7:
					{
					setState(176);
					exprcomp();
					}
					break;
				}
				setState(179);
				match(FBLOCO);
				}
				break;
			case FUNCSR:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(FUNCSR);
				setState(181);
				match(WS);
				setState(182);
				match(TEXTO);
				setState(183);
				match(APAREN);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTO) {
					{
					{
					setState(184);
					match(TEXTO);
					setState(185);
					match(SEP);
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(FPAREN);
				setState(192);
				match(WS);
				setState(193);
				match(ABLOCO);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENQUANTO) | (1L << SE) | (1L << FUNCR) | (1L << ES) | (1L << TIPO) | (1L << ATR) | (1L << FUNCSR))) != 0)) {
					{
					{
					setState(194);
					comando();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(FBLOCO);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u00cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u0001\u001b\b\u0001\n\u0001\f\u0001\u001e"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0003"+
		"\u0001+\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00038\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004E\b\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005I\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005M\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006S\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006W\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007]\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"a\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bi\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\bu\b\b\n\b\f\bx\t\b\u0003\bz\b\b\u0005\b|\b\b"+
		"\n\b\f\b\u007f\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0085\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u008c\b\t\n\t\f\t\u008f\t\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u009c\b\n\n\n\f\n\u009f\t\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u00a5\b\n\n\n\f\n\u00a8\t\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b2\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00bb\b\n\n\n\f\n\u00be"+
		"\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00c4\b\n\n\n\f\n\u00c7\t"+
		"\n\u0001\n\u0003\n\u00ca\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0002\u0001\u0000\u0013\u0014"+
		"\u0002\u0000\u0004\u0004\u0014\u0014\u00e5\u0000\u0016\u0001\u0000\u0000"+
		"\u0000\u0002*\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u0006"+
		"0\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000"+
		"\u0000\fP\u0001\u0000\u0000\u0000\u000eZ\u0001\u0000\u0000\u0000\u0010"+
		"d\u0001\u0000\u0000\u0000\u0012\u0080\u0001\u0000\u0000\u0000\u0014\u00c9"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018"+
		"\u0005\u0018\u0000\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001b"+
		"\u0003\u0004\u0002\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001e"+
		"\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0001\u0000\u0000\u0000\u001d!\u0001\u0000\u0000\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001f\"\u0003\b\u0004\u0000 \"\u0003\u0006\u0003\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#$\u0005\u0018\u0000\u0000$+\u0001\u0000\u0000\u0000%)\u0003"+
		"\u0010\b\u0000&)\u0003\u0012\t\u0000\')\u0003\u0014\n\u0000(%\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)+\u0001"+
		"\u0000\u0000\u0000*\u001c\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000+\u0003\u0001\u0000\u0000\u0000,-\u0005\u000f\u0000\u0000-.\u0005"+
		"\u001a\u0000\u0000./\u0005\u0014\u0000\u0000/\u0005\u0001\u0000\u0000"+
		"\u000001\u0005\u0017\u0000\u000017\u0005\u001a\u0000\u000028\u0005\u0013"+
		"\u0000\u000038\u0005\u0015\u0000\u000048\u0003\n\u0005\u000058\u0003\f"+
		"\u0006\u000068\u0003\u000e\u0007\u000072\u0001\u0000\u0000\u000073\u0001"+
		"\u0000\u0000\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"76\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0005\u0019\u0000"+
		"\u0000:;\u0005\u0014\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<=\u0005"+
		"\f\u0000\u0000=D\u0005\u001a\u0000\u0000>E\u0005\u0014\u0000\u0000?E\u0005"+
		"\u0013\u0000\u0000@E\u0005\u0015\u0000\u0000AE\u0003\n\u0005\u0000BE\u0003"+
		"\f\u0006\u0000CE\u0003\u000e\u0007\u0000D>\u0001\u0000\u0000\u0000D?\u0001"+
		"\u0000\u0000\u0000D@\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000E\t\u0001\u0000\u0000"+
		"\u0000FH\u0007\u0000\u0000\u0000GI\u0005\u001a\u0000\u0000HG\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0005"+
		"\u0001\u0000\u0000KM\u0005\u001a\u0000\u0000LK\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0007\u0000\u0000"+
		"\u0000O\u000b\u0001\u0000\u0000\u0000PR\u0007\u0001\u0000\u0000QS\u0005"+
		"\u001a\u0000\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TV\u0005\u0003\u0000\u0000UW\u0005\u001a\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XY\u0007\u0001\u0000\u0000Y\r\u0001\u0000\u0000\u0000Z\\\u0007"+
		"\u0000\u0000\u0000[]\u0005\u001a\u0000\u0000\\[\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0005\u0002\u0000"+
		"\u0000_a\u0005\u001a\u0000\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0007\u0000\u0000\u0000c\u000f"+
		"\u0001\u0000\u0000\u0000de\u0005\u0007\u0000\u0000eh\u0005\u001a\u0000"+
		"\u0000fi\u0003\f\u0006\u0000gi\u0003\u000e\u0007\u0000hf\u0001\u0000\u0000"+
		"\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\u001a"+
		"\u0000\u0000kl\u0005\b\u0000\u0000lm\u0005\u001a\u0000\u0000m}\u0003\u0002"+
		"\u0001\u0000no\u0005\u001a\u0000\u0000oy\u0005\t\u0000\u0000pz\u0003\u0010"+
		"\b\u0000qr\u0003\u0002\u0001\u0000rs\u0005\u0018\u0000\u0000su\u0001\u0000"+
		"\u0000\u0000tq\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000yp\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{n\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u0011\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0006\u0000\u0000\u0081\u0084\u0005\u001a\u0000\u0000\u0082\u0085"+
		"\u0003\u000e\u0007\u0000\u0083\u0085\u0003\f\u0006\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\u001a\u0000\u0000\u0087\u008d\u0005"+
		"\r\u0000\u0000\u0088\u0089\u0003\u0002\u0001\u0000\u0089\u008a\u0005\u0018"+
		"\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000"+
		"\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u000e"+
		"\u0000\u0000\u0091\u0013\u0001\u0000\u0000\u0000\u0092\u0093\u0005\n\u0000"+
		"\u0000\u0093\u0094\u0005\u001a\u0000\u0000\u0094\u0095\u0005\u000f\u0000"+
		"\u0000\u0095\u0096\u0005\u001a\u0000\u0000\u0096\u0097\u0005\u001a\u0000"+
		"\u0000\u0097\u0098\u0005\u0015\u0000\u0000\u0098\u009d\u0005\u0010\u0000"+
		"\u0000\u0099\u009a\u0005\u0015\u0000\u0000\u009a\u009c\u0005\u0016\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005\u0011\u0000\u0000\u00a1\u00a2\u0005\u001a\u0000"+
		"\u0000\u00a2\u00a6\u0005\r\u0000\u0000\u00a3\u00a5\u0003\u0002\u0001\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a9\u00b1\u0005\u0012\u0000\u0000\u00aa\u00b2\u0005\u0014\u0000\u0000"+
		"\u00ab\u00b2\u0005\u0013\u0000\u0000\u00ac\u00b2\u0005\u0004\u0000\u0000"+
		"\u00ad\u00b2\u0005\u0015\u0000\u0000\u00ae\u00b2\u0003\n\u0005\u0000\u00af"+
		"\u00b2\u0003\f\u0006\u0000\u00b0\u00b2\u0003\u000e\u0007\u0000\u00b1\u00aa"+
		"\u0001\u0000\u0000\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00ca"+
		"\u0005\u000e\u0000\u0000\u00b4\u00b5\u0005\u001b\u0000\u0000\u00b5\u00b6"+
		"\u0005\u001a\u0000\u0000\u00b6\u00b7\u0005\u0015\u0000\u0000\u00b7\u00bc"+
		"\u0005\u0010\u0000\u0000\u00b8\u00b9\u0005\u0015\u0000\u0000\u00b9\u00bb"+
		"\u0005\u0016\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00be"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0011\u0000\u0000\u00c0\u00c1"+
		"\u0005\u001a\u0000\u0000\u00c1\u00c5\u0005\r\u0000\u0000\u00c2\u00c4\u0003"+
		"\u0002\u0001\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c8\u00ca\u0005\u000e\u0000\u0000\u00c9\u0092\u0001"+
		"\u0000\u0000\u0000\u00c9\u00b4\u0001\u0000\u0000\u0000\u00ca\u0015\u0001"+
		"\u0000\u0000\u0000\u0018\u001c!(*7DHLRV\\`hvy}\u0084\u008d\u009d\u00a6"+
		"\u00b1\u00bc\u00c5\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}