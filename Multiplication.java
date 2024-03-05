/*3. Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.*/


class Multiplication {
 public static void main(String[] args) {

  int n=2345;
  int add=n+8;
  int divide=add/3;
  int modulus=divide/5;
  int result=modulus*5;
  System.out.println(result);

}
}





