package com.JavaFundamentals.VariablesAndDataTypes;

/**
 * PrimitiveTypes demonstrates all 8 primitive data types in Java:
 * 1. byte (8-bit signed integer)
 * 2. short (16-bit signed integer)
 * 3. int (32-bit signed integer)
 * 4. long (64-bit signed integer)
 * 5. float (32-bit single-precision floating point)
 * 6. double (64-bit double-precision floating point)
 * 7. char (16-bit Unicode character)
 * 8. boolean (true or false)
 * Also includes String (reference type) and literal representation examples.
 */
public class PrimitiveTypes {

    public static void main(String[] args) {
        // Integer types
        byte b = 127;                       // Min: -128, Max: 127
        short s = 32767;                    // Min: -32768, Max: 32767
        int i = 2147483647;                 // Min: -2^31, Max: 2^31 - 1
        long l = 9223372036854775807L;      // 'L' suffix for long literal

        // Floating-point types
        float f = 3.14159f;                 // 'f' suffix for float literal
        double d = 3.141592653589793;       // default floating point literal

        // Character type
        char c = 'A';                       // single quotes, 16-bit Unicode
        char unicodeChar = '\u0041';        // Unicode representation of 'A'

        // Boolean type
        boolean isJavaFun = true;

        // Reference type (String)
        String greeting = "Hello, Java Primitives!";

        // Printing values and ranges
        System.out.println("byte: " + b + " (Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
        System.out.println("short: " + s + " (Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
        System.out.println("int: " + i + " (Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
        System.out.println("long: " + l + " (Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c + " (Unicode: " + (int) c + ", \\u0041: " + unicodeChar + ")");
        System.out.println("boolean: " + isJavaFun);
        System.out.println("String: " + greeting);
    }
}
