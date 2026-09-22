package com.JavaFundamentals.Basics;

/**
 * CommentsAndFormatting demonstrates the three types of comments in Java:
 * 1. Single-line comment (//)
 * 2. Multi-line comment (/* ... *\/)
 * 3. Javadoc documentation comment (/** ... *\/)
 *
 * @author Java Learning Repository
 * @version 1.0
 */
public class CommentsAndFormatting {

    /**
     * Calculates the square of a given integer.
     * 
     * @param number The input integer
     * @return The square of the number
     */
    public static int calculateSquare(int number) {
        // Single-line comment: Multiply number by itself
        return number * number;
    }

    public static void main(String[] args) {
        /*
         * Multi-line comment:
         * Below code demonstrates calling a helper method
         * and displaying formatted output.
         */
        int input = 7;
        int result = calculateSquare(input);

        System.out.println("Square of " + input + " is: " + result);
    }
}
