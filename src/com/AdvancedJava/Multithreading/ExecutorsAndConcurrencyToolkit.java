package com.AdvancedJava.Multithreading;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ExecutorsAndConcurrencyToolkit demonstrates high-level concurrency utilities:
 * 1. ExecutorService & Thread Pools
 * 2. ScheduledExecutorService
 * 3. RejectedExecutionException handling
 * 4. CompletableFuture asynchronous pipelines
 * 5. Concurrent Collections: ConcurrentHashMap, CopyOnWriteArrayList, ArrayBlockingQueue
 */
public class ExecutorsAndConcurrencyToolkit {

    public static void main(String[] args) {
        // 1. Thread Pool & ExecutorService
        System.out.println("--- Fixed Thread Pool (2 Threads) ---");
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 3; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " running on Thread: " + Thread.currentThread().getName());
            });
        }
        executor.shutdown(); // Initiate graceful shutdown

        // 2. Handling RejectedExecutionException
        try {
            executor.submit(() -> System.out.println("This task should be rejected!"));
        } catch (RejectedExecutionException e) {
            System.out.println("Caught RejectedExecutionException: Cannot submit task after Executor shutdown.");
        }

        // 3. ScheduledExecutorService
        System.out.println("\n--- ScheduledExecutorService ---");
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.schedule(() -> System.out.println("Scheduled Task executed after 100ms delay."), 100, TimeUnit.MILLISECONDS);
        scheduler.shutdown();

        // 4. CompletableFuture Asynchronous Pipeline
        System.out.println("\n--- CompletableFuture Async Pipeline ---");
        CompletableFuture<String> futurePipeline = CompletableFuture.supplyAsync(() -> "hello asynchronous world")
                .thenApply(String::toUpperCase)
                .thenApply(str -> str + "!!!");

        System.out.println("CompletableFuture joined result: " + futurePipeline.join());

        // 5. Concurrent Collections
        System.out.println("\n--- Concurrent Collections ---");
        
        // ConcurrentHashMap (Lock stripping / segment locking)
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Key1", 100);
        map.putIfAbsent("Key2", 200);
        System.out.println("ConcurrentHashMap: " + map);

        // CopyOnWriteArrayList (Copy array on write operations, thread-safe iteration)
        List<String> cowList = new CopyOnWriteArrayList<>();
        cowList.add("Item 1");
        cowList.add("Item 2");
        System.out.println("CopyOnWriteArrayList: " + cowList);

        // BlockingQueue (Thread-safe producer-consumer queue)
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
        try {
            queue.put("Message 1");
            queue.put("Message 2");
            System.out.println("BlockingQueue take(): " + queue.take());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
