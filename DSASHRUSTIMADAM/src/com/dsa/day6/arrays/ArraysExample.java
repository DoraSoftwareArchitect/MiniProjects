package com.dsa.day6.arrays;

import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Pleas enter the number of rows :");
		int n = scanner.nextInt();

		System.out.println(" Please enter the number of columns :");
		int m = scanner.nextInt();

		int a[][] = new int[n][m]; // Here we are intialising the values in the arrays indexes
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scanner.nextInt(); // Here is we are going to adding the values into the array,
				// basically in the above we are storing all the elements in the array.
				// This is process of iterating all the elements and we are storing all the
				// elements by the help of an array.

			}
		}

		rowsAdding(n, m, a);
	}

	// In this method we are going to perform all the operations and we can able to
	// process the data and we can able to acess and iterate and perform all the
	// data and we can able to execute all the data.
	private static void rowsAdding(int n, int m, int[][] a) {

		for (int i = 0; i < n; i++) {// This is the iteration for the rows

			int sum = 0;
			for (int j = 0; j < m; j++) { // This is the iteration for the number of columns.

				sum = sum + a[i][j];
			}
			System.out.println(sum + " ");
		}

	}

}
