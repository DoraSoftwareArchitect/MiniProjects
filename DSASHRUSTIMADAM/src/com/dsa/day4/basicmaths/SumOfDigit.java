package com.dsa.day4.basicmaths;

public class SumOfDigit {

	public static void main(String[] args) {

		int n = 1234;

		int summ = sumOfNumber(n);
		System.out.println("Sum of given Number :" + summ);
	}

	private static int sumOfNumber(int n) {

		int sum = 0, remainder = 0;

		while (n != 0) {

			remainder = n % 10;
			sum = sum + remainder;
			n = n / 10;

		}

		return sum;
	}

}
