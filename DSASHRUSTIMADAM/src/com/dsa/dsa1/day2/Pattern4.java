package com.dsa.dsa1.day2;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of number value to print pattern ");
		int n = scanner.nextInt();
		pattern(n);

	}
	
//	***** 
//	**** 
//	*** 
//	** 
//	* 

	private static void pattern(int n) {
		
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println(" ");

		}

	}
}
