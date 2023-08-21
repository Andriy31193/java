package com.company.homeWorks.hw3.tasks;

import com.company.homeWorks.hw3.models.Fraction;
import com.company.homeWorks.interfaces.IHW;

import java.util.ArrayList;
import java.util.Scanner;

public class HW3T4 implements IHW {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Fraction> fractions = new ArrayList<Fraction>();

        int numFractions;

        System.out.print("Enter the number of fractions: ");
        numFractions = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left by nextInt()

        for (int i = 0; i < numFractions; i++) {
            System.out.println("\nEnter information for Fraction " + (i + 1) + ":");
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            fractions.add(new Fraction(numerator, denominator));
            scanner.nextLine();
        }

        System.out.println("\nPerforming arithmetic operations:");

        for (int i = 0; i < fractions.size() - 1; i++) {
            for (int j = i + 1; j < fractions.size(); j++) {
                Fraction fraction1 = fractions.get(i);
                Fraction fraction2 = fractions.get(j);

                System.out.println("\nOperations between Fraction " + (i + 1) + " and Fraction " + (j + 1) + ":");

                System.out.print("Sum: ");
                fraction1.add(fraction2).displayInfo();

                System.out.print("Difference: ");
                fraction1.subtract(fraction2).displayInfo();

                System.out.print("Product: ");
                fraction1.multiply(fraction2).displayInfo();

                System.out.print("Quotient: ");
                fraction1.divide(fraction2).displayInfo();
            }
        }
    }
}
