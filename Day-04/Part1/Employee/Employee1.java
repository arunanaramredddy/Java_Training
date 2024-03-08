/*6. Write a program that would print the information (name, year of 
joining, salary, address) of three employees by creating a class named
 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreet
Sam                2000                68D- WallsStreet
John                1999                26B- WallsStreet */

public class Employee1 {
  private String name;
  private int yearOfJoining;
  private double salary;
  private String address;

  public Employee1(String name, int yearOfJoining, double salary, String address) {
      this.name = name;
      this.yearOfJoining = yearOfJoining;
      this.salary = salary;
      this.address = address;
  }

  public void printEmployeeInfo() {
    System.out.printf("%-10s%-20s%-20s%-20s\n", name, yearOfJoining, salary, address);
  }
}