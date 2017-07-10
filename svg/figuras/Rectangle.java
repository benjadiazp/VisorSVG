package svg.figuras;

public class Rectangle extends Figura  {
  int x;
  int y;
  int width;
  int height;


  public Rectangle (int x, int y, int w, int h, int strokewidth, String stroke, String fill)
  {
    super(strokewidth, stroke, fill);
    this.x = x;
    this.y = y;
    width = w;
    height = h;

  }
  public Rectangle () {
    super(0, null, null); 
  }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
