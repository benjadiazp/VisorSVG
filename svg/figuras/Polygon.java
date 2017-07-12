package svg.figuras;

import java.util.LinkedList;

public class Polygon extends Figura{
  LinkedList<int[]> points;

  public Polygon (int strokewidth, String stroke, String fill){
    super("Polygon", strokewidth, stroke, fill);
    points = new LinkedList();
  }

  public Polygon () {
    super("Polygon");
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
    public int getX1(){return -1;};
    public int getY1(){return -1;};
    public int getX2(){return -1;};
    public int getY2(){return -1;};
    public int getCx(){return -1;};
    public int getCy(){return -1;};
    public int getX(){return -1;};
    public int getY(){return -1;};
    public int getWidth(){return -1;};
    public int getHeight(){return -1;};
    public int getRx(){return -1;};
    public int getRy(){return -1;};
    public int getR(){return -1;};
}
