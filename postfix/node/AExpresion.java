/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AExpresion extends PExpresion
{
    private PPr1 _pr1_;
    private PFinFigura _finFigura_;

    public AExpresion()
    {
        // Constructor
    }

    public AExpresion(
        @SuppressWarnings("hiding") PPr1 _pr1_,
        @SuppressWarnings("hiding") PFinFigura _finFigura_)
    {
        // Constructor
        setPr1(_pr1_);

        setFinFigura(_finFigura_);

    }

    @Override
    public Object clone()
    {
        return new AExpresion(
            cloneNode(this._pr1_),
            cloneNode(this._finFigura_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpresion(this);
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

    public PFinFigura getFinFigura()
    {
        return this._finFigura_;
    }

    public void setFinFigura(PFinFigura node)
    {
        if(this._finFigura_ != null)
        {
            this._finFigura_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._finFigura_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pr1_)
            + toString(this._finFigura_);
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

        if(this._finFigura_ == child)
        {
            this._finFigura_ = null;
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

        if(this._finFigura_ == oldChild)
        {
            setFinFigura((PFinFigura) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
