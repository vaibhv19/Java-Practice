package com.JavaFundamentals.Strings;

/**
 * StringBasics demonstrates:
 * - String creation via literal vs new keyword
 * - String Constant Pool (SCP) vs Heap storage
 * - Reference equality (==) vs Object equality (.equals())
 */
public class StringBasics {

    public static void main(String[] args) {
        // String literal (stored in String Constant Pool)
        String s1 = "Java";
        String s2 = "Java";

        // String object via new (stored on Heap)
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("--- Reference Equality (==) ---");
        System.out.println("s1 == s2 (Literals in Pool): " + (s1 == s2)); // true (points to same object)
        System.out.println("s1 == s3 (Pool vs Heap):     " + (s1 == s3)); // false (different memory references)
        System.out.println("s3 == s4 (Two Heap objects): " + (s3 == s4)); // false

        System.out.println("\n--- Content Equality (.equals()) ---");
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (contents are identical)
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // true

        // String immutability demo
        String str = "Hello";
        str.concat(" World"); // Return value ignored!
        System.out.println("\nString immutability demo: str remains '" + str + "'");

        str = str.concat(" World"); // Reassigned reference
        System.out.println("Reassigned reference: str is now '" + str + "'");
    }
}
