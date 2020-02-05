package com.techlabs.basic;

import java.util.Scanner;

public class StringArrayTest {
	static int maxLength = 0;
	static int indexOfMaximumLength = 0;
	
	public static void main(String args[]) {
		int type = 0;
		Scanner s = new Scanner(System.in);
		//String names[] = {"tanmay","pawan","niket","raj","meenal","pranav","sonam","hrishikesh","raju"};
		String names[] = {"tanmay","raj"};
		while(type != 11) {
			System.out.println("Type 1 to display names through traditional for loop");
			System.out.println("Type 2 to display names through enhance for array");
			System.out.println("Type 3 to display names with letter -a");
			System.out.println("Type 4 to display name of largest name");
			System.out.println("Type 5 to replace char-a with char-o in the names which contains char-a");
			System.out.println("Type 11 to exit");
			type = s.nextInt();
			
			switch(type) {
			case 1: 
				traditionalForLoop(names);
				break;
			case 2:
				enhanceForLoop(names);
				break;
			case 3:
				namesWithA(names);
				break;
			case 4:
				largestName(names);
				break;
			case 5:
				replaceCharA(names);
				break;
			case 11:
				break;
			}
			
		}
		s.close();
		
	}	
	
	
	
	private static void traditionalForLoop(String names[]) {
		System.out.println("Displaying all names using traditional for loop");
		for(int start=0 ; start<names.length ; start++) {
			System.out.println(names[start]);
		}
		System.out.println();
	}
	
	private static void enhanceForLoop(String names[]) {
		System.out.println("Displaying all names using enhance for loop");
		for(String i : names) {
			System.out.println(i);
		}
		System.out.println();
	}
				
	private static void namesWithA(String names[]) {
		System.out.println("Displaying all names with letter-a");
		for(int start=0 ; start<names.length ; start++) {
			if(names[start].contains("a")) {
				System.out.println(names[start]);
			}
		}
		System.out.println();
	}
	
   private static void largestName(String names[]) {
		System.out.println("Displaying the name with largest length = ");
		for(int start=0 ; start<names.length ; start++) {
			int nameLength = names[start].length();
			if(nameLength > maxLength) {
				maxLength = nameLength;
				indexOfMaximumLength = start;
			}
		}
		System.out.print(names[indexOfMaximumLength]);
		System.out.println();
	}
		
		
   private static void replaceCharA(String names[]) {
	   System.out.println("Replacing char-a with char-o in the names which conatins char-a");
		for(int start=0 ; start<names.length ; start++) {
			if(names[start].contains("a")) {
				String newname = names[start];
				newname = newname.replace('a', 'o');
				names[start] = newname;
			}
		}
		System.out.println();
   }
}  
