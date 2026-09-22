package com.OOP.Encapsulation;

/**
 * EncapsulationDemo demonstrates bundling data (fields) and methods that operate on data
 * into a single unit, hiding private implementation details and providing controlled access
 * via getter and setter methods with data validation invariant checks.
 */

class BankAccount {
    // Private fields (Data Hiding)
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    // Public Getters (Read Access)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Public Controlled Mutators / Methods (Write Access with Invariant Validation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Remaining balance: $" + balance);
        } else {
            System.out.println("Withdrawal failed: Insufficient funds or invalid amount.");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC-98765", "Alice Smith", 500.00);

        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Performing validated state changes
        account.deposit(200.00);
        account.withdraw(150.00);
        account.withdraw(1000.00); // Should fail validation safely

        // account.balance = 1000000; // Compile-time error: balance has private access in BankAccount
    }
}
