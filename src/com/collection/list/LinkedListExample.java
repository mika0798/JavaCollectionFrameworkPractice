package com.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> newList = new LinkedList<>();
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        LinkedList<String> stackList = new LinkedList<>();
        LinkedList<String> dequeList = new LinkedList<>();
        LinkedList<String> queueList = new LinkedList<>();

        /*
        LinkedList has the same basic functions as ArrayList, including:
            add(), get(), set(), size(), remove(), clear()
        Beside that LinkedList can function as a stack, a queue, or even a deque
        since it implements both interfaces Queue and Deque
         */

        newLinkedList.add(1);
        newLinkedList.add(2);
        newLinkedList.add(3);
        newLinkedList.add(4);
        newLinkedList.add(3);
        newLinkedList.add(5);
        System.out.println("LinkedList: " + newLinkedList);

        // Retrieve the first element in the list
        System.out.println("First element: " + newLinkedList.element());
        // Retrieve the first index of an element
        System.out.println("First appearance of 3 at index " + newLinkedList.indexOf(3));
        // Retrieve the last index of an element
        System.out.println("Last appearance of 3 at index " + newLinkedList.lastIndexOf(3));


        // LinkedList functions as a Stack
        stackList.push("A");
        stackList.push("B");
        stackList.push("C");
        stackList.push("D");
        stackList.push("F");
        stackList.push("E");
        stackList.push("G");
        stackList.pop();
        System.out.println("\nStack: " + stackList);
        System.out.println("Peek top: " + stackList.peek());

        // LinkedList functions as a Queue
        queueList.offer("A");
        queueList.offer("B");
        queueList.offer("C");
        queueList.offer("D");
        queueList.offer("E");
        queueList.offer("F");
        queueList.offer("G");
        queueList.poll();
        System.out.println("\nQueue: " + queueList);
        System.out.println("Peek head: " + queueList.peek());

        // Functions as a deque
        dequeList.add("B");
        dequeList.add("C");
        dequeList.add("D");
        dequeList.add("E");
        dequeList.addFirst("A");
        dequeList.addLast("F");
        dequeList.removeFirst();
        dequeList.removeLast();
        System.out.println("\nDeck: " + dequeList);
        System.out.println("Peek first: " + dequeList.peekFirst()); // or getFirst()
        System.out.println("Peek last: " + dequeList.peekLast()); // or getLast()

        //
    }
}
