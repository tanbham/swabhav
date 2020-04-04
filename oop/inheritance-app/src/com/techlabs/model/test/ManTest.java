package com.techlabs.model.test;

import com.techlabs.model.Boy;
import com.techlabs.model.Man;

public class ManTest {
	public static void main(String args[]) {
		//case1();
		case2();
		case3();
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
