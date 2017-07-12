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
  public abstract void setX1();
  public abstract void setY1();
  public abstract void setX2();
  public abstract void setY2();
  public abstract void setCx();
  public abstract void setCy();
  public abstract void setX();
  public abstract void setY();
  public abstract void setWidth();
  public abstract void setHeight();
  public abstract void setRx();
  public abstract void setRy();
  public abstract void setRad();
  public abstract void setPoints();
  public abstract int getX1();
  public abstract int getY1();
  public abstract int getX2();
  public abstract int getY2();
  public abstract int getCx();
  public abstract int getCy();
  public abstract int getX();
  public abstract int getY();
  public abstract int getWidth();
  public abstract int getHeight();
  public abstract int getRx();
  public abstract int getRy();
  public abstract int getR();
  public abstract LinkedList getPoints();
}
