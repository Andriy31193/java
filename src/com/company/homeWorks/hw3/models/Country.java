package com.company.homeWorks.hw3.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Country {
    private String countryName;
    private String continentName;
    private long population;
    private String countryCode;
    private String capitalCity;
    private ArrayList<String> cityNames = new ArrayList<String>();

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

    public String getCountryName() {
        return countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public long getPopulation() {
        return population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public ArrayList<String> getCityNames() {
        return cityNames;
    }

    public static void main(String[] args) {
        Country country = new Country();
        country.inputInfo();
        System.out.println("\nCountry information entered:");
        country.displayInfo();
    }
}

