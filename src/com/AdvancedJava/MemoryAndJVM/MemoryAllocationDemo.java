package com.AdvancedJava.MemoryAndJVM;

/**
 * MemoryAllocationDemo demonstrates Java memory behaviors accessible at language level:
 * - Stack reference allocation vs Heap object creation
 * - String Pool interning via String.intern()
 * - Requesting Garbage Collection suggestion via System.gc()
 */
public class MemoryAllocationDemo {

    public static void main(String[] args) {
        // Local variables stored in current thread's Stack Frame
        int localPrimitive = 100;

        // Reference variable 'objRef' stored on Stack, actual Object instance allocated on Heap
        String objRef = new String("JVM Heap Allocation");

        // String Pool Interning demonstration
        String heapStr = new String("JavaMemory");
        String poolStr = heapStr.intern(); // Returns canonical reference from String Constant Pool
        String literalStr = "JavaMemory";

        System.out.println("heapStr == literalStr: " + (heapStr == literalStr)); // false
        System.out.println("poolStr == literalStr: " + (poolStr == literalStr)); // true

        System.out.println("Local primitive on stack frame: " + localPrimitive);
        System.out.println("Heap object string value: " + objRef);

        // Hinting JVM to trigger Garbage Collection (Non-guaranteed hint to JVM)
        System.out.println("\nRequesting System.gc() execution hint...");
        System.gc();
    }
}
