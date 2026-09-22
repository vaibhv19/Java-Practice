package com.OOP.Projects.ParkingLot;

import java.util.ArrayList;
import java.util.List;

/**
 * Educational Parking Lot Project - ParkingLot Controller
 */
public class ParkingLot {
    private List<ParkingSpot> spots;

    public ParkingLot() {
        this.spots = new ArrayList<>();
    }

    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.park(vehicle)) {
                System.out.println("Parked " + vehicle.getType() + " [" + vehicle.getLicensePlate() + 
                                   "] in Spot #" + spot.getSpotNumber());
                return true;
            }
        }
        System.out.println("Parking failed for " + vehicle.getLicensePlate() + ": No available " + vehicle.getType() + " spots.");
        return false;
    }

    public boolean unparkVehicle(String licensePlate) {
        for (ParkingSpot spot : spots) {
            if (!spot.isAvailable() && spot.getParkedVehicle().getLicensePlate().equals(licensePlate)) {
                System.out.println("Unparked vehicle [" + licensePlate + "] from Spot #" + spot.getSpotNumber());
                spot.removeVehicle();
                return true;
            }
        }
        System.out.println("Vehicle [" + licensePlate + "] not found in parking lot.");
        return false;
    }
}
