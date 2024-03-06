/ 5*
b.
1010101
10101 
  101  
   1   */

import java.util.Scanner;
class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++) {
                System.out.print("");
            }
            for(int j=0;j<(n-i)*2-1;j++) {
                System.out.print(j%2==0 ? "1" : "0");
            }
            System.out.println();
        }
        
    }
}