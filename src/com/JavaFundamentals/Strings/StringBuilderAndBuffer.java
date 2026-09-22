package com.JavaFundamentals.Strings;

/**
 * StringBuilderAndBuffer demonstrates mutable character sequence classes:
 * - StringBuilder: Fast, non-thread-safe (single-threaded use)
 * - StringBuffer: Synchronized, thread-safe (multi-threaded use)
 */
public class StringBuilderAndBuffer {

    public static void main(String[] args) {
        // StringBuilder demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Fundamentals");
        sb.insert(4, " 17");
        sb.replace(0, 4, "Core Java");
        sb.reverse();

        System.out.println("--- StringBuilder Operations ---");
        System.out.println("Modified StringBuilder: " + sb);
        sb.reverse(); // Reverse back
        System.out.println("Reversed back: " + sb);

        // StringBuffer demo
        StringBuffer sbf = new StringBuffer("Thread-Safe");
        sbf.append(" Buffer");
        System.out.println("\n--- StringBuffer Operations ---");
        System.out.println("StringBuffer output: " + sbf);
    }
}
