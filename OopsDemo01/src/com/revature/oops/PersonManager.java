package com.revature.oops;

public class PersonManager {
    public static void main(String[] args) {

        Person []person=new Person[10];
        person[0]=new Person();
        person[0].setName("aruna");

        person[0].setAge(22);

        System.out.println(person[0]);


//        Person p1=new Person();
//        p1.setName("Aruna");
//        p1.setAge(22);
//
//        System.out.println("Name : "+p1.getName()+", age : "+p1.getAge());
//
//        Person p2=new Person("Ashwin" ,21);
//        System.out.println("Name :"+p2.getName()+",Age :"+p2.getAge());

    }
}
