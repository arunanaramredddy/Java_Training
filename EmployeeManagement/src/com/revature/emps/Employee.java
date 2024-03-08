package com.revature.emps;

public class Employee {

    private int empId;
    private String name;

    private int daysPresent;

    private int basicSalary;

    public Employee(int empId, String name, int daysPresent, int basicSalary) {
        this.empId = empId;
        this.name = name;
        this.daysPresent = daysPresent;
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", daysPresent=" + daysPresent +
                ", basicSalary=" + basicSalary +
                '}';
    }
}
