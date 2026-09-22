package com.JavaFundamentals.Strings;

/**
 * StringMethods demonstrates essential String manipulation operations:
 * length, charAt, substring, indexOf, replace, trim, split, join, compareTo, toLowerCase/toUpperCase
 */
public class StringMethods {

    public static void main(String[] args) {
        String text = "  Java Programming Language  ";

        System.out.println("Original text: '" + text + "'");
        System.out.println("Length: " + text.length());
        System.out.println("Trimmed: '" + text.trim() + "'");

        String cleanText = text.trim();
        System.out.println("Character at index 0: " + cleanText.charAt(0));
        System.out.println("Substring (0, 4): " + cleanText.substring(0, 4)); // "Java"
        System.out.println("IndexOf 'Prog': " + cleanText.indexOf("Prog"));
        System.out.println("Replace 'Language' with 'Core': " + cleanText.replace("Language", "Core"));
        System.out.println("Upper Case: " + cleanText.toUpperCase());
        System.out.println("Lower Case: " + cleanText.toLowerCase());

        // Split and Join
        String csv = "Apple,Banana,Cherry";
        String[] fruits = csv.split(",");
        System.out.println("\nSplit CSV:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        String joined = String.join(" | ", fruits);
        System.out.println("Joined string: " + joined);
    }
}
