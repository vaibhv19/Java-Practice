package com.AdvancedJava.Collections.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMapDemo demonstrates key-value pair hash table storage:
 * - O(1) average time complexity for get(), put(), remove()
 * - Allows 1 null key and multiple null values
 * - Does not guarantee order of keys
 * - Iteration over keySet(), values(), and entrySet()
 */
public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Inserting key-value pairs
        map.put("Alice", 95);
        map.put("Bob", 82);
        map.put("Charlie", 88);
        map.put(null, 100); // 1 null key permitted

        System.out.println("HashMap: " + map);

        // Accessing value by key
        System.out.println("Bob's score: " + map.get("Bob"));
        System.out.println("Contains key 'Alice'? " + map.containsKey("Alice"));

        // Iterating over EntrySet
        System.out.println("\n--- EntrySet Iteration ---");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
