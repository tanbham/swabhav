package com.techlabs.model.test;

import java.text.SimpleDateFormat;
import java.util.Iterator;

import com.techlabs.model.Organisation;
import com.techlabs.model.Partner;


public class Program {
	public static void main(String args[]) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Organisation swabhav = new Organisation(100,"Swabhav",sdf.parse("09-04-1998"));
		
		swabhav.add(new Partner(1,"Google",100000,50000));
		swabhav.add(new Partner(2,"Microsoft",400000,40000));
		swabhav.add(new Partner(3,"AurionPro",600000,60000));
		swabhav.add(new Partner(4,"Barkley",900000,70000));
		
		printInfo(swabhav);
	
	}

	private static void printInfo(Organisation swabhav) {
		System.out.println(swabhav);
		System.out.println("Assosciated company names are :");
		Iterator<Partner> p = swabhav.getPartners();
		while(p.hasNext()) {
			System.out.println(p.next());
		}		
		
	}
}
