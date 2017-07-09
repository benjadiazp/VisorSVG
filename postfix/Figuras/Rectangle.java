public class Rectangle
{
  int x;
  int y;
  int width;
  int height;
  String fill;
  int strokewidth;
  String stroke;

  public Rectangle (int x, int y, int w, int h, String f, int sw, String s)
  {
    this.x = x;
    this.y = y;
    width = w;
    height = h;
    fill = f;
    strokewidth = sw;
    stroke = s;
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

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public int getStrokewidth() {
        return strokewidth;
    }

    public void setStrokewidth(int strokewidth) {
        this.strokewidth = strokewidth;
    }

    public String getStroke() {
        return stroke;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }
  
}
