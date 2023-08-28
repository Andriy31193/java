package com.company.homeWorks.hw5.models;

public class Shop extends House {
    private String shopType;

    public Shop(String address) {
        super(address);
    }

    @Override
    public void setDetailsFromInput(String input) {
        shopType = input;
    }

    @Override
    public void displayInfo() {
        System.out.println("Shop:");
        System.out.println("Address: " + super.address);
        System.out.println("Shop type: " + shopType);
    }
}