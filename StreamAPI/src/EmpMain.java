import com.stream.Employee;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmpMain {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Ram", 200000));
        list.add(new Employee(2, "Shyam", 430000));
        list.add(new Employee(3, "Hari", 400000));
        list.add(new Employee(4, "Sita", 300000));
        list.add(new Employee(5, "Gita", 200000));
        System.out.println("Employees salary greater than 400000");
        employee.stream().filter(e -> e.getSalary() > 400000).forEach(e -> System.out.println("ID: " + e.getId() + " Name: " + e.getName() + " Salary: " + e.getSalary()));
        employee.forEach(e -> e.setSalary(e.getSalary() *1.25));
        System.out.println("Employees salary after increment of 25%");
        employee.forEach(e -> System.out.println("ID: " + e.getId() + " Name: " + e.getName() + " Salary: " + e.getSalary()));
        ArrayList<String> empNames= employee.stream()
                .map(e -> e.getName())
                .map(e -> e.getName().toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Employees names in uppercase");
        empNames.forEach(e -> System.out.println(e));


    }

}
