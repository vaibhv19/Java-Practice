package com.JavaFundamentals.Operators;

/**
 * AssignmentAndTernary demonstrates compound assignment operators (=, +=, -=, *=, /=, %=)
 * and the Ternary operator (condition ? expr1 : expr2).
 */
public class AssignmentAndTernary {

    public static void main(String[] args) {
        // Compound Assignment
        int num = 10;
        System.out.println("Initial num: " + num);

        num += 5; // num = num + 5
        System.out.println("After num += 5: " + num);

        num -= 3; // num = num - 3
        System.out.println("After num -= 3: " + num);

        num *= 2; // num = num * 2
        System.out.println("After num *= 2: " + num);

        num /= 4; // num = num / 4
        System.out.println("After num /= 4: " + num);

        num %= 3; // num = num % 3
        System.out.println("After num %= 3: " + num);

        // Ternary Operator
        System.out.println("\n--- Ternary Operator ---");
        int score = 75;
        String result = (score >= 60) ? "PASS" : "FAIL";
        System.out.println("Score " + score + " result: " + result);

        int a = 25, b = 40;
        int max = (a > b) ? a : b;
        System.out.println("Max of " + a + " and " + b + " is: " + max);
    }
}
