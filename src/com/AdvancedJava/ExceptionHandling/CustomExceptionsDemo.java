package com.AdvancedJava.ExceptionHandling;

/**
 * CustomExceptionsDemo demonstrates defining custom application exceptions:
 * 1. Custom Checked Exception (extends Exception)
 * 2. Custom Unchecked Exception (extends RuntimeException)
 */

// Custom Checked Exception
class InsufficientFundsException extends Exception {
    private double shortfall;

    public InsufficientFundsException(double shortfall) {
        super("Insufficient funds! Needed additional $" + shortfall);
        this.shortfall = shortfall;
    }

    public double getShortfall() {
        return shortfall;
    }
}

// Custom Unchecked Exception
class InvalidAccountStateException extends RuntimeException {
    public InvalidAccountStateException(String message) {
        super(message);
    }
}

public class CustomExceptionsDemo {

    public static void withdrawMoney(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        System.out.println("Withdrawal successful! Remaining balance: $" + (balance - amount));
    }

    public static void main(String[] args) {
        try {
            withdrawMoney(100.00, 250.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
            System.out.println("Shortfall amount: $" + e.getShortfall());
        }
    }
}
