package svg.figuras;

import java.util.LinkedList;

public class Polyline extends Figura {
  LinkedList<String> points = new LinkedList();
  int strokewidth;
  String fill;
  String stroke;

  public Polyline (LinkedList p, int strokewidth, String stroke, String fill){
    super(strokewidth, stroke, fill);
    points = p;
    strokewidth = sw;
    fill = f;
    stroke = s;

  }
  public Polyline () {

  }

    public LinkedList getPoints() {
        return points;
    }

    public void setPoints(LinkedList points) {
        this.points = points;
    }

}
