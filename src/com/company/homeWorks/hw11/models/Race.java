package com.company.homeWorks.hw11.models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

public class Race {
    private static AtomicLong startRaceTime = new AtomicLong(0);

    public static void main(String[] args) {
        List<RaceCarRunnable> cars = new ArrayList<>();
        int numCars = 5; // Change this to the number of cars you want in the race
        int raceDistance = 1000; // Change this to the race distance in meters

        CountDownLatch latch = new CountDownLatch(numCars);

        for (int i = 1; i <= numCars; i++) {
            RaceCarRunnable car = new RaceCarRunnable("Car " + i, 200, raceDistance, latch);
            cars.add(car);
        }

        List<Thread> threads = new ArrayList<>();
        for (RaceCarRunnable car : cars) {
            Thread thread = new Thread(car);
            threads.add(thread);
        }

        startRace(threads);

        try {
            latch.await(); // Wait for all cars to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        determineWinner(cars);
    }

    private static void startRace(List<Thread> cars) {
        Thread startThread = new Thread(() -> {
            for (int i = 3; i >= 1; i--) {
                System.out.println(i + "...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("GO!!!");

            startRaceTime.set(System.currentTimeMillis());

            for (Thread carThread : cars) {
                carThread.start();
            }
        });

        startThread.start();

        try {
            startThread.join(); // Wait for the start thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void determineWinner(List<RaceCarRunnable> cars) {
        RaceCarRunnable winner = null;
        long bestTime = Long.MAX_VALUE;

        for (RaceCarRunnable car : cars) {
            long finishTime = car.getFinishTime();
            if (finishTime < bestTime) {
                bestTime = finishTime;
                winner = car;
            }
        }

        assert winner != null;
        System.out.println("Winner: " + winner.name + " - Time: " + convertToTime(bestTime));
    }

    private static String convertToTime(long time) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("mm:ss.SSS");
        return dateFormat.format(time - startRaceTime.get());
    }
}