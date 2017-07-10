package svg;
import svg.node.*;
import svg.analysis.*;
import svg.analysis.DepthFirstAdapter.*;
import svg.figuras.*;
import svg.figuras.Figura;
import svg.figuras.Line;
import svg.figuras.Circle;
import svg.figuras.Rectangle;
import svg.figuras.Ellipse;
import svg.figuras.Polygon;
import svg.figuras.Polyline;
import java.util.LinkedList;

public class Visitador extends DepthFirstAdapter {
  public LinkedList<Figura> lista = new LinkedList<>();
  private Figura figActual;
  private int tipoFig;
  String attActual;
  /*

  1: línea
  2: círculo
  3: rectángulo
  4: elipse
  5: polígono
  6: polilínea

  */

  void asignarValor(String val)
  {
    int val2;
    switch (attActual)
    {
      case "coorx": System.out.print(attActual + ": " + val);
      val2 = Integer.parseInt(val);
      figActual.setX1(val2);
      break;
      /*case "coory": System.out.print(attActual + ": " + val);
      val2 = Integer.parseInt(val);
      figActual.setY1(val2);
      break;
      case "coorx2": System.out.print(attActual + ": " + val);
      val2 = Integer.parseInt(val);
      figActual.setX2(val2);
      break;
      case "coory2": System.out.print(attActual + ": " + val);
      val2 = Integer.parseInt(val);
      figActual.setY2(val2);
      break;
      case "coorcx": System.out.print(attActual + ": " + val);
      val2 = Integer.parseInt(val);
      figActual.setCx(val2);
      break;
      case "coorcy": System.out.print(attActual + ": " + val);
      val2 = Integer.parseInt(val);
      figActual.setCy(val2);
      break;
      case "rad": System.out.print(attActual + ": " + val);
      val2 = Integer.parseInt(val);
      figActual.setRad(val2);
      break;
      case "coorx0": System.out.print(attActual + ": " + val);
      val2 = Integer.parseInt(val);
      figActual.setX0(val2);
      break;
      case "coory0": System.out.print(attActual + ": " + val);
      val2 = Integer.parseInt(val);
      figActual.setY0(val2);
      break;
      case "wid": System.out.print(attActual + ": " + val);
      val2 = Integer.parseInt(val);
      figActual.setWid(val2);
      break;
      case "hei": System.out.print(attActual + ": " + val);
      val2 = Integer.parseInt(val);
      figActual.setHei(val2);
      break;
      case "radx": System.out.print(attActual + ": " + val);
      val2 = Integer.parseInt(val);
      figActual.setRadx(val2);
      break;
      case "rady": System.out.print(attActual + ": " + val);
      val2 = Integer.parseInt(val);
      figActual.setRady(val2);
      break;
*/
      default: break;
    }
  }



  public Visitador()
  {

  }


  @Override
  public void caseALineF(ALineF node)
  {
      inALineF(node);
      if(node.getLine() != null)
      {

        System.out.println("Crear línea...");
        figActual = new Line();
        tipoFig = 1;
          node.getLine().apply(this);
      }
      if(node.getL1() != null)
      {
          node.getL1().apply(this);
      }
      outALineF(node);
  }
  public void caseACircleF(ACircleF node)
  {
      inACircleF(node);
      if(node.getCircle() != null)
      {
        System.out.println("Crear círculo...");
          figActual = new Circle();
          tipoFig = 2;
          node.getCircle().apply(this);
      }
      if(node.getC1() != null)
      {
          node.getC1().apply(this);
      }
      outACircleF(node);
  }
  public void caseARectF(ARectF node)
  {
      inARectF(node);
      if(node.getRect() != null)
      {
        System.out.println("Crear rectángulo...");
        tipoFig = 3;
          figActual = new Rectangle();
          node.getRect().apply(this);
      }
      if(node.getR1() != null)
      {
          node.getR1().apply(this);
      }
      outARectF(node);
  }
  public void caseAEllipseF(AEllipseF node)
  {
      inAEllipseF(node);
      if(node.getEllipse() != null)
      {
        System.out.println("Crear elipse...");
        tipoFig = 4;
          figActual = new Ellipse();
          node.getEllipse().apply(this);
      }
      if(node.getE1() != null)
      {
          node.getE1().apply(this);
      }
      outAEllipseF(node);
  }
  public void caseAPolygonF(APolygonF node)
  {
      inAPolygonF(node);
      if(node.getPolygon() != null)
      {
        System.out.println("Crear polígono...");
        tipoFig = 5;
          figActual = new Polygon();
          node.getPolygon().apply(this);
      }
      if(node.getP() != null)
      {
          node.getP().apply(this);
      }
      outAPolygonF(node);
  }
  public void caseAPolylineF(APolylineF node)
  {
      inAPolylineF(node);
      if(node.getPolyline() != null)
      {
        System.out.println("Crear polilínea...");
          figActual = new Polyline();
          tipoFig = 6;
          node.getPolyline().apply(this);
      }
      if(node.getA() != null)
      {
          node.getA().apply(this);
      }
      outAPolylineF(node);
  }

  @Override
  public void caseACoorx(ACoorx node)
  {
      inACoorx(node);
      if(node.getNum() != null)
      {
        attActual = "coorx";
          node.getNum().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getX1() != null)
      {
          node.getX1().apply(this);
      }
      outACoorx(node);
  }

  @Override
  public void caseACoory(ACoory node)
  {
      inACoory(node);
      if(node.getNum() != null)
      {
        attActual = "coory";
          node.getNum().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getY1() != null)
      {
          node.getY1().apply(this);
      }
      outACoory(node);
  }

  @Override
  public void caseACoorx2(ACoorx2 node)
  {
      inACoorx2(node);
      if(node.getNum() != null)
      {
        attActual = "coorx2";
          node.getNum().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getX2() != null)
      {
          node.getX2().apply(this);
      }
      outACoorx2(node);
  }

  @Override
  public void caseACoory2(ACoory2 node)
  {
      inACoory2(node);
      if(node.getNum() != null)
      {
        attActual = "coory2";
          node.getNum().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getY2() != null)
      {
          node.getY2().apply(this);
      }
      outACoory2(node);
  }

  @Override
  public void caseACoorcx(ACoorcx node)
  {
      inACoorcx(node);
      if(node.getNum() != null)
      {
        attActual = "coorcx";
          node.getNum().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getCx() != null)
      {
          node.getCx().apply(this);
      }
      outACoorcx(node);
  }

  @Override
  public void caseACoorcy(ACoorcy node)
  {
      inACoorcy(node);
      if(node.getNum() != null)
      {
        attActual = "coorcy";
          node.getNum().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getCy() != null)
      {
          node.getCy().apply(this);
      }
      outACoorcy(node);
  }

  @Override
  public void caseARad(ARad node)
  {
      inARad(node);
      if(node.getNum() != null)
      {
        attActual = "rad";
          node.getNum().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getR0() != null)
      {
          node.getR0().apply(this);
      }
      outARad(node);
  }
  @Override
  public void caseACoorx0(ACoorx0 node)
  {
      inACoorx0(node);
      if(node.getNum() != null)
      {
        attActual = "coorx0";
          node.getNum().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getX0() != null)
      {
          node.getX0().apply(this);
      }
      outACoorx0(node);
  }

  @Override
  public void caseACoory0(ACoory0 node)
  {
      inACoory0(node);
      if(node.getNum() != null)
      {
        attActual = "coory0";
          node.getNum().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getY0() != null)
      {
          node.getY0().apply(this);
      }
      outACoory0(node);
  }

  @Override
  public void caseAWid(AWid node)
  {
      inAWid(node);
      if(node.getWidth() != null)
      {
        attActual = "wid";
          node.getWidth().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getNum() != null)
      {
          node.getNum().apply(this);
      }
      outAWid(node);
  }

  @Override
  public void caseAHei(AHei node)
  {
      inAHei(node);
      if(node.getHeight() != null)
      {
        attActual = "hei";
          node.getHeight().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getNum() != null)
      {
          node.getNum().apply(this);
      }
      outAHei(node);
  }

  @Override
  public void caseARadx(ARadx node)
  {
      inARadx(node);
      if(node.getNum() != null)
      {
        attActual = "radx";
          node.getNum().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getRx() != null)
      {
          node.getRx().apply(this);
      }
      outARadx(node);
  }

  @Override
  public void caseARady(ARady node)
  {
      inARady(node);
      if(node.getNum() != null)
      {
        attActual = "rady";
          node.getNum().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getRy() != null)
      {
          node.getRy().apply(this);
      }
      outARady(node);
  }



  @Override
  public void caseANum(ANum node) //IMPORTANTE
  {
      inANum(node);
      if(node.getA() != null)
      {
          node.getA().apply(this);
      }
      if(node.getN() != null)
      {
        //Modificar acá.
        asignarValor(node.getN().toString());
          node.getN().apply(this);
      }
      if(node.getCo() != null)
      {
          node.getCo().apply(this);
      }
      outANum(node);
  }


}
