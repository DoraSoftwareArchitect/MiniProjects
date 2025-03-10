package com.dsa.day2.session3PatternPrinting;

import java.util.Scanner;

public class RightAnglesPatternTraingle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number to print the pattern...");

		int number = scanner.nextInt();

		System.out.println("------------------------------------------");

		secondWayOfPrinting(number);
		System.out.println("------------------------------------------");

		System.out.println("");
		System.out.println("------------------------------------------");

		pattern(number);
		
		System.out.println("------------------------------------------");

		System.out.println("");
		System.out.println("------------------------------------------");
		
		secondWayOfPrinting1(number);
		

	}
	
	
	
	
	
	
//	
//	A@?>=<;:98
//	ABA@?>=<;:
//	ABCBA@?>=<
//	ABCDCBA@?>
//	ABCDEDCBA@	
	

	private static void secondWayOfPrinting1(int number) {
		for (int i = 1; i <= number; i++) {

			char charecter = 'A';

			for (int j = 1; j <=(2*number); j++) {
				if (j < i) {
					System.out.print(charecter++);
				}

				else if (i == j) {
					System.out.print(charecter);
				} else {
					System.out.print(--charecter);
				}

			}
			System.out.println();

		}
		
	}

	private static void secondWayOfPrinting(int number) {

		for (int i = 1; i <= number; i++) {

			char charecter = 'A';

			for (int j = 1; j <=(2 * i-1); j++) {
				if (j < i) {
					System.out.print(charecter++);
				}

				else if (i == j) {
					System.out.print(charecter);
				} else {
					System.out.print(--charecter);
				}

			}
			System.out.println();

		}

	}

	private static void pattern(int number) {

		for (int i = 1; i <= number; i++) {

			char charecter = 'A';

			for (int j = 1; j <= (2 * i - 1); j++) {

//				if (i <= j) {
				System.out.print(charecter);
				charecter++;

//				}

			}
			charecter -= 2;
			for (int k = 1; k < i; k++) {
				System.out.print(charecter);
				charecter--;
			}

			System.out.println();

		}

	}

}

//  A
//  ABCB
//  ABCDEDC
//  ABCDEFGFED
//  ABCDEFGHIHGFE

// Here in the above pattern the rows are incrementing, columns values are decrementing, 
// For this we are taking 2 inner loops here for the first loop we are giving the value 2*i-1 ,
// if it satisifies we are going to print the charecter,

// and after that we are decreasing charecter by 2
// In that scenario we are going to check the condition same and we are decrementing by charecter finally
// we can see this pattern.
