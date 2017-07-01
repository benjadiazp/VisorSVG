package postfix;
import postfix.analysis.*;
import postfix.node.*;
import java.util.Stack;

class Interpreter extends DepthFirstAdapter {
  public Stack pila = new Stack<Integer>();
  public void caseTNumber(TNumber node) {
    int n = Integer.parseInt(node.getText());
    pila.push(new Integer(n));
  }
  public void outAokusExpr(APlusExpr node)
  {
    int a = ((Integer)pila.pop()).intValue();
    int b = ((Integer)pila.pop()).intValue();
    int c = a+b;
    pila.push(new Integer(c));
  }
}
