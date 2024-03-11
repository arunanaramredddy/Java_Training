package com.bank;

public class Demat {

    public Demat( ) {

    }

    public void details() {
        Savings s=new Savings();
        System.out.println("rate of intrest:"+ s.intrest());
        Current c=new Current();
        c.getBalance();
    }

}