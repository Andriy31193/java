package com.company.homeWorks.hw5.models;

public class School extends House {
    private int numberOfStudents;
    private String accreditationLevel;

    public School(String address) {
        super(address);
    }

    @Override
    public void setDetailsFromInput(String input) {
        String[] parts = input.split(",");
        numberOfStudents = Integer.parseInt(parts[0]);
        accreditationLevel = parts[1];
    }

    @Override
    public void displayInfo() {
        System.out.println("School:");
        System.out.println("Address: " + super.address);
        System.out.println("Number of students: " + numberOfStudents);
        System.out.println("Accreditation level: " + accreditationLevel);
    }
}