package com.JavaFundamentals.Operators;

/**
 * IncrementDecrement demonstrates prefix vs postfix increment (++x vs x++)
 * and decrement (--x vs x--).
 */
public class IncrementDecrement {

    public static void main(String[] args) {
        // Postfix Increment: Use original value first, then increment
        int a = 5;
        int b = a++; // b = 5, then a becomes 6
        System.out.println("Postfix (a++): a = " + a + ", b = " + b);

        // Prefix Increment: Increment value first, then use
        int x = 5;
        int y = ++x; // x becomes 6, then y = 6
        System.out.println("Prefix (++x): x = " + x + ", y = " + y);

        // Postfix Decrement
        int p = 10;
        int q = p--; // q = 10, p = 9
        System.out.println("Postfix (p--): p = " + p + ", q = " + q);

        // Prefix Decrement
        int m = 10;
        int n = --m; // m = 9, n = 9
        System.out.println("Prefix (--m): m = " + m + ", n = " + n);

        // Expression evaluation with increment
        int val = 5;
        int exprResult = val++ + ++val; // 5 + 7 = 12
        System.out.println("val++ + ++val when val=5 -> result: " + exprResult + ", val final: " + val);
    }
}
