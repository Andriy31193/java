package com.company.homeWorks.hw2.tasks;

import com.company.homeWorks.interfaces.IHW;

import java.util.Random;

public class HW2T10 implements IHW {
    @Override
    public void solve() {
        Random random = new Random();

        int[] originalArray = new int[20];

        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = random.nextInt(201) - 100;
        }

        int evenCount = 0;
        int oddCount = 0;
        int negativeCount = 0;
        int positiveCount = 0;

        for (int num : originalArray) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];
        int[] negativeArray = new int[negativeCount];
        int[] positiveArray = new int[positiveCount];

        int evenIndex = 0;
        int oddIndex = 0;
        int negativeIndex = 0;
        int positiveIndex = 0;

        for (int num : originalArray) {
            if (num % 2 == 0) {
                evenArray[evenIndex++] = num;
            } else {
                oddArray[oddIndex++] = num;
            }
            if (num < 0) {
                negativeArray[negativeIndex++] = num;
            } else if (num > 0) {
                positiveArray[positiveIndex++] = num;
            }
        }

        System.out.println("Original array: " + java.util.Arrays.toString(originalArray));
        System.out.println("Even array: " + java.util.Arrays.toString(evenArray));
        System.out.println("Odd array: " + java.util.Arrays.toString(oddArray));
        System.out.println("Negative array: " + java.util.Arrays.toString(negativeArray));
        System.out.println("Positive array: " + java.util.Arrays.toString(positiveArray));
    }
}
