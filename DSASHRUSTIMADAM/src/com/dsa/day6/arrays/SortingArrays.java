package com.dsa.day6.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingArrays {
	// -12,11,-13,-5,6,-7,5,-3,-6
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayData=new ArrayList<>();
		arrayData.add(-12);
		arrayData.add(11);
		arrayData.add(-13);
		arrayData.add(-5);
		arrayData.add(6);
		arrayData.add(-7);
		arrayData.add(5);
		arrayData.add(-3);
		arrayData.add(-6);
		
		System.out.println("ArrayData :"+arrayData);
		
		// Here i am going to move all the data to negative and the positive to one end
		
		List<Integer> collect = arrayData.stream().sorted().collect(Collectors.toList());
		System.out.println("Naturally sorted :"+collect);




		
		
	}

}
