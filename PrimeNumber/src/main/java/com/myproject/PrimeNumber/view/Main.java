package com.myproject.PrimeNumber.view;

import com.myproject.PrimeNumber.controller.PrimeCalculator;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		PrimeCalculator cal = new PrimeCalculator();

		double t1 = System.currentTimeMillis();
		
		//cal.infinityPrime();
		cal.findnthPrime(10000);
		
		double t2 = System.currentTimeMillis();
		System.out.println("Time taken = " + (t2 - t1)/1000 +"s");
		
	}
}
