package com.everestengineering.parkinglotdesign.parkinglottest;

import java.util.LinkedHashMap;

public class Ticket {

    private LinkedHashMap<String, String> ticketsData = new LinkedHashMap<>();

    public Ticket(LinkedHashMap<String, String> ticketsData) {
        this.ticketsData = ticketsData;
    }

    public LinkedHashMap<String, String> generateTicket(String ticket, String vehicleRegistrationNumber, String vehicleColor) {

        ticketsData.put(ticket, (vehicleRegistrationNumber + " " + vehicleColor));
        System.out.println("Parked vehicle. Ticket ID: " + ticket);
        return ticketsData;
    }
}
