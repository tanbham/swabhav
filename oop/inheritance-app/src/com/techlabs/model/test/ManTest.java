package com.techlabs.model.test;

import com.techlabs.model.Boy;
import com.techlabs.model.Child;
import com.techlabs.model.Infant;
import com.techlabs.model.Man;

public class ManTest {
	public static void main(String args[]) {
		//case1();
		//case2();
		//case3();
		//case4();
		case5();
		
	}
	
	private static void case5() {
		Object x;
		x = 10;
		System.out.println(x.getClass());
		x = "hello";
		System.out.println(x.getClass());
		x = 10 > 20;
		System.out.println(x.getClass());
	}
	
	private static void case4() {
		atThePark(new Man());
		atThePark(new Child());
		atThePark(new Infant());
		atThePark(new Boy());
	}

	private static void atThePark(Man x) {
		System.out.println("At the Park");
		x.play();
	}

	private static void case3() {
		Man x;
		x = new Boy();
		x.play();
	
		
	}

	private static void case2() {
		Boy y;
		y = new Boy();
		y.eat();
		y.walk();
		y.play();
		y.read();
		
	}

	private static void case1() {
		Man x;
		x = new Man();
		x.play();
		x.read();
		x.walk();
	}
}
