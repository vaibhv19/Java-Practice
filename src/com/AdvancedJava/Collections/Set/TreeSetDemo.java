package com.AdvancedJava.Collections.Set;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * TreeSetDemo demonstrates sorted set implementation:
 * - Backed by Red-Black self-balancing binary search tree
 * - Elements stored in natural sorted order (or custom Comparator)
 * - O(log N) performance for add, remove, search
 * - Implements NavigableSet (first, last, lower, higher, floor, ceiling)
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(30);

        System.out.println("TreeSet (Natural Sorted Order): " + numbers);
        System.out.println("First (min): " + numbers.first());
        System.out.println("Last (max):  " + numbers.last());

        // Navigable Set methods
        System.out.println("Lower than 30:  " + numbers.lower(30)); // 20
        System.out.println("Higher than 30: " + numbers.higher(30)); // 40
        System.out.println("HeadSet (< 30): " + numbers.headSet(30));
        System.out.println("TailSet (>= 30): " + numbers.tailSet(30));
    }
}
