package com.dsa.day3;

public class ArraysIntroduction {

	public static void main(String[] args) {

		int[] array = { 9, 5, 2, -1, 0, 9 };

		int maximumNumber = 0;

		for (int a = 0; a < (array.length - 1); a++) {

			// System.out.println("Number :"+maximumNumber);

			if (array[a] < array[a + 1]) {

				maximumNumber = array[a + 1];
			}
			System.out.println("Maximum Number :" + maximumNumber);

		}

		System.out.println("--------------------------------------------");

		int number = 6;

		int arr = arrayMaximum(array, number);
		System.out.println(" 2 nd way of printing highest number in an array........");
		System.out.println("Minimum Number :" + arr);

	}

	private static int arrayMaximum(int[] array, int number) {

		int maximumNumber = 0; // This is applicable for non-negative values.
		
	//	int maximumNumbe=array[0]; This is we have to use when we can all non negative values in an array

		for (int a = 0; a < array.length; a++) {
			if(maximumNumber>array[a])
			maximumNumber = array[a];
		}

		return maximumNumber;
	}

}
