package com.company.homeWorks.hw9.tasks;

import com.company.homeWorks.aclasses.MultipleHomework;
import com.company.homeWorks.hw9.models.Student;
import com.company.homeWorks.interfaces.IHW;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HW9T2 extends MultipleHomework implements IHW {
    @Override
    public void solve() {
        List<Student> students = loadStudentsFromFile();

        if (students.isEmpty()) {
            System.err.println("File not found or empty.");
            return;
        }

        List<String> lastNamesUnder16 = students.stream()
                .filter(student -> student.getAge() < 16)
                .map(Student::getLastName)
                .collect(Collectors.toList());

        // Print the last names
        System.out.println("Last names of students younger than 16:");
        lastNamesUnder16.forEach(System.out::println);


        double averagePoints = students.stream()
                .mapToDouble(Student::getPoints)
                .average()
                .orElse(0.0);

        System.out.println("Average Points of All Students: " + averagePoints);
    }

    public static List<Student> loadStudentsFromFile() {
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data/hw9/students.data"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String fullName = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    String group = parts[2].trim();
                    int points = Integer.parseInt(parts[3].trim());
                    students.add(new Student(fullName, age, group, points));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
}
