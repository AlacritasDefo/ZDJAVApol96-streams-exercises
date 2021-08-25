package pl.sda.map;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Klara", "Smith");
        Person person3 = new Person("Jack", "Black");

        List<Person> people = List.of(person1, person2, person3);

        List<Employee> employees = people.stream()
                                        .map(person -> new Employee(person.getFirstName(), person.getLastName()))
                                        .collect(Collectors.toList());

        System.out.println(employees);
    }
}
