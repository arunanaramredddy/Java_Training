package com.lambda;

public interface LambdaEx {
    int calcMethod(int a, int b,String c);

}
class ExLambda {
    public static void main(String[] args) {
        LambdaEx lmd=(a,b,c)->{
            if("+".equals(c)){
                return a+b;
            }
            else if("-".equals(c)) {
                return a - b;
            }
            else if("*".equals(c)) {
                return a * b;
            }
            else {
                return a / b;
            }
        };
        System.out.println(lmd.calcMethod(10, 20, "+"));
        System.out.println(lmd.calcMethod(10, 20, "-"));
        System.out.println(lmd.calcMethod(10, 20, "*"));
        System.out.println(lmd.calcMethod(10, 20, "/"));
    }
}
