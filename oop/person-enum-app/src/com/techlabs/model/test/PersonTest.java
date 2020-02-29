package com.techlabs.model.test;

import com.techlabs.model.GenderType;
import com.techlabs.model.Person;

public class PersonTest {
	public static void main(String args[]) {
		Person p1 = new Person("Tanmay", GenderType.MALE, 21 , 50.5f , 6.1f);
		printInfo(p1);
		p1.doWorkOut();
		System.out.println("after workout ");
		printInfo(p1);
		p1.doEat();
		System.out.println("after eating");
		printInfo(p1);
		
		System.out.println();
		Person p2 = new Person(null, GenderType.FEMALE, -21 , 0 , 0);
		printInfo(p2);
		p2.doWorkOut();
		System.out.println("after workout ");
		printInfo(p2);
		p2.doEat();
		System.out.println("after eating");
		printInfo(p2);
	}
	
	public static void printInfo(Person p) {
		System.out.println("Name = "+p.getName()+" Gender = "+p.getGender()+" Age = "+p.getAge()+" weight = "+p.getWeight()+" height = "+p.getHeight());
	}
}
