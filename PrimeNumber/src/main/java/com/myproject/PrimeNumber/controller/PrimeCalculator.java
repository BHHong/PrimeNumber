package com.myproject.PrimeNumber.controller;

import java.util.ArrayList;
import java.util.List;

public class PrimeCalculator {

	private List<Integer> primeNumbers;

	public PrimeCalculator() {
		primeNumbers = new ArrayList<>();
	}

	public boolean isPrime(int number) {
		for (int i = 2; i < (int)Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isPrime2(int number){
		for (int i : primeNumbers) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void totalPrime(int numberFrom, int numberTo) {
		int total = 0;
		for (int i = 2; i < numberFrom; i++) {
			if (isPrime2(i)) {
				primeNumbers.add(i);
			}
		}
		for (int i = numberFrom; i <= numberTo; i++) {
			if (isPrime2(i)) {
				total++;
			}
		}
		System.out.println("Total prime number between " + numberFrom + " and " + numberTo + " is " + total + ".");
	}

	public void infinityPrime() {
		int i = 1;
		while (true) {
			if (isPrime2(++i)) {
				primeNumbers.add(i);
				System.out.println(primeNumbers.size() + " th prime number is " + i);
			}
		}
	}

	public void hundredKPrime() {
		int i = 1;
		while (primeNumbers.size() < 100000) {
			if (isPrime2(++i)) {
				primeNumbers.add(i);
				System.out.println(primeNumbers.size() + " th prime number is " + i);
			}
		}
	}

	public void findnthPrime(int num) {
		int i = 1;
		boolean run = true;
		while (run) {
			if (isPrime2(++i)) {
				primeNumbers.add(i);
				System.out.println(primeNumbers.size() + " th prime number is " + i);
				if (primeNumbers.size() == num) {
					run = false;
				}
			}
		}
	}
}