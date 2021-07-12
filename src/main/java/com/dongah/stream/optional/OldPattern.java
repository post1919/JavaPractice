package com.dongah.stream.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OldPattern {
    public static void main(String[] args) {
        Map<Integer, String> cities = new HashMap<>();
        cities.put(1, "Seoul");
        cities.put(2, "Busan");
        cities.put(3, "Daejeon");

        String city = cities.get(4); // returns null
        int length = city == null ? 0 : city.length(); // null check
        System.out.println(length);

        Optional<String> maybeCity = Optional.ofNullable(cities.get(4));
        int lengthCity = maybeCity.map(String::length).orElse(0);
        System.out.println("lengthCity: " + lengthCity);
    }
}
