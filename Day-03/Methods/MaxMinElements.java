/*1. Define two methods to print the maximum and the minimum number respectively among 
three numbers entered by user. */

import java.util.Scanner;

public class MaxMinElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        max(a, b, c);
        min(a, b, c);
    }

    public static void max(int a, int b, int c) {

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public static void min(int a, int b, int c) {

        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

}