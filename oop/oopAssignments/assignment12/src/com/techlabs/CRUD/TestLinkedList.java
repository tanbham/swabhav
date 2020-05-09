package com.techlabs.CRUD;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//add
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.addFirst(10);
		System.out.println(list);
		
		//delete
		list.remove(0);
		System.out.println(list);
		
		//replace
		list.set(1, 50);
		System.out.println(list);
		
		//read
		for(int i : list) {
			System.out.print(i+" ");
		}
	}
}
