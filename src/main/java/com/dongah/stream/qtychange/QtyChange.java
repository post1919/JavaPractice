package com.dongah.stream.qtychange;

import com.google.gson.Gson;

public class QtyChange {
    public static void main(String[] args) {
        String strJson = "{\n" +
                "        \"mbNo\": null,\n" +
                "        \"spdNo\": \"LML000002626837\",\n" +
                "        \"sitmNo\": \"LML000002626837_001\",\n" +
                "        \"slPrc\": 1100,\n" +
                "        \"slQty\": 2,\n" +
                "        \"discountApplyProductList\": [\n" +
                "            {\n" +
                "                \"prNo\": \"P20210616058560\",\n" +
                "                \"prRegNo\": 2576574,\n" +
                "                \"prFvrNo\": null,\n" +
                "                \"prTypCd\": \"PRD_DC\",\n" +
                "                \"prTypNm\": \"상품할인\",\n" +
                "                \"prKndCd\": \"PRD_SLR\",\n" +
                "                \"prKndNm\": \"스토어할인\",\n" +
                "                \"dcTnnoCd\": \"1ST\",\n" +
                "                \"dcTypCd\": \"FX\",\n" +
                "                \"dcAmt\": 20,\n" +
                "                \"cpnNo\": null,\n" +
                "                \"cpnIssNo\": null,\n" +
                "                \"cartSn\": null,\n" +
                "                \"sptDcPgmAgrYn\": \"N\",\n" +
                "                \"sfcoShrAmt\": 0,\n" +
                "                \"entpShrAmt\": 20,\n" +
                "                \"dcPgmCmsn\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"prNo\": \"P20210702059361\",\n" +
                "                \"prRegNo\": 66508,\n" +
                "                \"prFvrNo\": 40987,\n" +
                "                \"prTypCd\": \"DC_PRD\",\n" +
                "                \"prTypNm\": \"수량행사\",\n" +
                "                \"prKndCd\": \"PRD_NP1\",\n" +
                "                \"prKndNm\": \"N+1\",\n" +
                "                \"dcTnnoCd\": \"2ND\",\n" +
                "                \"dcTypCd\": \"FL\",\n" +
                "                \"dcAmt\": 0,\n" +
                "                \"cpnNo\": null,\n" +
                "                \"cpnIssNo\": null,\n" +
                "                \"cartSn\": null,\n" +
                "                \"sptDcPgmAgrYn\": \"N\",\n" +
                "                \"sfcoShrAmt\": 0,\n" +
                "                \"entpShrAmt\": 0,\n" +
                "                \"dcPgmCmsn\": 0\n" +
                "            }\n" +
                "        ],\n" +
                "        \"immdDcAplyTotAmt\": 2180,\n" +
                "        \"immdDcAplyUtAmt\": 1090,\n" +
                "        \"immdDcRt\": 0,\n" +
                "        \"mbFvrOffrDvsCd\": \"FVR_GNRL\",\n" +
                "        \"mbFvrOffrAmt\": 2180,\n" +
                "        \"mbFvrOffrUtAmt\": 1090,\n" +
                "        \"adtnDcDvsCd\": \"\",\n" +
                "        \"adtnDcAplyTotAmt\": 2180,\n" +
                "        \"adtnDcAplyUtAmt\": 1090,\n" +
                "        \"adtnDcAmt\": 0,\n" +
                "        \"adtnDcUtAmt\": 0,\n" +
                "        \"aplyPsbCpnYn\": \"N\",\n" +
                "        \"dnldPsbCpnYn\": null,\n" +
                "        \"qtyPrKndCd\": null,\n" +
                "        \"qtyDcAplyTotAmt\": null,\n" +
                "        \"dispName\": \"3개 담으면, 그 중 1개 무료\",\n" +
                "        \"spdWitrPrAplyYn\": \"N\",\n" +
                "        \"fboxBtnEpsrCd\": \"NON_EPSR\",\n" +
                "        \"crdProdDcYn\": \"N\",\n" +
                "        \"crdProdDcTxt\": \"\",\n" +
                "        \"pyCardCd\": \"\",\n" +
                "        \"pyCardNm\": null,\n" +
                "        \"crdProdDcEndDt\": \"\",\n" +
                "        \"fboxBtnEpsrNm\": \"\",\n" +
                "        \"fboxBtnEpsrStnc\": \"\",\n" +
                "        \"stffDvsNm\": null,\n" +
                "        \"fprdDvDcRt\": null,\n" +
                "        \"fprdDvDcAmt\": null,\n" +
                "        \"orginCmDcAmt\": 0,\n" +
                "        \"dispList\": null\n" +
                "}";

        Gson gson = new Gson();
        QtyChangeModel qtyChangeModel = gson.fromJson(strJson, QtyChangeModel.class);

        long count = qtyChangeModel.getDiscountApplyProductList().stream().filter(dc -> "PRD_NP1".equals(dc.getPrKndCd())).count();

        System.out.println(count);
    }
}