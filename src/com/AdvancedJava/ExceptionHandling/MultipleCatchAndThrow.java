package com.AdvancedJava.ExceptionHandling;

/**
 * MultipleCatchAndThrow demonstrates:
 * - Multi-catch block syntax (`catch (NullPointerException | ArithmeticException e)`)
 * - Ordering catch blocks from most specific subclass to general superclass
 * - Explicitly throwing exceptions using `throw` keyword
 * - Declaring method exception propagation using `throws` keyword
 */
public class MultipleCatchAndThrow {

    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older to register.");
        }
        System.out.println("Age " + age + " is valid.");
    }

    public static void processInput(String str) {
        try {
            int length = str.length(); // May throw NullPointerException
            System.out.println("Input length: " + length);
            int val = Integer.parseInt(str); // May throw NumberFormatException
            int div = 100 / val; // May throw ArithmeticException
            System.out.println("Result: " + div);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Handled Math/Parsing Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Handled Null reference error.");
        } catch (Exception e) {
            System.out.println("Handled general Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        processInput("0");
        processInput(null);
        processInput("abc");

        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught thrown exception: " + e.getMessage());
        }
    }
}
