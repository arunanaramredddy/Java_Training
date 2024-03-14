/*
*****
*   *
*   *
*   *
*****
*   *
*   *
*   *
*****
*   *
*   *
*   *
*****
*/



public class Pattern03 {


    public static void main(String[] args) {

        int n = 5;
        int m=13;

        for (int i =0; i <m; i++) {
            for (int j = 1; j <=n; j++) {
                if (i == 0 || i==m-1) {
                    System.out.print("*");
                } else {
                    if(i%4==0||j==1||j==n) {
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