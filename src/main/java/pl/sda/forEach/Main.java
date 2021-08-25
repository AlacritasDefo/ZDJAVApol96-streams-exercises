package pl.sda.forEach;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Jerzy", "Bartnik");
        Employee employee3 = new Employee("Anna", "Budka");

        List.of(employee1, employee2, employee3).stream()
                .map(Employee::getFirstName)
                .forEach(System.out::println);
    }
}
