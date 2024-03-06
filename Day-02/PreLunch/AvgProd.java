/*6. Take integer inputs from user until he/she presses q ( Ask to press q to quit after every 
integer input ). Print average and product of all numbers.*/

import java.util.Scanner;
class AvgProd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum = 0;
        int product = 1;
        int count = 0;
        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter an integer (or 'q' to quit): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("q")) {
                continueInput = false;
            } else {
               
                    int num = Integer.parseInt(input);
                    sum += num;
                    product *= num;
                    count++;
               
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of all numbers: " + average);
            System.out.println("Product of all numbers: " + product);
        } else {
            System.out.println("No numbers entered.");
        }

    }
}
        
    