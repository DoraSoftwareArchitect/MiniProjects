package com.dsa.day9;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number to find the armstrong Number or not");

		int n = scanner.nextInt();

		ArmstrongNumber(n);
	}

	private static void ArmstrongNumber(int n) {

		int armstrongNumber = 0, remainder, modules;
		int answer = n;

		while (n > 0) {

			remainder = n % 10;
			armstrongNumber = armstrongNumber + (remainder * remainder * remainder);
			n = n / 10;
		}

		if (answer == armstrongNumber) {

			System.out.println("The given number is an armstrong Number " + armstrongNumber);
		} else {
			System.out.println("The given number is not an armstrong Number" + armstrongNumber);
		}

	}

}
