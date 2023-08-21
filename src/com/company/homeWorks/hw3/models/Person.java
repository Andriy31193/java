package com.company.homeWorks.hw3.models;

import java.util.Scanner;

public class Person {

    private String fullName;
    private String dateOfBirth;
    private String contactPhone;
    private String city;
    private String country;
    private String homeAddress;

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full name: ");
        fullName = scanner.nextLine();

        System.out.print("Enter date of birth: ");
        dateOfBirth = scanner.nextLine();

        System.out.print("Enter contact phone: ");
        contactPhone = scanner.nextLine();

        System.out.print("Enter city: ");
        city = scanner.nextLine();

        System.out.print("Enter country: ");
        country = scanner.nextLine();

        System.out.print("Enter home address: ");
        homeAddress = scanner.nextLine();
    }

    public void displayInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Contact Phone: " + contactPhone);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Home Address: " + homeAddress);
    }

    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.inputInfo();
        System.out.println("\nInformation entered:");
        person.displayInfo();
    }
}
