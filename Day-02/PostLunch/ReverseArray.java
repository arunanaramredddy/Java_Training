/*4. Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an 
another array but in reverse order.*/


import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int ar1[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            ar1[i] = sc.nextInt();
        }

        int ar2[] = new int[n];
 
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            ar2[j] = ar1[i];
        }

        System.out.println("The reversed elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(ar2[i] + " ");
        }
    }
}
