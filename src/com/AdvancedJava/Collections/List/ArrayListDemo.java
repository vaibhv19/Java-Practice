package com.AdvancedJava.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ArrayListDemo demonstrates dynamic array list implementation:
 * - Resizable array storage
 * - Fast random access O(1) by index
 * - Slower insertions/deletions O(N) due to element shifting
 * - Allows null elements and duplicate values
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Adding elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java"); // Allows duplicates

        System.out.println("Original ArrayList: " + list);

        // Accessing by index O(1)
        System.out.println("Element at index 1: " + list.get(1));

        // Updating element
        list.set(2, "Go");
        System.out.println("After set(2, 'Go'): " + list);

        // Removing element
        list.remove("Java"); // Removes first occurrence
        System.out.println("After remove('Java'): " + list);

        // Sorting
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
    }
}
