package com.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args) {
        /*
        ArrayDeque is a resizable array-based implementation of Deque interface, meaning it
        is suitable for scenarios like FIFO and LIFO
        ArrayDeque is a good replacement for Stack and LinkedList in some cases:
        -It's faster than the old Stack class
        -It's a faster queue than LinkedList
        -ArrayDeque does not permit null values
         */

        Deque<String> newDeque = new ArrayDeque<>();

        newDeque.push("A");
        newDeque.push("B");
        System.out.println("Deque as Stack: " + newDeque);
        newDeque.pop();
        System.out.println("After pop(): " + newDeque);

        System.out.print("\n...And Deque as a Queue: ");
        newDeque.offer("B");
        System.out.println(newDeque);
        newDeque.poll();
        System.out.println("After poll(): " + newDeque);

        System.out.println("\nAnd now acts as a true Deque");
        newDeque.addFirst("A");
        System.out.println("Add to the front: " + newDeque);
        newDeque.addLast("C");
        System.out.println("And to the back: " + newDeque);
    }
}
