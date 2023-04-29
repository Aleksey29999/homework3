package ru.geekbrains;

/**
 * TODO: 1. Разработать самостоятельно в рамках домашней работы.
 */
class Freelancer extends Employee {
    // salary * 18 * 5

    public Freelancer(String firstName, String surName, int age, double salary) {
        super(firstName, surName, age, salary);
    }


    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; фрилансер; возраст: %d; плата за заказ: %.2f",
                surName, firstName, age, calculateSalary());
    }
}