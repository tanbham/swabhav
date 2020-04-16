package com.techlabs.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void test() {
		Demo obj = new Demo();
		assertEquals("TanmayBhambure",obj.Demo("Tanmay","Bhambure"));
	}

}
