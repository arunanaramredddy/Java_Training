/*3. Write a program to print the area and perimeter of a triangle 
having sides of 3, 4 and 5 units by creating a class named 'Triangle' 
with constructor having the three sides as its parameters. */

public class Triangle1 {
  private double side1;
  private double side2;
  private double side3;

  public Triangle1(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }
  public double getArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }
  public double getPerimeter() {
    return side1 + side2 + side3;
  }
}