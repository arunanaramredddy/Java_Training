/*2. Write a program that takes your full name as input and displays the abbreviations of the 
first and middle names except the last name which is displayed as it is. For example, if your 
name is Robert Brett Roser, then the output should be R.B.Roser. */

import java.util.Scanner;
public class DisplayName
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ar = s.split(" ");
        String first = ar[0];
        String middle = ar[1];
        String last = ar[2];
        System.out.println(first.charAt(0) + "." + middle.charAt(0) + "." + last);
    }
}