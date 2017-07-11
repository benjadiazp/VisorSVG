package svg.figuras;

import java.util.LinkedList;

public class Polygon extends Figura{
  LinkedList<int[]> points;

  public Polygon (String nombre, int strokewidth, String stroke, String fill){
    super("Polygon", strokewidth, stroke, fill);
    points = new LinkedList();
    nombreFigura = nombre;
  }

  public Polygon (String nombre) {
    super("Polygon");
    points = new LinkedList();
    nombreFigura = nombre; 
  }
    public LinkedList getPoints() {
        return points;
    }

    public void setPoints(LinkedList points) {
        this.points = points;
    }

    public void addPoint(int[] arr)
    {
      points.add(arr);
    }
}
