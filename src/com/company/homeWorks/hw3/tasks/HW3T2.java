package com.company.homeWorks.hw3.tasks;

import com.company.homeWorks.models.City;
import com.company.homeWorks.interfaces.IHW;

import java.util.ArrayList;
import java.util.Scanner;

public class HW3T2 implements IHW {

    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<City> cities = new ArrayList<City>();

        int numCities;

        System.out.print("Enter the number of cities: ");
        numCities = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCities; i++) {
            System.out.println("\nEnter information for City " + (i + 1) + ":");
            City city = new City();
            city.inputInfo();
            cities.add(city);
        }

        System.out.println("\nCity information:");

        for (City city : cities) {
            System.out.println("\nCity " + city.getCityName() + ":");
            city.displayInfo();
        }
    }
}
