package com.dongah.stream;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxFavorInfor {
    public static void main(String[] args) {
        String jsonStr = "{\n" +
                "      \"mbNo\": null,\n" +
                "      \"spdNo\": \"LML000002626837\",\n" +
                "      \"sitmNo\": \"LML000002626837_001\",\n" +
                "      \"slPrc\": 1100,\n" +
                "      \"slQty\": 1,\n" +
                "      \"discountApplyProductList\": [\n" +
                "        {\n" +
                "          \"prNo\": \"P20210616058560\",\n" +
                "          \"prRegNo\": 2576574,\n" +
                "          \"prFvrNo\": null,\n" +
                "          \"prTypCd\": \"PRD_DC\",\n" +
                "          \"prTypNm\": \"상품할인\",\n" +
                "          \"prKndCd\": \"PRD_SLR\",\n" +
                "          \"prKndNm\": \"스토어할인\",\n" +
                "          \"dcTnnoCd\": \"1ST\",\n" +
                "          \"dcTypCd\": \"FX\",\n" +
                "          \"dcAmt\": 10,\n" +
                "          \"cpnNo\": null,\n" +
                "          \"cpnIssNo\": null,\n" +
                "          \"cartSn\": null,\n" +
                "          \"sptDcPgmAgrYn\": \"N\",\n" +
                "          \"sfcoShrAmt\": 0,\n" +
                "          \"entpShrAmt\": 10,\n" +
                "          \"dcPgmCmsn\": 0\n" +
                "        },\n" +
                "        {\n" +
                "          \"prNo\": \"P20210702059361\",\n" +
                "          \"prRegNo\": 66508,\n" +
                "          \"prFvrNo\": 40987,\n" +
                "          \"prTypCd\": \"DC_PRD\",\n" +
                "          \"prTypNm\": \"수량행사\",\n" +
                "          \"prKndCd\": \"PRD_NP1\",\n" +
                "          \"prKndNm\": \"N+1\",\n" +
                "          \"dcTnnoCd\": \"2ND\",\n" +
                "          \"dcTypCd\": \"FL\",\n" +
                "          \"dcAmt\": 0,\n" +
                "          \"cpnNo\": null,\n" +
                "          \"cpnIssNo\": null,\n" +
                "          \"cartSn\": null,\n" +
                "          \"sptDcPgmAgrYn\": \"N\",\n" +
                "          \"sfcoShrAmt\": 0,\n" +
                "          \"entpShrAmt\": 0,\n" +
                "          \"dcPgmCmsn\": 0\n" +
                "        }\n" +
                "      ],\n" +
                "      \"immdDcAplyTotAmt\": 1090,\n" +
                "      \"immdDcAplyUtAmt\": 1090,\n" +
                "      \"immdDcRt\": 0,\n" +
                "      \"mbFvrOffrDvsCd\": \"FVR_GNRL\",\n" +
                "      \"mbFvrOffrAmt\": 1090,\n" +
                "      \"mbFvrOffrUtAmt\": 1090,\n" +
                "      \"adtnDcDvsCd\": \"\",\n" +
                "      \"adtnDcAplyTotAmt\": 1090,\n" +
                "      \"adtnDcAplyUtAmt\": 1090,\n" +
                "      \"adtnDcAmt\": 0,\n" +
                "      \"adtnDcUtAmt\": 0,\n" +
                "      \"aplyPsbCpnYn\": \"N\",\n" +
                "      \"dnldPsbCpnYn\": \"N\",\n" +
                "      \"qtyPrKndCd\": null,\n" +
                "      \"qtyDcAplyTotAmt\": null,\n" +
                "      \"dispName\": \"3개 담으면, 그 중 1개 무료\",\n" +
                "      \"spdWitrPrAplyYn\": \"N\",\n" +
                "      \"fboxBtnEpsrCd\": \"NON_EPSR\",\n" +
                "      \"crdProdDcYn\": \"N\",\n" +
                "      \"crdProdDcTxt\": \"\",\n" +
                "      \"pyCardCd\": \"\",\n" +
                "      \"pyCardNm\": null,\n" +
                "      \"crdProdDcEndDt\": \"\",\n" +
                "      \"fboxBtnEpsrNm\": \"\",\n" +
                "      \"fboxBtnEpsrStnc\": \"\",\n" +
                "      \"stffDvsNm\": null,\n" +
                "      \"fprdDvDcRt\": null,\n" +
                "      \"fprdDvDcAmt\": null,\n" +
                "      \"orginCmDcAmt\": 0,\n" +
                "      \"dispList\": [\n" +
                "        {\n" +
                "          \"dispName\": \"3개 담으면, 그 중 1개 무료\",\n" +
                "          \"highLight\": [\n" +
                "            \"3개\",\n" +
                "            \"1개\"\n" +
                "          ]\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n";

        Gson gson = new Gson();
        MaxFavorInforReqModel reqModel = gson.fromJson(jsonStr, MaxFavorInforReqModel.class);
        Optional<List<MaxFavorInforReqModel.DiscountApplyProductList>> dispList = Optional.ofNullable(reqModel.getDiscountApplyProductList());
        if(dispList.isPresent()){
            long cnt = dispList.get().stream().filter(n-> n.getPrKndCd().equals("PRD_SLR"))
            .peek(System.out::println).count();

            System.out.println("cnt => " + cnt);
        }
    }
}
