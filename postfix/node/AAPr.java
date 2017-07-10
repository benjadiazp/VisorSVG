/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AAPr extends PPr
{
    private PPr1 _pr1_;

    public AAPr()
    {
        // Constructor
    }

    public AAPr(
        @SuppressWarnings("hiding") PPr1 _pr1_)
    {
        // Constructor
        setPr1(_pr1_);

    }

    @Override
    public Object clone()
    {
        return new AAPr(
            cloneNode(this._pr1_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAPr(this);
    }

    public PPr1 getPr1()
    {
        return this._pr1_;
    }

    public void setPr1(PPr1 node)
    {
        if(this._pr1_ != null)
        {
            this._pr1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pr1_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pr1_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pr1_ == child)
        {
            this._pr1_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pr1_ == oldChild)
        {
            setPr1((PPr1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
