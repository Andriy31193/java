package com.company.homeWorks.hw5.models;

public class ResidentialHouse extends House {
    private int numberOfResidents;

    public ResidentialHouse(String address) {
        super(address);
    }

    @Override
    public void setDetailsFromInput(String input) {
        numberOfResidents = Integer.parseInt(input);
    }

    @Override
    public void displayInfo() {
        System.out.println("Residential House:");
        System.out.println("Address: " + super.address);
        System.out.println("Number of residents: " + numberOfResidents);
    }
}
