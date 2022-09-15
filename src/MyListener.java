import antlr.AickuniBaseListener;
import antlr.AickuniParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListener extends AickuniBaseListener {

    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();
    private List<String> errors = new ArrayList<>();

    @Override
    public void enterNPrograma(AickuniParser.NProgramaContext ctx) {
        System.out.println("No programa: "+ctx.getText());
    }

    @Override
    public void exitNPrograma(AickuniParser.NProgramaContext ctx){
        String message = "";

        if (hasSemanticError()){
            message = "";
            for (String error : errors) {
                message += error + "\n";
            }
        }
        super.exitNPrograma(ctx);
        throw new Error(message);
    }

    @Override
    public void enterNDeclaracao(AickuniParser.NDeclaracaoContext ctx) {
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();

        if (tabelaSimbolos.containsKey(id)){
            errors.add("Erro semantico linha" + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " Variavel já declarada!");
        } else {
            tabelaSimbolos.put(id,tipo);
        }
        super.enterNDeclaracao(ctx);
    }

    @Override
    public void enterNAtribuicao(AickuniParser.NAtribuicaoContext ctx) {
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
                tipoValor = switch (operador) {
                    case "E", "OU", "OUX", "NAO" -> "BOOL";
                    case "MAIS", "MENOS","MULT", "DIVREAL", "DIVINT", "RESTO" -> isOpAritType(valor);
                        default -> "";
                };
                if(!tipoValor.equals(tipoId)){
                    errors.add("Erro semantico linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " Valor do tipo '" + tipoValor + "' não pode ser atribuido à '" + id + "' de tipo '" + tipoId + "'!");
                }
            }

        }
        super.enterNAtribuicao(ctx);
    }

    @Override
    public void enterNExprArit(AickuniParser.NExprAritContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++){
            String type = getType(ctx.getChild(i).getText());
            if (type.equals("BOOL") || type.equals("TEXTO")){
                errors.add("Erro semantico linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " Nao e possivel realizar operações aritmeticas com valores do tipo: " + getType(ctx.getChild(i).getText())  + "!");
            }
        }
        super.enterNExprArit(ctx);
    }

    @Override
    public void enterNExprLogi(AickuniParser.NExprLogiContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++){
            String type = getType(ctx.getChild(i).getText());
            if (type.equals("STRING")){
                errors.add("Erro semantico linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " Nao e possivel realizar operações logicas com valores do tipo: " + getType(ctx.getChild(i).getText())  + "!");
            }
        }
        super.enterNExprLogi(ctx);
    }

    @Override
    public void enterNLer(AickuniParser.NLerContext ctx) {
        ParseTree valor = ctx.getChild(1);
        if (valor != null){
            if(tabelaSimbolos.containsKey(valor.getText()))
                errors.add("Erro semantico linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " A variavel " + ctx.ID() + " não foi declarada!");
        }
        super.enterNLer(ctx);
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