package com.dsa.dsa1;

import java.util.Scanner;

public class ReversePattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of number of elements to iterate ");

		int Number = scanner.nextInt();

		System.out.println("==================================================");
		printingReversePattern(Number);
		System.out.println("--------------Pattern 2-------------");
		System.out.println();
		printingReversePattern1(Number);

	}

//    *
//   * *
//  * * *
// * * * *
//* * * * *
//* * * * * *

	private static void printingReversePattern(int number) {

		for (int i = 0; i <= number; i++) {

			for (int k = number - i; k >= 1; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

	private static void printingReversePattern1(int number) {

		for (int i = 1; i <= number; i++) {

			for (int k = number - i; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}

			System.out.println();

		}

	}

}
