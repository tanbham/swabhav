package com.techlabs.annotation;

public class Foo {
	
	@BeforeUnitTestCase
	public void before() {
		System.out.println("before called");
	}
	
	@UnitTestCase(value = true)
	public boolean m1() {	   //passing testcase
		return true;
	}
	
	public boolean m2() {      //not a testcase   
		return true;
	}
	
	@UnitTestCase(value = false)
	public boolean m3() {      //failing testcase
		return false;
	}
	
	@UnitTestCase(value = true)
	public boolean m4() {     // passing testcase
		return true;
	}


}
