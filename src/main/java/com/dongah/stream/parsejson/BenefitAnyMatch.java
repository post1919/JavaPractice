package com.dongah.stream.parsejson;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BenefitAnyMatch {
    public static void main(String[] args) {
        String strJson = "{\n" +
                "\t\t\t\"mbNo\": null,\n" +
                "\t\t\t\"spdNo\": \"LML000002626837\",\n" +
                "\t\t\t\"sitmNo\": \"LML000002626837_001\",\n" +
                "\t\t\t\"slPrc\": 1100,\n" +
                "\t\t\t\"slQty\": 1,\n" +
                "\t\t\t\"discountApplyProductList\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"prNo\": \"P20210616058560\",\n" +
                "\t\t\t\t\t\"prRegNo\": 2576574,\n" +
                "\t\t\t\t\t\"prFvrNo\": null,\n" +
                "\t\t\t\t\t\"prTypCd\": \"PRD_DC\",\n" +
                "\t\t\t\t\t\"prTypNm\": \"상품할인\",\n" +
                "\t\t\t\t\t\"prKndCd\": \"PRD_SLR\",\n" +
                "\t\t\t\t\t\"prKndNm\": \"스토어할인\",\n" +
                "\t\t\t\t\t\"dcTnnoCd\": \"1ST\",\n" +
                "\t\t\t\t\t\"dcTypCd\": \"FX\",\n" +
                "\t\t\t\t\t\"dcAmt\": 10,\n" +
                "\t\t\t\t\t\"cpnNo\": null,\n" +
                "\t\t\t\t\t\"cpnIssNo\": null,\n" +
                "\t\t\t\t\t\"cartSn\": null,\n" +
                "\t\t\t\t\t\"sptDcPgmAgrYn\": \"N\",\n" +
                "\t\t\t\t\t\"sfcoShrAmt\": 0,\n" +
                "\t\t\t\t\t\"entpShrAmt\": 10,\n" +
                "\t\t\t\t\t\"dcPgmCmsn\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"prNo\": \"P20210617058661\",\n" +
                "\t\t\t\t\t\"prRegNo\": null,\n" +
                "\t\t\t\t\t\"prFvrNo\": 40342,\n" +
                "\t\t\t\t\t\"prTypCd\": \"DC_CPN\",\n" +
                "\t\t\t\t\t\"prTypNm\": \"할인쿠폰\",\n" +
                "\t\t\t\t\t\"prKndCd\": \"CPN_OVR_CPN\",\n" +
                "\t\t\t\t\t\"prKndNm\": \"중복쿠폰\",\n" +
                "\t\t\t\t\t\"dcTnnoCd\": \"4TH\",\n" +
                "\t\t\t\t\t\"dcTypCd\": \"FX\",\n" +
                "\t\t\t\t\t\"dcAmt\": 10,\n" +
                "\t\t\t\t\t\"cpnNo\": \"CP20210617000007335\",\n" +
                "\t\t\t\t\t\"cpnIssNo\": \"CI20210617000577452\",\n" +
                "\t\t\t\t\t\"cartSn\": null,\n" +
                "\t\t\t\t\t\"sptDcPgmAgrYn\": \"N\",\n" +
                "\t\t\t\t\t\"sfcoShrAmt\": 5,\n" +
                "\t\t\t\t\t\"entpShrAmt\": 5,\n" +
                "\t\t\t\t\t\"dcPgmCmsn\": 0\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"immdDcAplyTotAmt\": 1090,\n" +
                "\t\t\t\"immdDcAplyUtAmt\": 1090,\n" +
                "\t\t\t\"immdDcRt\": 0,\n" +
                "\t\t\t\"mbFvrOffrDvsCd\": \"FVR_GNRL\",\n" +
                "\t\t\t\"mbFvrOffrAmt\": 1090,\n" +
                "\t\t\t\"mbFvrOffrUtAmt\": 1090,\n" +
                "\t\t\t\"adtnDcDvsCd\": \"CPN_OVR_CPN\",\n" +
                "\t\t\t\"adtnDcAplyTotAmt\": 1080,\n" +
                "\t\t\t\"adtnDcAplyUtAmt\": 1080,\n" +
                "\t\t\t\"adtnDcAmt\": 10,\n" +
                "\t\t\t\"adtnDcUtAmt\": 10,\n" +
                "\t\t\t\"aplyPsbCpnYn\": \"Y\",\n" +
                "\t\t\t\"dnldPsbCpnYn\": null,\n" +
                "\t\t\t\"qtyPrKndCd\": null,\n" +
                "\t\t\t\"qtyDcAplyTotAmt\": null,\n" +
                "\t\t\t\"dispName\": null,\n" +
                "\t\t\t\"spdWitrPrAplyYn\": \"N\",\n" +
                "\t\t\t\"fboxBtnEpsrCd\": \"CPN_BRWS\",\n" +
                "\t\t\t\"crdProdDcYn\": \"N\",\n" +
                "\t\t\t\"crdProdDcTxt\": \"\",\n" +
                "\t\t\t\"pyCardCd\": \"\",\n" +
                "\t\t\t\"pyCardNm\": null,\n" +
                "\t\t\t\"crdProdDcEndDt\": \"\",\n" +
                "\t\t\t\"fboxBtnEpsrNm\": \"할인변경\",\n" +
                "\t\t\t\"fboxBtnEpsrStnc\": \"\",\n" +
                "\t\t\t\"stffDvsNm\": null,\n" +
                "\t\t\t\"fprdDvDcRt\": null,\n" +
                "\t\t\t\"fprdDvDcAmt\": null,\n" +
                "\t\t\t\"orginCmDcAmt\": 0,\n" +
                "\t\t\t\"dispList\": null\n" +
                "\t\t}";

        Gson gson = new Gson();
        BenefitModel bm = gson.fromJson(strJson, BenefitModel.class);

        List<BenefitModel.DiscountApplyProductList> list = bm.getDiscountApplyProductList();
        list.forEach((item)->{
            System.out.println(item.getPrKndCd());
        });

//        boolean result = bm.getDiscountApplyProductList().stream().anyMatch(dc -> "PRD_SLR".equals(dc.getPrKndCd()));
//        System.out.println("result => " + result);

        boolean r = bm.getDiscountApplyProductList().stream().anyMatch(item->"PRD_SLR".equals(item.getPrKndCd()));
        System.out.println("r => " + r);
    }
}
