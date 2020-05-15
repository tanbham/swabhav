package com.techlabs.model.test;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.UUID;

import com.techlabs.model.Organisation;
import com.techlabs.model.Partner;
import com.techlabs.model.Talent;


public class Program {
	public static void main(String args[]) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Organisation swabhav = new Organisation(UUID.randomUUID(),"Swabhav",sdf.parse("09-04-1998"));
		
		Partner google = new Partner(1,"Google",100000,50000);
		Partner microsoft = new Partner(2,"Microsoft",400000,40000);
		Partner aurionpro = new Partner(3,"AurionPro",600000,60000);
		Partner barkley = new Partner(4,"Barkley",900000,70000);
		
		swabhav.add(google);
		swabhav.add(microsoft);
		swabhav.add(aurionpro);
		swabhav.add(barkley);
		
		Talent tanmay = new Talent(1,"Tanmay",8.5,"Java",google);
		Talent saloni = new Talent(2,"Saloni",8.4,".net",microsoft);
		Talent rajeev = new Talent(3,"Rajeev",8.6,"C",aurionpro);
		Talent vinit = new Talent(4,"Vinit",8.7,"C++",barkley);
		Talent jay = new Talent(4,"Jay",7.5,"C++",null);
		
		swabhav.addTalent(tanmay);
		swabhav.addTalent(saloni);
		swabhav.addTalent(rajeev);
		swabhav.addTalent(vinit);
		swabhav.addTalent(jay);
		
		printInfo(swabhav);
		printInfo(google);
	}

	private static void printInfo(Partner partner) {
		System.out.println("Partner "+partner.getName()+" details are");
		System.out.println(partner);
		
	}

	private static void printInfo(Organisation organisation) {
		System.out.println(organisation);
		System.out.println("Assosciated company names are :");
		Iterator<Partner> p = organisation.getPartners();
		while(p.hasNext()) {
			System.out.println(p.next());
		}		
		System.out.println("List of talents are");
		Iterator<Talent> t = organisation.getTalents();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
	}
}
