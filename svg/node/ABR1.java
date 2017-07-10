/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class ABR1 extends PR1
{
    private PR2 _r2_;
    private PAtt _att_;

    public ABR1()
    {
        // Constructor
    }

    public ABR1(
        @SuppressWarnings("hiding") PR2 _r2_,
        @SuppressWarnings("hiding") PAtt _att_)
    {
        // Constructor
        setR2(_r2_);

        setAtt(_att_);

    }

    @Override
    public Object clone()
    {
        return new ABR1(
            cloneNode(this._r2_),
            cloneNode(this._att_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABR1(this);
    }

    public PR2 getR2()
    {
        return this._r2_;
    }

    public void setR2(PR2 node)
    {
        if(this._r2_ != null)
        {
            this._r2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._r2_ = node;
    }

    public PAtt getAtt()
    {
        return this._att_;
    }

    public void setAtt(PAtt node)
    {
        if(this._att_ != null)
        {
            this._att_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._att_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._r2_)
            + toString(this._att_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._r2_ == child)
        {
            this._r2_ = null;
            return;
        }

        if(this._att_ == child)
        {
            this._att_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._r2_ == oldChild)
        {
            setR2((PR2) newChild);
            return;
        }

        if(this._att_ == oldChild)
        {
            setAtt((PAtt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}