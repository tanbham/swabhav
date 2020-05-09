package com.techlabs.CRUD;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	public static void main(String args[]) {
		HashSet<Integer> set = new HashSet();
		HashSet<Integer> set1 = new HashSet();
		
		//add
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		set1.add(5);
		set1.add(6);
		System.out.println(set);
		
		//read
		Iterator<Integer> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.print(i.next()+" ");  
        }  
        System.out.println();
        
        //delete
        set.remove(1);
        System.out.println(set);
        
        //update
        set.addAll(set1);
        System.out.println(set);
 
		
	}
}
