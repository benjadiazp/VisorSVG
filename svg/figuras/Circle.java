
package svg.figuras;

public class Circle extends Figura{
  int cx;
  int cy;
  int r;


  public Circle (int cx, int cy, int r, int strokewidth, String stroke, String fill) {
    super(strokewidth, stroke, fill);
    this.cx = cx;
    this.cy = cy;
    this.r = r;


  }
  public Circle () {
    super(0, null, null);
  }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public void setCy(int cy) {
        this.cy = cy;
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


}
