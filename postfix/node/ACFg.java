/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class ACFg extends PFg
{
    private TRect _rect_;

    public ACFg()
    {
        // Constructor
    }

    public ACFg(
        @SuppressWarnings("hiding") TRect _rect_)
    {
        // Constructor
        setRect(_rect_);

    }

    @Override
    public Object clone()
    {
        return new ACFg(
            cloneNode(this._rect_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACFg(this);
    }

    public TRect getRect()
    {
        return this._rect_;
    }

    public void setRect(TRect node)
    {
        if(this._rect_ != null)
        {
            this._rect_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rect_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._rect_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._rect_ == child)
        {
            this._rect_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._rect_ == oldChild)
        {
            setRect((TRect) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
