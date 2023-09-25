package com.company.homeWorks.hw10.models;

public class Trip {
    private Request request;
    private Driver driver;
    private Car car;

    public Trip(Request request, Driver driver, Car car) {
        this.request = request;
        this.driver = driver;
        this.car = car;
    }

    public Request getRequest() {
        return request;
    }

    public Driver getDriver() {
        return driver;
    }

    public Car getCar() {
        return car;
    }

    // Other methods related to trips

    // Implement logic for the trip, including handling breakdowns and calculating earnings
    public int performTrip() {
        // Check if the car has a breakdown
        if (car.hasBreakdown()) {
            // Request repair and return 0 earnings for this trip
            driver.requestRepair();
            return 0;
        }

        // Calculate earnings based on cargo quantity, driver experience, and cargo type
        int earnings = request.getQuantity() * (driver.getExperience() + 1); // Adding 1 to experience for calculation

        // Mark car and driver as available
        car.markAsAvailable();
        driver.assignTrip(earnings);

        return earnings;
    }
}
