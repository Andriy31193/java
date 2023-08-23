package com.company.homeWorks.hw3.tasks;

import com.company.homeWorks.models.Country;
import com.company.homeWorks.interfaces.IHW;

import java.util.ArrayList;
import java.util.Scanner;

public class HW3T3 implements IHW {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Country> countries = new ArrayList<Country>();

        int numCountries;

        System.out.print("Enter the number of countries: ");
        numCountries = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCountries; i++) {
            System.out.println("\nEnter information for Country " + (i + 1) + ":");
            Country country = new Country();
            country.inputInfo();
            countries.add(country);
        }

        System.out.println("\nCountry information:");

        for (Country country : countries) {
            System.out.println("\nCountry " + country.getCountryName() + ":");
            country.displayInfo();
        }
    }
}
