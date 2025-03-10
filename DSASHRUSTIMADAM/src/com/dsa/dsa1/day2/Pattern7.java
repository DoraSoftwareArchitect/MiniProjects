package com.dsa.dsa1.day2;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of number value to print pattern ");
		int n = scanner.nextInt();
		pattern(n);
		System.out.println("Pattern 2 example in the different approach......");
		pattern1(n);

	}

	private static void pattern1(int n) {

		for (int i = 1; i <= (2 * n - 1); i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

	private static void pattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		int max = 2 * n - 3; // This condition is very important to remember here we are decreasing the loop
								// one by one so we have to wrote this condition in order to decrement the loop
								// for the iteration this is the process the iterating the loop one by one
								// towards downwards.

		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= max; k++) {
				System.out.print("*");
			}
			max = max - 2;

			System.out.println("");
		}

	}

}

//  *
// ***
//*****
// ***
//  *
// So here in the above program we have done is for the first triangle pattern we have used normal condition,

// Then to print the reverse triangle we have used the formula max=2*n-3  ; and inner for loop max=max-2

// because here in this pattern every loop is decrementing by 2 ;; 3 , 1 like that what ever we have the condition.
