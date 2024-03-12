package com.collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> employee=new HashMap<>();
        employee.put(101,"Aruna");
        employee.put(102,"Sanju");
        employee.put(103,"Vishnu");
        employee.put(104,"Loki");
        employee.put(105,"Ramya");

        System.out.println(employee);
        employee.put(103,"Suppu");
        System.out.println(employee);

        Set<Integer> setOfempId=employee.keySet();
        System.out.println(setOfempId);

        for(Integer empId:setOfempId){
            System.out.println(empId+" ::"+employee.get(empId));
        }

    }
}
