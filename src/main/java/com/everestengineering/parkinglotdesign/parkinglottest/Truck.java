package com.everestengineering.parkinglotdesign.parkinglottest;

public class Truck implements Vehicle {
    public String vehicleRegistrationNumber(String truckRegistrationNumber) {
        return truckRegistrationNumber;
    }

    @Override
    public String vehicleColor(String truckColor) {
        return truckColor;

    }
}
