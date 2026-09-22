# Multithreading & Concurrency in Java

## Concepts
- **Thread vs Process**: Process is an OS-level isolated execution unit with dedicated memory space; Thread is a lightweight sub-unit of execution sharing process Heap memory.
- **Task Interfaces**:
  - `Runnable`: `void run()` - No return value, cannot throw checked exceptions.
  - `Callable<V>`: `V call()` - Returns result of type V, can throw checked exceptions.
- **Thread Lifecycle States**: NEW -> RUNNABLE -> BLOCKED / WAITING / TIMED_WAITING -> TERMINATED.

## Concurrency Primitive Toolkit
- `synchronized`: Intrinsic monitor lock enforcing single-thread execution per monitor.
- `volatile`: Ensures immediate write visibility to main memory across CPU core L1/L2 caches.
- `AtomicInteger` / `AtomicReference`: Non-blocking lock-free atomic updates using hardware CPU CAS (Compare-And-Swap) instructions.
- `ReentrantLock` / `ReadWriteLock`: Explicit locks supporting fairness policies and concurrent multiple reader locks.
- `ExecutorService` / `ThreadPoolExecutor`: Reuses worker threads to manage concurrent task execution queues.
- `CompletableFuture`: Asynchronous non-blocking reactive task chaining.
- **Concurrent Collections**: `ConcurrentHashMap`, `CopyOnWriteArrayList`, `ArrayBlockingQueue`.

## Related Java Files
- [`ThreadBasicsAndLifecycle.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Multithreading/ThreadBasicsAndLifecycle.java)
- [`SynchronizationAndLocks.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Multithreading/SynchronizationAndLocks.java)
- [`ExecutorsAndConcurrencyToolkit.java`](file:///D:/Work/Learning%20Engg/Java-Practice/src/com/AdvancedJava/Multithreading/ExecutorsAndConcurrencyToolkit.java)
