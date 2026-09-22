package com.JavaFundamentals.Operators;

/**
 * RelationalAndLogicalOperators demonstrates comparison and logical operations:
 * Relational: ==, !=, >, <, >=, <=
 * Logical: && (Short-circuit AND), || (Short-circuit OR), ! (Logical NOT)
 */
public class RelationalAndLogicalOperators {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 10;

        System.out.println("--- Relational Operators ---");
        System.out.println("x == z: " + (x == z));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y:  " + (x > y));
        System.out.println("x < y:  " + (x < y));
        System.out.println("x >= z: " + (x >= z));
        System.out.println("x <= y: " + (x <= y));

        System.out.println("\n--- Logical Operators ---");
        boolean condition1 = (x < y); // true
        boolean condition2 = (x == z); // true
        boolean condition3 = (x > y); // false

        System.out.println("condition1 && condition2: " + (condition1 && condition2)); // true
        System.out.println("condition1 && condition3: " + (condition1 && condition3)); // false
        System.out.println("condition1 || condition3: " + (condition1 || condition3)); // true
        System.out.println("!condition1: " + (!condition1));                         // false

        // Short-circuit evaluation demo
        System.out.println("\n--- Short-circuit Evaluation ---");
        int count = 5;
        // Since (x > y) is false, count++ is NEVER evaluated!
        if (x > y && ++count > 0) {
            System.out.println("Inside if block");
        }
        System.out.println("Count after short-circuit &&: " + count + " (remains 5)");
    }
}
