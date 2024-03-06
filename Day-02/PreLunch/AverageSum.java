/* 4. Take 10 integers from keyboard using loop and print their average value on the screen*/

import java.util.Scanner;
class AverageSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++) {
            int num=sc.nextInt();
            sum=sum+num;
        }
        double avg=(double)(sum)/n;
            
        
        System.out.println(avg);
        
    }
}