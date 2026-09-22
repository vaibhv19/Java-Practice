package com.JavaFundamentals.ControlFlow;

/**
 * LoopingStatements demonstrates iteration constructs in Java:
 * - for loop
 * - while loop
 * - do-while loop
 * - enhanced for loop (for-each)
 * - nested loops
 */
public class LoopingStatements {

    public static void main(String[] args) {
        // 1. Standard for loop
        System.out.println("--- Standard for loop ---");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. while loop
        System.out.println("\n--- while loop ---");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        // 3. do-while loop (executes at least once)
        System.out.println("\n--- do-while loop ---");
        int val = 10;
        do {
            System.out.println("Executed once even if condition is false. val = " + val);
            val++;
        } while (val < 5);

        // 4. Enhanced for loop (for-each)
        System.out.println("\n--- Enhanced for-each loop ---");
        String[] fruits = {"Apple", "Banana", "Cherry", "Mango"};
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 5. Nested for loops (Matrix representation)
        System.out.println("\n--- Nested for loop (2x3 grid) ---");
        for (int r = 1; r <= 2; r++) {
            for (int c = 1; c <= 3; c++) {
                System.out.print("[" + r + "," + c + "] ");
            }
            System.out.println();
        }
    }
}
