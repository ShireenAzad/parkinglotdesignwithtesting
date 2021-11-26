package com.everestengineering.parkinglotdesign.parkinglottest;

import java.util.LinkedHashMap;
import java.util.Map;

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

    public String[] removeTicket(String ticket) {
        String[] data = new String[0];
        for (Map.Entry<String, String> entry : ticketsData.entrySet()) {
            String key = entry.getKey();
            if (key.equals(ticket)) {
                data = new String[]{key, ticketsData.get(key)};
                data[0] = key;
                data[1] = ticketsData.get(key);
                ticketsData.remove(key);
                return data;
            }

        }
        return data;
    }
}
