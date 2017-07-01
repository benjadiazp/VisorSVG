/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class ADE1 extends PE1
{
    private PE0 _e0_;

    public ADE1()
    {
        // Constructor
    }

    public ADE1(
        @SuppressWarnings("hiding") PE0 _e0_)
    {
        // Constructor
        setE0(_e0_);

    }

    @Override
    public Object clone()
    {
        return new ADE1(
            cloneNode(this._e0_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADE1(this);
    }

    public PE0 getE0()
    {
        return this._e0_;
    }

    public void setE0(PE0 node)
    {
        if(this._e0_ != null)
        {
            this._e0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e0_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._e0_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._e0_ == child)
        {
            this._e0_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._e0_ == oldChild)
        {
            setE0((PE0) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}