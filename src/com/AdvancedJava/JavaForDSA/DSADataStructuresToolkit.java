package com.AdvancedJava.JavaForDSA;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * DSADataStructuresToolkit demonstrates standard Java Collection templates for DSA:
 * - Dynamic Arrays (ArrayList)
 * - Frequency Map & Lookup (HashMap)
 * - Unique Set & Hash Lookup (HashSet)
 * - Stack & Queue Operations (ArrayDeque)
 * - Priority Queue / Heaps (Min-Heap / Max-Heap)
 */
public class DSADataStructuresToolkit {

    public static void main(String[] args) {
        System.out.println("--- 1. Frequency Counter via HashMap ---");
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Element Frequencies: " + freqMap);

        System.out.println("\n--- 2. LIFO Stack via ArrayDeque ---");
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // 30 20 10
        }
        System.out.println();

        System.out.println("\n--- 3. Min-Heap & Max-Heap via PriorityQueue ---");
        // Min-Heap (default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(50);
        minHeap.offer(20);
        minHeap.offer(40);
        System.out.println("Min-Heap root (smallest): " + minHeap.peek()); // 20

        // Max-Heap (Reverse order comparator)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        maxHeap.offer(50);
        maxHeap.offer(20);
        maxHeap.offer(40);
        System.out.println("Max-Heap root (largest): " + maxHeap.peek()); // 50

        System.out.println("\n--- 4. Unique Lookup via HashSet ---");
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        System.out.println("Unique Elements: " + uniqueSet);

        System.out.println("\n--- 5. Dynamic Array via ArrayList ---");
        List<Integer> list = new ArrayList<>(uniqueSet);
        System.out.println("Dynamic ArrayList from Set: " + list);
    }
}
