package com.techlabs.CRUD;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//add
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("Original = "+list);
		
		//remove
		list.remove(0);
		System.out.println("After deleting 1st element = "+list);
		
		//update
		list.set(1,100);
		System.out.println("After replacing 1st element by 100 = "+list);
		
		//read
		System.out.println(list);
		
	}
}
