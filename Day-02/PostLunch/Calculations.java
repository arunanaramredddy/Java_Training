/*3. Take 20 integer inputs from user and print the following:

number of positive numbers

number of negative numbers

number of odd numbers

number of even numbers

number of 0s.*/

import java.util.Scanner;

class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        int ar[] = new int[n];
        int pos = 0, neg = 0, odd = 0, even = 0, zero = 0;

        System.out.println("Enter 20 integers:");

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();

            if (ar[i] >=0) {
                pos++;
            } else if (ar[i] < 0) {
                neg++;
            }

            if (ar[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (ar[i] == 0) {
                zero++;
            }
        }

        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of zeros: " + zero);
    }
}
