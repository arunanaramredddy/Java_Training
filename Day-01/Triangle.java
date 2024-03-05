/*2. Write a program to calculate the perimeter of a triangle. Input the sides of triangle using command Line arguments.*/

class Triangle{
    public static void main(String[] args) {
       double  a=Integer.parseInt(args[0]);
        double b=Integer.parseInt(args[1]);
        double c=Integer.parseInt(args[2]);
        
        double perimeter=a+b+c;
  
        System.out.println(perimeter);
    }
}