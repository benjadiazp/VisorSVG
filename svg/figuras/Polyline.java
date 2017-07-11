package svg.figuras;

import java.util.LinkedList;

public class Polyline extends Figura {
  LinkedList<int[]> points;

  public Polyline (String nombre, int strokewidth, String stroke, String fill){
    super("Polyline", strokewidth, stroke, fill);
    points = new LinkedList();
    nombreFigura = nombre;
  }

  public Polyline (String nombre) {
    super("Polyline");
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
