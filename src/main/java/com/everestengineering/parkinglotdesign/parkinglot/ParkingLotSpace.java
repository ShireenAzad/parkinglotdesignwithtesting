package com.everestengineering.parkinglotdesign.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotSpace {
    private static String id;
    private static int floors;
    private static int slots;

    public ParkingLotSpace(String id, int floors, int slots) {
        ParkingLotSpace.id = id;
        ParkingLotSpace.floors = floors;
        ParkingLotSpace.slots = slots;
    }

    public static int getFloors() {
        return floors;
    }

    public static int getSlots() {
        return slots;
    }

    public static String getId() {
        return id;
    }

}

