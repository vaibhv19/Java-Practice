package com.OOP.AdvancedOOP;

/**
 * CompositionVsInheritance demonstrates favor composition over inheritance (HAS-A vs IS-A).
 * Composition builds complex objects by assembling instance references, leading to looser coupling.
 */

// Component 1
class Engine {
    public void start() {
        System.out.println("Engine v8 revving up...");
    }
}

// Component 2
class Transmission {
    public void shiftGear(int gear) {
        System.out.println("Transmission shifted to gear " + gear);
    }
}

// Composite Class (HAS-A Engine, HAS-A Transmission)
class SportsCar {
    private Engine engine;
    private Transmission transmission;

    public SportsCar() {
        this.engine = new Engine();
        this.transmission = new Transmission();
    }

    public void drive() {
        engine.start();
        transmission.shiftGear(1);
        transmission.shiftGear(2);
        System.out.println("SportsCar zooming down the road!");
    }
}

public class CompositionVsInheritance {
    public static void main(String[] args) {
        SportsCar car = new SportsCar();
        car.drive();
    }
}
