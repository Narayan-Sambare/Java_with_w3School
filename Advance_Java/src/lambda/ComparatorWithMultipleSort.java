package lambda;
import java.util.*;
import static java.util.Comparator.*;
public class ComparatorWithMultipleSort {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 3000),
            new Employee("Bob", 2500),
            new Employee("Alice", 2000)
        );

        // 1. Simple Sort (Functional approach)
        employees.sort(comparing(Employee::getName));

        // 2. Multi-level Sort (Sort by Name, then by Salary)
        // This is where the power of functional chaining shines!
        employees.sort(
            comparing(Employee::getName)
            .thenComparing(Employee::getSalary)
        );

        // 3. Reverse Sort
        employees.sort(comparing(Employee::getSalary).reversed());
        
        System.out.println(employees);
    }
}
