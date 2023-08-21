package com.company.homeWorks.hw3.models;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        numerator = scanner.nextInt();

        System.out.print("Enter denominator: ");
        denominator = scanner.nextInt();
    }

    public void displayInfo() {
        System.out.println(numerator + "/" + denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(1, 2);

        System.out.print("Fraction 1: ");
        fraction1.displayInfo();

        System.out.print("Fraction 2: ");
        fraction2.displayInfo();

        Fraction sum = fraction1.add(fraction2);
        System.out.print("Sum: ");
        sum.displayInfo();

        Fraction difference = fraction1.subtract(fraction2);
        System.out.print("Difference: ");
        difference.displayInfo();

        Fraction product = fraction1.multiply(fraction2);
        System.out.print("Product: ");
        product.displayInfo();

        Fraction quotient = fraction1.divide(fraction2);
        System.out.print("Quotient: ");
        quotient.displayInfo();
    }
}
