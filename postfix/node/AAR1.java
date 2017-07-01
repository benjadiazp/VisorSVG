/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AAR1 extends PR1
{
    private PAtt _att_;
    private PR2 _r2_;

    public AAR1()
    {
        // Constructor
    }

    public AAR1(
        @SuppressWarnings("hiding") PAtt _att_,
        @SuppressWarnings("hiding") PR2 _r2_)
    {
        // Constructor
        setAtt(_att_);

        setR2(_r2_);

    }

    @Override
    public Object clone()
    {
        return new AAR1(
            cloneNode(this._att_),
            cloneNode(this._r2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAR1(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._att_)
            + toString(this._r2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._att_ == child)
        {
            this._att_ = null;
            return;
        }

        if(this._r2_ == child)
        {
            this._r2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._att_ == oldChild)
        {
            setAtt((PAtt) newChild);
            return;
        }

        if(this._r2_ == oldChild)
        {
            setR2((PR2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
