/*
*************
*   *   *   *
*   *   *   *
*   *   *   *
*************
*/

public class Pattern01 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 13;
        int m=5;

        for (int i =0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i==m-1) {
                    System.out.print("*");
                } else {
                    if(j%4==0) {
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