package com.everestengineering.parkinglotdesign.parkinglottest;

import com.everestengineering.parkinglotdesign.parkinglot.ParkingLotSpace;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ParkingLot {
    private final List<ArrayList<String>> vehiclesData;
    private final LinkedHashMap<String, String> ticketsData;

    public ParkingLot(List<ArrayList<String>> vehiclesData, LinkedHashMap<String, String> ticketsData) {
        this.vehiclesData = vehiclesData;
        this.ticketsData = ticketsData;

    }

    public List<ArrayList<String>> parkVehicle(String vehicleType, String vehicleRegistrationNumber, String vehicleColor) {

        for (int i = 0; i < vehiclesData.size(); i++) {
            for (int j = 0; j < vehiclesData.get(0).size(); j++) {
                if (vehiclesData.get(i).get(j).equals(vehicleType)) {
                    Ticket ticket = new Ticket(ticketsData);
                    ticket.generateTicket(ParkingLotSpace.getId() + "_" + (i + 1) + "_" + (j + 1), vehicleRegistrationNumber, vehicleColor);
                    vehiclesData.get(i).set(j, (vehicleType + " is parked"));
                    return vehiclesData;
                }
            }
        }
        return vehiclesData;
    }


    public List<ArrayList<String>> unparkVehicle(String ticketId) {
        String[] vehiclePosition = ticketId.split("_");
        String[] vehicleType = (vehiclesData.get(Integer.parseInt(vehiclePosition[1]) - 1).get(Integer.parseInt(vehiclePosition[2]) - 1)).split(" ");
        vehiclesData.get(Integer.parseInt(vehiclePosition[1]) - 1).set(Integer.parseInt(vehiclePosition[2]) - 1, vehicleType[0]);
        return vehiclesData;
    }
}
