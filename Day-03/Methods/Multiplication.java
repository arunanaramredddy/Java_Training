/*3. Print the multiplication table of 15 using recursion. */

public class Multiplication {
    public static void main(String[] args) {
        int n = 15;
        System.out.println("Multiplication table of " + n + ":");
        printMultiplicationTable(n, 1);
    }
  
    public static void printMultiplicationTable(int n, int multiplier) {
        if (multiplier <= 10) {
            System.out.println(n + " * " + multiplier + " = " + (n * multiplier));
            printMultiplicationTable(n, multiplier + 1);
        }
    }
  }