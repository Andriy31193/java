package com.company.homeWorks.hw2.tasks;

import com.company.homeWorks.interfaces.IHW;

import java.util.Scanner;

public class HW2T6 implements IHW {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in meters: ");
        double meters = scanner.nextDouble();

        System.out.println("Choose the conversion unit:");
        System.out.println("1. Miles");
        System.out.println("2. Inches");
        System.out.println("3. Yards");
        int choice = scanner.nextInt();

        double convertedDistance = 0.0;

        switch (choice) {
            case 1:
                convertedDistance = metersToMiles(meters);
                break;
            case 2:
                convertedDistance = metersToInches(meters);
                break;
            case 3:
                convertedDistance = metersToYards(meters);
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        System.out.println("Converted distance: " + convertedDistance);

    }

    public static double metersToMiles(double meters) {
        return meters * 0.000621371;
    }

    public static double metersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double metersToYards(double meters) {
        return meters * 1.09361;
    }
}
