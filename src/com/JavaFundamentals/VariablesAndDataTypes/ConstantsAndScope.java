package com.JavaFundamentals.VariablesAndDataTypes;

/**
 * ConstantsAndScope demonstrates:
 * 1. Constants using the 'final' keyword.
 * 2. Class scope (instance & static variables).
 * 3. Local scope (inside methods).
 * 4. Block scope (inside if/loops).
 */
public class ConstantsAndScope {

    // Class variable (static scope)
    private static final double INTEREST_RATE = 5.5; // Constant
    
    // Instance variable
    private String category = "Banking";

    public void demonstrateScope() {
        // Method local variable
        int localVal = 50;
        System.out.println("Local variable: " + localVal);
        System.out.println("Instance variable: " + category);
        System.out.println("Static Constant: " + INTEREST_RATE);

        if (localVal > 20) {
            // Block scope variable
            int blockVal = 100;
            System.out.println("Block variable inside if: " + blockVal);
        }
        // blockVal is NOT accessible here (out of scope)
    }

    public static void main(String[] args) {
        // final local variable
        final int MAX_USERS = 100;
        // MAX_USERS = 200; // Compile-time error if uncommented: cannot assign value to final variable

        System.out.println("Final local constant: " + MAX_USERS);
        
        ConstantsAndScope demo = new ConstantsAndScope();
        demo.demonstrateScope();
    }
}
