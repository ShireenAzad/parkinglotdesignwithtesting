package com.everestengineering.parkinglotdesign.parkinglottest;

import com.everestengineering.parkinglotdesign.parkinglot.ParkingLotSpace;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private final List<ArrayList<String>> vehiclesData;

    public ParkingLot(List<ArrayList<String>> vehiclesData) {
        this.vehiclesData=vehiclesData;

    }

    public List<ArrayList<String>> parkVehicle(String vehicleType, String vehicleRegistrationNumber, String vehicleColor) {
        for (int i = 0; i < vehiclesData.size(); i++) {
            for (int j = 0; j < vehiclesData.get(0).size(); j++) {
                if (vehiclesData.get(i).get(j).equals(vehicleType)) {
                    vehiclesData.get(i).set(j, (vehicleType + " is parked"));
                    return vehiclesData;
                }
            }
        }
        return vehiclesData;
    }
}
