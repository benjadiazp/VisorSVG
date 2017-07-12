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

public class Visor extends JPanel {

	private static LinkedList<Figura> figuras;

	public void paint( Graphics g ) {
		Graphics2D g2 = (Graphics2D)g;
		System.out.print("Qué está pasando.");
		for (int i=0; i < figuras.size(); i++)
		{
			System.out.println("Imprimir " + figuras.get(i).getNombre() + "... (Figura " + i + " de " + figuras.size() + ").");
			dibujarFigura(g2, figuras.get(i));
		}

	}

	public static void main( String[] args ) {


		leerSVG();

		//leer archivo html con instrucciones svg.
		//Parsear el archivo de entrada.
		//Indicar errores si el formato no corresponde, y abortar
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

		Container dibujo = new Visor();
		ventana.setContentPane( dibujo ); //esto invoca automaticamente el metodo paint
		ventana.setVisible( true );

	}

	public static void leerSVG()
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
				System.out.println ("Ingrese figura(s) en svg.");
				line = in.readLine();
				Parser p = new Parser( new Lexer( new PushbackReader(new StringReader(line))));

				Start tree = p.parse();
				tree.apply(new Visitador());
				figuras = Visitador.lista;
		}
		catch(Exception e) {
				System.out.println(e.getMessage());
		}
	}

	public void dibujarFigura(Graphics2D g, Figura f)
	{

		g.setColor(obtenerColor(f.getStroke()));
		g.setStroke(new BasicStroke(f.getStrokewidth()*2));

		switch(f.getNombre())

		{
			case "Line": g.drawLine(f.getX1(), f.getY1(), f.getX2(), f.getY2()); ;
			break;
			case "Ellipse": Ellipse2D e = new Ellipse2D.Double((f.getCx()-f.getRx()), (f.getCy()-f.getRy()), f.getRx()*2, f.getRy()*2);
			g.draw(e);
			if (!f.getFill().equals("none"))
			{
				g.setColor(obtenerColor(f.getFill()));
				g.fill(e);
			}

			break;
			case "Circle": Ellipse2D c = new Ellipse2D.Double((f.getCx()-f.getR()), (f.getCy()-f.getR()), f.getR()*2, f.getR()*2);
			g.draw(c);
			if (!f.getFill().equals("none"))
			{
				g.setColor(obtenerColor(f.getFill()));
				g.fill(c);
			}
			break;
			case "Rectangle": Rectangle2D r = new Rectangle2D.Float(f.getX(), f.getY(), f.getWidth(), f.getHeight());
			g.draw(r);
			g.setColor(obtenerColor(f.getFill()));
			g.fill(r);
			break;
			case "Polygon": dibujarPolygon(g, f);break;
			case "Polyline": dibujarPolyline(g, f);break;

			default: break;
		}



	}
	void dibujarPolygon(Graphics2D g, Figura f)
	{
		LinkedList<int[]> points = f.getPoints();
		int valoresX[] = new int[points.size()];
		int valoresY[] = new int[points.size()];
		for (int i=0; i<points.size(); i++)
		{
			valoresX[i] = points.get(i)[0];
			valoresY[i] = points.get(i)[1];
		}
		java.awt.Polygon p = new java.awt.Polygon(valoresX, valoresY, points.size());
		g.drawPolygon(p);
		g.setColor(obtenerColor(f.getFill()));
		g.fill(p);
	}
	void dibujarPolyline(Graphics2D g, Figura f)
	{
		LinkedList<int[]> points = f.getPoints();
		int valoresX[] = new int[points.size()];
		int valoresY[] = new int[points.size()];
		for (int i=0; i<points.size(); i++)
		{
			valoresX[i] = points.get(i)[0];
			valoresY[i] = points.get(i)[1];
		}
		g.drawPolyline(valoresX, valoresY, points.size());
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
			case "skyblue" : c = new Color(83,224, 252); break;
			case "purple" : c = new Color(122,22, 103); break;
			case "brown" : c = new Color(102,53, 14); break;
			case "lime" : c = new Color(107,252, 45); break;
			default: break;
		}
		return c;
	}


}
