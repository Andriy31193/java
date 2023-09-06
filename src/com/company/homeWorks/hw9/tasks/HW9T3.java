package com.company.homeWorks.hw9.tasks;

import com.company.homeWorks.aclasses.MultipleHomework;
import com.company.homeWorks.hw9.models.Employee;
import com.company.homeWorks.hw9.models.Student;
import com.company.homeWorks.interfaces.IHW;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class HW9T3 extends MultipleHomework implements IHW {
    @Override
    public void solve() {
        List<Student> students = HW9T2.loadStudentsFromFile();

        List<Employee> employees = students.stream()
                .map(student -> {
                    String[] fullNameParts = student.getFullName().split(" ");
                    String name = fullNameParts[0];
                    String surname = fullNameParts.length > 1 ? fullNameParts[1] : "";
                    String patronymic = fullNameParts.length > 2 ? fullNameParts[2] : "";
                    int age = student.getAge();
                    return new Employee(name, surname, patronymic, age);
                })
                .collect(Collectors.toList());


        Random random = new Random();
        int numToPrint = 5;
        System.out.println("Randomly converted employees:");
        for (int i = 0; i < numToPrint; i++) {
            int randomIndex = random.nextInt(employees.size());
            Employee randomEmployee = employees.get(randomIndex);
            System.out.println("Employee " + (i + 1) + ": " + randomEmployee.getName() + " " + randomEmployee.getSurname());
        }
    }
}
