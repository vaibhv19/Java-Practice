package com.JavaFundamentals.Arrays;

import java.util.Arrays;

/**
 * ArraysUtilityClass demonstrates useful static methods from java.util.Arrays:
 * - Arrays.toString()
 * - Arrays.sort()
 * - Arrays.binarySearch()
 * - Arrays.equals() / Arrays.deepEquals()
 * - Arrays.fill()
 * - Arrays.copyOf()
 */
public class ArraysUtilityClass {

    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 3, 27};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting array in-place
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Binary Search (requires array to be sorted)
        int target = 27;
        int index = Arrays.binarySearch(numbers, target);
        System.out.println("Binary search for " + target + " -> index: " + index);

        // Array Copying
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copy));

        // Equality check
        System.out.println("Arrays.equals(numbers, copy): " + Arrays.equals(numbers, copy));

        // Filling array
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled array: " + Arrays.toString(filledArray));
    }
}
