package com.dsa.day7;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number to iterate the pattern");
		int number = scanner.nextInt();

		printingPattern2(number);

	}

	private static void printingPattern2(int number) {

		for (int i = 1; i <= number; i++) {

			for (int j = 1; j <= number; j++) {

				if ((j == 5 || i == 1 || i == 5 || j == 1)) {

					System.out.print("  *  ");
				} else {
					System.out.print("     ");
				}

			}
			System.out.println();

		}

	}

}
