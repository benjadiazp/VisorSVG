/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AC1 extends PC1
{
    private TCx _cx_;
    private TIg _ig_;
    private PNum _num_;
    private TCy _cy_;
    private TIg _a_;
    private PNum _b_;
    private TR0 _r0_;
    private TIg _c_;
    private PNum _d_;

    public AC1()
    {
        // Constructor
    }

    public AC1(
        @SuppressWarnings("hiding") TCx _cx_,
        @SuppressWarnings("hiding") TIg _ig_,
        @SuppressWarnings("hiding") PNum _num_,
        @SuppressWarnings("hiding") TCy _cy_,
        @SuppressWarnings("hiding") TIg _a_,
        @SuppressWarnings("hiding") PNum _b_,
        @SuppressWarnings("hiding") TR0 _r0_,
        @SuppressWarnings("hiding") TIg _c_,
        @SuppressWarnings("hiding") PNum _d_)
    {
        // Constructor
        setCx(_cx_);

        setIg(_ig_);

        setNum(_num_);

        setCy(_cy_);

        setA(_a_);

        setB(_b_);

        setR0(_r0_);

        setC(_c_);

        setD(_d_);

    }

    @Override
    public Object clone()
    {
        return new AC1(
            cloneNode(this._cx_),
            cloneNode(this._ig_),
            cloneNode(this._num_),
            cloneNode(this._cy_),
            cloneNode(this._a_),
            cloneNode(this._b_),
            cloneNode(this._r0_),
            cloneNode(this._c_),
            cloneNode(this._d_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAC1(this);
    }

    public TCx getCx()
    {
        return this._cx_;
    }

    public void setCx(TCx node)
    {
        if(this._cx_ != null)
        {
            this._cx_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cx_ = node;
    }

    public TIg getIg()
    {
        return this._ig_;
    }

    public void setIg(TIg node)
    {
        if(this._ig_ != null)
        {
            this._ig_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ig_ = node;
    }

    public PNum getNum()
    {
        return this._num_;
    }

    public void setNum(PNum node)
    {
        if(this._num_ != null)
        {
            this._num_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._num_ = node;
    }

    public TCy getCy()
    {
        return this._cy_;
    }

    public void setCy(TCy node)
    {
        if(this._cy_ != null)
        {
            this._cy_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cy_ = node;
    }

    public TIg getA()
    {
        return this._a_;
    }

    public void setA(TIg node)
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

    public PNum getB()
    {
        return this._b_;
    }

    public void setB(PNum node)
    {
        if(this._b_ != null)
        {
            this._b_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._b_ = node;
    }

    public TR0 getR0()
    {
        return this._r0_;
    }

    public void setR0(TR0 node)
    {
        if(this._r0_ != null)
        {
            this._r0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._r0_ = node;
    }

    public TIg getC()
    {
        return this._c_;
    }

    public void setC(TIg node)
    {
        if(this._c_ != null)
        {
            this._c_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._c_ = node;
    }

    public PNum getD()
    {
        return this._d_;
    }

    public void setD(PNum node)
    {
        if(this._d_ != null)
        {
            this._d_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._d_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cx_)
            + toString(this._ig_)
            + toString(this._num_)
            + toString(this._cy_)
            + toString(this._a_)
            + toString(this._b_)
            + toString(this._r0_)
            + toString(this._c_)
            + toString(this._d_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cx_ == child)
        {
            this._cx_ = null;
            return;
        }

        if(this._ig_ == child)
        {
            this._ig_ = null;
            return;
        }

        if(this._num_ == child)
        {
            this._num_ = null;
            return;
        }

        if(this._cy_ == child)
        {
            this._cy_ = null;
            return;
        }

        if(this._a_ == child)
        {
            this._a_ = null;
            return;
        }

        if(this._b_ == child)
        {
            this._b_ = null;
            return;
        }

        if(this._r0_ == child)
        {
            this._r0_ = null;
            return;
        }

        if(this._c_ == child)
        {
            this._c_ = null;
            return;
        }

        if(this._d_ == child)
        {
            this._d_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cx_ == oldChild)
        {
            setCx((TCx) newChild);
            return;
        }

        if(this._ig_ == oldChild)
        {
            setIg((TIg) newChild);
            return;
        }

        if(this._num_ == oldChild)
        {
            setNum((PNum) newChild);
            return;
        }

        if(this._cy_ == oldChild)
        {
            setCy((TCy) newChild);
            return;
        }

        if(this._a_ == oldChild)
        {
            setA((TIg) newChild);
            return;
        }

        if(this._b_ == oldChild)
        {
            setB((PNum) newChild);
            return;
        }

        if(this._r0_ == oldChild)
        {
            setR0((TR0) newChild);
            return;
        }

        if(this._c_ == oldChild)
        {
            setC((TIg) newChild);
            return;
        }

        if(this._d_ == oldChild)
        {
            setD((PNum) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
