package com.JavaFundamentals.Methods;

/**
 * MethodBasics demonstrates method signatures, parameters, return types, and call-by-value.
 */
public class MethodBasics {

    // Method with parameters and a return value
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    // void method with no return value
    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java methods.");
    }

    // Java passes arguments by value (primitive copy demo)
    public static void modifyValue(int val) {
        val = 999; // Changes local copy only
    }

    public static void main(String[] args) {
        printGreeting("Alice");

        int result = calculateSum(15, 25);
        System.out.println("Result of calculateSum(15, 25): " + result);

        int original = 50;
        modifyValue(original);
        System.out.println("Original value after modifyValue(): " + original + " (Unchanged due to pass-by-value)");
    }
}
