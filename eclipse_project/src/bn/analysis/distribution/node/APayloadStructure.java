/* This file was generated by SableCC (http://www.sablecc.org/). */

package bn.analysis.distribution.node;

import bn.analysis.distribution.analysis.Analysis;

@SuppressWarnings("nls")
public final class APayloadStructure extends PStructure
{
    private PFloat _float_;
    private TSslash _sslash_;
    private PLegend _legend_;

    public APayloadStructure()
    {
        // Constructor
    }

    public APayloadStructure(
        @SuppressWarnings("hiding") PFloat _float_,
        @SuppressWarnings("hiding") TSslash _sslash_,
        @SuppressWarnings("hiding") PLegend _legend_)
    {
        // Constructor
        setFloat(_float_);

        setSslash(_sslash_);

        setLegend(_legend_);

    }

    @Override
    public Object clone()
    {
        return new APayloadStructure(
            cloneNode(this._float_),
            cloneNode(this._sslash_),
            cloneNode(this._legend_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPayloadStructure(this);
    }

    public PFloat getFloat()
    {
        return this._float_;
    }

    public void setFloat(PFloat node)
    {
        if(this._float_ != null)
        {
            this._float_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._float_ = node;
    }

    public TSslash getSslash()
    {
        return this._sslash_;
    }

    public void setSslash(TSslash node)
    {
        if(this._sslash_ != null)
        {
            this._sslash_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sslash_ = node;
    }

    public PLegend getLegend()
    {
        return this._legend_;
    }

    public void setLegend(PLegend node)
    {
        if(this._legend_ != null)
        {
            this._legend_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._legend_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._float_)
            + toString(this._sslash_)
            + toString(this._legend_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._float_ == child)
        {
            this._float_ = null;
            return;
        }

        if(this._sslash_ == child)
        {
            this._sslash_ = null;
            return;
        }

        if(this._legend_ == child)
        {
            this._legend_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._float_ == oldChild)
        {
            setFloat((PFloat) newChild);
            return;
        }

        if(this._sslash_ == oldChild)
        {
            setSslash((TSslash) newChild);
            return;
        }

        if(this._legend_ == oldChild)
        {
            setLegend((PLegend) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
