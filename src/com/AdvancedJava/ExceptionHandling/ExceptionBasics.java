package com.AdvancedJava.ExceptionHandling;

/**
 * ExceptionBasics demonstrates:
 * - Throwable hierarchy: Error vs Exception
 * - Checked Exceptions (compile-time enforced, e.g. IOException)
 * - Unchecked Exceptions (RuntimeException at runtime, e.g. ArithmeticException, NullPointerException)
 * - try-catch-finally control flow execution order
 */
public class ExceptionBasics {

    public static void main(String[] args) {
        System.out.println("Starting program...");

        try {
            int numerator = 10;
            int denominator = 0;
            System.out.println("Performing division...");
            int result = numerator / denominator; // Throws ArithmeticException
            System.out.println("Result: " + result); // Skipped
        } catch (ArithmeticException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed ALWAYS (cleanup code).");
        }

        System.out.println("Program resumed execution safely after handling exception.");
    }
}
