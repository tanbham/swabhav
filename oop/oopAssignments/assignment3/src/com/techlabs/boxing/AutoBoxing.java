package com.techlabs.boxing;

import java.util.ArrayList;

public class AutoBoxing {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(9);
		for(int i: list) {
			System.out.println(i);
		}
	}
}

//Integer is object and list is automatically converting it into a primitive data type
//list.add(Integer.parseInt(9))
