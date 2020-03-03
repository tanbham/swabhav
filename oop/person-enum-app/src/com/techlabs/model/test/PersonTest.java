package com.techlabs.model.test;

import com.techlabs.model.GenderType;
import com.techlabs.model.Person;

public class PersonTest {
	public static void main(String args[]) { //height in meters , weight in kg
		Person p1 = new Person("Tanmay",GenderType.MALE, 21 , 50.5f , 1.8f);
		p1.calculateBmi();
		p1.checkBodyCategory();
		printInfo(p1);
		
		p1.doWorkOut();
		p1.calculateBmi();
		p1.checkBodyCategory();
		System.out.println("after workout ");
		printInfo(p1);
		
		p1.doEat();
		p1.calculateBmi();
		p1.checkBodyCategory();
		System.out.println("after eating");
		printInfo(p1);
		
		System.out.println();
		
        ///////////new test case/////////////////////
		Person p2 = new Person(null, GenderType.FEMALE, -21 , 0 , 0);
		p2.calculateBmi();
		p2.checkBodyCategory();
		printInfo(p2);
		
		p2.doWorkOut();
		p2.calculateBmi();
		p2.checkBodyCategory();
		System.out.println("after workout ");
		printInfo(p2);
		
		p2.doEat();
		p2.calculateBmi();
		p2.checkBodyCategory();
		System.out.println("after eating");
		printInfo(p2);
	}
	
	public static void printInfo(Person p) {
		System.out.println("Name = "+p.getName()+" Gender = "+p.getGender()+" Age = "+p.getAge()+" weight = "+p.getWeight()+" height = "+p.getHeight()+" BMI = "+p.getBmi()+" BodyCategory = "+p.getBodyCategory());
	}
}
