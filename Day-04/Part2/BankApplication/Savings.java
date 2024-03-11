package com.Bank1;

public class Savings {

	
	public Savings() {
		
	}
	double amount=60000.00;
	int rate=5;
	int time=2;
	public double intrest( ) {
		
		return (amount*rate*time)/100;
	}
}
