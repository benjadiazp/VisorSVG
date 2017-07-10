package svg;
import svg.node.*;
import svg.analysis.*;
import svg.analysis.DepthFirstAdapter.*;
import svg.figuras.*;
import svg.figuras.Figura;
import java.util.LinkedList;

public class Visitador extends DepthFirstAdapter {
  public LinkedList<Figura> lista = new LinkedList<>();
  private Figura figActual;
  private int tipoFig;

  /*

  1: línea
  2: círculo
  3: elipse
  4: polígono
  5: polilínea
  6: rectángulo

  */

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
}
