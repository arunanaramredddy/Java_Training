import java.util.Scanner;

/*6. Initialize and print all elements of a 2D array.*/

import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of the 2D array:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
    }
}
}
