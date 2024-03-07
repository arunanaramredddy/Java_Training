/*4. Write a program to check if a given string is a Palindrome. 
A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.*/

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int i=0,j=str.length()-1;
        while(i<j) {
            if(str.charAt(i)==str.charAt(j)) {
                i++;
                j--;
            }
            else {
                System.out.println("Not Palindrome");
                break;
            }
        }
        if(i==j) {
            System.out.println("Palindrome");
        }
    }
}