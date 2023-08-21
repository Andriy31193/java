package com.company.homeWorks.hw3.models;

import java.util.Scanner;

public class City {
    private String cityName;
    private String regionName;
    private String countryName;
    private long population;
    private String postalCode;
    private String areaCode;

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter city name: ");
        cityName = scanner.nextLine();

        System.out.print("Enter region name: ");
        regionName = scanner.nextLine();

        System.out.print("Enter country name: ");
        countryName = scanner.nextLine();

        System.out.print("Enter population: ");
        population = scanner.nextLong();

        scanner.nextLine();

        System.out.print("Enter postal code: ");
        postalCode = scanner.nextLine();

        System.out.print("Enter area code: ");
        areaCode = scanner.nextLine();
    }

    public void displayInfo() {
        System.out.println("City Name: " + cityName);
        System.out.println("Region Name: " + regionName);
        System.out.println("Country Name: " + countryName);
        System.out.println("Population: " + population);
        System.out.println("Postal Code: " + postalCode);
        System.out.println("Area Code: " + areaCode);
    }

    public String getCityName() {
        return cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public long getPopulation() {
        return population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public static void main(String[] args) {
        City city = new City();
        city.inputInfo();
        System.out.println("\nCity information entered:");
        city.displayInfo();
    }
}