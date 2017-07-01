/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class ABMayus0 extends PMayus0
{
    private TSl _sl_;
    private TMayus _mayus_;

    public ABMayus0()
    {
        // Constructor
    }

    public ABMayus0(
        @SuppressWarnings("hiding") TSl _sl_,
        @SuppressWarnings("hiding") TMayus _mayus_)
    {
        // Constructor
        setSl(_sl_);

        setMayus(_mayus_);

    }

    @Override
    public Object clone()
    {
        return new ABMayus0(
            cloneNode(this._sl_),
            cloneNode(this._mayus_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABMayus0(this);
    }

    public TSl getSl()
    {
        return this._sl_;
    }

    public void setSl(TSl node)
    {
        if(this._sl_ != null)
        {
            this._sl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sl_ = node;
    }

    public TMayus getMayus()
    {
        return this._mayus_;
    }

    public void setMayus(TMayus node)
    {
        if(this._mayus_ != null)
        {
            this._mayus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mayus_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._sl_)
            + toString(this._mayus_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._sl_ == child)
        {
            this._sl_ = null;
            return;
        }

        if(this._mayus_ == child)
        {
            this._mayus_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._sl_ == oldChild)
        {
            setSl((TSl) newChild);
            return;
        }

        if(this._mayus_ == oldChild)
        {
            setMayus((TMayus) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
