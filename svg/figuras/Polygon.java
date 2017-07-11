package svg.figuras;

import java.util.LinkedList;

public class Polygon extends Figura{
  LinkedList<int[]> points;
  public Polygon (int strokewidth, String stroke, String fill){
    super(strokewidth, stroke, fill);
    points = new LinkedList();
  }

  public Polygon () {
    super();
    points = new LinkedList();
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
