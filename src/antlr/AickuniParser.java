// Generated from src/antlr/Aickuni.g4 by ANTLR 4.10.1

    package antlr;

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
		SENAO=9, FUNCR=10, FUNSR=11, LER=12, ESCREVER=13, ABLOCO=14, FBLOCO=15, 
		TIPO=16, APAREN=17, FPAREN=18, RETORNA=19, NUM=20, ID=21, TEXTO=22, SEP=23, 
		ATR=24, DELIM=25, A=26, WS=27;
	public static final int
		RULE_programa = 0, RULE_comando = 1, RULE_declaracao = 2, RULE_atribuicao = 3, 
		RULE_ler = 4, RULE_escrever = 5, RULE_exprarit = 6, RULE_exprlogi = 7, 
		RULE_exprcomp = 8, RULE_exprcond = 9, RULE_exprrepe = 10, RULE_funcao = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comando", "declaracao", "atribuicao", "ler", "escrever", 
			"exprarit", "exprlogi", "exprcomp", "exprcond", "exprrepe", "funcao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'PARA'", "'ENQUANTO'", "'SE'", "'ENTAO'", 
			"'SENAO'", "'FUNCAORETORNO'", "'FUNCAOSEMRETORNO'", "'LER'", "'ESCREVER'", 
			"'{'", "'}'", null, "'('", "')'", "'RETORNA'", null, null, null, "','", 
			"'ATRIBUI'", "';'", "'A'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPARIT", "OPREL", "OPBOOL", "BOOL", "PARA", "ENQUANTO", "SE", 
			"ENTAO", "SENAO", "FUNCR", "FUNSR", "LER", "ESCREVER", "ABLOCO", "FBLOCO", 
			"TIPO", "APAREN", "FPAREN", "RETORNA", "NUM", "ID", "TEXTO", "SEP", "ATR", 
			"DELIM", "A", "WS"
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
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	 
		public ProgramaContext() { }
		public void copyFrom(ProgramaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NProgramaContext extends ProgramaContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(AickuniParser.DELIM, 0); }
		public NProgramaContext(ProgramaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterNPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitNPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			_localctx = new NProgramaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(24);
			comando();
			setState(25);
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
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NComandoContext extends ComandoContext {
		public List<TerminalNode> DELIM() { return getTokens(AickuniParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(AickuniParser.DELIM, i);
		}
		public List<ExprcondContext> exprcond() {
			return getRuleContexts(ExprcondContext.class);
		}
		public ExprcondContext exprcond(int i) {
			return getRuleContext(ExprcondContext.class,i);
		}
		public List<ExprrepeContext> exprrepe() {
			return getRuleContexts(ExprrepeContext.class);
		}
		public ExprrepeContext exprrepe(int i) {
			return getRuleContext(ExprrepeContext.class,i);
		}
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
		}
		public List<LerContext> ler() {
			return getRuleContexts(LerContext.class);
		}
		public LerContext ler(int i) {
			return getRuleContext(LerContext.class,i);
		}
		public List<EscreverContext> escrever() {
			return getRuleContexts(EscreverContext.class);
		}
		public EscreverContext escrever(int i) {
			return getRuleContext(EscreverContext.class,i);
		}
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public NComandoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterNComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitNComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		int _la;
		try {
			int _alt;
			_localctx = new NComandoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(73);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LER:
					case ESCREVER:
					case TIPO:
					case ATR:
					case DELIM:
						{
						setState(36);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==TIPO) {
							{
							{
							setState(27);
							declaracao();
							setState(31);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS) {
								{
								{
								setState(28);
								match(WS);
								}
								}
								setState(33);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(38);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(52);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LER) | (1L << ESCREVER) | (1L << ATR))) != 0)) {
							{
							{
							setState(42);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case LER:
								{
								setState(39);
								ler();
								}
								break;
							case ESCREVER:
								{
								setState(40);
								escrever();
								}
								break;
							case ATR:
								{
								setState(41);
								atribuicao();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(47);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS) {
								{
								{
								setState(44);
								match(WS);
								}
								}
								setState(49);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(54);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(55);
						match(DELIM);
						setState(59);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(56);
								match(WS);
								}
								} 
							}
							setState(61);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
						}
						}
						break;
					case ENQUANTO:
					case SE:
					case FUNCR:
					case FUNSR:
						{
						setState(65);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SE:
							{
							setState(62);
							exprcond();
							}
							break;
						case ENQUANTO:
							{
							setState(63);
							exprrepe();
							}
							break;
						case FUNCR:
						case FUNSR:
							{
							setState(64);
							funcao();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(70);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(67);
								match(WS);
								}
								} 
							}
							setState(72);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						}
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
				setState(75); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NDeclaracaoContext extends DeclaracaoContext {
		public TerminalNode TIPO() { return getToken(AickuniParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(AickuniParser.ID, 0); }
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
		}
		public NDeclaracaoContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterNDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitNDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		int _la;
		try {
			_localctx = new NDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(TIPO);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(78);
				match(WS);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	 
		public AtribuicaoContext() { }
		public void copyFrom(AtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NAtribuicaoContext extends AtribuicaoContext {
		public TerminalNode ATR() { return getToken(AickuniParser.ATR, 0); }
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
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
		}
		public NAtribuicaoContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterNAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitNAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atribuicao);
		int _la;
		try {
			int _alt;
			_localctx = new NAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ATR);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(87);
				match(WS);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(93);
				match(NUM);
				}
				break;
			case 2:
				{
				setState(94);
				match(TEXTO);
				}
				break;
			case 3:
				{
				setState(95);
				exprarit();
				}
				break;
			case 4:
				{
				setState(96);
				exprlogi();
				}
				break;
			case 5:
				{
				setState(97);
				exprcomp();
				}
				break;
			}
			setState(100);
			match(A);
			setState(101);
			match(ID);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					match(WS);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class LerContext extends ParserRuleContext {
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
	 
		public LerContext() { }
		public void copyFrom(LerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NLerContext extends LerContext {
		public TerminalNode LER() { return getToken(AickuniParser.LER, 0); }
		public TerminalNode ID() { return getToken(AickuniParser.ID, 0); }
		public TerminalNode NUM() { return getToken(AickuniParser.NUM, 0); }
		public TerminalNode TEXTO() { return getToken(AickuniParser.TEXTO, 0); }
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
		}
		public NLerContext(LerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterNLer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitNLer(this);
		}
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ler);
		int _la;
		try {
			_localctx = new NLerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(LER);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(109);
				match(WS);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << ID) | (1L << TEXTO))) != 0)) ) {
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

	public static class EscreverContext extends ParserRuleContext {
		public EscreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrever; }
	 
		public EscreverContext() { }
		public void copyFrom(EscreverContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NEscreverContext extends EscreverContext {
		public TerminalNode ESCREVER() { return getToken(AickuniParser.ESCREVER, 0); }
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
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
		}
		public NEscreverContext(EscreverContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterNEscrever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitNEscrever(this);
		}
	}

	public final EscreverContext escrever() throws RecognitionException {
		EscreverContext _localctx = new EscreverContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_escrever);
		int _la;
		try {
			_localctx = new NEscreverContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ESCREVER);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(118);
				match(WS);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(124);
				match(ID);
				}
				break;
			case 2:
				{
				setState(125);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(126);
				match(TEXTO);
				}
				break;
			case 4:
				{
				setState(127);
				exprarit();
				}
				break;
			case 5:
				{
				setState(128);
				exprlogi();
				}
				break;
			case 6:
				{
				setState(129);
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
		public ExpraritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprarit; }
	 
		public ExpraritContext() { }
		public void copyFrom(ExpraritContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NExprAritContext extends ExpraritContext {
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
		public NExprAritContext(ExpraritContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterNExprArit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitNExprArit(this);
		}
	}

	public final ExpraritContext exprarit() throws RecognitionException {
		ExpraritContext _localctx = new ExpraritContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprarit);
		int _la;
		try {
			int _alt;
			_localctx = new NExprAritContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(133);
				match(WS);
				}
			}

			setState(136);
			match(OPARIT);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(137);
				match(WS);
				}
			}

			setState(140);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					match(WS);
					}
					} 
				}
				setState(146);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ExprlogiContext extends ParserRuleContext {
		public ExprlogiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlogi; }
	 
		public ExprlogiContext() { }
		public void copyFrom(ExprlogiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NExprLogiContext extends ExprlogiContext {
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
		public NExprLogiContext(ExprlogiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterNExprLogi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitNExprLogi(this);
		}
	}

	public final ExprlogiContext exprlogi() throws RecognitionException {
		ExprlogiContext _localctx = new ExprlogiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprlogi);
		int _la;
		try {
			int _alt;
			_localctx = new NExprLogiContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(148);
				match(WS);
				}
			}

			setState(151);
			match(OPBOOL);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(152);
				match(WS);
				}
			}

			setState(155);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(156);
					match(WS);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public ExprcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprcomp; }
	 
		public ExprcompContext() { }
		public void copyFrom(ExprcompContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NExprCompContext extends ExprcompContext {
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
		public NExprCompContext(ExprcompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterNExprComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitNExprComp(this);
		}
	}

	public final ExprcompContext exprcomp() throws RecognitionException {
		ExprcompContext _localctx = new ExprcompContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprcomp);
		int _la;
		try {
			int _alt;
			_localctx = new NExprCompContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(163);
				match(WS);
				}
			}

			setState(166);
			match(OPREL);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(167);
				match(WS);
				}
			}

			setState(170);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					match(WS);
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public ExprcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprcond; }
	 
		public ExprcondContext() { }
		public void copyFrom(ExprcondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NExprCondContext extends ExprcondContext {
		public TerminalNode SE() { return getToken(AickuniParser.SE, 0); }
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
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
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
		public NExprCondContext(ExprcondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterNExprCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitNExprCond(this);
		}
	}

	public final ExprcondContext exprcond() throws RecognitionException {
		ExprcondContext _localctx = new ExprcondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprcond);
		int _la;
		try {
			int _alt;
			_localctx = new NExprCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(SE);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(178);
				match(WS);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(184);
				exprlogi();
				}
				break;
			case 2:
				{
				setState(185);
				exprcomp();
				}
				break;
			}
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(188);
				match(WS);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(ENTAO);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(195);
				match(WS);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			comando();
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(202);
						match(WS);
						}
						}
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(208);
					match(SENAO);
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(209);
						exprcond();
						}
						break;
					case 2:
						{
						setState(215);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(210);
								comando();
								setState(211);
								match(DELIM);
								}
								} 
							}
							setState(217);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
						}
						}
						break;
					}
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(WS);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public ExprrepeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprrepe; }
	 
		public ExprrepeContext() { }
		public void copyFrom(ExprrepeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NExprRepeContext extends ExprrepeContext {
		public TerminalNode ENQUANTO() { return getToken(AickuniParser.ENQUANTO, 0); }
		public TerminalNode ABLOCO() { return getToken(AickuniParser.ABLOCO, 0); }
		public TerminalNode FBLOCO() { return getToken(AickuniParser.FBLOCO, 0); }
		public ExprcompContext exprcomp() {
			return getRuleContext(ExprcompContext.class,0);
		}
		public ExprlogiContext exprlogi() {
			return getRuleContext(ExprlogiContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
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
		public NExprRepeContext(ExprrepeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterNExprRepe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitNExprRepe(this);
		}
	}

	public final ExprrepeContext exprrepe() throws RecognitionException {
		ExprrepeContext _localctx = new ExprrepeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprrepe);
		int _la;
		try {
			int _alt;
			_localctx = new NExprRepeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ENQUANTO);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(232);
				match(WS);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(238);
				exprcomp();
				}
				break;
			case 2:
				{
				setState(239);
				exprlogi();
				}
				break;
			}
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(242);
				match(WS);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(ABLOCO);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENQUANTO) | (1L << SE) | (1L << FUNCR) | (1L << FUNSR) | (1L << LER) | (1L << ESCREVER) | (1L << TIPO) | (1L << ATR) | (1L << DELIM))) != 0)) {
				{
				{
				setState(249);
				comando();
				setState(250);
				match(DELIM);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(FBLOCO);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258);
					match(WS);
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class FuncaoContext extends ParserRuleContext {
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	 
		public FuncaoContext() { }
		public void copyFrom(FuncaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NFuncaorContext extends FuncaoContext {
		public TerminalNode FUNCR() { return getToken(AickuniParser.FUNCR, 0); }
		public List<TerminalNode> TIPO() { return getTokens(AickuniParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(AickuniParser.TIPO, i);
		}
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
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(AickuniParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(AickuniParser.SEP, i);
		}
		public NFuncaorContext(FuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterNFuncaor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitNFuncaor(this);
		}
	}
	public static class NFuncaoContext extends FuncaoContext {
		public TerminalNode FUNSR() { return getToken(AickuniParser.FUNSR, 0); }
		public List<TerminalNode> WS() { return getTokens(AickuniParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AickuniParser.WS, i);
		}
		public List<TerminalNode> TEXTO() { return getTokens(AickuniParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(AickuniParser.TEXTO, i);
		}
		public TerminalNode APAREN() { return getToken(AickuniParser.APAREN, 0); }
		public TerminalNode FPAREN() { return getToken(AickuniParser.FPAREN, 0); }
		public TerminalNode ABLOCO() { return getToken(AickuniParser.ABLOCO, 0); }
		public TerminalNode FBLOCO() { return getToken(AickuniParser.FBLOCO, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> TIPO() { return getTokens(AickuniParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(AickuniParser.TIPO, i);
		}
		public List<TerminalNode> SEP() { return getTokens(AickuniParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(AickuniParser.SEP, i);
		}
		public NFuncaoContext(FuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).enterNFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AickuniListener ) ((AickuniListener)listener).exitNFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcao);
		int _la;
		try {
			int _alt;
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCR:
				_localctx = new NFuncaorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(FUNCR);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(265);
					match(WS);
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
				match(TIPO);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(272);
					match(WS);
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
				match(TEXTO);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(279);
					match(WS);
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(APAREN);
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(286);
						match(WS);
						}
						} 
					}
					setState(291);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				{
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(292);
						match(TIPO);
						setState(293);
						match(TEXTO);
						setState(294);
						match(SEP);
						}
						} 
					}
					setState(299);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIPO) {
					{
					setState(300);
					match(TIPO);
					setState(301);
					match(TEXTO);
					}
				}

				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(304);
					match(WS);
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(310);
				match(FPAREN);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(311);
					match(WS);
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
				match(ABLOCO);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENQUANTO) | (1L << SE) | (1L << FUNCR) | (1L << FUNSR) | (1L << LER) | (1L << ESCREVER) | (1L << TIPO) | (1L << ATR) | (1L << DELIM))) != 0)) {
					{
					{
					setState(318);
					comando();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(RETORNA);
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(325);
					match(ID);
					}
					break;
				case 2:
					{
					setState(326);
					match(NUM);
					}
					break;
				case 3:
					{
					setState(327);
					match(BOOL);
					}
					break;
				case 4:
					{
					setState(328);
					match(TEXTO);
					}
					break;
				case 5:
					{
					setState(329);
					exprarit();
					}
					break;
				case 6:
					{
					setState(330);
					exprlogi();
					}
					break;
				case 7:
					{
					setState(331);
					exprcomp();
					}
					break;
				}
				setState(334);
				match(FBLOCO);
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(335);
						match(WS);
						}
						} 
					}
					setState(340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				}
				break;
			case FUNSR:
				_localctx = new NFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(FUNSR);
				setState(342);
				match(WS);
				setState(343);
				match(TEXTO);
				setState(344);
				match(APAREN);
				{
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(345);
						match(TIPO);
						setState(346);
						match(TEXTO);
						setState(347);
						match(SEP);
						}
						} 
					}
					setState(352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIPO) {
					{
					setState(353);
					match(TIPO);
					setState(354);
					match(TEXTO);
					}
				}

				}
				setState(357);
				match(FPAREN);
				setState(358);
				match(WS);
				setState(359);
				match(ABLOCO);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENQUANTO) | (1L << SE) | (1L << FUNCR) | (1L << FUNSR) | (1L << LER) | (1L << ESCREVER) | (1L << TIPO) | (1L << ATR) | (1L << DELIM))) != 0)) {
					{
					{
					setState(360);
					comando();
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
				match(FBLOCO);
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(367);
						match(WS);
						}
						} 
					}
					setState(372);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u0178\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0005\u0001#\b\u0001\n\u0001\f"+
		"\u0001&\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001"+
		"\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0005\u0001"+
		"3\b\u0001\n\u0001\f\u00016\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		":\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001B\b\u0001\u0001\u0001\u0005\u0001E\b\u0001\n\u0001\f\u0001"+
		"H\t\u0001\u0004\u0001J\b\u0001\u000b\u0001\f\u0001K\u0001\u0002\u0001"+
		"\u0002\u0005\u0002P\b\u0002\n\u0002\f\u0002S\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0005\u0003Y\b\u0003\n\u0003\f\u0003\\"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003c\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003h\b\u0003"+
		"\n\u0003\f\u0003k\t\u0003\u0001\u0004\u0001\u0004\u0005\u0004o\b\u0004"+
		"\n\u0004\f\u0004r\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0005\u0005x\b\u0005\n\u0005\f\u0005{\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0083\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0087\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u008b\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008f\b"+
		"\u0006\n\u0006\f\u0006\u0092\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0096\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009a\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u009e\b\u0007\n\u0007\f\u0007\u00a1\t\u0007"+
		"\u0001\b\u0001\b\u0003\b\u00a5\b\b\u0001\b\u0001\b\u0003\b\u00a9\b\b\u0001"+
		"\b\u0001\b\u0005\b\u00ad\b\b\n\b\f\b\u00b0\t\b\u0001\t\u0001\t\u0005\t"+
		"\u00b4\b\t\n\t\f\t\u00b7\t\t\u0001\t\u0001\t\u0003\t\u00bb\b\t\u0001\t"+
		"\u0005\t\u00be\b\t\n\t\f\t\u00c1\t\t\u0001\t\u0001\t\u0005\t\u00c5\b\t"+
		"\n\t\f\t\u00c8\t\t\u0001\t\u0001\t\u0005\t\u00cc\b\t\n\t\f\t\u00cf\t\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00d6\b\t\n\t\f\t\u00d9"+
		"\t\t\u0003\t\u00db\b\t\u0005\t\u00dd\b\t\n\t\f\t\u00e0\t\t\u0001\t\u0005"+
		"\t\u00e3\b\t\n\t\f\t\u00e6\t\t\u0001\n\u0001\n\u0005\n\u00ea\b\n\n\n\f"+
		"\n\u00ed\t\n\u0001\n\u0001\n\u0003\n\u00f1\b\n\u0001\n\u0005\n\u00f4\b"+
		"\n\n\n\f\n\u00f7\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00fd\b\n"+
		"\n\n\f\n\u0100\t\n\u0001\n\u0001\n\u0005\n\u0104\b\n\n\n\f\n\u0107\t\n"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u010b\b\u000b\n\u000b\f\u000b\u010e"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0112\b\u000b\n\u000b\f\u000b"+
		"\u0115\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0119\b\u000b\n\u000b"+
		"\f\u000b\u011c\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0120\b\u000b"+
		"\n\u000b\f\u000b\u0123\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0128\b\u000b\n\u000b\f\u000b\u012b\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u012f\b\u000b\u0001\u000b\u0005\u000b\u0132\b\u000b\n\u000b"+
		"\f\u000b\u0135\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0139\b\u000b"+
		"\n\u000b\f\u000b\u013c\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0140"+
		"\b\u000b\n\u000b\f\u000b\u0143\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u014d\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0151\b\u000b\n\u000b"+
		"\f\u000b\u0154\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u015d\b\u000b\n\u000b"+
		"\f\u000b\u0160\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0164\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u016a\b\u000b"+
		"\n\u000b\f\u000b\u016d\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0171"+
		"\b\u000b\n\u000b\f\u000b\u0174\t\u000b\u0003\u000b\u0176\b\u000b\u0001"+
		"\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0000\u0003\u0001\u0000\u0014\u0016\u0001\u0000\u0014\u0015\u0002"+
		"\u0000\u0004\u0004\u0015\u0015\u01b1\u0000\u0018\u0001\u0000\u0000\u0000"+
		"\u0002I\u0001\u0000\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006V"+
		"\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000"+
		"\u0000\f\u0084\u0001\u0000\u0000\u0000\u000e\u0093\u0001\u0000\u0000\u0000"+
		"\u0010\u00a2\u0001\u0000\u0000\u0000\u0012\u00b1\u0001\u0000\u0000\u0000"+
		"\u0014\u00e7\u0001\u0000\u0000\u0000\u0016\u0175\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u001a\u0005\u0019\u0000\u0000"+
		"\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001f\u0003\u0004\u0002\u0000"+
		"\u001c\u001e\u0005\u001b\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000\"\u001b\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000"+
		"$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%4\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000\'+\u0003\b\u0004\u0000(+\u0003\n\u0005"+
		"\u0000)+\u0003\u0006\u0003\u0000*\'\u0001\u0000\u0000\u0000*(\u0001\u0000"+
		"\u0000\u0000*)\u0001\u0000\u0000\u0000+/\u0001\u0000\u0000\u0000,.\u0005"+
		"\u001b\u0000\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000003\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u00002*\u0001\u0000\u0000\u000036\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u00007;\u0005\u0019\u0000\u0000"+
		"8:\u0005\u001b\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<J\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000>B\u0003\u0012\t\u0000?B\u0003\u0014"+
		"\n\u0000@B\u0003\u0016\u000b\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000A@\u0001\u0000\u0000\u0000BF\u0001\u0000\u0000\u0000CE\u0005"+
		"\u001b\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000I$\u0001\u0000\u0000\u0000IA\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000L\u0003\u0001\u0000\u0000\u0000MQ\u0005\u0010\u0000"+
		"\u0000NP\u0005\u001b\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005\u0015\u0000\u0000"+
		"U\u0005\u0001\u0000\u0000\u0000VZ\u0005\u0018\u0000\u0000WY\u0005\u001b"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[b\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000]c\u0005\u0014\u0000\u0000^c\u0005\u0016\u0000"+
		"\u0000_c\u0003\f\u0006\u0000`c\u0003\u000e\u0007\u0000ac\u0003\u0010\b"+
		"\u0000b]\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000b_\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000de\u0005\u001a\u0000\u0000ei\u0005\u0015\u0000\u0000"+
		"fh\u0005\u001b\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0007\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lp\u0005\f\u0000\u0000mo\u0005"+
		"\u001b\u0000\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000st\u0007\u0000\u0000\u0000t\t\u0001\u0000"+
		"\u0000\u0000uy\u0005\r\u0000\u0000vx\u0005\u001b\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z\u0082\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000|\u0083\u0005\u0015\u0000\u0000}\u0083\u0005\u0014\u0000\u0000~"+
		"\u0083\u0005\u0016\u0000\u0000\u007f\u0083\u0003\f\u0006\u0000\u0080\u0083"+
		"\u0003\u000e\u0007\u0000\u0081\u0083\u0003\u0010\b\u0000\u0082|\u0001"+
		"\u0000\u0000\u0000\u0082}\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000"+
		"\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u000b\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0007\u0001\u0000\u0000\u0085\u0087\u0005\u001b\u0000"+
		"\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0005\u0001\u0000"+
		"\u0000\u0089\u008b\u0005\u001b\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u0090\u0007\u0001\u0000\u0000\u008d\u008f\u0005\u001b\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\r\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0095\u0007\u0002\u0000\u0000\u0094\u0096\u0005\u001b\u0000\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0005\u0003\u0000\u0000"+
		"\u0098\u009a\u0005\u001b\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u009f\u0007\u0002\u0000\u0000\u009c\u009e\u0005\u001b\u0000\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u000f\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a4\u0007\u0001\u0000\u0000\u00a3\u00a5\u0005\u001b\u0000\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u0002\u0000\u0000"+
		"\u00a7\u00a9\u0005\u001b\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ae\u0007\u0001\u0000\u0000\u00ab\u00ad\u0005\u001b\u0000\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000"+
		"\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000"+
		"\u00af\u0011\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b5\u0005\u0007\u0000\u0000\u00b2\u00b4\u0005\u001b\u0000\u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00ba\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b8\u00bb\u0003\u000e\u0007\u0000\u00b9\u00bb\u0003\u0010\b\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bc\u00be\u0005\u001b\u0000\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c6\u0005\b\u0000\u0000\u00c3\u00c5\u0005\u001b\u0000\u0000\u00c4\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00de"+
		"\u0003\u0002\u0001\u0000\u00ca\u00cc\u0005\u001b\u0000\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0"+
		"\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00da"+
		"\u0005\t\u0000\u0000\u00d1\u00db\u0003\u0012\t\u0000\u00d2\u00d3\u0003"+
		"\u0002\u0001\u0000\u00d3\u00d4\u0005\u0019\u0000\u0000\u00d4\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d2\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00da\u00d1\u0001\u0000\u0000\u0000\u00da\u00d7\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e3\u0005"+
		"\u001b\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u0013\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e7\u00eb\u0005\u0006\u0000\u0000\u00e8\u00ea\u0005"+
		"\u001b\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00f0\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ee\u00f1\u0003\u0010\b\u0000\u00ef\u00f1\u0003\u000e"+
		"\u0007\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f5\u0001\u0000\u0000\u0000\u00f2\u00f4\u0005\u001b"+
		"\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fe\u0005\u000e\u0000\u0000\u00f9\u00fa\u0003\u0002"+
		"\u0001\u0000\u00fa\u00fb\u0005\u0019\u0000\u0000\u00fb\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0101\u0105\u0005\u000f\u0000\u0000\u0102\u0104\u0005\u001b"+
		"\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106\u0015\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0108\u010c\u0005\n\u0000\u0000\u0109\u010b\u0005\u001b\u0000"+
		"\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000"+
		"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000"+
		"\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010f\u0113\u0005\u0010\u0000\u0000\u0110\u0112\u0005\u001b\u0000"+
		"\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000"+
		"\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000"+
		"\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000"+
		"\u0000\u0116\u011a\u0005\u0016\u0000\u0000\u0117\u0119\u0005\u001b\u0000"+
		"\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000"+
		"\u0000\u011d\u0121\u0005\u0011\u0000\u0000\u011e\u0120\u0005\u001b\u0000"+
		"\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000"+
		"\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u0129\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0005\u0010\u0000\u0000\u0125\u0126\u0005\u0016\u0000"+
		"\u0000\u0126\u0128\u0005\u0017\u0000\u0000\u0127\u0124\u0001\u0000\u0000"+
		"\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012e\u0001\u0000\u0000"+
		"\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0010\u0000"+
		"\u0000\u012d\u012f\u0005\u0016\u0000\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0133\u0001\u0000\u0000"+
		"\u0000\u0130\u0132\u0005\u001b\u0000\u0000\u0131\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000"+
		"\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u013a\u0005\u0012\u0000"+
		"\u0000\u0137\u0139\u0005\u001b\u0000\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0001\u0000\u0000"+
		"\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u0141\u0005\u000e\u0000"+
		"\u0000\u013e\u0140\u0003\u0002\u0001\u0000\u013f\u013e\u0001\u0000\u0000"+
		"\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000"+
		"\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u014c\u0005\u0013\u0000"+
		"\u0000\u0145\u014d\u0005\u0015\u0000\u0000\u0146\u014d\u0005\u0014\u0000"+
		"\u0000\u0147\u014d\u0005\u0004\u0000\u0000\u0148\u014d\u0005\u0016\u0000"+
		"\u0000\u0149\u014d\u0003\f\u0006\u0000\u014a\u014d\u0003\u000e\u0007\u0000"+
		"\u014b\u014d\u0003\u0010\b\u0000\u014c\u0145\u0001\u0000\u0000\u0000\u014c"+
		"\u0146\u0001\u0000\u0000\u0000\u014c\u0147\u0001\u0000\u0000\u0000\u014c"+
		"\u0148\u0001\u0000\u0000\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014e\u0152\u0005\u000f\u0000\u0000\u014f"+
		"\u0151\u0005\u001b\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151"+
		"\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u0001\u0000\u0000\u0000\u0153\u0176\u0001\u0000\u0000\u0000\u0154"+
		"\u0152\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u000b\u0000\u0000\u0156"+
		"\u0157\u0005\u001b\u0000\u0000\u0157\u0158\u0005\u0016\u0000\u0000\u0158"+
		"\u015e\u0005\u0011\u0000\u0000\u0159\u015a\u0005\u0010\u0000\u0000\u015a"+
		"\u015b\u0005\u0016\u0000\u0000\u015b\u015d\u0005\u0017\u0000\u0000\u015c"+
		"\u0159\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e"+
		"\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f"+
		"\u0163\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0005\u0010\u0000\u0000\u0162\u0164\u0005\u0016\u0000\u0000\u0163"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0012\u0000\u0000\u0166"+
		"\u0167\u0005\u001b\u0000\u0000\u0167\u016b\u0005\u000e\u0000\u0000\u0168"+
		"\u016a\u0003\u0002\u0001\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a"+
		"\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d"+
		"\u016b\u0001\u0000\u0000\u0000\u016e\u0172\u0005\u000f\u0000\u0000\u016f"+
		"\u0171\u0005\u001b\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171"+
		"\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0175\u0108\u0001\u0000\u0000\u0000\u0175"+
		"\u0155\u0001\u0000\u0000\u0000\u0176\u0017\u0001\u0000\u0000\u00008\u001f"+
		"$*/4;AFIKQZbipy\u0082\u0086\u008a\u0090\u0095\u0099\u009f\u00a4\u00a8"+
		"\u00ae\u00b5\u00ba\u00bf\u00c6\u00cd\u00d7\u00da\u00de\u00e4\u00eb\u00f0"+
		"\u00f5\u00fe\u0105\u010c\u0113\u011a\u0121\u0129\u012e\u0133\u013a\u0141"+
		"\u014c\u0152\u015e\u0163\u016b\u0172\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}