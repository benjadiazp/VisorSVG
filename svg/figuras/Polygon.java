package svg.figuras;

import java.util.LinkedList;

public class Polygon extends Figura{

  LinkedList<String> points = new LinkedList();


  public Polygon (LinkedList p, int strokewidth, String stroke, String fill){
    points = p;
    super(strokewidth, stroke, fill);

  }
  public Polygon () {

  }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public int getStrokewidth() {
        return strokewidth;
    }

    public void setStrokewidth(int strokewidth) {
        this.strokewidth = strokewidth;
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public String getStroke() {
        return stroke;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

}
