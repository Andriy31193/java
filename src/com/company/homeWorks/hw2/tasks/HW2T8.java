package com.company.homeWorks.hw2.tasks;

import com.company.homeWorks.interfaces.IHW;

import java.util.Scanner;

public class HW2T8 implements IHW {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Multiplication table from " + start + " to " + end + ":");

        for (int i = 1; i <= 10; i++) {
            for (int j = start; j <= end; j++) {
                System.out.printf("%d * %d = %d\t", j, i, (j * i));
            }
            System.out.println();
        }
    }
}
