package com.AdvancedJava.Collections.Map;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * TreeMapDemo demonstrates sorted map implementation:
 * - Backed by Red-Black self-balancing BST
 * - Keys stored in natural sorted order (or custom Comparator)
 * - O(log N) lookup/insertion/deletion
 * - Implements NavigableMap (firstEntry, lastEntry, headMap, tailMap)
 */
public class TreeMapDemo {

    public static void main(String[] args) {
        NavigableMap<Integer, String> idNameMap = new TreeMap<>();

        idNameMap.put(103, "Charlie");
        idNameMap.put(101, "Alice");
        idNameMap.put(105, "Eve");
        idNameMap.put(102, "Bob");

        System.out.println("TreeMap sorted keys: " + idNameMap);
        System.out.println("First Entry (min key): " + idNameMap.firstEntry());
        System.out.println("Last Entry (max key):  " + idNameMap.lastEntry());

        // Navigable Map methods
        System.out.println("Floor Key for 104: " + idNameMap.floorKey(104)); // 103
        System.out.println("Ceiling Key for 104: " + idNameMap.ceilingKey(104)); // 105
    }
}
