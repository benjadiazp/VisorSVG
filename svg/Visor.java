package svg;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Visor extends JPanel {

	public void paint( Graphics g ) {
		Graphics2D g2 = (Graphics2D)g;
		// C�rculo a rellenar
		Ellipse2D circulo = new Ellipse2D.Float( 10,10,220,220 );
		// Gradiente de color de azul a verde
		GradientPaint gradiente = new GradientPaint( 75,75,Color.RED, 95,95,Color.green,true );
		// Se fija el gradiente
		g2.setPaint( gradiente );
		// Se rellena el c�rculo
		g2.fill( circulo );
	}// M�todo principal de la clase

	public static void main( String[] args ) {

		//leer archivo html con instrucciones svg
		//parsear el archivo de entrada
		//indicar errores si el formato no corresponde, y abortar
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
}
