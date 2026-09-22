package com.OOP.Projects.ParkingLot;

/**
 * Educational Parking Lot Project - Vehicle Base Model
 */
public abstract class Vehicle {
    private String licensePlate;
    private VehicleType type;

    public enum VehicleType { CAR, MOTORCYCLE, TRUCK }

    public Vehicle(String licensePlate, VehicleType type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public String getLicensePlate() { return licensePlate; }
    public VehicleType getType() { return type; }
}

class Car extends Vehicle {
    public Car(String licensePlate) {
        super(licensePlate, VehicleType.CAR);
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String licensePlate) {
        super(licensePlate, VehicleType.MOTORCYCLE);
    }
}
