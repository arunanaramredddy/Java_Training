/*10. Write a program to reverse a 3-digit number. 

E.g.-Number : 132        Output : 231

Input the number using scanner.*/



import java.util.Scanner; 
class ReverseTheDigits{
    
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int n =sc.nextInt();
                int rem=0;
                int reverse=0;
                while(n>0) {
                    rem=n%10;
                    reverse=(reverse*10)+rem;
                    n=n/10;
                }
                System.out.println(reverse);
                
            }
        }
        
    


    
 