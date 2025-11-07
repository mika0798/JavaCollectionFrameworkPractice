package com.collection.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        /*
        - TreeSet internally stores elements in a red-black tree
        - TreeSet does not allow null value
        - TreeSet automatically sort values in ascending order (or using custom Comparator)
         */

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(10); // Skip due to duplicate

        System.out.println("TreeSet: " + numbers);

        // Một số hàm hay dùng
        System.out.println("Smallest element: " + numbers.first());
        System.out.println("Largest element: " + numbers.last());
        System.out.println("Elements smaller than 30: " + numbers.headSet(30));
        System.out.println("Elements greater than 20: " + numbers.tailSet(20));
        System.out.println("Smaller and closest to 25: " + numbers.lower(25));
        System.out.println("Larger and closest to 25: " + numbers.higher(25));
    }
}
