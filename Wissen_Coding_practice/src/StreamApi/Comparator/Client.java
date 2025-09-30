package src.StreamApi.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
                new Employee("John", 50000, "HR"),
                new Employee("Alice", 75000, "IT"),
                new Employee("Bob", 60000, "Finance"),
                new Employee("David", 80000, "IT"),
                new Employee("Carol", 70000, "HR")
        );

        List<Employee> sortByName = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println(sortByName);

        List<Employee> sortBySalary = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(sortBySalary);

        List<Employee> sortByDept = employees.stream()
                .sorted(Comparator.comparing(Employee::getDeptName))
                .collect(Collectors.toList());
        System.out.println(sortByDept);

    }
}
