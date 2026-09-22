package com.JavaFundamentals.ControlFlow;

/**
 * IfElseStatements demonstrates decision-making structures:
 * - Simple if
 * - if-else
 * - else-if ladder
 * - Nested if statements
 */
public class IfElseStatements {

    public static void main(String[] args) {
        int marks = 85;

        System.out.println("--- Grade Evaluation (else-if ladder) ---");
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        // Nested if demonstration
        System.out.println("\n--- Nested If (Loan Eligibility) ---");
        int age = 25;
        double salary = 45000.0;

        if (age >= 21) {
            if (salary >= 30000.0) {
                System.out.println("Loan Approved!");
            } else {
                System.out.println("Loan Rejected: Insufficient salary.");
            }
        } else {
            System.out.println("Loan Rejected: Minimum age is 21.");
        }
    }
}
