package com.OOP.ClassesAndObjects;

/**
 * ClassAndObjectDemo demonstrates defining classes, fields, methods,
 * and creating object instances using the 'new' keyword.
 */

class Car {
    // Fields (State)
    String brand;
    String model;
    int year;
    double price;

    // Method (Behavior)
    void displayInfo() {
        System.out.println("Car: " + year + " " + brand + " " + model + " [$" + price + "]");
    }

    void startEngine() {
        System.out.println("Engine started for " + brand + " " + model);
    }
}

public class ClassAndObjectDemo {
    public static void main(String[] args) {
        // Object Instantiation 1
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2023;
        car1.price = 26320.0;

        // Object Instantiation 2
        Car car2 = new Car();
        car2.brand = "Tesla";
        car2.model = "Model 3";
        car2.year = 2024;
        car2.price = 38990.0;

        // Invoking behaviors
        car1.displayInfo();
        car1.startEngine();

        System.out.println();
        car2.displayInfo();
        car2.startEngine();
    }
}
