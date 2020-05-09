package com.techlabs.model;

import java.util.Vector;

public class TestVector {
	public static void main(String args[]) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		System.out.println(vector);
		
	}
}
//Vectors are synchronized i.e there is a thread safety, multiple threads cannot access a Vector
//ArrayLists are not synchronized i.e multiple threads can access an array at a time

//Vectors are slower bcs they are synchronized
//ArrayLists are faster bcs they are not syncronized