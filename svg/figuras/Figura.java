package svg.figuras;
public abstract class Figura
{
  protected String nombreFigura;
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
/*  public void setX1(){return;}
  public void setY1(){return;}
  public void setX2(){return;}
  public void setY2(){return;}
  public void setCx(){return;}
  public void setCy(){return;}
  public void setX0(){return;}
  public void setY0(){return;}
  public void setWid(){return;}
  public void setHei(){return;}
  public void setRadx(){return;}
  public void setRady(){return;}
  public void setRad(){return;}
  */
}
