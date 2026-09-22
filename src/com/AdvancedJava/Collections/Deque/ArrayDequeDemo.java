package com.AdvancedJava.Collections.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ArrayDequeDemo demonstrates Double-Ended Queue (Deque):
 * - Resizable array backed implementation of Deque
 * - Faster than Stack class when used as a Stack (LIFO)
 * - Faster than LinkedList when used as a Queue (FIFO)
 * - Prohibits null elements
 */
public class ArrayDequeDemo {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Using as a Double-Ended Queue
        deque.addFirst("Head Element");
        deque.addLast("Tail Element");
        deque.offerFirst("New Head");
        deque.offerLast("New Tail");

        System.out.println("ArrayDeque: " + deque);

        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("Poll Last:  " + deque.pollLast());
        System.out.println("Remaining Deque: " + deque);
    }
}
