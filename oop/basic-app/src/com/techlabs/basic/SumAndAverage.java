package com.techlabs.basic;

public class SumAndAverage {
	public static void main(String names[]) {
		
		if(names.length == 0) {
			System.out.println("Values not passed");
			return;
		}
		
		if(names[names.length-1].equals("-even")) {
			int flag = 0;
			int limit = 0;
			for(int i=0 ; i<names.length-1 ; i++) {
				if(Integer.parseInt(names[i])%2 == 0) {
					System.out.print(names[i]+" ");
					limit++;
				}
			}
			System.out.println("sum is "+calculateSumOfNumbers(names,flag,limit));
			System.out.println("avg is "+calculateAvgOfNumbers(names,flag,limit));
		}
		
		if(names[names.length-1].equals("-odd")) {
			int flag= 1;
			int limit = 0;
			for(int i=0 ; i<names.length-1 ; i++) {
				if(Integer.parseInt(names[i])%2 != 0) {
					System.out.print(names[i]+" ");
					limit++;
				}
			}
			System.out.println("sum is "+calculateSumOfNumbers(names,flag,limit));
			System.out.println("avg is "+calculateAvgOfNumbers(names,flag,limit));
		}
	}
	
	
	private static String calculateSumOfNumbers(String names[],int flag,int limit) {
		int sum = 0;
		if(flag == 0) {
			for(int i=0 ;i<names.length && Integer.parseInt(names[i])%2 == 0; i++) {
				sum = sum + Integer.parseInt(names[i]);
			}
		}
		if(flag == 1) {
			for(int i=0 ;i<names.length-1 ; i++) {
				if(Integer.parseInt(names[i])%2 == 1) {
					sum = sum + Integer.parseInt(names[i]);
				}
			}
		}
		return String.valueOf(sum);
	}
	
	
	private static String calculateAvgOfNumbers(String names[] ,int flag ,int limit) {
		int avg1 = 0; 
		if(flag == 0) {
			String avg = calculateSumOfNumbers(names , flag ,limit);
			avg1 = Integer.parseInt(avg)/limit;

		}
		if(flag == 1){
			String avg = calculateSumOfNumbers(names , flag , limit);
			avg1 = Integer.parseInt(avg)/limit;
		}
		return String.valueOf(avg1);
	}
}
