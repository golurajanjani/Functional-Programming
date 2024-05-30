package Challenge114;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee>employees = List.of(
                new Employee("Golu",100),
                new Employee ("Raj", 200),
                new Employee ("Ram", 300),
                new Employee ("Rohan", 400),
                new Employee ("Raja", 20)
                );

        employees.stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}
