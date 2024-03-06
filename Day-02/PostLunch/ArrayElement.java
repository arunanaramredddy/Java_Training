/*2. Take 10 integer inputs from user and store them in an array. Again ask user to give a 
number. Now, tell user whether that number is present in array or not. */

import java.util.Scanner; 
class ArrayElement {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n=10;
         int[] ar = new int[n];
         for(int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
         }
         for(int i=0; i<n; i++) {
            System.out.println(ar[i]);
         }
         System.out.println("Enter a number");
         int num = sc.nextInt();
         boolean numberPresent = false;
            for (int i = 0; i < n; i++) {
                if (num == ar[i]) {
                    numberPresent = true;
                    break; 
                }
            }
    
            if (numberPresent) {
                System.out.println("Number is present");
            } else {
                System.out.println("Number is not present");
            }
    
         }
        }
     
 