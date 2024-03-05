/*5. Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.

A - first program by using a third variable

B - second program without using any third variable*/

//A
import java.util.Scanner;
class Swap{
    
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the values of a and b");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int temp=a;
                 a=b;
                 b=temp;
            
                System.out.println("a="+a);
                System.out.println("b="+b);
            }
        }
           
             
//B

class Swap{
    
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the values of a and b");
                int a=sc.nextInt();
                int b=sc.nextInt();
                a = a + b;
                b = a - b;
                a = a - b;
                System.out.println("a="+a);
                System.out.println("b="+b);
            }
        }
           
             