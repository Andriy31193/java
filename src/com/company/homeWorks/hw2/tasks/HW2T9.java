package com.company.homeWorks.hw2.tasks;

import com.company.homeWorks.interfaces.IHW;

import java.util.Random;

public class HW2T9 implements IHW {
    @Override
    public void solve() {
        Random random = new Random();

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        int min = array[0];
        int max = array[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        System.out.println("Number of negative elements: " + negativeCount);
        System.out.println("Number of positive elements: " + positiveCount);
        System.out.println("Number of zero elements: " + zeroCount);
    }
}
