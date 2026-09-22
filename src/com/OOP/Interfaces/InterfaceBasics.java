package com.OOP.Interfaces;

/**
 * InterfaceBasics demonstrates:
 * - 100% abstract contract definitions using interfaces.
 * - Implementing single and multiple interfaces (`implements InterfaceA, InterfaceB`).
 * - All fields in interfaces are implicitly `public static final`.
 * - All method signatures are implicitly `public abstract` (unless default/static).
 */

interface Drivable {
    void drive(); // public abstract implicitly
}

interface Printable {
    void printDetails();
}

// Class implementing multiple interfaces
class ElectricCar implements Drivable, Printable {
    private String model;

    public ElectricCar(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving " + model + " quietly using battery power.");
    }

    @Override
    public void printDetails() {
        System.out.println("Vehicle Model: " + model + " (Zero Emission)");
    }
}

public class InterfaceBasics {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Model Y");
        tesla.printDetails();
        tesla.drive();

        // Interface reference pointing to implementing instance
        Drivable vehicle = tesla;
        vehicle.drive();
    }
}
