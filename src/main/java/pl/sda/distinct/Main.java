package pl.sda.distinct;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jakub", "Błaszczykowski", 1980);
        Employee employee2 = new Employee("Jakub", "Błaszczykowski", 1980);
        Employee employee3 = new Employee("Jakub", "Błaszczyk", 1990);
        Employee employee4 = new Employee("Jarosław", "Kamiński", 1981);

        List<Employee> employeeList = List.of(employee1, employee2, employee3, employee4);
        System.out.println(employeeList);
        List<Employee> employeeList1 = employeeList.stream().distinct().collect(Collectors.toList());
        System.out.println(employeeList1);
    }
}
