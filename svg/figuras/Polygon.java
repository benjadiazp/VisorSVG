package svg.figuras;

import java.util.LinkedList;

public class Polygon extends Figura{

  LinkedList<String> points = new LinkedList();


  public Polygon (LinkedList p, int strokewidth, String stroke, String fill){
    super(strokewidth, stroke, fill);
    points = p;

  }
  public Polygon () {

  }

    public LinkedList getPoints() {
        return points;
    }

    public void setPoints(LinkedList points) {
        this.points = points;
    }


}
