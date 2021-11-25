package com.everestengineering.parkinglotdesign.parkinglottest;

import com.everestengineering.parkinglotdesign.parkinglot.FloorsInParkingLot;
import com.everestengineering.parkinglotdesign.parkinglot.ParkingLotSpace;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ParkingLotTest {
    static List<ArrayList<String>> vehiclesData;
    @BeforeAll
    public static  void creatingParkingLotTesting()
    {
        ParkingLotSpace plot = new ParkingLotSpace("PR123",2,6);
         vehiclesData=plot.createParkingLot();
        assertEquals(vehiclesData.size(),2,"Floor objects are created in lot");
        assertEquals(vehiclesData.get(0).size(),6,"Slot objects are created in each floor");
    }
    @Test
    public void parkVehicle()
    {
        ParkingLot parkingLot = new ParkingLot(vehiclesData);
        parkingLot.parkVehicle("CAR","KA-01-DB-1541","RED");
        assertEquals((vehiclesData.get(0).get(3)),("CAR is parked"),"Car is parked successfully.");
        assertNotEquals((vehiclesData.get(0).get(4)),("CAR is parked"),"Car slot is empty.");
        parkingLot.parkVehicle("BIKE","KA-01-DB-1234","RED");
        assertEquals((vehiclesData.get(0).get(1)),("BIKE is parked"),"Bike is parked successfully.");
        assertNotEquals((vehiclesData.get(0).get(2)),("BIKE is parked"),"Bike slot is empty.");
        parkingLot.parkVehicle("TRUCK","KA-32-SJ-5389 ","ORANGE");
        assertEquals((vehiclesData.get(0).get(0)),("TRUCK is parked"),"Truck is parked successfully.");
        assertNotEquals((vehiclesData.get(1).get(0)),("TRUCK is parked"),"Truck slot is empty.");

    }

}
