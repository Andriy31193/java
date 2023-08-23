package com.company.homeWorks.models;

import java.util.Scanner;

public class City {
    private String cityName;
    private String regionName;
    private String countryName;
    private long population;
    private String postalCode;
    private String areaCode;

    public City() {
        // Default constructor
    }

    public City(String cityName, String countryName, long population) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.population = population;
    }

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

    // Getters and Setters

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public static void main(String[] args) {
        City city1 = new City();
        city1.inputInfo();
        System.out.println("\nCity information entered:");
        city1.displayInfo();

        City city2 = new City("New York", "USA", 8419600);
        System.out.println("\nCity information for city2:");
        System.out.println("City Name: " + city2.getCityName());
        System.out.println("Country Name: " + city2.getCountryName());
        System.out.println("Population: " + city2.getPopulation());
    }
}