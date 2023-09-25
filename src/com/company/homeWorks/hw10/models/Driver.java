package com.company.homeWorks.hw10.models;

public class Driver {
    private String name;
    private int experience;
    private int earnings;
    private boolean available;
    private Car car; // Add a Car field to store the driver's car

    public Driver(String name, int experience, Car car) {
        this.name = name;
        this.experience = experience;
        this.earnings = 0;
        this.available = true;
        this.car = car; // Initialize the driver's car
    }

    // Getter methods for the fields
    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getEarnings() {
        return earnings;
    }

    public boolean isAvailable() {
        return available;
    }

    // Assign a trip to the driver and update earnings
    public void assignTrip(int earnings) {
        this.earnings += earnings;
        this.available = true;
    }

    // Request a repair for the car
    public void requestRepair() {
        if (!available) {
            System.out.println(name + " has requested a car repair.");
            // Assuming a repair takes some time to complete
            // Simulate the repair time by sleeping the thread
            try {
                Thread.sleep(2000); // Simulate a 2-second repair
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "'s car has been repaired and is now available.");
            car.markAsAvailable(); // Mark the car as available after repair
        }
    }
}
