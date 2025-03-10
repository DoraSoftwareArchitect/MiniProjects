package com.dsa.dsa1.day2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of number value to print pattern ");
		int n = scanner.nextInt();
		pattern(n);

	}

	/*
	 * 123 
	 * 23
	 * 3
	 * 
	 */

	private static void pattern(int n) {
		for (int i = 1; i <= n; i++) {

			for (int k = i; k <= n; k++) {
				for (int j = i; j <= n; j++) {
					System.out.print("");

				}
				System.out.print(k);
			}
			System.out.println();

		}
		System.out.println();
	}

}
