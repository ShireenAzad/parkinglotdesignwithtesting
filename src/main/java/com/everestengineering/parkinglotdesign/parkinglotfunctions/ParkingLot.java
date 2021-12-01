package com.everestengineering.parkinglotdesign.parkinglotfunctions;

import com.everestengineering.parkinglotdesign.parkinglotcreation.ParkingLotSpace;
import com.everestengineering.parkinglotdesign.vehicles.Vehicle;

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

    public List<ArrayList<String>> parkVehicle(Vehicle vehicle, String vehicleRegistrationNumber, String vehicleColor) {
        String vehicleType = vehicle.getClass().getSimpleName().toUpperCase();
        ParkingLotValidation parkingLotFull = new ParkingLotValidation(vehiclesData);
        if (parkingLotFull.isParkingLotFull(vehicleType))
            return vehiclesData;
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
        Ticket ticket = new Ticket(ticketsData);
        String[] ticketData = ticket.removeTicket(ticketId);
        if (ticketData.length == 0) {
            System.out.println("Invalid Ticket");
            return vehiclesData;
        }
        String[] vehiclePosition = ticketId.split("_");
        String[] vehicleDetails = ticketData[1].split(" ");
        String[] vehicleType = (vehiclesData.get(Integer.parseInt(vehiclePosition[1]) - 1).get(Integer.parseInt(vehiclePosition[2]) - 1)).split(" ");
        vehiclesData.get(Integer.parseInt(vehiclePosition[1]) - 1).set(Integer.parseInt(vehiclePosition[2]) - 1, vehicleType[0]);
        System.out.println("Unparked vehicle with Registration Number: " + vehicleDetails[0] + " and Color: " + vehicleDetails[1]);
        return vehiclesData;

    }
}
