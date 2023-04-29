package ru.geekbrains;

class Worker extends Employee {

    public Worker(String firstName, String surName, int age, double salary) {
        super(firstName, surName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; возраст: %d; Среднемесячная заработная плата: %.2f",
                surName, firstName, age, calculateSalary());
    }
}