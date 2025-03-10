package com.dsa.session5;

import java.util.Scanner;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter the numbers into an array");

			int n = scanner.nextInt();

			int arr[] = new int[n];

			for (int a = 0; a < n; a++) {
				arr[a] = scanner.nextInt(); // Here we are sending the values into the array.

				System.out.println("Elements in an array :" + arr[a]);

			}

			duplicate(arr, n);
		}

	}

	private static void duplicate(int[] arr, int n) {

		for (int a = 0; a < n; a++) {

			boolean duplicate = false;
			for (int b = a + 1; b < n; b++) {

				if (arr[a] == arr[b] && arr[b] >= 0) {
					arr[b] = -1;
					duplicate = true;

				}

			}
			if (duplicate) {
				System.out.println(arr[a] + " ");
			}

		}

	}

}
