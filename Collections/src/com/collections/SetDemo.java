package com.collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        //Set<String> employeeSet = new HashSet<>();
        //Set<String> employeeSet = new TreeSet<>();
        Set<String> employeeSet = new LinkedHashSet<>();

        employeeSet.add("Aruna");
        employeeSet.add("Ramya");
        employeeSet.add("Suppu");
        employeeSet.add("Vishnu");
        employeeSet.add("Loki");
        employeeSet.add("Loki");


        for(String employee:employeeSet){
            System.out.println(employee);
        }
    }
}
