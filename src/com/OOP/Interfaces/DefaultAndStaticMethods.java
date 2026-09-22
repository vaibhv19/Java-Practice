package com.OOP.Interfaces;

/**
 * DefaultAndStaticMethods demonstrates Java 8 interface features:
 * 1. default methods: instance methods with default body (enables backward compatibility).
 * 2. static methods: utility helper methods attached to the interface.
 * 3. Handling default method collisions (Diamond Problem resolution).
 */

interface Vehicle {
    void start();

    // Default method (can be optionally overridden)
    default void honk() {
        System.out.println("Default Vehicle Honk: Beep Beep!");
    }

    // Static interface method
    static boolean isMotorVehicle(int wheels) {
        return wheels >= 2;
    }
}

class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck diesel engine starting...");
    }

    // Custom override of default method
    @Override
    public void honk() {
        System.out.println("Truck Horn: HONK HONK!");
    }
}

public class DefaultAndStaticMethods {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.start();
        truck.honk();

        // Calling static method on interface directly
        System.out.println("Is 4 wheels a motor vehicle? " + Vehicle.isMotorVehicle(4));
    }
}
