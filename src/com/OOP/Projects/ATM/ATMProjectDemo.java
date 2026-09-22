package com.OOP.Projects.ATM;

/**
 * Educational Practice Project 1: ATM System Runner
 */
public class ATMProjectDemo {

    public static void main(String[] args) {
        ATMSystem atm = new ATMSystem();

        // Register accounts
        atm.registerAccount(new Account("1001", "1234", 1000.00));
        atm.registerAccount(new Account("1002", "5678", 500.00));

        System.out.println("--- ATM System Demo ---");
        if (atm.authenticate("1001", "1234")) {
            atm.checkBalance();
            atm.deposit(250.00);
            atm.withdraw(100.00);
            atm.checkBalance();
            atm.logout();
        }
    }
}
