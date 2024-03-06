/*1. Take values of length and breadth of a rectangle from user and check if it is square or not.*/

import java.util.Scanner;
class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        if(length==breadth){
            System.out.println("Square");
        }
        else{
            System.out.println("Not a Square");
        }

    }
}