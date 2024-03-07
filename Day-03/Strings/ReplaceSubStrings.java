/*7. Write a program to replace a given substring in a sentence with another string. 
For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, the new 
sentence should be printed as ”A snowman with snow”. */

import java.util.Scanner;

public class ReplaceSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String substr = sc.nextLine();
        String newstr = sc.nextLine();
        String result = str.replace(substr, newstr);
        System.out.println(result);
    }
}