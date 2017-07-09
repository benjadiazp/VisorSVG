package postfix;
import postfix.analysis.*;
import postfix.parser.*;
import postfix.lexer.*;
import postfix.node.*;
import java.io.*;
import java.io.BufferedReader;

public class Analizer {
    public static void main(String[] arguments) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try {
            System.out.println ("Ingrese figura(s) en svg.");
            //Crear una instancia del parser
            line = in.readLine();
            Parser p = new Parser( new Lexer( new PushbackReader(new StringReader(line), 1024)));

            //generar el arbol de parsing
            Start tree = p.parse();
            tree.apply(new Visitador());
            tree.apply(new ASTPrinter());
            tree.apply(new ASTDisplay());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
       // Interpreter ip=new Interpreter();
       // tree.apply(ip);
    }
}
