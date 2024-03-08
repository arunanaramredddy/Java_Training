public class Student1 {
  public static void main(String[] args) {
    Student john = new Student("John", 2, 856738930L, "123 G.Street, City");

    Student sam = new Student("Sam", 1, 9537837280L, "254 VivekNagar, Town");

    System.out.println("Details of John:");
    john.printDetails();
    System.out.println();

    System.out.println("Details of Sam:");
    sam.printDetails();
  }
}