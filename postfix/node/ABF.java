/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class ABF extends PF
{
    private TCircle _circle_;
    private PC1 _c1_;

    public ABF()
    {
        // Constructor
    }

    public ABF(
        @SuppressWarnings("hiding") TCircle _circle_,
        @SuppressWarnings("hiding") PC1 _c1_)
    {
        // Constructor
        setCircle(_circle_);

        setC1(_c1_);

    }

    @Override
    public Object clone()
    {
        return new ABF(
            cloneNode(this._circle_),
            cloneNode(this._c1_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABF(this);
    }

    public TCircle getCircle()
    {
        return this._circle_;
    }

    public void setCircle(TCircle node)
    {
        if(this._circle_ != null)
        {
            this._circle_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._circle_ = node;
    }

    public PC1 getC1()
    {
        return this._c1_;
    }

    public void setC1(PC1 node)
    {
        if(this._c1_ != null)
        {
            this._c1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._c1_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._circle_)
            + toString(this._c1_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._circle_ == child)
        {
            this._circle_ = null;
            return;
        }

        if(this._c1_ == child)
        {
            this._c1_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._circle_ == oldChild)
        {
            setCircle((TCircle) newChild);
            return;
        }

        if(this._c1_ == oldChild)
        {
            setC1((PC1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
