package com.company.homeWorks.hw10.models;

public class Car {
    private String carModel;
    private int cargoCapacity;
    private boolean available;

    public Car(String carModel, int cargoCapacity) {
        this.carModel = carModel;
        this.cargoCapacity = cargoCapacity;
        this.available = true;
    }

    // Getter methods for the fields
    public String getCarModel() {
        return carModel;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public boolean isAvailable() {
        return available;
    }

    // Mark the car as unavailable (e.g., it's on a trip)
    public void markAsUnavailable() {
        this.available = false;
    }

    // Mark the car as available (e.g., after a trip or repair)
    public void markAsAvailable() {
        this.available = true;
    }

    // Implement logic to check and handle car breakdown during a trip
    public boolean hasBreakdown() {
        // Return true if the car has a breakdown during a trip, else false
        return false;
    }
}
