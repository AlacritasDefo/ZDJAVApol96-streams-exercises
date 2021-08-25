package pl.sda.sorted;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jakub", "Błaszczykowski", 1980);
        Employee employee2 = new Employee("Jakub", "Błaszczykowski", 1980);
        Employee employee3 = new Employee("Jakub", "Błaszczyk", 1990);
        Employee employee4 = new Employee("Jarosław", "Kamiński", 1981);

        Comparator<Employee> comparator = (emp1, emp2) -> emp2.getDateOfBirth() - emp1.getDateOfBirth();

        List<Employee> listOfSortedEmploees = List.of(employee1, employee2, employee3, employee4).stream().
                sorted(comparator).
                collect(Collectors.toList());

        System.out.println(listOfSortedEmploees);
    }


}
