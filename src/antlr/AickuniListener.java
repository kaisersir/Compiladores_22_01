// Generated from src/antlr/Aickuni.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AickuniParser}.
 */
public interface AickuniListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NPrograma}
	 * labeled alternative in {@link AickuniParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterNPrograma(AickuniParser.NProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NPrograma}
	 * labeled alternative in {@link AickuniParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitNPrograma(AickuniParser.NProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NComando}
	 * labeled alternative in {@link AickuniParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterNComando(AickuniParser.NComandoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NComando}
	 * labeled alternative in {@link AickuniParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitNComando(AickuniParser.NComandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link AickuniParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracao(AickuniParser.NDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link AickuniParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracao(AickuniParser.NDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link AickuniParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(AickuniParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link AickuniParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(AickuniParser.NAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NLer}
	 * labeled alternative in {@link AickuniParser#ler}.
	 * @param ctx the parse tree
	 */
	void enterNLer(AickuniParser.NLerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NLer}
	 * labeled alternative in {@link AickuniParser#ler}.
	 * @param ctx the parse tree
	 */
	void exitNLer(AickuniParser.NLerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEscrever}
	 * labeled alternative in {@link AickuniParser#escrever}.
	 * @param ctx the parse tree
	 */
	void enterNEscrever(AickuniParser.NEscreverContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEscrever}
	 * labeled alternative in {@link AickuniParser#escrever}.
	 * @param ctx the parse tree
	 */
	void exitNEscrever(AickuniParser.NEscreverContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExprArit}
	 * labeled alternative in {@link AickuniParser#exprarit}.
	 * @param ctx the parse tree
	 */
	void enterNExprArit(AickuniParser.NExprAritContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExprArit}
	 * labeled alternative in {@link AickuniParser#exprarit}.
	 * @param ctx the parse tree
	 */
	void exitNExprArit(AickuniParser.NExprAritContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExprLogi}
	 * labeled alternative in {@link AickuniParser#exprlogi}.
	 * @param ctx the parse tree
	 */
	void enterNExprLogi(AickuniParser.NExprLogiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExprLogi}
	 * labeled alternative in {@link AickuniParser#exprlogi}.
	 * @param ctx the parse tree
	 */
	void exitNExprLogi(AickuniParser.NExprLogiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExprComp}
	 * labeled alternative in {@link AickuniParser#exprcomp}.
	 * @param ctx the parse tree
	 */
	void enterNExprComp(AickuniParser.NExprCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExprComp}
	 * labeled alternative in {@link AickuniParser#exprcomp}.
	 * @param ctx the parse tree
	 */
	void exitNExprComp(AickuniParser.NExprCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExprCond}
	 * labeled alternative in {@link AickuniParser#exprcond}.
	 * @param ctx the parse tree
	 */
	void enterNExprCond(AickuniParser.NExprCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExprCond}
	 * labeled alternative in {@link AickuniParser#exprcond}.
	 * @param ctx the parse tree
	 */
	void exitNExprCond(AickuniParser.NExprCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExprRepe}
	 * labeled alternative in {@link AickuniParser#exprrepe}.
	 * @param ctx the parse tree
	 */
	void enterNExprRepe(AickuniParser.NExprRepeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExprRepe}
	 * labeled alternative in {@link AickuniParser#exprrepe}.
	 * @param ctx the parse tree
	 */
	void exitNExprRepe(AickuniParser.NExprRepeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NFuncaor}
	 * labeled alternative in {@link AickuniParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterNFuncaor(AickuniParser.NFuncaorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NFuncaor}
	 * labeled alternative in {@link AickuniParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitNFuncaor(AickuniParser.NFuncaorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NFuncao}
	 * labeled alternative in {@link AickuniParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterNFuncao(AickuniParser.NFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NFuncao}
	 * labeled alternative in {@link AickuniParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitNFuncao(AickuniParser.NFuncaoContext ctx);
}