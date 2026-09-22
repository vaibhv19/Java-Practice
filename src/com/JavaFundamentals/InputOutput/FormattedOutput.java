package com.JavaFundamentals.InputOutput;

/**
 * FormattedOutput demonstrates output formatting using System.out.printf() / String.format().
 * Format specifiers:
 * %d - Decimal integer
 * %f - Floating-point number
 * %s - String
 * %c - Character
 * %b - Boolean
 * %n - Platform-independent newline
 */
public class FormattedOutput {

    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double gpa = 3.8765;

        // Basic print and println
        System.out.print("Standard print without newline. ");
        System.out.println("Standard println with newline.");

        // Formatted output
        System.out.printf("Name: %s, Age: %d, GPA: %.2f%n", name, age, gpa);

        // Padding and alignment
        System.out.printf("%-10s | %-5s | %-8s%n", "Item", "Qty", "Price");
        System.out.printf("----------------------------------%n");
        System.out.printf("%-10s | %-5d | $%7.2f%n", "Book", 2, 19.99);
        System.out.printf("%-10s | %-5d | $%7.2f%n", "Pen", 10, 1.50);
    }
}
