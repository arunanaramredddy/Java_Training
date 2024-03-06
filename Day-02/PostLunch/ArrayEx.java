/*1. Take 10 integer inputs from user and store them in an array and print them on screen. */

import java.util.Scanner; 
public class ArrayEx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Elements of an array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i]);
        }
    }
}