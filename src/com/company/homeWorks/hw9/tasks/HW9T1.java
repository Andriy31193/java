package com.company.homeWorks.hw9.tasks;

import com.company.homeWorks.hw9.models.Car;
import com.company.homeWorks.interfaces.IHW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HW9T1 implements IHW {
    @Override
    public void solve() {


        List<Car> cars = loadCarsFromFile("../data/cars.txt");

        if (cars.isEmpty()) {
            System.out.println("No car data found.");
            return;
        }

        // Use Stream API to find the fastest red car
        Car fastestRedCar = cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("Red"))
                .max((car1, car2) -> Integer.compare(car1.getMaxSpeed(), car2.getMaxSpeed()))
                .orElse(null);

        if (fastestRedCar != null) {
            System.out.println("The fastest red car is: " + fastestRedCar.getName() +
                    " (Color: " + fastestRedCar.getColor() +
                    ", Max Speed: " + fastestRedCar.getMaxSpeed() + " km/h)");
        } else {
            System.out.println("No red cars found.");
        }
    }

    private static List<Car> loadCarsFromFile(String filename) {

        // Construct the full path to the file
        String fullPath = new File(filename).getAbsolutePath();
        List<Car> cars = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fullPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    String color = parts[1].trim();
                    int maxSpeed = Integer.parseInt(parts[2].trim());
                    cars.add(new Car(name, color, maxSpeed));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cars;
    }
}
