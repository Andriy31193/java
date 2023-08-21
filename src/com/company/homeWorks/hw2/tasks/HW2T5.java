package com.company.homeWorks.hw2.tasks;

import com.company.homeWorks.interfaces.IHW;

import java.util.Scanner;

public class HW2T5 implements IHW {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        int monthNumber = scanner.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            String season;
            if (monthNumber >= 3 && monthNumber <= 5) {
                season = "Spring";
            } else if (monthNumber >= 6 && monthNumber <= 8) {
                season = "Summer";
            } else if (monthNumber >= 9 && monthNumber <= 11) {
                season = "Autumn";
            } else {
                season = "Winter";
            }

            System.out.println("The season for month " + monthNumber + " is " + season);
        } else {
            System.out.println("Invalid month number. Please enter a value between 1 and 12.");
        }
    }
}
