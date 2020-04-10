package com.techlabs.properties;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertyTest {
	public static void main(String args[]) throws Exception {
		FileReader reader = new FileReader("hey.properties"); //read hey.properties file
		
		Properties p = new Properties();
		Set set = p.entrySet();            //entrySet() returns a Set containing the entries of properties file
		p.load(reader);
		
		System.out.println("Using Iterator");
		Iterator i  = set.iterator();      //iterate over set
		while(i.hasNext()) {
			Map.Entry entry =(Map.Entry) i.next();  //Map.Entry is used to access the entry in Map
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	
		System.out.println("using for loop");
		for(Object s : set) {
			System.out.println(s.toString());
		}
	}
}
