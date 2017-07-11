package svg;
import svg.node.*;
import svg.analysis.*;
import svg.analysis.DepthFirstAdapter.*;
import svg.figuras.*;
import svg.figuras.Figura;
import java.util.LinkedList;

public class Visitador extends DepthFirstAdapter {
  public LinkedList<Figura> lista = new LinkedList<>();
  private int tipoFig;
  int contFig = -1;
  String attActual;
  Line line;
  Circle circle;
  Rectangle rect;
  Ellipse ellipse;
  Polygon polygon;
  Polyline polyline;

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
    int val2=0;
    switch (attActual)
    {
      case "coorx": val2 = Integer.parseInt(val);
      line.setX1(val2);
      System.out.print(attActual + ": " + val + " ");
      break;
      case "coory": val2 = Integer.parseInt(val);
      line.setY1(val2);
      System.out.print(attActual + ": " + val + " ");
      break;
      case "coorx2": val2 = Integer.parseInt(val);
      line.setX2(val2);
      System.out.print(attActual + ": " + val + " ");
      break;
      case "coory2": val2 = Integer.parseInt(val);
      line.setY2(val2);
      System.out.print(attActual + ": " + val + " ");
      break;
      case "coorcx": switch (tipoFig)
      {
        case 2: val2 = Integer.parseInt(val);
        circle.setCx(val2);
        System.out.print(attActual + ": " + val + " "); break; //Círculo
        case 4: val2 = Integer.parseInt(val);
        ellipse.setCx(val2);
        System.out.print(attActual + ": " + val + " "); break; //Elipse
        default: break;
      }
      break;
      case "coorcy": switch (tipoFig)
      {
        case 2: val2 = Integer.parseInt(val);
        circle.setCy(val2);
        System.out.print(attActual + ": " + val + " "); break; //Círculo
        case 4: val2 = Integer.parseInt(val);
        ellipse.setCy(val2);
        System.out.print(attActual + ": " + val + " "); break; //Elipse
        default: break;
      }
      break;
      case "rad": val2 = Integer.parseInt(val);
      circle.setR(val2);
      System.out.print(attActual + ": " + val + " ");
      break;
      case "coorx0": val2 = Integer.parseInt(val);
      rect.setX(val2);
      System.out.print(attActual + ": " + val + " ");
      break;
      case "coory0": val2 = Integer.parseInt(val);
      rect.setY(val2);
      System.out.print(attActual + ": " + val + " ");
      break;
      case "wid": val2 = Integer.parseInt(val);
      rect.setWidth(val2);
      System.out.print(attActual + ": " + val + " ");
      break;
      case "hei": val2 = Integer.parseInt(val);
      rect.setHeight(val2);
      System.out.print(attActual + ": " + val + " ");
      break;
      case "radx": val2 = Integer.parseInt(val);
      ellipse.setRx(val2);
      System.out.print(attActual + ": " + val + " ");
      break;
      case "rady": val2 = Integer.parseInt(val);
      ellipse.setRy(val2);
      System.out.print(attActual + ": " + val + " ");
      break;
      case "fill": switch (tipoFig)
      {
        //  STYLE
        case 1: line.setFill(val);
        System.out.print(attActual + ": " + val + " ");
        break;
        case 2: circle.setFill(val);
        System.out.print(attActual + ": " + val + " ");
        break;
        case 3: rect.setFill(val);
        System.out.print(attActual + ": " + val + " ");
        break;
        case 4: ellipse.setFill(val);
        System.out.print(attActual + ": " + val + " ");
        break;
        case 5: polygon.setFill(val);
        System.out.print(attActual + ": " + val + " ");
        break;
        case 6: polyline.setFill(val);
        System.out.print(attActual + ": " + val + " ");
        break;
        default: break;
      } break;
      case "stroke": switch (tipoFig)
      {

        case 1: line.setStroke(val);
        System.out.println(attActual + ": " + val + " ");
        break;
        case 2: circle.setStroke(val);
        System.out.println(attActual + ": " + val + " ");
        break;
        case 3: rect.setStroke(val);
        System.out.println(attActual + ": " + val + " ");
        break;
        case 4: ellipse.setStroke(val);
        System.out.println(attActual + ": " + val + " ");
        break;
        case 5: polygon.setStroke(val);
        System.out.println(attActual + ": " + val + " ");
        break;
        case 6: polyline.setStroke(val);
        System.out.println(attActual + ": " + val + " ");
        break;
        default: break;
      } break;
      case "strokewidth": val2 = Integer.parseInt(val);
      switch (tipoFig)
      {
        case 1: line.setStrokewidth(val2);
        System.out.println(attActual + ": " + val + " ");
        break;
        case 2: circle.setStrokewidth(val2);
        System.out.println(attActual + ": " + val + " ");
        break;
        case 3: rect.setStrokewidth(val2);
        System.out.println(attActual + ": " + val + " ");
        break;
        case 4: ellipse.setStrokewidth(val2);
        System.out.println(attActual + ": " + val + " ");
        break;
        case 5: polygon.setStrokewidth(val2);
        System.out.println(attActual + ": " + val + " ");
        break;
        case 6: polyline.setStrokewidth(val2);
        System.out.println(attActual + ": " + val + " ");
        break;
        default: break;
      } break;

      default: break;
    }
  }



  public Visitador()
  {

  }

  @Override
  public void caseAAPr1(AAPr1 node)
  {
      inAAPr1(node);
      if(node.getMinus() != null)
      {
          node.getMinus().apply(this);
      }
      if(node.getF() != null)
      {
          contFig++;
          System.out.println("");
          node.getF().apply(this);
      }
      if(node.getS() != null)
      {
          node.getS().apply(this);
      }
      if(node.getMayus0() != null)
      {
          node.getMayus0().apply(this);
      }
      outAAPr1(node);
  }

  @Override
  public void caseABPr1(ABPr1 node)
  {
      inABPr1(node);
      if(node.getMinus() != null)
      {
          node.getMinus().apply(this);
      }
      if(node.getF() != null)
      {
          contFig++;
          System.out.println("");
          node.getF().apply(this);
      }
      if(node.getMayus0() != null)
      {
          node.getMayus0().apply(this);
      }
      outABPr1(node);
  }

  @Override
  public void caseACPr1(ACPr1 node)
  {
      inACPr1(node);
      if(node.getMinus() != null)
      {
          node.getMinus().apply(this);
      }
      if(node.getS() != null)
      {
          node.getS().apply(this);
      }
      if(node.getF() != null)
      {
          contFig++;
          System.out.println("");
          node.getF().apply(this);
      }
      if(node.getMayus0() != null)
      {
          node.getMayus0().apply(this);
      }
      outACPr1(node);
  }




  @Override
  public void caseALineF(ALineF node)
  {
      inALineF(node);
      if(node.getLine() != null)
      {

        System.out.println("Crear línea... (" + contFig + " figuras).");
        line = new Line();
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
        System.out.println("Crear círculo... (" + contFig + " figuras).");
          circle = new Circle();
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
        System.out.println("Crear rectángulo... (" + contFig + " figuras).");
        tipoFig = 3;
          rect = new Rectangle();
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
        System.out.println("Crear elipse... (" + contFig + " figuras).");
        tipoFig = 4;
          ellipse = new Ellipse();
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
        System.out.println("Crear polígono... (" + contFig + " figuras).");
        tipoFig = 5;
          polygon = new Polygon();
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
        System.out.println("Crear polilínea... (" + contFig + " figuras).");
          polyline = new Polyline();
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
  public void caseAAAtt0(AAAtt0 node)
  {
      inAAAtt0(node);
      if(node.getFill() != null)
      {
        attActual = "fill";
          node.getFill().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getCo() != null)
      {
          node.getCo().apply(this);
      }
      if(node.getC0() != null)
      {
        asignarValor(node.getC0().getText());
          node.getC0().apply(this);
      }
      if(node.getA() != null)
      {
          node.getA().apply(this);
      }
      outAAAtt0(node);
  }

  @Override
  public void caseABAtt0(ABAtt0 node)
  {
      inABAtt0(node);
      if(node.getStroke() != null)
      {
        attActual = "stroke";
          node.getStroke().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getCo() != null)
      {
          node.getCo().apply(this);
      }
      if(node.getC0() != null)
      {
        asignarValor(node.getC0().getText());
          node.getC0().apply(this);
      }
      if(node.getA() != null)
      {
          node.getA().apply(this);
      }
      outABAtt0(node);
  }

  @Override
  public void caseACAtt0(ACAtt0 node)
  {
      inACAtt0(node);
      if(node.getStrokew() != null)
      {
        attActual = "strokewidth";
          node.getStrokew().apply(this);
      }
      if(node.getIg() != null)
      {
          node.getIg().apply(this);
      }
      if(node.getNum() != null)
      {
          node.getNum().apply(this);
      }
      outACAtt0(node);
  }

  @Override
  public void caseAASp0(AASp0 node)
  {
      inAASp0(node);
      if(node.getFill() != null)
      {
        attActual = "fill";
          node.getFill().apply(this);
      }
      if(node.getDosp() != null)
      {
          node.getDosp().apply(this);
      }
      if(node.getC0() != null)
      {
        asignarValor(node.getC0().getText());
          node.getC0().apply(this);
      }
      outAASp0(node);
  }

  @Override
  public void caseABSp0(ABSp0 node)
  {
      inABSp0(node);
      if(node.getStroke() != null)
      {
        attActual = "stroke";
          node.getStroke().apply(this);
      }
      if(node.getDosp() != null)
      {
          node.getDosp().apply(this);
      }
      if(node.getC0() != null)
      {
        asignarValor(node.getC0().getText());
          node.getC0().apply(this);
      }
      outABSp0(node);
  }

  @Override
  public void caseACSp0(ACSp0 node)
  {
      inACSp0(node);
      if(node.getStrokew() != null)
      {
        attActual = "strokewidth";
          node.getStrokew().apply(this);
      }
      if(node.getDosp() != null)
      {
          node.getDosp().apply(this);
      }
      if(node.getN() != null)
      {
        asignarValor(node.getN().getText());
          node.getN().apply(this);
      }
      outACSp0(node);
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
        asignarValor(node.getN().getText());
          node.getN().apply(this);
      }
      if(node.getCo() != null)
      {
          node.getCo().apply(this);
      }
      outANum(node);
  }


}
