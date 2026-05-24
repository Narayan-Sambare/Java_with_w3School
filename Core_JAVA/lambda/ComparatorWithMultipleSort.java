package lambda;
import java.util.*;
import static java.util.Comparator.*;

public class ComparatorWithMultipleSort {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 3000),
            new Employee(2, "Bob", 2500),
            new Employee(3, "Alice", 2000)
        );

        // 1. Simple Sort (by Name)
        employees.sort(comparing(Employee::getName));
        System.out.println("Sort by Name: " + employees);

        // 2. Multi-level Sort (Name → Salary)
        employees.sort(
            comparing(Employee::getName)
            .thenComparing(Employee::getSal)
        );
        System.out.println("Sort by Name then Salary: " + employees);

        // 3. Reverse Sort (by Salary Desc)
        employees.sort(comparing(Employee::getSal).reversed());
        System.out.println("Sort by Salary Desc: " + employees);
    }
}
