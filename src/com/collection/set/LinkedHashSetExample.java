package com.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        /*
        LinkedHashSet is created based on HashSet but
        it remains insertion order
         */

        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Canada");
        cities.add("Kyoto");
        cities.add("Osaka");
        cities.add("Kyoto"); // Skip - duplicate
        cities.add("Perth");

        System.out.println("LinkedHashSet: " + cities);

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
