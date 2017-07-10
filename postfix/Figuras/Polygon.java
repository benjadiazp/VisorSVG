public class Polygon {
  int points;
  int strokewidth;
  String fill;
  String stroke;

  public Polygon (int p, int sw, String f, String s){
    points = p;
    strokewidth = sw;
    fill = f;
    stroke = s;

  }
  public Polygon () {
    
  }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
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
