/*5. Write a program to find the sum and product of all elements of an array. */

import java.util.Scanner;
public class Sum&Prod
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar = new int[n];
        int sum = 0;
        int product = 1;
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += ar[i];
            product *= ar[i];
        }
        System.out.println("Sum of elements: " + sum);
        System.out.println("Product of elements: " + product);
    }
}