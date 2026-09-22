package com.AdvancedJava.Collections.Iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * IteratorAndListIteratorDemo demonstrates collection iteration mechanisms:
 * - Iterator: Forward-only traversal for all Collection types (hasNext(), next(), remove()).
 * - ListIterator: Bidirectional traversal for List structures (hasPrevious(), previous(), set(), add()).
 * - Demonstrates safe removal during iteration (avoiding ConcurrentModificationException).
 */
public class IteratorAndListIteratorDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");
        list.add("Delta");

        // 1. Iterator (Forward traversal & safe removal)
        System.out.println("--- Iterator Traversal & Safe Remove ---");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("Beta")) {
                iterator.remove(); // Safely removes "Beta" without throwing ConcurrentModificationException
            }
        }
        System.out.println("List after Iterator removal: " + list);

        // 2. ListIterator (Bidirectional traversal)
        System.out.println("\n--- ListIterator Backward Traversal ---");
        ListIterator<String> listIterator = list.listIterator(list.size()); // Start at end
        while (listIterator.hasPrevious()) {
            System.out.println("Previous index " + listIterator.previousIndex() + ": " + listIterator.previous());
        }
    }
}
