package com.company.homeWorks.hw9.tasks;

import com.company.homeWorks.hw9.models.Car;
import com.company.homeWorks.interfaces.IHW;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HW9T1 implements IHW {
    @Override
    public void solve() {

        List<Car> cars = loadCarsFromFile();

        if (cars.isEmpty()) {
            System.err.println("File not found or empty.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a car color:");
            List<String> colors = cars.stream()
                    .map(Car::getColor)
                    .distinct()
                    .collect(Collectors.toList());

            for (int i = 0; i < colors.size(); i++) {
                System.out.println((i + 1) + ". " + colors.get(i));
            }

            System.out.print("Enter the number of your choice: ");
            int colorChoice = scanner.nextInt();

            if (colorChoice < 1 || colorChoice > colors.size()) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            String selectedColor = colors.get(colorChoice - 1);

            List<Car> filteredCars = cars.stream()
                    .filter(car -> car.getColor().equals(selectedColor))
                    .collect(Collectors.toList());

            if (filteredCars.isEmpty()) {
                System.out.println("No cars with the selected color found.");
            } else {
                Car fastestCar = filteredCars.stream()
                        .max(Comparator.comparingInt(Car::getMaxSpeed))
                        .orElse(null);

                System.out.println("The fastest car with " + selectedColor + " color is:");
                System.out.println("Name: " + fastestCar.getName());
                System.out.println("Color: " + fastestCar.getColor());
                System.out.println("Max Speed: " + fastestCar.getMaxSpeed() + " km/h");
            }

            System.out.print("Do you want to search again? (yes/no): ");
            String againChoice = scanner.next();
            if (!againChoice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }

    private static List<Car> loadCarsFromFile() {

        List<Car> cars = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data/hw9/cars.data"))) {
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
