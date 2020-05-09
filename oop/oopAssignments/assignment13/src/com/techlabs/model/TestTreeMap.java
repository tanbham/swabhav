package com.techlabs.model;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String args[]) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		
		//add
		map.put(1,"Tanmay");
		map.put(2,"Swabhav");
		map.put(0,"AurionPro");
		System.out.println(map);
		
		//search
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("Tanmay"));
		
		//delete
		map.remove(1);
		System.out.println(map);
		
		//read
		for (Map.Entry<Integer,String> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + 
                    ", Value = " + entry.getValue());
		}
	}
}
