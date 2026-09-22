package com.OOP.Projects.ATM;

import java.util.HashMap;
import java.util.Map;

/**
 * Educational ATM Practice Project - Controller System
 */
public class ATMSystem {
    private Map<String, Account> accounts;
    private Account currentAccount;

    public ATMSystem() {
        this.accounts = new HashMap<>();
    }

    public void registerAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public boolean authenticate(String accNo, String pin) {
        Account acc = accounts.get(accNo);
        if (acc != null && acc.validatePin(pin)) {
            currentAccount = acc;
            System.out.println("Authentication successful for Account: " + accNo);
            return true;
        }
        System.out.println("Authentication failed for Account: " + accNo);
        return false;
    }

    public void checkBalance() {
        if (currentAccount != null) {
            System.out.println("Current Balance: $" + currentAccount.getBalance());
        }
    }

    public void deposit(double amount) {
        if (currentAccount != null) {
            currentAccount.deposit(amount);
        }
    }

    public void withdraw(double amount) {
        if (currentAccount != null) {
            currentAccount.withdraw(amount);
        }
    }

    public void logout() {
        System.out.println("Logged out account: " + (currentAccount != null ? currentAccount.getAccountNumber() : "None"));
        currentAccount = null;
    }
}
