import antlr.AickuniBaseListener;
import antlr.AickuniParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class MyListener extends AickuniBaseListener {

    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();
    private List<String> errors = new ArrayList<>();

    @Override
    public void enterPrograma(AickuniParser.ProgramaContext ctx) {
        System.out.println("No programa: "+ctx.getText());
    }

    @Override
    public void exitPrograma(AickuniParser.ProgramaContext ctx){
        String message = "";

        if (hasSemanticError()){
            message = "";
            for (String error : errors) {
                message += error + "\n";
            }
        }
        super.exitPrograma(ctx);
        throw new Error(message);
    }

    @Override
    public void enterDeclaracao(AickuniParser.DeclaracaoContext ctx) {
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();

        if (tabelaSimbolos.containsKey(id)){
            errors.add("Erro semantico linha" + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " Variavel já declarada!");
        } else {
            tabelaSimbolos.put(id,tipo);
        }
        super.enterDeclaracao(ctx);
    }

     @Override
    public void enterAtribuicao(AickuniParser.AtribuicaoContext ctx) {
        ParseTree valor = ctx.getChild(1);
        String id = ctx.getChild(3).getText();

        if (tabelaSimbolos.containsKey(id)){ // Variavel não declarada

            errors.add("Erro semantico linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " A variavel " + id + " não foi declarada!");
        } else { //Tipo
            String tipoId = tabelaSimbolos.get(id);
            String tipoValor;
            //noh filho
            if (valor.getChildCount() == 1){ 
                String valorTexto = valor.getChild(0).getText();
                tipoValor = getType(valorTexto);
                if (!tipoId.equals(tipoValor)){
                    errors.add("Erro semantico linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " Valor do tipo '" + tipoValor + "' não pode ser atribuido à '" + id + "' de tipo '" + tipoId + "'!");
                }

            } else if (valor.getChildCount() > 1){
                String operador = valor.getChild(1).getText();
                tipoValor = switch (op) {
                    case "E", "OU", "OUX", "NAO" -> "BOOL";
                    case 'MAIS', 'MENOS','MULT', 'DIVREAL', 'DIVINT', 'RESTO'; -> cisOpAritType(valor);
                    default -> "";
                };
                if(!tipoValor.equals(tipoId)){
                    errors.add("Erro semantico linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " Valor do tipo '" + tipoValor + "' não pode ser atribuido à '" + id + "' de tipo '" + tipoId + "'!");
                }
            }

        }
        super.enterAtribuicao(ctx);
    }

    @Override
    public void enterExprArit(AickuniParser.ExprAritContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++){
          String type = getType(ctx.getChild(i).getText());
            if (type.equals("BOOL") || type.equals("TEXTO")){
                erros.add("Erro semantico linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " Nao e possivel realizar operações aritmeticas com valores do tipo: " + getType(ctx.getChild(i).getText())  + "!");
            }
        }
        super.enterExprArit(ctx);
    }

    @Override
    public void enterExprLogi(AickuniParser.ExprLogiContent ctx) {
      for (int i = 0; i < ctx.getChildCount(); i++){
        String type = getType(ctx.getChild(i).getText());
            if (type.equals("STRING")){
                erros.add("Erro semantico linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " Nao e possivel realizar operações logicas com valores do tipo: " + getType(ctx.getChild(i).getText())  + "!");
            }
        }
        super.enterExprArit(ctx);
    }

    @Override
    public void enterLer(AickuniParser.LerContext ctx) {
        ParseTree valor = ctx.getChild(1);
        if (valor != null){
            if(tabelaSimbolos.containsKey(valor.getText()))
                errors.add("Erro semantico linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " A variavel " + ctx.VAR() + " não foi declarada!");
        }
        super.enterLer(ctx);
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }

    private String getType(String value){
        String type = tabelaSimbolos.get(value);
        if (type != null){
            return type;
        }

        if (value.contains("\"")){
            type = "TEXTO";
        } else if (value.contains(",")) {
            type = "REAL";
        } else if (value.equals("true") || value.equals("false")){
            type = "BOOL";
        } else {
            type = "INT";
        }
        return type;
    }

    private String isOpAritType(ParseTree op){
        String type = "INT";
        for (int i = 0; i < op.getChildCount(); i++){
            if (i%2 == 0){
                if(getType(op.getChild(i).getText()).equals("REAL"))
                    type = "REAL";
            }
        }

        return type;
    }

    public boolean hasSemanticError(){
        return errors.size() > 0;
    }
}
