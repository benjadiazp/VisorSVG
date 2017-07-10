package svg;
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
  public Circle () {

  }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setStrokewidth(int strokewidth) {
        this.strokewidth = strokewidth;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

    public void setFill(String fill) {
        this.fill = fill;
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
