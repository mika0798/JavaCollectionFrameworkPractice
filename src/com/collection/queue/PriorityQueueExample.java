package com.collection.queue;

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        /*
        PriorityQueue default comparator is min-heap behavior. In this
        example, we will create 2 custom comparators, one for String queue
        and one for User queue
         */

        // Comparator favors shorter string
        Comparator<String> stringLengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        // Comparator for User list
        Comparator<User> ageComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };

        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<User> userQueue = new PriorityQueue<>(ageComparator);


        stringQueue.add("banana");
        stringQueue.add("kiwi");
        stringQueue.add("apple");
        stringQueue.add("watermelon");

        intQueue.add(10);
        intQueue.add(3);
        intQueue.add(25);
        intQueue.add(7);

        userQueue.add(new User("Tom",18));
        userQueue.add(new User("Rebecca",17));
        userQueue.add(new User("Jack",23));
        userQueue.add(new User("James",27));


        System.out.println("PriorityQueue<String> prioritizes shorter string:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll()); // Remove and retrieve the head element
        }

        System.out.println("--------------------------------");

        System.out.println("PriorityQueue<Integer> prioritizes greater number: ");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.poll()); // Remove and retrieve the head element
        }

        System.out.println("--------------------------------");

        System.out.println("PriorityQueue<User> prioritizes greater age: ");
        while (!userQueue.isEmpty()) {
            System.out.println(userQueue.poll());
        }

    }
}

class User {
    String name;
    int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public int getAge() {return age;}

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}
