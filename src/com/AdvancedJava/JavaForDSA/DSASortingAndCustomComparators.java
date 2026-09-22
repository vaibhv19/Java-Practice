package com.AdvancedJava.JavaForDSA;

import java.util.Arrays;

/**
 * DSASortingAndCustomComparators demonstrates sorting arrays and intervals in DSA:
 * - Primitives sorting (Dual-Pivot Quicksort O(N log N))
 * - Custom object / interval 2D array sorting using lambda Comparators
 */
public class DSASortingAndCustomComparators {

    public static void main(String[] args) {
        // 1. Primitive Array Sort
        int[] arr = {40, 10, 50, 20, 30};
        Arrays.sort(arr);
        System.out.println("Sorted primitives: " + Arrays.toString(arr));

        // 2. 2D Interval Array Sorting (e.g. Merge Intervals problem)
        int[][] intervals = {
            {1, 3},
            {8, 10},
            {2, 6},
            {15, 18}
        };

        // Sort intervals by start time ascending
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        System.out.println("Intervals sorted by start time:");
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
