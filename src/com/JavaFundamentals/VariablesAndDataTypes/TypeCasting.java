package com.JavaFundamentals.VariablesAndDataTypes;

/**
 * TypeCasting demonstrates conversion between data types:
 * 1. Widening (Implicit) Casting: Small type to larger type. Safe, automatically performed by Java.
 *    byte -> short -> char -> int -> long -> float -> double
 * 2. Narrowing (Explicit) Casting: Larger type to smaller type. Manual cast required, potential data loss.
 *    double -> float -> long -> int -> char -> short -> byte
 */
public class TypeCasting {

    public static void main(String[] args) {
        // Widening Casting (Implicit)
        int num = 100;
        long longNum = num;      // Automatic widening int to long
        double doubleNum = longNum; // Automatic widening long to double

        System.out.println("--- Widening (Implicit) Casting ---");
        System.out.println("int value: " + num);
        System.out.println("widened to long: " + longNum);
        System.out.println("widened to double: " + doubleNum);

        // Narrowing Casting (Explicit)
        double decimalVal = 99.99;
        int integerVal = (int) decimalVal; // Explicit conversion (truncates fractional part)
        byte byteVal = (byte) integerVal;   // Explicit conversion int to byte

        System.out.println("\n--- Narrowing (Explicit) Casting ---");
        System.out.println("double value: " + decimalVal);
        System.out.println("narrowed to int: " + integerVal + " (fractional part lost)");
        System.out.println("narrowed to byte: " + byteVal);

        // Data overflow demo in narrowing
        int largeInt = 130;
        byte overflowByte = (byte) largeInt; // Byte range is -128 to 127
        System.out.println("\nOverflow demonstration: int 130 cast to byte = " + overflowByte);
    }
}
