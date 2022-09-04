// Generated from Aickuni.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AickuniParser}.
 */
public interface AickuniListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AickuniParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AickuniParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AickuniParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AickuniParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AickuniParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(AickuniParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AickuniParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(AickuniParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AickuniParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(AickuniParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AickuniParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(AickuniParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AickuniParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(AickuniParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AickuniParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(AickuniParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AickuniParser#entradasaida}.
	 * @param ctx the parse tree
	 */
	void enterEntradasaida(AickuniParser.EntradasaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AickuniParser#entradasaida}.
	 * @param ctx the parse tree
	 */
	void exitEntradasaida(AickuniParser.EntradasaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AickuniParser#exprarit}.
	 * @param ctx the parse tree
	 */
	void enterExprarit(AickuniParser.ExpraritContext ctx);
	/**
	 * Exit a parse tree produced by {@link AickuniParser#exprarit}.
	 * @param ctx the parse tree
	 */
	void exitExprarit(AickuniParser.ExpraritContext ctx);
	/**
	 * Enter a parse tree produced by {@link AickuniParser#exprlogi}.
	 * @param ctx the parse tree
	 */
	void enterExprlogi(AickuniParser.ExprlogiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AickuniParser#exprlogi}.
	 * @param ctx the parse tree
	 */
	void exitExprlogi(AickuniParser.ExprlogiContext ctx);
	/**
	 * Enter a parse tree produced by {@link AickuniParser#exprcomp}.
	 * @param ctx the parse tree
	 */
	void enterExprcomp(AickuniParser.ExprcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link AickuniParser#exprcomp}.
	 * @param ctx the parse tree
	 */
	void exitExprcomp(AickuniParser.ExprcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link AickuniParser#exprcond}.
	 * @param ctx the parse tree
	 */
	void enterExprcond(AickuniParser.ExprcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link AickuniParser#exprcond}.
	 * @param ctx the parse tree
	 */
	void exitExprcond(AickuniParser.ExprcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link AickuniParser#exprrepe}.
	 * @param ctx the parse tree
	 */
	void enterExprrepe(AickuniParser.ExprrepeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AickuniParser#exprrepe}.
	 * @param ctx the parse tree
	 */
	void exitExprrepe(AickuniParser.ExprrepeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AickuniParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(AickuniParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AickuniParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(AickuniParser.FuncaoContext ctx);
}