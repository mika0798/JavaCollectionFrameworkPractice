package com.collection.map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        /*
        - Store key-value pairs based on red-black tree structure
        - Does not allow null key but null values
        - Automatically sorts elements in ascending order (or by using custom Comparator)
         */

        TreeMap<Integer, String> products = new TreeMap<>();

        products.put(300, "Cookies");
        products.put(100, "Milk");
        products.put(200, "Sweets");
        products.put(150, "Juices");

        System.out.println("TreeMap: " + products);

        // Common functions
        System.out.println("Smallest key: " + products.firstKey());
        System.out.println("Largest key: " + products.lastKey());
        System.out.println("Closest key and < 200: " + products.lowerKey(200));
        System.out.println("Closest key and > 200: " + products.higherKey(200));
        System.out.println("Greater than 150: " + products.tailMap(150));
        System.out.println("Less than 150: " + products.headMap(150));
    }
}
