import java.util.Scanner;

public class Area1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();
       Area rectangle= new Area(length, breadth);
      System.out.println("The area of the rectangle is: " + rectangle.returnArea());
    }
}