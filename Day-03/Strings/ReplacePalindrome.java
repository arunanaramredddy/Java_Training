/*5. Input a string which contains some palindrome substrings. Find out the position of
 palindrome substrings if exist and replace it by *. (For example if input string is “bob has
  a radar plane” then it should convert in “*** has a ***** plane”. */

  import java.util.Scanner;

public class ReplacePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String[] arr = s.split(" ");

        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                for (int j = 0; j < arr[i].length(); j++) {
                    str = str + "*";
                }
            } else {
                str = str + arr[i];
            }

            if (i < arr.length - 1) {
                str = str + " "; // Add space between words
            }
        }
        System.out.println(str);
    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
