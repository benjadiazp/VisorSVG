public class Circle {
  int cx;
  int cy;
  int r;
  int strokewidth;
  String stroke;
  String fill;


  public Circle (int cx, int cy, int r, int sw, String s, String f) {
    this.cx = cx;
    this.cy = cy;
    this.r = r;
    strokewidth = sw;
    stroke = s;
    fill = f;

  }

    public int getCx() {
        return cx;
    }

    public int getCy() {
        return cy;
    }

    public int getR() {
        return r;
    }

    public int getStrokewidth() {
        return strokewidth;
    }

    public String getStroke() {
        return stroke;
    }

    public String getFill() {
        return fill;
    }
  
}
