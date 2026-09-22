package com.JavaFundamentals.Operators;

/**
 * ArithmeticOperators demonstrates standard arithmetic operations in Java:
 * - Addition (+)
 * - Subtraction (-)
 * - Multiplication (*)
 * - Division (/)
 * - Modulus / Remainder (%)
 * - Unary plus (+) and minus (-)
 */
public class ArithmeticOperators {

    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b)); // 19
        System.out.println("a - b = " + (a - b)); // 11
        System.out.println("a * b = " + (a * b)); // 60
        System.out.println("a / b = " + (a / b)); // Integer division = 3
        System.out.println("a % b = " + (a % b)); // Remainder = 3

        // Floating-point division
        double doubleDiv = (double) a / b;
        System.out.println("(double) a / b = " + doubleDiv); // 3.75

        // Unary operators
        int pos = +a;
        int neg = -a;
        System.out.println("Unary plus: " + pos + ", Unary minus: " + neg);
    }
}
