import java.util.Scanner;

/**
 * The Rectangle class allows the user to input the length and breadth of a rectangle and determines whether it's a square or not.
 *
 * @author Aruna
 * @version 1.0
 * @since 06-03-2024
 */
public class Rectangle1 {

    /**
     * The main method prompts the user to enter the length and breadth of a rectangle, and then determines whether it's a square or not.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }

    }
}