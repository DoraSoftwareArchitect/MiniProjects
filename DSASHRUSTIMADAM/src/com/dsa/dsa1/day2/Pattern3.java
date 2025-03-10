package com.dsa.dsa1.day2;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of number value to print pattern ");
		int n = scanner.nextInt();
		pattern(n);

	}

	private static void pattern(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print("   ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + "  ");

			}

			System.out.println();

		}

	}

}
