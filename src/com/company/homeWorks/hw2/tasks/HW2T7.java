package com.company.homeWorks.hw2.tasks;

import com.company.homeWorks.interfaces.IHW;

import java.util.Scanner;

public class HW2T7 implements IHW {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        System.out.println("Odd numbers in the range:");

        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
