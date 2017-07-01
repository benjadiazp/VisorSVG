/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class ACL1 extends PL1
{
    private PAtt _att_;
    private PL0 _l0_;
    private PAtt _a_;

    public ACL1()
    {
        // Constructor
    }

    public ACL1(
        @SuppressWarnings("hiding") PAtt _att_,
        @SuppressWarnings("hiding") PL0 _l0_,
        @SuppressWarnings("hiding") PAtt _a_)
    {
        // Constructor
        setAtt(_att_);

        setL0(_l0_);

        setA(_a_);

    }

    @Override
    public Object clone()
    {
        return new ACL1(
            cloneNode(this._att_),
            cloneNode(this._l0_),
            cloneNode(this._a_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACL1(this);
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

    public PL0 getL0()
    {
        return this._l0_;
    }

    public void setL0(PL0 node)
    {
        if(this._l0_ != null)
        {
            this._l0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._l0_ = node;
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
            + toString(this._l0_)
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

        if(this._l0_ == child)
        {
            this._l0_ = null;
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

        if(this._l0_ == oldChild)
        {
            setL0((PL0) newChild);
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