package com.AdvancedJava.Collections.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSetDemo demonstrates unordered set storing unique elements:
 * - Backed by HashMap hashtable
 * - O(1) performance for add, remove, contains
 * - No duplicate elements allowed
 * - Does not preserve insertion order
 */
public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        boolean duplicateAdded = set.add("Apple"); // Returns false, duplicate rejected

        System.out.println("HashSet elements: " + set);
        System.out.println("Was duplicate 'Apple' added? " + duplicateAdded);
        System.out.println("Contains 'Banana'? " + set.contains("Banana"));

        set.remove("Banana");
        System.out.println("After remove('Banana'): " + set);
    }
}
