package com.dsa.session5;

public class ArrayExample {
	
	
	public static void main(String[] args) {
		
		int []array= {1,2,3,4,5};
		
		int maxValue=array[0];
		int minValue=array[0];
		int totalSum=0;
		
		
		for(int num:array) {
			totalSum =totalSum+num;
			if(num>maxValue) {
				
				maxValue=num;
				
			}
			 if(num<minValue){
				 minValue=num;
			}
			
			
			
		}
		
		
		int maximumSum=totalSum-minValue;
		
		int minimumSum=totalSum-maxValue;
		
		
		
		
		System.out.println("Minimum Value :"+minValue);
		System.out.println("Maximum Value :"+maxValue);
		System.out.println("Total Sum :"+totalSum);
		System.out.println("------------------------------------------------------------");
		System.out.println("Below operations performed using 4 elements reducing one element in an array .....");
		System.out.println("Maximum Sum of  Element in an array :"+maximumSum);
		System.out.println("Maximim  Sum of Element in an array :"+minimumSum);
		
		
		

		
		
		
	}

}
