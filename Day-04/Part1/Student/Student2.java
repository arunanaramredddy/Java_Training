/*2. Create a class named 'Student' with String variable 'name' and 
integer variable 'roll_no'. Assign the value of roll_no as '2' and that
 of name as "John" by creating an object of the class Student. Assign
  and print the roll number, phone number and address of two students 
  having names "Sam" and "John" respectively by creating two objects
   of class 'Student'. */

class Student2{
    
        private String name;
        private int roll_no;
        private long phoneNumber;
        private String address;
      
        public Student2(String name, int roll_no, long phoneNumber, String address) {
            this.name = name;
            this.roll_no = roll_no;
            this.phoneNumber = phoneNumber;
            this.address = address;
        }
      
        public void printDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + roll_no);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Address: " + address);
        }
      }