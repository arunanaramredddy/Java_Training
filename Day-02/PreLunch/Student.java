/*3. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not 
( 'Y' or 'N' ) and print accordingly.*/


import java.util.Scanner;
class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int classesHeld=sc.nextInt();
        int classesAttended=sc.nextInt();
        double percentage=(double)(classesAttended/classesHeld)*100;
        char medicalCause=sc.next().charAt(0);
        if(medicalCause=='Y'|| medicalCause=='y'|| percentage<75){
            System.out.println("Student is allowed to sit in exam");
        }
        else {
            System.out.println("Student is not allowed to sit in exam");
        }
        
        
    }
}