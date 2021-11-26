package com.everestengineering.parkinglotdesign.display;


import com.everestengineering.parkinglotdesign.vehicles.Truck;
import com.everestengineering.parkinglotdesign.vehicles.Vehicle;

public enum DisplayType {
    free_count
            {
                public Display displayVehicleData() {
                    return new DisplayFreeCount();
                }

            },
    free_slots
            {
                public Display displayVehicleData() {
                    return new DisplayFreeSlots();
                }

            },
    occupied_slots
            {
                public Display displayVehicleData() {
                    return new DisplayOccupiedSlots();
                }
            };

    public abstract Display displayVehicleData() ;
}
