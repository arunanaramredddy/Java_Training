package com.bank;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur name");
        String name=sc.next();
        System.out.println("enter ur pin");
        int pin=sc.nextInt();

        System.out.println("1.savings 2. current  3. demat");
        System.out.println("enter ur choice");
        int n=sc.nextInt();
        switch (n) {
            case 1: {

                Savings saving=new Savings();
                saving.intrest();
            } break;
            case 2: {

                Current current=new Current();
                current.getBalance();
            }break;
            case 3: {


            }break;
            default:
                System.out.println("enter correct option");
        }


    }

}
