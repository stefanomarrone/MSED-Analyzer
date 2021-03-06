/* This file was generated by SableCC (http://www.sablecc.org/). */

package bn.analysis.distribution.node;

import bn.analysis.distribution.analysis.Analysis;

@SuppressWarnings("nls")
public final class TProbabilityTok extends Token
{
    public TProbabilityTok()
    {
        super.setText("probability");
    }

    public TProbabilityTok(int line, int pos)
    {
        super.setText("probability");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TProbabilityTok(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTProbabilityTok(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TProbabilityTok text.");
    }
}
