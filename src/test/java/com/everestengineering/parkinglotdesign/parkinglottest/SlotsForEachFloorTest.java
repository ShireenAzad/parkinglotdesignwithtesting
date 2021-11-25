package com.everestengineering.parkinglotdesign.parkinglottest;

import com.everestengineering.parkinglotdesign.parkinglot.ParkingLotSpace;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

public class SlotsForEachFloorTest {
    @Test
    public void slotsCreationTesting()
    {
        ParkingLotSpace plot = new ParkingLotSpace("PR123", 2, 6);
        List<ArrayList<String>> floors=plot.createParkingLot();
        assertEquals(floors.get(0).size(),6,"Slot objects are created successfully.");
        ParkingLotSpace plot1 = new ParkingLotSpace("PR123", 2, 4);
        List<ArrayList<String>> floors1=plot.createParkingLot();
        assertNotEquals(floors.get(0).size(),4,"Slot objects are not created successfully in each floor.");
    }
}
