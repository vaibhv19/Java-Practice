package com.AdvancedJava.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ThreadBasicsAndLifecycle demonstrates:
 * - Extending Thread vs Implementing Runnable vs Implementing Callable<T>
 * - Thread lifecycle methods: start(), run(), sleep(), join(), interrupt()
 * - Retrieving return values from asynchronous tasks via Future<T>
 */

// 1. Extending Thread
class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("CustomThread running on thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(100); // sleep() demo
        } catch (InterruptedException e) {
            System.out.println("CustomThread interrupted!");
        }
    }
}

// 2. Implementing Runnable
class CustomRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("CustomRunnable running on thread: " + Thread.currentThread().getName());
    }
}

// 3. Implementing Callable<T>
class CustomCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("CustomCallable calculating on thread: " + Thread.currentThread().getName());
        Thread.sleep(200);
        return 42; // Returns result
    }
}

public class ThreadBasicsAndLifecycle {

    public static void main(String[] args) {
        System.out.println("Main thread started: " + Thread.currentThread().getName());

        // Launching CustomThread
        CustomThread thread1 = new CustomThread();
        thread1.start(); // Spawns new OS thread and invokes run()

        // Launching CustomRunnable
        Thread thread2 = new Thread(new CustomRunnable());
        thread2.start();

        // Demonstrating join() to wait for worker threads
        try {
            thread1.join(); // Main thread pauses until thread1 terminates
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted.");
        }

        // Demonstrating interrupt()
        Thread worker = new Thread(() -> {
            try {
                System.out.println("Worker thread sleeping for 5 seconds...");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Worker thread received interrupt signal safely!");
            }
        });
        worker.start();
        worker.interrupt(); // Interrupts sleeping worker thread

        // Demonstrating Callable & Future
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> futureResult = executor.submit(new CustomCallable());

        try {
            // Future.get() blocks until Callable completes and returns result
            Integer result = futureResult.get();
            System.out.println("Result received from Callable Future: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

        System.out.println("Main thread completed.");
    }
}
