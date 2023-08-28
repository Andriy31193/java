package com.company.homeWorks.hw5.models;

public abstract class House {
    public String address;

    public House(String address) {
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract void setDetailsFromInput(String input);

    public abstract void displayInfo();
}
