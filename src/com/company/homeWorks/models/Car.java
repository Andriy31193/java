package com.company.homeWorks.models;

import java.util.Scanner;

public class Car {
    private String carName;
    private String manufacturer;
    private int year;
    private double engineVolume;

    private static int totalCars = 0;

    public Car() {
        totalCars++;
    }

    public Car(String carName, String manufacturer, int year, double engineVolume) {
        this.carName = carName;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
        totalCars++;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car name: ");
        carName = scanner.nextLine();

        System.out.print("Enter manufacturer: ");
        manufacturer = scanner.nextLine();

        // Input validation for year
        while (true) {
            System.out.print("Enter year of production: ");
            String inputYear = scanner.nextLine();
            try {
                year = Integer.parseInt(inputYear);
                if (year < 0) {
                    System.out.println("Invalid year. Please enter a valid year.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid year.");
            }
        }

        // Input validation for engine volume
        while (true) {
            System.out.print("Enter engine volume: ");
            String inputEngineVolume = scanner.nextLine();
            try {
                engineVolume = Double.parseDouble(inputEngineVolume);
                if (engineVolume <= 0) {
                    System.out.println("Invalid engine volume. Please enter a valid value.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid engine volume.");
            }
        }
    }

    public void displayInfo() {
        System.out.println("Car Name: " + carName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year of Production: " + year);
        System.out.println("Engine Volume: " + engineVolume + " cc");
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.inputInfo();
        System.out.println("\nCar information entered:");
        car1.displayInfo();

        Car car2 = new Car("Model S", "Tesla", 2022, 7100);
        System.out.println("\nCar information for car2:");
        System.out.println("Car Name: " + car2.getCarName());
        System.out.println("Manufacturer: " + car2.getManufacturer());
        System.out.println("Year of Production: " + car2.getYear());

        System.out.println("\nTotal cars created: " + Car.getTotalCars());
    }
}
