package com.everestengineering.parkinglotdesign.vehicles;

public class Bike implements Vehicle {

    public String vehicleRegistrationNumber(String bikeRegistrationNumber) {
        return bikeRegistrationNumber;
    }

    @Override
    public String vehicleColor(String bikeColor) {
        return bikeColor;

    }
}
