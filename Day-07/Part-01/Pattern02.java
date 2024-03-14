/*
***************
*   **   **   *
*   **   **   *
*   **   **   *
***************
*/

import java.util.Scanner;

public class Pattern02 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 15;
        int m=5;

        for (int i =0; i <m; i++) {
            for (int j = 1; j <=n; j++) {
                if (i == 0 || i==m-1) {
                    System.out.print("*");
                } else {
                    if(j%5==0||j%5==1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();
        }
    }
}