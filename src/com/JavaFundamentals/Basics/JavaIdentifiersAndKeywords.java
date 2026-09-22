package com.JavaFundamentals.Basics;

/**
 * JavaIdentifiersAndKeywords demonstrates valid identifier rules and Java keywords.
 * 
 * Rules for Identifiers:
 * 1. Must begin with a letter (A-Z or a-z), currency character ($), or underscore (_).
 * 2. Subsequent characters can be digits (0-9), letters, $, or _.
 * 3. Cannot use reserved Java keywords (e.g., class, public, static, void, int).
 * 4. Case-sensitive (myVariable vs myvariable).
 * 5. Naming Conventions:
 *    - Classes: PascalCase (e.g., StudentAccount)
 *    - Variables/Methods: camelCase (e.g., totalAmount, calculateInterest)
 *    - Constants: UPPER_SNAKE_CASE (e.g., MAX_CAPACITY)
 */
public class JavaIdentifiersAndKeywords {

    // Valid identifiers
    private static final double PI_VALUE = 3.14159; // Constant (UPPER_SNAKE_CASE)
    
    public static void main(String[] args) {
        // Valid variable identifiers
        int studentAge = 20;
        double $salary = 50000.50;
        String _userStatus = "Active";
        int total_count = 100;
        
        System.out.println("Student Age: " + studentAge);
        System.out.println("Salary: $" + $salary);
        System.out.println("Status: " + _userStatus);
        System.out.println("Total Count: " + total_count);
        System.out.println("Constant PI: " + PI_VALUE);

        // Demonstrating case sensitivity
        int score = 50;
        int Score = 80;
        int SCORE = 100;
        System.out.println("Case sensitivity demo: score=" + score + ", Score=" + Score + ", SCORE=" + SCORE);
    }
}
