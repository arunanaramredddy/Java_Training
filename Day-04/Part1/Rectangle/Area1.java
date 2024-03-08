import java.util.Scanner;

public class Area1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();
       Area rectangle= new Area();
       rectangle.setDim(length, breadth);
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}