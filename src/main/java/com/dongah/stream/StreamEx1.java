package com.dongah.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Eric", "Elena", "Java");

        Stream<String> stream = names.stream()
                .filter(name -> name.contains("l"));

        stream.forEach(System.out::println);
    }
}
