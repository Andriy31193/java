package com.company.homeWorks.hw2.tasks;

import com.company.homeWorks.interfaces.IHW;

import java.util.Scanner;

public class HW2T2 implements IHW {

    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number = scanner.nextDouble();

        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        double result = (percentage / 100) * number;

        System.out.println("Result: " + result);

    }
}
