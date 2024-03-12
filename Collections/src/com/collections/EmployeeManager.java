package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManager {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee(103, "Aruna", 21000));
        empList.add(new Employee(105, "Sanju", 70000));
        empList.add(new Employee(101, "Vishnu", 63000));
        empList.add(new Employee(104, "Loki", 40000));
        empList.add(new Employee(102, "Ramya", 10000));
        System.out.println(empList);

        Collections.sort(empList, Comparator.comparing(Employee::geteId));

        for(Employee emp:empList){
            System.out.println(emp);
        }
        Collections.sort(empList);
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }
}
