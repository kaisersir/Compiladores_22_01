import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;



public class CompiladorAlguma {

    public static void main (String[] args){
        String filename = "/home/ivan/Documents/UFLA/2022_1/Compiladores/Projeto compiladores/parte 2/codigo.txt";
    try{
        CharStream input = CharStremas.fromFileName(filename);
        AickuniLexer lexer = new AickuniLexer(input);
        CommonTokenStream tokens =  new CommonTokenStram(lexer);
        AickuniParser parser = new AickuniParser(tokens);

        ParseTree ast = parser.inicio();
        system.out.println(ast.toStringTree());


    } catch (IOException e){
        e.printStackTrace();
    }


    }

}
