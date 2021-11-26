package com.everestengineering.parkinglotdesign.vehicles;
public enum VehicleType {
    TRUCK {
        public Vehicle createVehicle() {
            return new Truck();
        }
    },
    BIKE {
        public Vehicle createVehicle() {
            return new Bike();
        }
    },
    CAR {
        public Vehicle createVehicle() {
            return new Car();
        }
    };

    public abstract Vehicle createVehicle();
};

