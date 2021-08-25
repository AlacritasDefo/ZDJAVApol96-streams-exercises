package pl.sda.Filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("David", "Beckham", 1982);
        Employee employee2 = new Employee("Michael", "Owen", 1992);
        Employee employee3 = new Employee("Harry", "Kane", 1995);

        List<Employee> collect = Stream.of(employee1, employee2, employee3)
                .filter(employee -> employee.getDateOfBirth() > 1991)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
