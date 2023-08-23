package com.company.homeWorks.models;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        numerator = scanner.nextInt();

        System.out.print("Enter denominator (cannot be zero): ");
        int tempDenominator = scanner.nextInt();
        if (tempDenominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        denominator = tempDenominator;
    }

    public void displayInfo() {
        System.out.println(numerator + "/" + denominator);
    }

    // Getters and Setters

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }


    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        fraction1.inputInfo();
        System.out.print("Fraction 1: ");
        fraction1.displayInfo();

        Fraction fraction2 = new Fraction(1, 2);
        System.out.print("Fraction 2: ");
        fraction2.displayInfo();

        Fraction sum = fraction1.add(fraction2);
        System.out.print("Sum: ");
        sum.displayInfo();
    }
}