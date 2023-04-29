package ru.geekbrains;

abstract class Employee implements Comparable<Employee> {

    protected String firstName;
    protected String surName;
    protected int age;
    protected double salary;

    public Employee(String firstName, String surName, int age, double salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Ставка: %.2f; Среднемесячная заработная плата: %.2f",
                surName, firstName, salary, calculateSalary());
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(age, o.age);
    }
}