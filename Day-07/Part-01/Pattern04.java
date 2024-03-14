
/*
* * * * * * * * * * 
*     *     *     * 
*     *     *     * 
*     *     *     * 
* * * * * * * * * * 
*     *     *     * 
*     *     *     * 
*     *     *     * 
* * * * * * * * * * 
*     *     *     * 
*     *     *     * 
*     *     *     * 
* * * * * * * * * * 
*/

public class Pattern04 {


    public static void main(String[] args) {

        int n = 10;
        int m=13;

        for (int i =0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                if (i == 0 || i==m-1) {
                    System.out.print("* ");
                } else {
                    if(i%4==0||j==0||j==n-1||j%3==0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
            }
            System.out.println();
        }
    }
}