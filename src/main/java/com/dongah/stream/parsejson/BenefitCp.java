package com.dongah.stream.parsejson;

import com.google.gson.Gson;

import java.util.*;
import java.util.stream.Collectors;

public class BenefitCp {
    public static void main(String[] args) {
        List<BenefitModel> list = Arrays.asList(
                  new BenefitModel("A", 1)
                , new BenefitModel("B", 2)
                , new BenefitModel("C", 3)
                , new BenefitModel("A", 4)
                , new BenefitModel("B", 5)
                , new BenefitModel("C", 1)
                , new BenefitModel("A", 2)
                , new BenefitModel("B", 3)
                , new BenefitModel("C", 4)
                , new BenefitModel("A", 5)
                , new BenefitModel("B", 6)
                , new BenefitModel("C", 1)
                , new BenefitModel("A", 2)
                , new BenefitModel("B", 3)
                , new BenefitModel("C", 4)
                , new BenefitModel("A", 5)
                , new BenefitModel("B", 6)
        );

        Gson gson = new Gson();

        Map<String, Integer> map = new HashMap<String, Integer>();
        map = list.stream().collect(
            Collectors.groupingBy(
                  BenefitModel::getSpdNo
                , Collectors.summingInt(BenefitModel::getSlQty)
            )
        );

        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            String formatStr = String.format("key=> %s, value=> %s", key, map.get(key));
            System.out.println(formatStr);
        }

        System.out.println("====================================");

        for(Map.Entry<String, Integer> item : map.entrySet()){
            String formatStr = String.format("key=> %s, value=> %s", item.getKey(), item.getValue());
            System.out.println(formatStr);
        }

        System.out.println("====================================");

        map.forEach((key, value)->{
            String formatStr = String.format("key=> %s, value=> %s", key, value);
            System.out.println(formatStr);
        });
    }
}
