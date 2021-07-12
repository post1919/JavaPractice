package com.dongah.stream;

import com.google.gson.Gson;

import java.util.Map;

public class map {
    public static void main(String[] args) {
        String jsonStr = "{\n" +
                "\t\"spdNo\": \"LML000002626837\",\n" +
                "\t\"sitmNo\": \"LML000002626837_001\",\n" +
                "\t\"trGrpCd\": \"LM\",\n" +
                "\t\"trNo\": \"LM000000\",\n" +
                "\t\"lrtrNo\": \"SLM029550\",\n" +
                "\t\"strCd\": \"981\",\n" +
                "\t\"ctrtTypCd\": \"B\",\n" +
                "\t\"slPrc\": 1100,\n" +
                "\t\"slQty\": 1,\n" +
                "\t\"scatNo\": \"BC12010400\",\n" +
                "\t\"brdNo\": \"\",\n" +
                "\t\"sfcoPdMrgnRt\": 3.6,\n" +
                "\t\"sfcoPdLwstMrgnRt\": 0,\n" +
                "\t\"afflPdMrgnRt\": null,\n" +
                "\t\"afflPdLwstMrgnRt\": null,\n" +
                "\t\"pcsLwstMrgnRt\": 0,\n" +
                "\t\"infwMdiaCd\": \"PC\",\n" +
                "\t\"chCsfCd\": \"DI\",\n" +
                "\t\"chTypCd\": \"DI02\",\n" +
                "\t\"chNo\": \"100205\",\n" +
                "\t\"chDtlNo\": \"1000739\",\n" +
                "\t\"aplyStdDttm\": \"20210705161658\",\n" +
                "\t\"cartDvsCd\": \"01\",\n" +
                "\t\"thdyPdYn\": \"N\",\n" +
                "\t\"dvCst\": 2500,\n" +
                "\t\"fprdDvPdYn\": \"N\",\n" +
                "\t\"cpnBoxVersion\": \"V2\"\n" +
                "}";

//        System.out.println("jsonStr=> " + jsonStr);
        Gson gson = new Gson();
        Map<String, Object> map = gson.fromJson(jsonStr, Map.class);
        map.forEach((k,v)->{
            System.out.format("key=>%s, value=>%s\n", k, v);
        });

        map.entrySet().stream().forEach(System.out::println);
    }
}

