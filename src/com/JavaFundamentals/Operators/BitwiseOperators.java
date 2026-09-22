package com.JavaFundamentals.Operators;

/**
 * BitwiseOperators demonstrates bitwise operations on integer types:
 * - AND (&)
 * - OR (|)
 * - XOR (^)
 * - NOT (~)
 * - Left shift (<<)
 * - Right shift (>>) (Signed)
 * - Unsigned Right shift (>>>)
 */
public class BitwiseOperators {

    public static void main(String[] args) {
        int a = 6;  // Binary: 0110
        int b = 4;  // Binary: 0100

        System.out.println("a = " + a + " (0110), b = " + b + " (0100)");
        System.out.println("a & b:   " + (a & b) + " (0100)"); // Bitwise AND = 4
        System.out.println("a | b:   " + (a | b) + " (0110)"); // Bitwise OR = 6
        System.out.println("a ^ b:   " + (a ^ b) + " (0010)"); // Bitwise XOR = 2
        System.out.println("~a:      " + (~a) + " (Two's complement NOT)"); // -7

        // Bit Shifts
        int val = 8; // Binary: 0000 1000
        System.out.println("\n--- Bit Shift Operations ---");
        System.out.println("val << 2 (8 * 2^2): " + (val << 2)); // 32
        System.out.println("val >> 2 (8 / 2^2): " + (val >> 2)); // 2

        // Signed vs Unsigned Right Shift for negative number
        int neg = -8;
        System.out.println("neg >> 1 (Signed shift):   " + (neg >> 1));  // -4
        System.out.println("neg >>> 1 (Unsigned shift): " + (neg >>> 1)); // 2147483640 (fills MSB with 0)
    }
}
