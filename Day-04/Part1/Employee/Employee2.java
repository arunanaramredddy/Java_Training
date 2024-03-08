public class Employee2{
    public static void main(String[] args) {
      
      Employee1 employee[] = new Employee1[3];
      employee[0] = new Employee1("Robert", 1994, 50000, "64C- WallsStreet");
      employee[1] = new Employee1("Sam", 2000, 60000, "68D- WallsStreet");
      employee[2] = new Employee1("John", 1999, 55000, "26B- WallsStreet");
  
      System.out.printf("%-10s%-20s%-20s%-20s\n", "Name", "Year of Joining", "Salary", "Address");
  
      for (Employee1 employees : employee) {
        employees.printEmployeeInfo();
      }
  
    }
    
  }