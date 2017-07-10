package svg;
import svg.node.*;
import svg.analysis.*;
import svg.analysis.DepthFirstAdapter.*;
import svg.figuras.*;
import svg.figuras.Figura;
import java.util.LinkedList;

public class Visitador extends DepthFirstAdapter {
  public LinkedList<Figura> lista = new LinkedList<>();

  public Visitador()
  {

  }


  @Override
  public void caseALineF(ALineF node)
  {
      inALineF(node);
      if(node.getLine() != null)
      {

        System.out.println("Línea creada.");
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
        System.out.println("Crear círculo.");
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
        System.out.println("Crear círculo.");
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
        System.out.println("Crear círculo.");
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
        System.out.println("Crear círculo.");
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
        System.out.println("Crear círculo.");
          node.getPolyline().apply(this);
      }
      if(node.getA() != null)
      {
          node.getA().apply(this);
      }
      outAPolylineF(node);
  }


}
