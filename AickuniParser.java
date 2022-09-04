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
		SENAO=9, FUNC=10, ES=11, ABLOCO=12, FBLOCO=13, TIPO=14, APAREN=15, FPAREN=16, 
		RETORNA=17, NUM=18, ID=19, TEXTO=20, SEP=21, ATR=22, DELIM=23, A=24, WS=25;
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
			"'SENAO'", null, null, "'{'", "'}'", null, "'('", "')'", "'RETORNA'", 
			null, null, null, "','", "'ATRIBUI'", "';'", "'A'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPARIT", "OPREL", "OPBOOL", "BOOL", "PARA", "ENQUANTO", "SE", 
			"ENTAO", "SENAO", "FUNC", "ES", "ABLOCO", "FBLOCO", "TIPO", "APAREN", 
			"FPAREN", "RETORNA", "NUM", "ID", "TEXTO", "SEP", "ATR", "DELIM", "A", 
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				comando();
				setState(23);
				match(DELIM);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENQUANTO) | (1L << SE) | (1L << FUNC) | (1L << ES) | (1L << TIPO) | (1L << ATR))) != 0) );
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ES:
			case TIPO:
			case ATR:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TIPO) {
					{
					{
					setState(29);
					declaracao();
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ES:
					{
					setState(35);
					entradasaida();
					}
					break;
				case ATR:
					{
					setState(36);
					atribuicao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(39);
				match(DELIM);
				}
				break;
			case ENQUANTO:
			case SE:
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SE:
					{
					setState(41);
					exprcond();
					}
					break;
				case ENQUANTO:
					{
					setState(42);
					exprrepe();
					}
					break;
				case FUNC:
					{
					setState(43);
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
			setState(48);
			match(TIPO);
			setState(49);
			match(WS);
			setState(50);
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
			setState(52);
			match(ATR);
			setState(53);
			match(WS);
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(54);
				match(NUM);
				}
				break;
			case 2:
				{
				setState(55);
				match(TEXTO);
				}
				break;
			case 3:
				{
				setState(56);
				exprarit();
				}
				break;
			case 4:
				{
				setState(57);
				exprlogi();
				}
				break;
			case 5:
				{
				setState(58);
				exprcomp();
				}
				break;
			}
			setState(61);
			match(A);
			setState(62);
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
			setState(64);
			match(ES);
			setState(65);
			match(WS);
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(66);
				match(ID);
				}
				break;
			case 2:
				{
				setState(67);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(68);
				match(TEXTO);
				}
				break;
			case 4:
				{
				setState(69);
				exprarit();
				}
				break;
			case 5:
				{
				setState(70);
				exprlogi();
				}
				break;
			case 6:
				{
				setState(71);
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
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			match(OPARIT);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(79);
				match(WS);
				}
			}

			setState(82);
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
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			match(OPBOOL);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(89);
				match(WS);
				}
			}

			setState(92);
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
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			match(OPREL);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(99);
				match(WS);
				}
			}

			setState(102);
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
			setState(104);
			match(SE);
			setState(105);
			match(WS);
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(106);
				exprlogi();
				}
				break;
			case 2:
				{
				setState(107);
				exprcomp();
				}
				break;
			}
			setState(110);
			match(WS);
			setState(111);
			match(ENTAO);
			setState(112);
			match(WS);
			setState(113);
			comando();
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					match(WS);
					setState(115);
					match(SENAO);
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(116);
						exprcond();
						}
						break;
					case 2:
						{
						setState(122);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(117);
								comando();
								setState(118);
								match(DELIM);
								}
								} 
							}
							setState(124);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						}
						}
						break;
					}
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			setState(132);
			match(ENQUANTO);
			setState(133);
			match(WS);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(134);
				exprcomp();
				}
				break;
			case 2:
				{
				setState(135);
				exprlogi();
				}
				break;
			}
			setState(138);
			match(WS);
			setState(139);
			match(ABLOCO);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENQUANTO) | (1L << SE) | (1L << FUNC) | (1L << ES) | (1L << TIPO) | (1L << ATR))) != 0)) {
				{
				{
				setState(140);
				comando();
				setState(141);
				match(DELIM);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
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
		public TerminalNode FUNC() { return getToken(AickuniParser.FUNC, 0); }
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(FUNC);
				setState(151);
				match(WS);
				setState(152);
				match(TIPO);
				setState(153);
				match(WS);
				setState(154);
				match(WS);
				setState(155);
				match(TEXTO);
				setState(156);
				match(APAREN);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTO) {
					{
					{
					setState(157);
					match(TEXTO);
					setState(158);
					match(SEP);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(FPAREN);
				setState(165);
				match(WS);
				setState(166);
				match(ABLOCO);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENQUANTO) | (1L << SE) | (1L << FUNC) | (1L << ES) | (1L << TIPO) | (1L << ATR))) != 0)) {
					{
					{
					setState(167);
					comando();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(RETORNA);
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(174);
					match(ID);
					}
					break;
				case 2:
					{
					setState(175);
					match(NUM);
					}
					break;
				case 3:
					{
					setState(176);
					match(BOOL);
					}
					break;
				case 4:
					{
					setState(177);
					match(TEXTO);
					}
					break;
				case 5:
					{
					setState(178);
					exprarit();
					}
					break;
				case 6:
					{
					setState(179);
					exprlogi();
					}
					break;
				case 7:
					{
					setState(180);
					exprcomp();
					}
					break;
				}
				setState(183);
				match(FBLOCO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(FUNC);
				setState(185);
				match(WS);
				setState(186);
				match(TEXTO);
				setState(187);
				match(APAREN);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTO) {
					{
					{
					setState(188);
					match(TEXTO);
					setState(189);
					match(SEP);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(FPAREN);
				setState(196);
				match(WS);
				setState(197);
				match(ABLOCO);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENQUANTO) | (1L << SE) | (1L << FUNC) | (1L << ES) | (1L << TIPO) | (1L << ATR))) != 0)) {
					{
					{
					setState(198);
					comando();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(FBLOCO);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00d0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0004\u0000\u001a\b\u0000\u000b\u0000\f\u0000\u001b\u0001"+
		"\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001-\b\u0001\u0003\u0001/\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003<\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004I\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005M\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005Q\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006W\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"[\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"a\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007e\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bm\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\by\b"+
		"\b\n\b\f\b|\t\b\u0003\b~\b\b\u0005\b\u0080\b\b\n\b\f\b\u0083\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0089\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0090\b\t\n\t\f\t\u0093\t\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00a0\b\n\n\n\f\n\u00a3\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n"+
		"\u00a9\b\n\n\n\f\n\u00ac\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00b6\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00bf\b\n\n\n\f\n\u00c2\t\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u00c8\b\n\n\n\f\n\u00cb\t\n\u0001\n\u0003\n\u00ce"+
		"\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0000\u0002\u0001\u0000\u0012\u0013\u0002\u0000\u0004\u0004"+
		"\u0013\u0013\u00ea\u0000\u0019\u0001\u0000\u0000\u0000\u0002.\u0001\u0000"+
		"\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000"+
		"\b@\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fT\u0001\u0000"+
		"\u0000\u0000\u000e^\u0001\u0000\u0000\u0000\u0010h\u0001\u0000\u0000\u0000"+
		"\u0012\u0084\u0001\u0000\u0000\u0000\u0014\u00cd\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018\u0005\u0017\u0000\u0000"+
		"\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0016\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u0001\u0001\u0000\u0000\u0000"+
		"\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!%\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"#&\u0003\b\u0004\u0000$&\u0003\u0006\u0003\u0000%#\u0001\u0000\u0000\u0000"+
		"%$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0005\u0017\u0000"+
		"\u0000(/\u0001\u0000\u0000\u0000)-\u0003\u0010\b\u0000*-\u0003\u0012\t"+
		"\u0000+-\u0003\u0014\n\u0000,)\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000,+\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000. \u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000/\u0003\u0001\u0000\u0000\u0000"+
		"01\u0005\u000e\u0000\u000012\u0005\u0019\u0000\u000023\u0005\u0013\u0000"+
		"\u00003\u0005\u0001\u0000\u0000\u000045\u0005\u0016\u0000\u00005;\u0005"+
		"\u0019\u0000\u00006<\u0005\u0012\u0000\u00007<\u0005\u0014\u0000\u0000"+
		"8<\u0003\n\u0005\u00009<\u0003\f\u0006\u0000:<\u0003\u000e\u0007\u0000"+
		";6\u0001\u0000\u0000\u0000;7\u0001\u0000\u0000\u0000;8\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=>\u0005\u0018\u0000\u0000>?\u0005\u0013\u0000\u0000?\u0007"+
		"\u0001\u0000\u0000\u0000@A\u0005\u000b\u0000\u0000AH\u0005\u0019\u0000"+
		"\u0000BI\u0005\u0013\u0000\u0000CI\u0005\u0012\u0000\u0000DI\u0005\u0014"+
		"\u0000\u0000EI\u0003\n\u0005\u0000FI\u0003\f\u0006\u0000GI\u0003\u000e"+
		"\u0007\u0000HB\u0001\u0000\u0000\u0000HC\u0001\u0000\u0000\u0000HD\u0001"+
		"\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"HG\u0001\u0000\u0000\u0000I\t\u0001\u0000\u0000\u0000JL\u0007\u0000\u0000"+
		"\u0000KM\u0005\u0019\u0000\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0005\u0001\u0000\u0000OQ\u0005"+
		"\u0019\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RS\u0007\u0000\u0000\u0000S\u000b\u0001\u0000"+
		"\u0000\u0000TV\u0007\u0001\u0000\u0000UW\u0005\u0019\u0000\u0000VU\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XZ\u0005\u0003\u0000\u0000Y[\u0005\u0019\u0000\u0000ZY\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0007\u0001"+
		"\u0000\u0000]\r\u0001\u0000\u0000\u0000^`\u0007\u0000\u0000\u0000_a\u0005"+
		"\u0019\u0000\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bd\u0005\u0002\u0000\u0000ce\u0005\u0019\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fg\u0007\u0000\u0000\u0000g\u000f\u0001\u0000\u0000\u0000"+
		"hi\u0005\u0007\u0000\u0000il\u0005\u0019\u0000\u0000jm\u0003\f\u0006\u0000"+
		"km\u0003\u000e\u0007\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000no\u0005\u0019\u0000\u0000op\u0005\b\u0000"+
		"\u0000pq\u0005\u0019\u0000\u0000q\u0081\u0003\u0002\u0001\u0000rs\u0005"+
		"\u0019\u0000\u0000s}\u0005\t\u0000\u0000t~\u0003\u0010\b\u0000uv\u0003"+
		"\u0002\u0001\u0000vw\u0005\u0017\u0000\u0000wy\u0001\u0000\u0000\u0000"+
		"xu\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000}t\u0001\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000~\u0080"+
		"\u0001\u0000\u0000\u0000\u007fr\u0001\u0000\u0000\u0000\u0080\u0083\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0011\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005\u0006\u0000\u0000\u0085\u0088\u0005"+
		"\u0019\u0000\u0000\u0086\u0089\u0003\u000e\u0007\u0000\u0087\u0089\u0003"+
		"\f\u0006\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0019"+
		"\u0000\u0000\u008b\u0091\u0005\f\u0000\u0000\u008c\u008d\u0003\u0002\u0001"+
		"\u0000\u008d\u008e\u0005\u0017\u0000\u0000\u008e\u0090\u0001\u0000\u0000"+
		"\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\r\u0000\u0000\u0095\u0013\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005\n\u0000\u0000\u0097\u0098\u0005\u0019\u0000\u0000\u0098"+
		"\u0099\u0005\u000e\u0000\u0000\u0099\u009a\u0005\u0019\u0000\u0000\u009a"+
		"\u009b\u0005\u0019\u0000\u0000\u009b\u009c\u0005\u0014\u0000\u0000\u009c"+
		"\u00a1\u0005\u000f\u0000\u0000\u009d\u009e\u0005\u0014\u0000\u0000\u009e"+
		"\u00a0\u0005\u0015\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0010\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0019\u0000\u0000\u00a6\u00aa\u0005\f\u0000\u0000\u00a7\u00a9"+
		"\u0003\u0002\u0001\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00ac"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ad\u00b5\u0005\u0011\u0000\u0000\u00ae\u00b6"+
		"\u0005\u0013\u0000\u0000\u00af\u00b6\u0005\u0012\u0000\u0000\u00b0\u00b6"+
		"\u0005\u0004\u0000\u0000\u00b1\u00b6\u0005\u0014\u0000\u0000\u00b2\u00b6"+
		"\u0003\n\u0005\u0000\u00b3\u00b6\u0003\f\u0006\u0000\u00b4\u00b6\u0003"+
		"\u000e\u0007\u0000\u00b5\u00ae\u0001\u0000\u0000\u0000\u00b5\u00af\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00ce\u0005\r\u0000\u0000\u00b8\u00b9\u0005\n"+
		"\u0000\u0000\u00b9\u00ba\u0005\u0019\u0000\u0000\u00ba\u00bb\u0005\u0014"+
		"\u0000\u0000\u00bb\u00c0\u0005\u000f\u0000\u0000\u00bc\u00bd\u0005\u0014"+
		"\u0000\u0000\u00bd\u00bf\u0005\u0015\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0010"+
		"\u0000\u0000\u00c4\u00c5\u0005\u0019\u0000\u0000\u00c5\u00c9\u0005\f\u0000"+
		"\u0000\u00c6\u00c8\u0003\u0002\u0001\u0000\u00c7\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005\r\u0000\u0000"+
		"\u00cd\u0096\u0001\u0000\u0000\u0000\u00cd\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ce\u0015\u0001\u0000\u0000\u0000\u0019\u001b %,.;HLPVZ`dlz}\u0081"+
		"\u0088\u0091\u00a1\u00aa\u00b5\u00c0\u00c9\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}