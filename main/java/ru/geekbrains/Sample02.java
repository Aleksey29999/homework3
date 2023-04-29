//Доработать приложение, которое мы разрабатывали на уроке. Мы доллжны поработать с сортировкой объектов, освоить работу с интерфейсами Comparator,
//        Comparable.
//Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
//Переработать метод generateEmployee, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого). Метод должен быть один!
//Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? Тогда добавьте соответствующее состояние на уровне ваших классов).
//Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.






package ru.geekbrains;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Sample02 {

    private static Random random = new Random();

    /**
     * TODO: 2. Переработать метод generateEmployee(). Метод должен возвращать
     * любого случайного сотрудника разного типа (Worker, Freelancer)
     *
     * @return
     */
    public static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salary = random.nextInt(900, 1500);
        int salaryIndex = random.nextInt(28, 31);
        int age = random.nextInt(22, 60);
        int type = random.nextInt(0, 2);
        int price = random.nextInt(10000, 30000);

        return type == 0 ? new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], age, salary * salaryIndex) :
                new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], age, price);

    }

    public static void main(String[] args) {

        //Worker worker = new Worker("Глеб", "Григорьев", 120000);
        //System.out.println(worker);

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees);

        System.out.println("\n*** Отсортированный по возрасту массив сотрудников ***\n");

        for (Employee employee : employees) {
            System.out.println(employee);
        }


        /*int a = 2;
        boolean f = true;
        String str = "Hello!";
        System.out.println(worker);
        System.out.println(a);
        System.out.println(f);
        System.out.println(str);*/

    }

}










