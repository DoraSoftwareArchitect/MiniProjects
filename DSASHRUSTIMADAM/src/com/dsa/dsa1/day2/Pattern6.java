package com.dsa.dsa1.day2;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of number value to print pattern ");
		int n = scanner.nextInt();
		pattern(n);
		System.out.println();
		System.out.println("-------------------------------------------------");
		pattern1(n);

	}

	private static void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) { // This loop we have used for printing spaces.
				System.out.print("  ");
			}

			// Here in the below loop it will check the condition of above 2 loops and it
			// will check the condition and based on that it will print the data.
			// Here i value we have passed it is taking only 1 value and it is iterating by
			// the help of loop.
			for (int k = i; k >= 1; k--) {
				System.out.print(i+" " );
			}
			// As here in the above data the condition are going to be 1 and after that 2
			System.out.println();
		}
	}

	private static void pattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) { // This loop we have used for printing spaces.
				System.out.print("  ");
			}

			// Here in the below loop it will check the condition of above 2 loops and it
			// will check the condition and based on that it will print the data.
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			// As here in the above data the condition are going to be 1 and after that 2
			System.out.println();
		}
	}

}
