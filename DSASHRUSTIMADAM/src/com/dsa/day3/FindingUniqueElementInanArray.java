package com.dsa.day3;

import java.util.Scanner;

public class FindingUniqueElementInanArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number :  ");
		int n = scanner.nextInt();

		int[] array = { 1, 1, 2, 2, 3, 3, 4, 4, 5 };

		uniqueElement(array, n);
	}

	private static void uniqueElement(int[] array, int n) {

		for (int i = 0; i <= n; i++) {

			int frequency = 0;
			boolean flag=false;

			for (int j = 0; j <= n; j++) {

				if (array[i] == array[j]  && frequency<=1) {

					frequency++;
				}
				
				else {
					flag=true;
					break;
				}

			}

			if (frequency == 1) {
				System.out.print(" Unique Element from an array :" + array[i]);

			}

		}

	}

}
