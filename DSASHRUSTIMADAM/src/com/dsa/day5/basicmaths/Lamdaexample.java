package com.dsa.day5.basicmaths;

import java.util.ArrayList;
import java.util.Iterator;

public class Lamdaexample {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);

		numbers.forEach(Lamdaexample -> System.out.println(Lamdaexample));

		// This is the exace info of lambda

		numbers.forEach(

				suja -> {
					if (suja % 2 == 0)
						System.out.println("Even numbers :" + suja);
				});

		numbers.forEach(

				suja -> {
					if ((suja % 2) != 0)
						System.out.println("Odd numbers :" + suja);
				});

	}

}
