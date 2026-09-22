package com.JavaFundamentals.Arrays;

/**
 * MultiDimensionalArrays demonstrates:
 * - 2D rectangular matrices
 * - Jagged arrays (arrays of arrays where sub-array lengths vary)
 */
public class MultiDimensionalArrays {

    public static void main(String[] args) {
        // 2D Matrix (2 rows, 3 columns)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("--- 2D Rectangular Matrix (2x3) ---");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // Jagged Array (varying row lengths)
        System.out.println("\n--- Jagged Array ---");
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{10};
        jagged[1] = new int[]{20, 30};
        jagged[2] = new int[]{40, 50, 60, 70};

        for (int r = 0; r < jagged.length; r++) {
            System.out.print("Row " + r + ": ");
            for (int c = 0; c < jagged[r].length; c++) {
                System.out.print(jagged[r][c] + " ");
            }
            System.out.println();
        }
    }
}
