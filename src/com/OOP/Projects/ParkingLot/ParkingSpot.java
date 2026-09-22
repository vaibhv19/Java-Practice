package com.OOP.Projects.ParkingLot;

/**
 * Educational Parking Lot Project - Parking Spot Model
 */
public class ParkingSpot {
    private int spotNumber;
    private Vehicle.VehicleType spotType;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotNumber, Vehicle.VehicleType spotType) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
        this.parkedVehicle = null;
    }

    public boolean isAvailable() {
        return parkedVehicle == null;
    }

    public boolean park(Vehicle vehicle) {
        if (isAvailable() && vehicle.getType() == spotType) {
            this.parkedVehicle = vehicle;
            return true;
        }
        return false;
    }

    public void removeVehicle() {
        this.parkedVehicle = null;
    }

    public int getSpotNumber() { return spotNumber; }
    public Vehicle getParkedVehicle() { return parkedVehicle; }
    public Vehicle.VehicleType getSpotType() { return spotType; }
}
