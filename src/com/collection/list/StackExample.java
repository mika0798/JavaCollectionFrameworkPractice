package com.collection.list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> oldStack = new Stack<>();
        Deque<String> newStack1 = new ArrayDeque<>();
        Deque<String> newStack2 = new LinkedList<>();

        /*
        Stack is an old legacy class, people suggest to use
        ArrayDeque and LinkedList since they're faster. If you need
        fast insert/delete in the middle of the list or storing null value
        , use LinkedList.
        Otherwise, ArrayDeque is more efficient in performance
         */

        System.out.println("Stack using Stack class");
        oldStack.push("A");
        oldStack.push("B");
        oldStack.push("C");
        oldStack.push("D");
        oldStack.push("E");
        oldStack.pop();
        System.out.println("Stack: " + oldStack);
        System.out.println("Peek top: " + oldStack.peek() + "\n");


        /*
        Let's see the difference when you use LinkedList/ArrayDeque as a Stack
         */
        System.out.println("Stack using ArrayDeque class");
        newStack1.push("A");
        newStack1.push("B");
        newStack1.push("C");
        newStack1.push("D");
        newStack1.push("E");
        newStack1.pop();
        System.out.println("New Stack: " + newStack1 );
        System.out.println("Peek top: " + newStack1.peek() + "\n");
        System.out.println("Both are stacks but do you see the difference? ;)");

    }
}
