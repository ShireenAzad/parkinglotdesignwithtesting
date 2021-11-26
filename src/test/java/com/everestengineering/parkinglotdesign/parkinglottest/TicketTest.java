package com.everestengineering.parkinglotdesign.parkinglottest;

import com.everestengineering.parkinglotdesign.parkinglot.ParkingLotSpace;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TicketTest {

    public static List<ArrayList<String>> vehiclesData;
    LinkedHashMap<String, String> ticketsData = new LinkedHashMap<>();
    @BeforeAll
    public static void creatingParkingLotTesting() {
        ParkingLotSpace plot = new ParkingLotSpace("PR1234", 2, 6);
        vehiclesData = plot.createParkingLot();
    }

    @Test
    public void checkingTicketGeneration() {
        ParkingLot parkingLot = new ParkingLot(vehiclesData,ticketsData);
        Vehicle vehicle = VehicleType.valueOf("CAR").createVehicle();
        parkingLot.parkVehicle(vehicle, "KA-01-DB-1541", "RED");
        Ticket ticket = new Ticket(ticketsData);
        LinkedHashMap<String, String> ticketsData = ticket.generateTicket(ParkingLotSpace.getId() + "_" + 1 + "_" + 4, "KA-01-DB-1541", "RED");
        boolean isTicketPresent = ticketsData.containsKey("PR1234_1_4");
        assertEquals(isTicketPresent,true,"Ticket is generated");
        isTicketPresent = ticketsData.containsKey("PR1234_1_5");
        assertEquals(isTicketPresent,false,"Ticket is not generated");

    }
    @Test
    public void checkingTicketRemoval()
    {
        ParkingLot parkingLot = new ParkingLot(vehiclesData,ticketsData);
        Vehicle vehicle = VehicleType.valueOf("CAR").createVehicle();
        parkingLot.parkVehicle(vehicle, "KA-01-DB-1541", "RED");
        Ticket ticket = new Ticket(ticketsData);
        LinkedHashMap<String, String> ticketsData = ticket.generateTicket(ParkingLotSpace.getId() + "_" + 1 + "_" + 4, "KA-01-DB-1541", "RED");
        String[] ticketIdData=ticket.removeTicket("PR1234_1_4");
        assertEquals(ticketIdData[0],"PR1234_1_4","Ticket removed successfully");

    }
}
