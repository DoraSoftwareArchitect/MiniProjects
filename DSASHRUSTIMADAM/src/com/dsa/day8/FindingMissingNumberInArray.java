package com.dsa.day8;

import java.util.Scanner;

public class FindingMissingNumberInArray {

	public static void main(String[] args) {

		int[] number = { 1, 3, 4, 5, 6 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please the n value to loop");
		int n = scanner.nextInt();

		int missingNumberInArray = missingNumberInArray(number, n);
		System.out.println("Missing Number in an Array :" + missingNumberInArray);
	}

	private static int missingNumberInArray(int[] number, int n) {

		for (int i = 1; i <= 6; i++) {

			boolean found = false;
			for (int j = 0; j < n; j++) {
				if (i == number[j]) {

					found = true;
					break;

				}

			}
			if (!found) {
				return i;
				

			}

		}
		return 0;

	}

}
