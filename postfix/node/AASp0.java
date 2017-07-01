/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AASp0 extends PSp0
{
    private TFill _fill_;
    private TDosp _dosp_;
    private TC0 _c0_;

    public AASp0()
    {
        // Constructor
    }

    public AASp0(
        @SuppressWarnings("hiding") TFill _fill_,
        @SuppressWarnings("hiding") TDosp _dosp_,
        @SuppressWarnings("hiding") TC0 _c0_)
    {
        // Constructor
        setFill(_fill_);

        setDosp(_dosp_);

        setC0(_c0_);

    }

    @Override
    public Object clone()
    {
        return new AASp0(
            cloneNode(this._fill_),
            cloneNode(this._dosp_),
            cloneNode(this._c0_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAASp0(this);
    }

    public TFill getFill()
    {
        return this._fill_;
    }

    public void setFill(TFill node)
    {
        if(this._fill_ != null)
        {
            this._fill_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fill_ = node;
    }

    public TDosp getDosp()
    {
        return this._dosp_;
    }

    public void setDosp(TDosp node)
    {
        if(this._dosp_ != null)
        {
            this._dosp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dosp_ = node;
    }

    public TC0 getC0()
    {
        return this._c0_;
    }

    public void setC0(TC0 node)
    {
        if(this._c0_ != null)
        {
            this._c0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._c0_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fill_)
            + toString(this._dosp_)
            + toString(this._c0_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fill_ == child)
        {
            this._fill_ = null;
            return;
        }

        if(this._dosp_ == child)
        {
            this._dosp_ = null;
            return;
        }

        if(this._c0_ == child)
        {
            this._c0_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fill_ == oldChild)
        {
            setFill((TFill) newChild);
            return;
        }

        if(this._dosp_ == oldChild)
        {
            setDosp((TDosp) newChild);
            return;
        }

        if(this._c0_ == oldChild)
        {
            setC0((TC0) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
