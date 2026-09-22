package com.AdvancedJava.Collections.List;

import java.util.Stack;
import java.util.Vector;

/**
 * VectorAndStackDemo demonstrates legacy synchronized collection structures:
 * - Vector: Synchronized resizable array list
 * - Stack: LIFO (Last-In-First-Out) stack structure extending Vector
 */
public class VectorAndStackDemo {

    public static void main(String[] args) {
        // Vector Demo
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector elements: " + vector);
        System.out.println("Vector capacity: " + vector.capacity());

        // Stack Demo (LIFO)
        Stack<String> stack = new Stack<>();
        stack.push("Page 1");
        stack.push("Page 2");
        stack.push("Page 3");

        System.out.println("\nStack after 3 pushes: " + stack);
        System.out.println("Peek top element: " + stack.peek());

        System.out.println("Pop element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
