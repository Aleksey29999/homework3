package ru.geekbrains;

import java.util.Comparator;

class AgeComparator implements Comparator<Employee> {

    // 1 0 -1
    @Override
    public int compare(Employee o1, Employee o2) {

        return Double.compare(o2.calculateSalary(), o1.calculateSalary());

    }
}

