package com.dongah.stream.parsejson;

import lombok.Data;

import java.util.List;

@Data
public class BenefitModel {

    private int orginCmDcAmt;
    private String fboxBtnEpsrStnc;
    private String fboxBtnEpsrNm;
    private String crdProdDcEndDt;
    private String pyCardCd;
    private String crdProdDcTxt;
    private String crdProdDcYn;
    private String fboxBtnEpsrCd;
    private String spdWitrPrAplyYn;
    private String aplyPsbCpnYn;
    private int adtnDcUtAmt;
    private int adtnDcAmt;
    private int adtnDcAplyUtAmt;
    private int adtnDcAplyTotAmt;
    private String adtnDcDvsCd;
    private int mbFvrOffrUtAmt;
    private int mbFvrOffrAmt;
    private String mbFvrOffrDvsCd;
    private int immdDcRt;
    private int immdDcAplyUtAmt;
    private int immdDcAplyTotAmt;
    private List<DiscountApplyProductList> discountApplyProductList;
    private int slQty;
    private int slPrc;
    private String sitmNo;
    private String spdNo;

    @Data
    public static class DiscountApplyProductList {
        private int dcPgmCmsn;
        private int entpShrAmt;
        private int sfcoShrAmt;
        private String sptDcPgmAgrYn;
        private String cpnIssNo;
        private String cpnNo;
        private int dcAmt;
        private String dcTypCd;
        private String dcTnnoCd;
        private String prKndNm;
        private String prKndCd;
        private String prTypNm;
        private String prTypCd;
        private int prFvrNo;
        private String prNo;
    }

    BenefitModel(String spdNo, int slQty){
        this.spdNo = spdNo;
        this.slQty = slQty;
    }
}
