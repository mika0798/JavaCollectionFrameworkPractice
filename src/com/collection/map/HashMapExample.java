package com.collection.map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        /*
        - HashMap stores elements as key-value pairs
        - Every key is unique, values can be duplicated
        - HashMap permits one null key and multiple null values
        - Null key is always at index 0
        - Elements stores in HashMap do not follow an order
        - Elements stored in buckets as entries
        - If elements have the same hashCode(), they will be stored in
        the same bucket and form a linked list
        - When the amount of entries in a bucket exceeds a thresh hold, bucket
        linked list will become a red-black tree, access speed will be also reduced
         */

        HashMap<Integer, String> students = new HashMap<>();

        // Adding elements
        students.put(101, "Amy");
        students.put(102, "Barbara");
        students.put(103, "Callum");
        students.put(101, "Daniel"); // Overwrite/Update value of element that has the key 101

        System.out.println("HashMap: " + students);

        // Common functions
        System.out.println("Students with ID 102: " + students.get(102));
        System.out.println("Does key 103 exist in the collection? " + students.containsKey(103));
        System.out.println("Does value \"Barbara\" exist? " + students.containsValue("Barbara"));
        students.remove(102);
        System.out.println("HashMap after deleting element with key 102: " + students);
        System.out.println("Size: " + students.size());
        students.clear();
        System.out.println("Is the HashMap empty now? " + students.isEmpty());
    }
}
