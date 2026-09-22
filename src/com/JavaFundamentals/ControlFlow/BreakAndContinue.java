package com.JavaFundamentals.ControlFlow;

/**
 * BreakAndContinue demonstrates jump statements:
 * - break (terminates loop immediately)
 * - continue (skips current iteration)
 * - labeled break and labeled continue
 */
public class BreakAndContinue {

    public static void main(String[] args) {
        System.out.println("--- break Statement ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking loop at i = " + i);
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n--- continue Statement ---");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.print(i + " "); // Prints odd numbers only
        }
        System.out.println();

        System.out.println("\n--- Labeled break ---");
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Breaking outerLoop at i=" + i + ", j=" + j);
                    break outerLoop;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
