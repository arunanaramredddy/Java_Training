/*5. Print the average of three numbers entered by user by creating 
a class named 'Average' having a method to calculate and print the 
average. */

public class Average1 {

  private double average;
  public void calculateAverage(double num1, double num2, double num3) {
     average = (num1 + num2 + num3) / 3;
}
public void printAverage() {
  System.out.println("The Average is :"+average);
}
  
}