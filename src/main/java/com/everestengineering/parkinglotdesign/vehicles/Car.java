package com.everestengineering.parkinglotdesign.vehicles;

public class Car implements Vehicle {


    public String vehicleRegistrationNumber(String carRegistrationNumber) {
        return carRegistrationNumber;
    }

    @Override
    public String vehicleColor(String carColor) {
        return carColor;

    }
}
