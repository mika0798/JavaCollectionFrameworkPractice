package com.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        /*
        - LinkedHashMap is just like HashMap, however it preserves
        insertion order
        - LinkedHashMap is beneficial in logging or caching
         */

        LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();

        scores.put("Lynn", 85);
        scores.put("Joel", 90);
        scores.put("Noel", 93);
        scores.put("Halbert", 95);
        scores.put("Jenn", 94);
        scores.put("Joel", 92); // Overwrite/Update value

        System.out.println("LinkedHashMap: " + scores);

        for (String name : scores.keySet()) {
            System.out.println(name + "\t → " + scores.get(name));
        }
    }
}
