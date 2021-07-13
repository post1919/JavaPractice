package com.dongah.stream;

import com.dongah.stream.model.ProductFavorCommonReqModel;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEx {
    public static void main(String[] args) {
        String jsonStr = //"{\n" +
                "[\n" +
                "   {\n" +
                "       \"spdNo\": \"LML000002626837\",\n" +
                "       \"slPrc\": 1100,\n" +
                "       \"slQty\": 7\n" +
                "   }\n" +
                "   ,{\n" +
                "       \"spdNo\": \"LML000002626838\",\n" +
                "       \"slPrc\": 1108,\n" +
                "       \"slQty\": 8\n" +
                "   }\n" +
                "   ,{\n" +
                "       \"spdNo\": \"LML000002626839\",\n" +
                "       \"slPrc\": 1109,\n" +
                "       \"slQty\": 9\n" +
                "   }\n" +
                "   ,{\n" +
                "       \"spdNo\": \"LML000002626831\",\n" +
                "       \"slPrc\": 1101,\n" +
                "       \"slQty\": 1\n" +
                "   }\n" +
                "   ,{\n" +
                "       \"spdNo\": \"LML000002626832\",\n" +
                "       \"slPrc\": 1102,\n" +
                "       \"slQty\": 2\n" +
                "   }\n" +
                "]\n";
                //"}";

        Gson gson = new Gson();
        List<ProductFavorCommonReqModel> modelList = gson.fromJson(jsonStr, new TypeToken<List<ProductFavorCommonReqModel>>(){}.getType());
        List<ProductFavorCommonReqModel> list = modelList.stream()
            .filter(n->n.getSlQty() > 2)
            //.sorted(Collections.reverseOrder(Comparator.comparing(ProductFavorCommonReqModel::getSpdNo)))
            .sorted(Comparator.comparing(ProductFavorCommonReqModel::getSpdNo))
            .collect(Collectors.toList());

        list.forEach(n->{
            System.out.println(n.getSpdNo());
        });
    }
}
