package com.dsa.day7;

import java.util.Scanner;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number to print the patter ");
		int number=scanner.nextInt();
		
		pattern1(number);
		
	}
	
	
	// Here print() method will print the data in the rows and println() method will print to the number of columns.
	
	

	private static void pattern1(int number) {
		
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(i);
			
			}
			System.out.println(" ");

			
		}
		
	}

}
