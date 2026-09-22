package com.JavaFundamentals.Operators;

/**
 * OperatorPrecedence demonstrates Java operator precedence and evaluation rules.
 * Higher precedence operators are evaluated before lower precedence ones.
 * Parentheses () override default operator precedence.
 */
public class OperatorPrecedence {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;

        // Multiplication (*) has higher precedence than addition (+)
        int r1 = a + b * c; // 10 + (5 * 2) = 20
        int r2 = (a + b) * c; // (10 + 5) * 2 = 30

        System.out.println("a + b * c = " + r1);
        System.out.println("(a + b) * c = " + r2);

        // Relational and Logical Precedence
        boolean test = a > b + c && b > c; // a > (5 + 2) && 5 > 2 -> 10 > 7 && true -> true
        System.out.println("a > b + c && b > c: " + test);

        // Associativity (Left-to-Right for arithmetic, Right-to-Left for assignment)
        int x, y, z;
        x = y = z = 100; // Right-to-left assignment
        System.out.println("Assigned x = y = z = 100 -> x: " + x + ", y: " + y + ", z: " + z);
    }
}
