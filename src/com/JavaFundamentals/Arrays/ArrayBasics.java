package com.JavaFundamentals.Arrays;

/**
 * ArrayBasics demonstrates fixed-size, homogeneous container arrays:
 * - Declaration, allocation (new keyword), initialization
 * - Traversal (indexed for vs enhanced for)
 * - Search, update elements
 */
public class ArrayBasics {

    public static void main(String[] args) {
        // Declaration & initialization
        int[] numbers = new int[5]; // Allocated with default zeros
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Array literal shortcut
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        System.out.println("Colors array length: " + colors.length + ", first color: " + colors[0]);

        System.out.println("Array length: " + numbers.length);

        // Traversal using index
        System.out.println("--- Traversal via index ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Updating an element
        numbers[2] = 99;
        System.out.println("Updated index 2: " + numbers[2]);

        // Search operation (Linear Search)
        int target = 40;
        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("Target " + target + " found at index: " + foundIndex);
    }
}
