package com.company.ui;

import com.company.homeWorks.interfaces.IManager;

import java.util.Scanner;

public class UI {

    public static void printBlock(String text) {
        System.out.println("-----------------------------");
        System.out.println(text);
        System.out.println("-----------------------------");
    }
    public static void printText(String text) {
        System.out.println(text);
    }
    public static void printDelimiter() {
        System.out.println("-----------------------------");
    }
    public static void printDelimiter(char s, int length) {
        for (int i = 0; i < length; i++)
            System.out.print(s);

        System.out.println("");
    }
    public static void printDelimiter(char s) {
        printDelimiter(s, 29);
    }


    public static int readNumber()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
