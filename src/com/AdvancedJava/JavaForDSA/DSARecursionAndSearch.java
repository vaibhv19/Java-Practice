package com.AdvancedJava.JavaForDSA;

/**
 * DSARecursionAndSearch demonstrates reusable DSA search templates:
 * - Binary Search template O(log N)
 * - Two-Pointers pattern O(N)
 * - Sliding Window template O(N)
 */
public class DSARecursionAndSearch {

    // Binary Search Template O(log N)
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents integer overflow vs (left+right)/2
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }

    // Two Pointers Template (Two Sum on sorted array)
    public static int[] twoSumSorted(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                return new int[]{left, right};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] sortedArr = {2, 7, 11, 15, 18, 24, 30};

        int index = binarySearch(sortedArr, 15);
        System.out.println("Binary Search for 15 -> index: " + index);

        int[] pairs = twoSumSorted(sortedArr, 22); // 7 + 15 = 22
        System.out.println("Two Sum target 22 found at indices: [" + pairs[0] + ", " + pairs[1] + "]");
    }
}
