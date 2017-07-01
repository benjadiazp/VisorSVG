/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.analysis;

import java.util.*;
import postfix.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStart(AStart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAPr(AAPr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABPr(ABPr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAPr1(AAPr1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABPr1(ABPr1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACPr1(ACPr1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAF(AAF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABF(ABF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACF(ACF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADF(ADF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEF(AEF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFF(AFF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAAtt(AAAtt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABAtt(ABAtt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAAtt0(AAAtt0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABAtt0(ABAtt0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACAtt0(ACAtt0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAL1(AAL1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABL1(ABL1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACL1(ACL1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAL0(AL0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAC1(AAC1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABC1(ABC1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACC1(ACC1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAC2(AC2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAR1(AAR1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABR1(ABR1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACR1(ACR1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAR2(AR2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAE1(AAE1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABE1(ABE1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACE1(ACE1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAE0(AE0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANum(ANum node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAP(AAP node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABP(ABP node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACP(ACP node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAP3(AP3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAP0(AAP0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABP0(ABP0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAP1(AP1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAS(AS node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAASp(AASp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABSp(ABSp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAASp0(AASp0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABSp0(ABSp0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACSp0(ACSp0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTN(TN node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSvg1(TSvg1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSvg2(TSvg2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMayus(TMayus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCo(TCo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIg(TIg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLine(TLine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCircle(TCircle node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRect(TRect node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEllipse(TEllipse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPolygon(TPolygon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPolyline(TPolyline node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTX1(TX1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTY1(TY1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTX2(TX2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTY2(TY2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCx(TCx node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCy(TCy node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTR0(TR0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTX0(TX0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTY0(TY0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWidth(TWidth node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTHeight(THeight node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRx(TRx node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRy(TRy node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPoints(TPoints node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComa(TComa node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStyle(TStyle node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFill(TFill node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStroke(TStroke node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStrokew(TStrokew node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTC0(TC0 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPc(TPc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDosp(TDosp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
