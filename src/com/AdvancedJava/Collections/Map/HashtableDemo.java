package com.AdvancedJava.Collections.Map;

import java.util.Hashtable;

/**
 * HashtableDemo demonstrates legacy synchronized map:
 * - Thread-safe (methods marked synchronized)
 * - DOES NOT allow null keys or null values (throws NullPointerException)
 * - Legacy alternative replaced by HashMap (single-threaded) or ConcurrentHashMap (multi-threaded)
 */
public class HashtableDemo {

    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>();

        table.put("Key1", "Val1");
        table.put("Key2", "Val2");

        System.out.println("Hashtable: " + table);

        try {
            table.put(null, "NullKey"); // Will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Hashtable prohibits null keys and null values.");
        }
    }
}
