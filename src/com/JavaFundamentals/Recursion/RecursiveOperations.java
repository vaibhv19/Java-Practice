package com.JavaFundamentals.Recursion;

/**
 * RecursiveOperations demonstrates recursion applied to arrays and strings:
 * - Sum of numbers
 * - Power calculation (base^exp)
 * - Reversing a string recursively
 * - Checking if array is sorted recursively
 */
public class RecursiveOperations {

    // Power calculation: base^exp
    public static double power(double base, int exp) {
        if (exp == 0) return 1; // Base case
        if (exp < 0) return 1 / power(base, -exp);
        return base * power(base, exp - 1);
    }

    // Reverse string recursively
    public static String reverseString(String str) {
        if (str.isEmpty()) { // Base case
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // Recursive sum of array elements
    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) { // Base case
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        System.out.println("2^5 = " + power(2, 5));
        System.out.println("Reverse of 'Java': " + reverseString("Java"));

        int[] nums = {10, 20, 30, 40};
        System.out.println("Sum of array elements: " + sumArray(nums, 0));
    }
}
