package com.techlabs.accountequality.test;

import com.techlabs.accountequality.Account;

public class AccoutEquality {
	public static void main(String args[]) {
		//case1
		Account acc1 = new Account(101,"abc",5000);
		Account acc2 = new Account(101,"abc",5000);
		System.out.println(acc1.hashCode());
		System.out.println(acc2.hashCode());
		
		Account acc3 = acc1;
		System.out.println(acc1 == acc1);
		System.out.println(acc1 == acc2); //false bcs referring to diff objects in  heap
		System.out.println(acc3 == acc1);
		System.out.println();
		//value equality
		//case2
		System.out.println(acc1.equals(acc1));
		System.out.println(acc1.equals(acc2)); //false bcs equals method of class Object is not overridden
		System.out.println();										//it will check the reference
		
		//case3 make acc1.equals(acc2) returns true
		//right click -> source -> generate equals() and hashCode()
	}
}
