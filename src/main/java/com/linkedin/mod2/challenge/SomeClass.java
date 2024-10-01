package com.linkedin.mod2.challenge;

public class SomeClass {
    final private String name;
    final private int age;
    final private double[] grades;

    public SomeClass(String name, int age, double[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public double calculateGradeAverage() {
        double average = getGradeSum() / grades.length;
        if (average >= 90) {
            return 4.0;
        } else if (average >= 80) {
            return 3.0;
        } else if (average >= 70) {
            return 2.0;
        } else if (average >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public double getAverage() {
        if (grades.length == 0)
            throw new ArithmeticException("Division by zero not allowed");
        return getGradeSum() / grades.length;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private double[] getGrades() {
        return grades;
    }

    private double getGradeSum() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum;
    }
}

