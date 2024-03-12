package com.collections;
import java.util.*;
import java.util.Comparator;
public class Employee implements Comparable<Employee> {
    private int eId;
    private String Name;
    private int salary;

    public Employee() {
    }

    public Employee(int eId, String name, int salary) {
        this.eId = eId;
        Name = name;
        this.salary = salary;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", Name='" + Name + '\'' +
                ", salary=" + salary +
                '}';
    }


    public int compareTo(Employee o) {
        return this.geteId() - o.geteId();
    }
}
