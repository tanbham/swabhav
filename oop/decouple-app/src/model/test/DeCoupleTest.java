package model.test;

import model.A;
import model.B;

public class DeCoupleTest {
	public static void main(String args[]) {
		A a = new A(new B());
		a.bar();
	}
}

