package com.JavaFundamentals.Recursion;

/**
 * RecursionBasics demonstrates fundamental recursive concepts:
 * - Recursive case: method calling itself with a smaller input subproblem.
 * - Base case: stopping condition to prevent infinite stack frame allocation (StackOverflowError).
 * Examples: Factorial and Fibonacci calculations.
 */
public class RecursionBasics {

    /**
     * Calculates factorial of n (n! = n * (n-1)!)
     * Base case: n <= 1 -> 1
     */
    public static long factorial(int n) {
        if (n <= 1) { // Base case
            return 1;
        }
        return n * factorial(n - 1); // Recursive case
    }

    /**
     * Calculates nth Fibonacci number (0, 1, 1, 2, 3, 5, 8, 13...)
     * Base case: n == 0 -> 0, n == 1 -> 1
     */
    public static int fibonacci(int n) {
        if (n <= 0) return 0; // Base case 1
        if (n == 1) return 1; // Base case 2
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + ": " + factorial(n));

        System.out.print("First 7 Fibonacci numbers: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}
