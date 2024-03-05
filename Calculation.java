/*4. Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks.*/

import java.util.Scanner;
class Calculation{
    
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int total=a+b+c;
                float percentage=total/3;
                System.out.println(total);
                System.out.println(percentage);
            }
        }
           
             