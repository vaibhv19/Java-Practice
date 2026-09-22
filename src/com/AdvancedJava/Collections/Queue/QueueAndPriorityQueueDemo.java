package com.AdvancedJava.Collections.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * QueueAndPriorityQueueDemo demonstrates FIFO queue structures and PriorityQueue (Heap):
 * - Queue interface methods: offer() [add], poll() [remove top], peek() [examine top]
 * - PriorityQueue: Min-Heap / Max-Heap structure for prioritized element processing
 */
public class QueueAndPriorityQueueDemo {

    public static void main(String[] args) {
        // 1. Standard FIFO Queue using LinkedList
        System.out.println("--- FIFO Queue ---");
        Queue<String> fifoQueue = new LinkedList<>();
        fifoQueue.offer("First");
        fifoQueue.offer("Second");
        fifoQueue.offer("Third");

        System.out.println("Queue poll (FIFO): " + fifoQueue.poll()); // First
        System.out.println("Queue peek: " + fifoQueue.peek()); // Second

        // 2. PriorityQueue (Min-Heap by default)
        System.out.println("\n--- PriorityQueue (Min-Heap) ---");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(5);

        System.out.println("PriorityQueue poll order (Lowest number first):");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // 5 10 30 40
        }
        System.out.println();
    }
}
