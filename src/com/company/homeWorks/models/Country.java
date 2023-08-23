package com.company.homeWorks.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Country {
    private String countryName;
    private String continentName;
    private long population;
    private String countryCode;
    private String capitalCity;
    private ArrayList<String> cityNames = new ArrayList<String>();

    public Country() {
        // Default constructor
    }

    public Country(String countryName, String continentName, long population) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter country name: ");
        countryName = scanner.nextLine();

        System.out.print("Enter continent name: ");
        continentName = scanner.nextLine();

        System.out.print("Enter population: ");
        population = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter country code: ");
        countryCode = scanner.nextLine();

        System.out.print("Enter capital city: ");
        capitalCity = scanner.nextLine();

        System.out.println("Enter city names (enter 'done' to finish):");
        String cityName;
        do {
            cityName = scanner.nextLine();
            if (!cityName.equals("done")) {
                cityNames.add(cityName);
            }
        } while (!cityName.equals("done"));
    }

    public void displayInfo() {
        System.out.println("Country Name: " + countryName);
        System.out.println("Continent Name: " + continentName);
        System.out.println("Population: " + population);
        System.out.println("Country Code: " + countryCode);
        System.out.println("Capital City: " + capitalCity);
        System.out.println("City Names: " + cityNames);
    }

    // Getters and Setters

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public ArrayList<String> getCityNames() {
        return cityNames;
    }

    public void setCityNames(ArrayList<String> cityNames) {
        this.cityNames = cityNames;
    }

    public static void main(String[] args) {
        Country country1 = new Country();
        country1.inputInfo();
        System.out.println("\nCountry information entered:");
        country1.displayInfo();

        Country country2 = new Country("United States", "North America", 332915073);
        System.out.println("\nCountry information for country2:");
        System.out.println("Country Name: " + country2.getCountryName());
        System.out.println("Continent Name: " + country2.getContinentName());
        System.out.println("Population: " + country2.getPopulation());
    }
}