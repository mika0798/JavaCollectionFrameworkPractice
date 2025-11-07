package com.collection.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        /*
        - HashSet internally stores elements using HashMap. Therefore,
        HashSet utilizes hash table for fast operation such as:
        contains(), add(), remove()

        - HashSet also inherently prevents duplicate values thanks to Set implementation
        - HashSet allows one null value only
         */

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Skip due to repeating element

        System.out.println("HashSet: " + fruits);

        // Common functions
        System.out.println("Chứa Apple? " + fruits.contains("Apple"));
        fruits.remove("Banana");
        System.out.println("Sau khi xóa Banana: " + fruits);
        System.out.println("Kích thước: " + fruits.size());
        fruits.clear();
        System.out.println("Rỗng? " + fruits.isEmpty());
    }
}
