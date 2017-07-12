package svg.figuras;

import java.util.LinkedList;

public abstract class Figura
{
  public String nombreFigura;
  protected String stroke;
  protected String fill;
  protected int strokewidth;

  public Figura(String nombre, int sw, String s, String f)
  {
    stroke = s;
    strokewidth = sw;
    fill = f;
    nombreFigura = nombre;
  }

  public Figura(String nombre)
  {
    nombreFigura = nombre;
    stroke = "none";
    strokewidth = 1;
    fill = "black";
  }

  public String getNombre()
  {
    return nombreFigura;
  }

  public void setStroke(String s)
  {
    stroke = s;
  }

  public void setStrokewidth(int sw)
  {
    strokewidth = sw;
  }

  public void setFill(String fill)
  {
    this.fill = fill;
  }

  public String getStroke()
  {
    return stroke;
  }

  public int getStrokewidth()
  {
    return strokewidth;
  }

  public String getFill()
  {
    return fill;
  }

  public void setX1(int i){return;};
  public void setY1(int i){return;};
  public void setX2(int i){return;};
  public void setY2(int i){return;};
  public void setCx(int i){return;};
  public void setCy(int i){return;};
  public void setX(int i){return;};
  public void setY(int i){return;};
  public void setWidth(int i){return;};
  public void setHeight(int i){return;};
  public void setRx(int i){return;};
  public void setRy(int i){return;};
  public void setRad(int i){return;};
  public void setPoints(LinkedList p){return;};
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
  public LinkedList getPoints(){return null;};

}
