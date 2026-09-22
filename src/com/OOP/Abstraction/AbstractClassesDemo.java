package com.OOP.Abstraction;

/**
 * AbstractClassesDemo demonstrates partial abstraction using abstract classes:
 * - Declared with 'abstract' keyword.
 * - Cannot be directly instantiated (`new AbstractClass()` is invalid).
 * - Can contain both abstract methods (without body) and concrete methods (with body).
 * - Subclasses MUST override all abstract methods or be declared abstract themselves.
 */

abstract class Appliance {
    private String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    // Concrete method (shared implementation)
    public void turnOn() {
        System.out.println(brand + " appliance powered ON.");
    }

    // Abstract method (contract enforced on concrete subclasses)
    public abstract void performTask();
}

class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void performTask() {
        System.out.println("Washing clothes on spin cycle...");
    }
}

class Refrigerator extends Appliance {
    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    public void performTask() {
        System.out.println("Cooling contents to 4°C...");
    }
}

public class AbstractClassesDemo {
    public static void main(String[] args) {
        Appliance wm = new WashingMachine("Bosch");
        wm.turnOn();
        wm.performTask();

        System.out.println();

        Appliance fridge = new Refrigerator("Samsung");
        fridge.turnOn();
        fridge.performTask();
    }
}
