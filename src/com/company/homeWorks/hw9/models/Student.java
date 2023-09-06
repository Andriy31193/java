package com.company.homeWorks.hw9.models;

public class Student {
    private final String fullName;
    private final int age;
    private final String group;
    private int points;

    public Student(String fullName, int age, String group, int points) {
        this.fullName = fullName;
        this.age = age;
        this.group = group;
        this.points = points;
    }


    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public String getLastName() {
        String[] parts = fullName.split(" ");
        return parts.length > 0 ? parts[parts.length - 1] : "";
    }
}
