package com.company.homeWorks.hw10.models;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Dispatcher {
    private List<Driver> drivers;
    private List<Car> cars;
    private List<Trip> trips;
    private Map<String, Integer> cargoStatistics;
    private List<Trip> completedTrips;

    public Dispatcher() {
        drivers = new ArrayList<>();
        cars = new ArrayList<>();
        trips = new ArrayList<>();
        cargoStatistics = new HashMap<>();
        completedTrips = new ArrayList<>();
    }

    // Add a driver to the dispatcher
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    // Add a car to the dispatcher
    public void addCar(Car car) {
        cars.add(car);
    }

    // Generate and process random requests, assign drivers and cars, and log trips
    public void processRequests(int numRequests) {
        for (int i = 0; i < numRequests; i++) {
            Request request = Request.generateRandomRequest();
            Driver availableDriver = findAvailableDriver(request);

            if (availableDriver != null) {
                Car availableCar = findAvailableCar(request);

                if (availableCar != null) {
                    Trip trip = new Trip(request, availableDriver, availableCar);
                    int earnings = trip.performTrip();
                    trips.add(trip);

                    // Update cargo statistics
                    String cargoType = request.getCargoType();
                    cargoStatistics.put(cargoType, cargoStatistics.getOrDefault(cargoType, 0) + request.getQuantity());

                    // Add completed trip to the list
                    completedTrips.add(trip);

                    // Log the trip to a file
                    logTrip(trip, earnings);
                }
            }
        }
    }

    // Find an available driver with enough experience for the request
    private Driver findAvailableDriver(Request request) {
        return drivers.stream()
                .filter(driver -> driver.isAvailable() && driver.getExperience() >= request.getQuantity())
                .min(Comparator.comparing(Driver::getExperience))
                .orElse(null);
    }

    // Find an available car with sufficient cargo capacity for the request
    private Car findAvailableCar(Request request) {
        return cars.stream()
                .filter(car -> car.isAvailable() && car.getCargoCapacity() >= request.getQuantity())
                .min(Comparator.comparing(Car::getCargoCapacity))
                .orElse(null);
    }

    // Log the trip details to a file
    private void logTrip(Trip trip, int earnings) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("trip_log.txt", true))) {
            writer.println("Destination: " + trip.getRequest().getDestination());
            writer.println("Cargo Type: " + trip.getRequest().getCargoType());
            writer.println("Quantity: " + trip.getRequest().getQuantity());
            writer.println("Driver: " + trip.getDriver().getName());
            writer.println("Car Model: " + trip.getCar().getCarModel());
            writer.println("Earnings: " + earnings);
            writer.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Get cargo statistics
    public Map<String, Integer> getCargoStatistics() {
        return cargoStatistics;
    }

    // Get drivers with the highest earnings
    public List<Driver> getDriversWithHighestEarnings() {
        int maxEarnings = drivers.stream().mapToInt(Driver::getEarnings).max().orElse(0);
        return drivers.stream()
                .filter(driver -> driver.getEarnings() == maxEarnings)
                .collect(Collectors.toList());
    }
}
