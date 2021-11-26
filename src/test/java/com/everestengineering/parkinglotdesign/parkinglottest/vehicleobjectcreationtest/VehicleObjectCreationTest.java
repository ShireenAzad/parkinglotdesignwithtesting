package com.everestengineering.parkinglotdesign.parkinglottest.vehicleobjectcreationtest;

import com.everestengineering.parkinglotdesign.vehicles.Vehicle;
import com.everestengineering.parkinglotdesign.vehicles.VehicleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class VehicleObjectCreationTest {
    @Test
    public void checkingVehicleObjectCreation() {
        Vehicle vehicle = VehicleType.valueOf("CAR").createVehicle();
        assertNotNull(vehicle, "Car object is created");
        vehicle = VehicleType.valueOf("BIKE").createVehicle();
        assertNotNull(vehicle, "Bike object is created");
        vehicle = VehicleType.valueOf("TRUCK").createVehicle();
        assertNotNull(vehicle, "Truck object is created");


    }
}
