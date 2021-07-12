package com.dongah.stream.model;

import lombok.Data;

import java.math.BigDecimal;

/** ProductWithOutInsFavorInfoReqModel, ProductFavorBoxReqModel 의 부모클래스.
 * 공통로직 정의를 위해 생성.*/
@Data
public class ProductFavorCommonReqModel {

    private String mbNo;

    private String spdNo;

    private String sitmNo;

    private String trGrpCd;

    private String ctrtTypCd;

    private String trNo;

    private String lrtrNo;

    private String strCd;

    private BigDecimal slPrc;

    private Integer slQty;

    private BigDecimal sfcoPdMrgnRt;

    private BigDecimal sfcoPdLwstMrgnRt;

    private BigDecimal afflPdMrgnRt;

    private BigDecimal afflPdLwstMrgnRt;

    private String infwMdiaCd;

    private String chCsfCd;

    private String chTypCd;

    private String chNo;

    private String chDtlNo;

    private String aplyStdDttm;

    private String thdyPdYn;

    private String crdPrdDcAplyYn;

    private String brdNo;

    //private FavorBoxVersion cpnBoxVersion;

}
