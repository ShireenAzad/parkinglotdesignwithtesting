package com.everestengineering.parkinglotdesign.parkinglottest;

import com.everestengineering.parkinglotdesign.parkinglot.FloorsInParkingLot;
import com.everestengineering.parkinglotdesign.parkinglot.ParkingLotSpace;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

 public class FloorsInParkingLotTest {
    @Test
    public void creatingFloorsTest()
    {
        ParkingLotSpace plot = new ParkingLotSpace("PR123", 2, 6);
        List<ArrayList<String>> floors=plot.createParkingLot();
        assertEquals(floors.size(),2,"Floor objects are created");
    }

}
