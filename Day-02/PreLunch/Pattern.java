/*5. 
Print the following patterns using loop :
a.
*
**
***
****    */

import java.util.Scanner;
class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }