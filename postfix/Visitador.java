import postfix.node.*;
import postfix.DepthFirstAdapter.*;

public class Visitador extends DepthFirstAdapter {
  public void inStart(Start node)
  {
      defaultIn(node);
  }

  public void outStart(Start node)
  {
      defaultOut(node);
  }
}
