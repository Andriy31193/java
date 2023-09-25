package com.company.homeWorks.hw10.models;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Request {
    private String destination;
    private int quantity;
    private String cargoType;

    public Request(String destination, int quantity, String cargoType) {
        this.destination = destination;
        this.quantity = quantity;
        this.cargoType = cargoType;
    }

    // Getter methods for the fields
    public String getDestination() {
        return destination;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCargoType() {
        return cargoType;
    }

    // Generate a random request
    public static Request generateRandomRequest() {
        Random random = new Random();
        String[] destinations = {"Destination1", "Destination2", "Destination3"}; // Replace with actual destinations
        String[] cargoTypes = {"Type1", "Type2", "Type3"}; // Replace with actual cargo types

        String randomDestination = destinations[random.nextInt(destinations.length)];
        int randomQuantity = random.nextInt(10) + 1; // Ensure quantity is at least 1
        String randomCargoType = cargoTypes[random.nextInt(cargoTypes.length)];

        return new Request(randomDestination, randomQuantity, randomCargoType);
    }
}