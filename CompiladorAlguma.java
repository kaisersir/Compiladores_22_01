import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;



public class CompiladorAlguma {

    public static void main (String[] args){
        String filename = "/home/ivan/Documents/UFLA/2022_1/Compiladores/Projeto compiladores/parte 2/codigo.txt";
        AickuniParser parser = getParser(fileName);

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
            GramaticaLexer lexer = new AickuniLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new AickuniParser(tokens);

        } catch(IOException e){
            e.printStackTrace();
        }
        return parser;
    }

}
