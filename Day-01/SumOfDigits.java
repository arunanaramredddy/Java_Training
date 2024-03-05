/*9. Write a program to calculate the sum of the digits of a 3-digit number.

Number : 132        Output : 6

Input the number using scanner.*/



import java.util.Scanner; 
class SumOfDigits{
    
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int n =sc.nextInt();
                int rem=0;
                int sum=0;
                while(n>0) {
                    rem=n%10;
                    sum=sum+rem;
                    n=n/10;
                }
                System.out.println(sum);
          }
        }
        
    


    