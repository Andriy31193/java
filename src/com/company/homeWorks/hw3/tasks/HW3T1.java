package com.company.homeWorks.hw3.tasks;

import com.company.homeWorks.hw3.models.Person;
import com.company.homeWorks.interfaces.IHW;

import java.util.Scanner;

public class HW3T1 implements IHW {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter information for a person:");

        Person person = new Person();
        person.inputInfo();

        System.out.println("\nInformation entered:");
        person.displayInfo();
    }
}
