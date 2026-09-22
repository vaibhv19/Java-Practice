package com.AdvancedJava.Collections.List;

import java.util.LinkedList;

/**
 * LinkedListDemo demonstrates doubly-linked list implementation:
 * - Implements both List and Deque interfaces
 * - Fast insert/delete O(1) at ends (addFirst, removeFirst, addLast, removeLast)
 * - Slower random index search O(N)
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Node 1");
        linkedList.add("Node 2");
        linkedList.add("Node 3");

        System.out.println("Initial LinkedList: " + linkedList);

        // Deque operation methods on LinkedList
        linkedList.addFirst("Head Node");
        linkedList.addLast("Tail Node");
        System.out.println("After addFirst/addLast: " + linkedList);

        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element:  " + linkedList.getLast());

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removeFirst/removeLast: " + linkedList);
    }
}
