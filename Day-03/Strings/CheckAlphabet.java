/*1. Write a program to check if the letter 'e' is present in the word 'Umbrella'. */

public class CheckAlphabet
{
    public static void main(String[] args)
    {
        String s="Umbrella";
        if(s.contains("e"))
        {
            System.out.println("e is present in Umbrella");
        }
        else
        {
            System.out.println("e is not present in Umbrella");
        }
    }
}