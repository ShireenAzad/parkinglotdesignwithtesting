package com.everestengineering.parkinglotdesign.parkinglottest;

import com.everestengineering.parkinglotdesign.parkinglot.ParkingLotSpace;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.everestengineering.parkinglotdesign.parkinglottest.ParkingLotTest.vehiclesData;
import static com.everestengineering.parkinglotdesign.parkinglottest.ParkingLotTest.ticketsData;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotValidationTest {
    @BeforeAll
    public static void creatingParkingLotTesting() {
        ParkingLotSpace plot = new ParkingLotSpace("PR1234", 2, 5);
        vehiclesData = plot.createParkingLot();
    }

    @Test
    public void checkingIsParkingLotFull()
    {
        ParkingLot parkingLot = new ParkingLot(vehiclesData,ticketsData);
        parkingLot.parkVehicle("CAR","KA-01-DB-1541","RED");
        parkingLot.parkVehicle("CAR","KA-01-DB-1541","RED");
        parkingLot.parkVehicle("CAR","KA-01-DB-1541","RED");
        parkingLot.parkVehicle("CAR","KA-01-DB-1541","RED");
        parkingLot.parkVehicle("CAR","KA-01-DB-1541","RED");
        ParkingLotValidation parkingLotCreationValidation=new ParkingLotValidation(vehiclesData);
        boolean parkingLotFull=parkingLotCreationValidation.isParkingLotFull("CAR");
        assertEquals(parkingLotFull,true,"parking lot is full");
        parkingLotFull=parkingLotCreationValidation.isParkingLotFull("BIKE");
        assertEquals(parkingLotFull,false,"There is slot to park the vehicle");

    }
}
