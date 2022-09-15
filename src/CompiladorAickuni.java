import antlr.AickuniLexer;
import antlr.AickuniParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;


public class CompiladorAickuni {

    public static void main (String[] args){
        String filename = "/home/ivan/Documents/UFLA/2022_1/Compiladores/Projeto final/untitled/src/teste/Teste.txt";
        AickuniParser parser = getParser(filename);

        //obter arvore
        ParseTree ast = parser.programa();

        // System.out.println(ast.toStringTree());

        //Inicia o MyListener, nossa implementação do baseListener
        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        //percorre a ast com a nossa implementação do listener
        walker.walk(listener,ast);

        //imprime a tabela de símbolos
        System.out.println(listener.getTabelaSimbolos().toString());
    }

    private static AickuniParser getParser(String fileName){
        AickuniParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(fileName);
            AickuniLexer lexer = new AickuniLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new AickuniParser(tokens);

        } catch(IOException e){
            e.printStackTrace();
        }
        return parser;
    }

}