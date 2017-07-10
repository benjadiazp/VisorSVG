package svg;

<<<<<<< HEAD:svg/Visitador.java
import svg.node.*;
import svg.analysis.*;
import svg.analysis.DepthFirstAdapter.*;
import svg.figuras.*;
import svg.figuras.Figura;
=======
import postfix.node.*;
import postfix.analysis.*;
import postfix.analysis.DepthFirstAdapter.*;
>>>>>>> 0acbb43a79168c03d9059ebeb7fcf2df4707a35d:postfix/Visitador.java
import java.util.LinkedList;

public class Visitador extends DepthFirstAdapter {
  public LinkedList<String> lista = new LinkedList<>();

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
          node.getPolyline().apply(this);
      }
      if(node.getA() != null)
      {
          node.getA().apply(this);
      }
      outAPolylineF(node);
  }


}
