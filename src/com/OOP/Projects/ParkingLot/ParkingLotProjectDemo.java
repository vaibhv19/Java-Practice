package com.OOP.Projects.ParkingLot;

/**
 * Educational Practice Project 3: Parking Lot System Runner
 */
public class ParkingLotProjectDemo {

    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        // Adding spots
        lot.addSpot(new ParkingSpot(101, Vehicle.VehicleType.CAR));
        lot.addSpot(new ParkingSpot(102, Vehicle.VehicleType.CAR));
        lot.addSpot(new ParkingSpot(201, Vehicle.VehicleType.MOTORCYCLE));

        System.out.println("--- Parking Lot System Demo ---");

        Vehicle car1 = new Car("ABC-1234");
        Vehicle bike1 = new Motorcycle("MOTO-999");
        Vehicle car2 = new Car("XYZ-9876");

        lot.parkVehicle(car1);
        lot.parkVehicle(bike1);
        lot.parkVehicle(car2); // Succeeds in spot 102

        Vehicle car3 = new Car("FULL-000");
        lot.parkVehicle(car3); // Fails (no spots available)

        lot.unparkVehicle("ABC-1234");
        lot.parkVehicle(car3); // Now succeeds in spot 101
    }
}
