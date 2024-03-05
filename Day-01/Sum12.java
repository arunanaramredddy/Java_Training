/*8. Write a program to calculate the sum of the first and the second last digit of a 5 digit.

E.g.- NUMBER : 12345        OUTPUT : 1+4=5 

Input the number using scanner.*/

import java.util.Scanner; 
class Sum12{
    
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
                Scanner sc = new Scanner(System.in);
                int n =sc.nextInt();
                int firstDigit = n / 10000;  
                int secondLastDigit = (n / 10) % 10;  
                int sum = firstDigit + secondLastDigit;
   
                System.out.println("Sum of the first and the second last digit: " + sum);
            }
        }
        
    


    