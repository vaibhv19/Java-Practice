package com.JavaFundamentals.Methods;

/**
 * MethodOverloading demonstrates compile-time polymorphism where multiple methods
 * in the same class share the same name but have different parameter lists (count, type, or order).
 * Note: Changing return type alone is NOT sufficient for overloading!
 */
public class MethodOverloading {

    // Overload 1: Two int parameters
    public int multiply(int a, int b) {
        return a * b;
    }

    // Overload 2: Three int parameters
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Overload 3: Two double parameters
    public double multiply(double a, double b) {
        return a * b;
    }

    // Overload 4: Different parameter order (String, int vs int, String)
    public void printDetails(String label, int value) {
        System.out.println("Label: " + label + ", Value: " + value);
    }

    public void printDetails(int value, String label) {
        System.out.println("Value: " + value + ", Label: " + label);
    }

    public static void main(String[] args) {
        MethodOverloading demo = new MethodOverloading();

        System.out.println("multiply(4, 5): " + demo.multiply(4, 5));
        System.out.println("multiply(2, 3, 4): " + demo.multiply(2, 3, 4));
        System.out.println("multiply(2.5, 4.0): " + demo.multiply(2.5, 4.0));

        demo.printDetails("Item", 101);
        demo.printDetails(202, "Item");
    }
}
