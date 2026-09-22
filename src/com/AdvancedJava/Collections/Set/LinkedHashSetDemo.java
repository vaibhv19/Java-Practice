package com.AdvancedJava.Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSetDemo demonstrates insertion-order preserving unique set:
 * - Backed by hashtable + doubly-linked list iteration chain
 * - Maintains predictable iteration order (order of insertion)
 */
public class LinkedHashSetDemo {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("Fourth");

        System.out.println("LinkedHashSet iteration order (predictable insertion order):");
        for (String element : set) {
            System.out.print(element + " -> ");
        }
        System.out.println("END");
    }
}
