package com.dsa.day5.basicmaths;

public class FindingSquareValue {

	public static void main(String[] args) {

		long powerOFValue = powerOFValue(2, 300);
		System.out.println("Power of given value :" + powerOFValue);
	}

	private static long powerOFValue(int a, int b) {

		int answer = 1;

		for (int z = 0; z < b; z++) {
			answer = answer * a;
		}

		return answer;

	}

}
