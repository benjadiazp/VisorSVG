/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class ACR1 extends PR1
{
    private PAtt _att_;
    private PR2 _r2_;
    private PAtt _a_;

    public ACR1()
    {
        // Constructor
    }

    public ACR1(
        @SuppressWarnings("hiding") PAtt _att_,
        @SuppressWarnings("hiding") PR2 _r2_,
        @SuppressWarnings("hiding") PAtt _a_)
    {
        // Constructor
        setAtt(_att_);

        setR2(_r2_);

        setA(_a_);

    }

    @Override
    public Object clone()
    {
        return new ACR1(
            cloneNode(this._att_),
            cloneNode(this._r2_),
            cloneNode(this._a_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACR1(this);
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

    public PAtt getA()
    {
        return this._a_;
    }

    public void setA(PAtt node)
    {
        if(this._a_ != null)
        {
            this._a_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._a_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._att_)
            + toString(this._r2_)
            + toString(this._a_);
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

        if(this._a_ == child)
        {
            this._a_ = null;
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

        if(this._a_ == oldChild)
        {
            setA((PAtt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
