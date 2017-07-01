/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AR2 extends PR2
{
    private PCoory0 _coory0_;
    private PWid _wid_;
    private PHei _hei_;

    public AR2()
    {
        // Constructor
    }

    public AR2(
        @SuppressWarnings("hiding") PCoory0 _coory0_,
        @SuppressWarnings("hiding") PWid _wid_,
        @SuppressWarnings("hiding") PHei _hei_)
    {
        // Constructor
        setCoory0(_coory0_);

        setWid(_wid_);

        setHei(_hei_);

    }

    @Override
    public Object clone()
    {
        return new AR2(
            cloneNode(this._coory0_),
            cloneNode(this._wid_),
            cloneNode(this._hei_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAR2(this);
    }

    public PCoory0 getCoory0()
    {
        return this._coory0_;
    }

    public void setCoory0(PCoory0 node)
    {
        if(this._coory0_ != null)
        {
            this._coory0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._coory0_ = node;
    }

    public PWid getWid()
    {
        return this._wid_;
    }

    public void setWid(PWid node)
    {
        if(this._wid_ != null)
        {
            this._wid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._wid_ = node;
    }

    public PHei getHei()
    {
        return this._hei_;
    }

    public void setHei(PHei node)
    {
        if(this._hei_ != null)
        {
            this._hei_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._hei_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._coory0_)
            + toString(this._wid_)
            + toString(this._hei_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._coory0_ == child)
        {
            this._coory0_ = null;
            return;
        }

        if(this._wid_ == child)
        {
            this._wid_ = null;
            return;
        }

        if(this._hei_ == child)
        {
            this._hei_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._coory0_ == oldChild)
        {
            setCoory0((PCoory0) newChild);
            return;
        }

        if(this._wid_ == oldChild)
        {
            setWid((PWid) newChild);
            return;
        }

        if(this._hei_ == oldChild)
        {
            setHei((PHei) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
