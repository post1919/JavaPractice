package com.dongah.stream;

import com.dongah.stream.model.ProductFavorCommonReqModel;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.util.List;

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
        try {
            List<ProductFavorCommonReqModel> modelList = gson.fromJson(jsonStr.toString(), new TypeToken<List<ProductFavorCommonReqModel>>(){}.getType());

            modelList.stream().forEach(n -> System.out.println(n.getSpdNo()));
            System.out.println("============================================");
            modelList.stream().filter(n->n.getSlQty().equals(1))
            .forEach(n-> System.out.println(n.getSpdNo()));
            System.out.println("============================================");
            modelList.stream().map(n->n.getSpdNo().toLowerCase()).forEach(n-> System.out.println(n));
        } catch(JsonSyntaxException ex){
            ex.printStackTrace();
        }
    }
}
