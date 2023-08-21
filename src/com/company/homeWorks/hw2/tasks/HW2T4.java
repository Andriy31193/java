package com.company.homeWorks.hw2.tasks;

import com.company.homeWorks.interfaces.IHW;

import java.util.Scanner;

public class HW2T4 implements IHW {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a six-digit number: ");
        int number = scanner.nextInt();

        if (number < 100000 || number > 999999) {
            System.out.println("Error: Input must be a six-digit number.");
        } else {
            int firstDigit = number / 100000;
            int secondDigit = (number / 10000) % 10;
            int thirdDigit = (number / 1000) % 10;
            int fourthDigit = (number / 100) % 10;
            int fifthDigit = (number / 10) % 10;
            int sixthDigit = number % 10;

            int newNumber = sixthDigit * 100000 + fifthDigit * 10000 + thirdDigit * 1000 +
                    fourthDigit * 100 + secondDigit * 10 + firstDigit;

            System.out.println("Original number: " + number);
            System.out.println("Number with swapped digits: " + newNumber);
        }
    }
}
