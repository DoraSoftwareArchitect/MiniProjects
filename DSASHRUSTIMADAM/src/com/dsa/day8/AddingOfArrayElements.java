package com.dsa.day8;

import java.util.Scanner;

public class AddingOfArrayElements {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the array of elements to iterate");

		int n = scanner.nextInt();
		int array1[] = {1,2,3,4,5};

		int sum = sum(array1, n);
		System.out.println("Sum of Array numbers :"+sum);

	}

	private static int sum(int array1[], int n) {

		int SumOfNumber = 0;

		for (int a = 0; a < array1.length; a++) {
			
			SumOfNumber=SumOfNumber+array1[a];

		}
		return SumOfNumber;

	}

}
