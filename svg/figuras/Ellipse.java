package svg.figuras;

public class Ellipse extends Figura{
  int cx;
  int cy;
  int rx;
  int ry;

  public Ellipse (String nombre, int cx, int cy, int rx, int ry, int strokewidth, String stroke, String fill){
    super("Ellipse", strokewidth, stroke, fill);
    this.cx = cx;
    this.cy = cy;
    this.rx = rx;
    this.ry = ry;
    nombreFigura = nombre;
  }
  public Ellipse (String nombre) {
    super("Ellipse");
    nombreFigura = nombre;
  }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public int getRx() {
        return rx;
    }

    public void setRx(int rx) {
        this.rx = rx;
    }

    public int getRy() {
        return ry;
    }

    public void setRy(int ry) {
        this.ry = ry;
    }

}
