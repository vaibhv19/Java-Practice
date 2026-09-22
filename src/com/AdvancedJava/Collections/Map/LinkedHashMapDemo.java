package com.AdvancedJava.Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMapDemo demonstrates insertion-order or access-order preserving map:
 * - Maintains doubly-linked list running through all entries
 * - Useful for building LRU (Least Recently Used) cache implementations
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        // Insertion-order LinkedHashMap
        Map<String, String> capitalMap = new LinkedHashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("France", "Paris");

        System.out.println("LinkedHashMap iteration order (Insertion order preserved):");
        for (Map.Entry<String, String> entry : capitalMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
