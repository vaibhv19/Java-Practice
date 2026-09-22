package com.AdvancedJava.Multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * SynchronizationAndLocks demonstrates race condition prevention and thread safety mechanisms:
 * 1. Race Condition demo (un-synchronized counter)
 * 2. synchronized keyword (intrinsic lock / monitor)
 * 3. volatile keyword (guarantees visibility across CPU caches)
 * 4. AtomicInteger (lock-free atomic compare-and-swap CAS operations)
 * 5. ReentrantLock (explicit lock with lock() / unlock())
 * 6. ReadWriteLock (shared read lock, exclusive write lock)
 */

class SharedCounter {
    private int count = 0;
    private volatile boolean flag = true; // Visibility guarantee across CPU cache memories
    private final AtomicInteger atomicCount = new AtomicInteger(0);
    private final Lock explicitLock = new ReentrantLock();

    // Synchronized method
    public synchronized void incrementSynchronized() {
        count++;
    }

    // Atomic increment
    public void incrementAtomic() {
        atomicCount.incrementAndGet();
    }

    // ReentrantLock increment
    public void incrementWithLock() {
        explicitLock.lock();
        try {
            count++;
        } finally {
            explicitLock.unlock(); // Always release in finally block
        }
    }

    public int getCount() { return count; }
    public int getAtomicCount() { return atomicCount.get(); }
    public boolean isFlagActive() { return flag; }
    public void setFlag(boolean flag) { this.flag = flag; }
}

public class SynchronizationAndLocks {

    private static String sharedData = "Initial Content";
    private static final ReadWriteLock rwLock = new ReentrantReadWriteLock();

    public static String readData() {
        rwLock.readLock().lock(); // Multiple threads can hold read lock concurrently
        try {
            return sharedData;
        } finally {
            rwLock.readLock().unlock();
        }
    }

    public static void writeData(String newData) {
        rwLock.writeLock().lock(); // Exclusive write lock
        try {
            sharedData = newData;
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SharedCounter counter = new SharedCounter();

        // Spawning 10 threads doing 1000 increments each
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.incrementSynchronized();
                    counter.incrementAtomic();
                }
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Expected count: 10000");
        System.out.println("Synchronized Counter final value: " + counter.getCount());
        System.out.println("AtomicInteger Counter final value: " + counter.getAtomicCount());

        // ReadWriteLock demo
        writeData("Updated via ReadWriteLock");
        System.out.println("Read via ReadWriteLock: " + readData());
    }
}
