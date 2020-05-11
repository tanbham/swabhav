package com.techlabs.model.test;

import java.text.SimpleDateFormat;
import java.util.Iterator;

import com.techlabs.model.Organisation;
import com.techlabs.model.Partner;
import com.techlabs.model.Talent;


public class Program {
	public static void main(String args[]) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Organisation swabhav = new Organisation(100,"Swabhav",sdf.parse("09-04-1998"));
		
		swabhav.add(new Partner(1,"Google",100000,50000));
		swabhav.add(new Partner(2,"Microsoft",400000,40000));
		swabhav.add(new Partner(3,"AurionPro",600000,60000));
		swabhav.add(new Partner(4,"Barkley",900000,70000));
		
		Talent tanmay = new Talent(1,"Tanmay",8.5,"Java",new Partner(3,"AurionPro",100000,5000));
		Talent saloni = new Talent(2,"Saloni",8.4,".net",new Partner(2,"Microsoft",200000,4000));
		Talent rajeev = new Talent(3,"Rajeev",8.6,"C",new Partner(1,"Google",400000,8000));
		Talent vinit = new Talent(4,"Vinit",8.7,"C++",new Partner(4,"Brakley",700000,9000));
		Talent jay = new Talent(4,"Jay",7.5,"C++",new Partner(4,"Brakley",700000,9000));
		
		
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
