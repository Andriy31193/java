package com.company.homeWorks.models;

import java.util.Scanner;

public class Person {
    private String fullName;
    private String dateOfBirth;
    private String contactPhone;
    private String city;
    private String country;
    private String homeAddress;

    public Person() {
        // Default constructor
    }

    public Person(String fullName, String dateOfBirth, String contactPhone) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.contactPhone = contactPhone;
    }

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

    // Getters and Setters

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.inputInfo();
        System.out.println("\nInformation entered:");
        person1.displayInfo();

        Person person2 = new Person("John Doe", "1990-01-01", "123-456-7890");
        System.out.println("\nInformation for person2:");
        System.out.println("Full Name: " + person2.getFullName());
        System.out.println("Date of Birth: " + person2.getDateOfBirth());
        System.out.println("Contact Phone: " + person2.getContactPhone());
    }
}