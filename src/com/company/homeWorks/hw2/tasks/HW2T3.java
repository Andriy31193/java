package com.company.homeWorks.hw2.tasks;

import com.company.homeWorks.interfaces.IHW;

import java.util.Scanner;

public class HW2T3 implements IHW {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first digit: ");
        int firstDigit = scanner.nextInt();

        System.out.print("Enter the second digit: ");
        int secondDigit = scanner.nextInt();

        System.out.print("Enter the third digit: ");
        int thirdDigit = scanner.nextInt();

        int number = firstDigit * 100 + secondDigit * 10 + thirdDigit;

        System.out.println("Constructed number: " + number);
    }
}
