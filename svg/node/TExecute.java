/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class TExecute extends Token
{
    public TExecute()
    {
        super.setText("^Z");
    }

    public TExecute(int line, int pos)
    {
        super.setText("^Z");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TExecute(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTExecute(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TExecute text.");
    }
}