package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Adding element
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("e");

        list2.add(1);
        list2.add(2);
        list2.add(3);

        // Adding element at specific index
        list.add(1,"b");

        // Adding to the head or the tail
        list.addFirst("a");
        list.addLast("f");

        // Removing the first and the last element
        list.removeFirst();
        list.removeLast();

        // Accessing an element
        list.get(4);

        // Accessing the first element
        list.getFirst();

        // Check if an ArrayList is Empty()
        list.isEmpty();

        // Accessing the last elemetn
        list.getLast();

        // Number of elements in the list
        list.size();

        // Removing element using index
        list.remove(3);

        // Removing element by value
        list.remove("e");

        // Updating value
        list.set(0,"A");

        // Remove the whole list
        list.clear();

        // ArrayList to Array using Stream
        int[] intArr = list2.stream().mapToInt(Integer::valueOf).toArray();
        String[] stringArr = list.stream().map(String::valueOf).toArray(String[]::new);

        // ArrayList to Object[] Array
        Object[] newArr = list.toArray();
        Object[] newArr2 = list2.toArray();

        // ArrayList to String[] Array
        String[] newStringArr = list.toArray(new String[0]);

    }
}
