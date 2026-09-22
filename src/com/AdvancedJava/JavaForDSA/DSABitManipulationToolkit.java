package com.AdvancedJava.JavaForDSA;

/**
 * DSABitManipulationToolkit demonstrates essential bitwise tricks for DSA problems:
 * - Checking if odd/even (`n & 1`)
 * - Checking if power of two (`n > 0 && (n & (n - 1)) == 0`)
 * - Counting set bits (`Integer.bitCount(n)`)
 * - Finding single non-duplicate element using XOR (`a ^ a = 0`, `a ^ 0 = a`)
 * - Toggling, setting, and clearing the ith bit
 */
public class DSABitManipulationToolkit {

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static int findSingleNumber(int[] nums) {
        int xorSum = 0;
        for (int num : nums) {
            xorSum ^= num;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println("Is " + num + " a power of 2? " + isPowerOfTwo(num));
        System.out.println("Is 18 a power of 2? " + isPowerOfTwo(18));

        int[] duplicates = {4, 1, 2, 1, 2}; // 4 appears once, rest appear twice
        System.out.println("Single non-duplicate number via XOR: " + findSingleNumber(duplicates));

        int n = 29; // Binary: 11101
        System.out.println("Number of set bits (1s) in 29: " + Integer.bitCount(n));
    }
}
