package svg;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import svg.analysis.*;
import svg.parser.*;
import svg.lexer.*;
import svg.node.*;
import java.io.*;
import java.io.BufferedReader;
import java.util.LinkedList;
import svg.figuras.*;
import svg.figuras.Figura;
import svg.figuras.Line;

public class Visor extends JPanel {

	private static LinkedList<Figura> figuras;

	public void paint( Graphics g ) {
		Graphics2D g2 = (Graphics2D)g;

		for (int i=0; i < figuras.size(); i++)
		{
			System.out.println("Imprimir " + figuras.get(i).getNombre() + "... ");
			dibujarFigura(g2, figuras.get(i));
		}


		// C�rculo a rellenar
/*
		//Ellipse2D circulo = new Ellipse2D.Float( 10,10,220,220 );
		Line l = new Line(50, 200, 200, 100, 15, "gray", "red");
		Line2D linea = new Line2D.Float(l.getX1(), l.getY1(), l.getX2(), l.getY2());
		// Gradiente de color de azul a verde
		GradientPaint gradiente = new GradientPaint( 75,75,Color.RED, 95,95,Color.green,true );
		// Se fija el gradiente
		g2.setColor(obtenerColor(l.getStroke()));
		// Se rellena el c�rculo
		//g2.fill( circulo );


		g2.fill(linea);
		g2.setStroke(new BasicStroke(15));
		g2.drawLine(l.getX1(), l.getY1(), l.getX2(), l.getY2());

		*/

	}// M�todo principal de la clase

	public void dibujarFigura(Graphics2D g, Figura f)
	{

		g.setColor(obtenerColor(f.getStroke()));
		g.setStroke(new BasicStroke(f.getStrokewidth()));

		switch(f.getNombre())

		{
			case "Line": dibujarLinea(g, f); break;

/*
			case "Ellipse": dibujarEllipse(g, f); break;
			case "Circle": dibujarCircle(g, f); break;
			case "Rectangle": dibujarRectangle(g, f); break;
			case "Polygon": dibujarPolygon(g, f); break;
			case "Polyline": dibujarPolyline(g, f); break;
*/
			default: break;
		}

	}

	public void dibujarLinea(Graphics2D g, Figura l)
	{
		g.drawLine(l.getX1(), l.getY1(), l.getX2(), l.getY2());

	}



	private Color obtenerColor(String str)
	{
		Color c=null;
		switch (str)
		{
			case "blue" : c = Color.blue; break;
			case "black": c = Color.black; break;
			case "green" : c = Color.green; break;
			case "yellow" : c = Color.yellow; break;
			case "white" : c = Color.white; break;
			case "red" : c = Color.red; break;
			case "pink" : c = Color.pink; break;
			case "gray" : c = Color.gray; break;
			default: break;
		}
		return c;
	}

	public static void main( String[] args ) {

		//leerSVG();
		//leerSVG2();
		//aplicarVisitador();

		/*leer archivo html con instrucciones svg.
		Parsear el archivo de entrada.
		Indicar errores si el formato no corresponde, y abortar
		*/
		//aplicar visitador y generar informaci�n �til para la siguiente etapa (apoyarse de variables, arreglos, objetos, etc.)
		//utilizar estos datos generados en el metodo paint.


		JFrame ventana = new JFrame("Visor SVG");
		ventana.setSize( 800,800 );

		// Receptor de eventos de cierre de la clase
		ventana.addWindowListener( new WindowAdapter() {

			public void windowClosing( WindowEvent evt ) {
				System.exit( 0 );
			}

		} );

		Container ejemplo = new Visor();
		ventana.setContentPane( ejemplo ); //esto invoca automaticamente el metodo paint
		ventana.setVisible( true );
	}

	public static void leerSVG()
	{

	}

	public static void leerSVG2()
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
				System.out.println ("Ingrese figura(s) en svg.");
				//Crear una instancia del parser
				line = in.readLine();
				Parser p = new Parser(new Lexer( new PushbackReader(new StringReader(line), 1024)));

				//generar el arbol de parsing
				Start tree = p.parse();
				tree.apply(new Visitador());
				figuras = Visitador.lista;
		}
		catch(Exception e) {
				System.out.println(e.getMessage());
		}
	}
}
