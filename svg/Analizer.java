package svg;
import svg.analysis.*;
import svg.parser.*;
import svg.lexer.*;
import svg.node.*;
import java.io.*;
import java.io.BufferedReader;

public class Analizer {

  public static void main(String[] arguments) {
    try {
      System.out.println ("Ingrese el código SVG.");

      //Crear una instancia del parser
      Parser p = new Parser( new Lexer( new PushbackReader(new InputStreamReader(System.in),1024)));
      //Crear el arbol de parsing
      Start tree = p.parse();
      tree.apply(new Visitador());

    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
