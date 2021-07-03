package com.dongah.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        int dumCnt = Math.floorDiv(3, 2 + 1);
        int notCnt = Math.floorMod(3, 2 + 1);

        System.out.println("dumCnt => " + dumCnt);
        System.out.println("notCnt => " + notCnt);
    }
}
