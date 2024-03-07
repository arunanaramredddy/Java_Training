/*6. Write down the names of 10 of your friends in an array and then sort those in 
alphabetically ascending order.(HINT : USE the compareTo method of String) */

import java.util.Scanner;
import java.util.Arrays;
public class SortNames
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        for(int i=0;i<10;i++)
        {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        System.out.println("Sorted Names in Alphabetical Ascending Order is");
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}