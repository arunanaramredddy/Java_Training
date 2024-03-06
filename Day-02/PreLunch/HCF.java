/* 7. Write a program to find greatest common divisor (GCD) or highest common factor 
(HCF) of given two numbers*/

class HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i>=1;i--) {
            if(n1%i==0 && n2%i==0) {
                System.out.println(i);
                break;
            }
        }
    }
}
        
    