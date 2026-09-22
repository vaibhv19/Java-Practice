package com.OOP.Polymorphism;

/**
 * RunTimePolymorphism demonstrates dynamic method dispatch (Method Overriding).
 * A superclass reference points to a subclass object at runtime.
 * The JVM resolves which implementation to call at runtime via Virtual Method Table (vtable).
 */

class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing general payment of $" + amount);
    }
}

class CreditCardPayment extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount + " [1.5% fee applied]");
    }
}

class PayPalPayment extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " [Redirecting to PayPal portal]");
    }
}

class UPIPayment extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount + " [Instant VPA transfer]");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        // Dynamic Method Dispatch: Superclass reference -> Subclass instances
        PaymentMethod payment;

        payment = new CreditCardPayment();
        payment.processPayment(150.00); // Calls CreditCardPayment's processPayment

        payment = new PayPalPayment();
        payment.processPayment(250.00); // Calls PayPalPayment's processPayment

        payment = new UPIPayment();
        payment.processPayment(50.00);  // Calls UPIPayment's processPayment
    }
}
