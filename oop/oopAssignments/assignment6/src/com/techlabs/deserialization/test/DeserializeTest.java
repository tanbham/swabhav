package com.techlabs.deserialization.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techlabs.account.Account;

public class DeserializeTest {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		Account acc = null;
		
		FileInputStream fileIn = new FileInputStream("account.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		
		 acc = (Account) in.readObject();
		 
		 in.close();
		 fileIn.close();
		 
		 System.out.println(acc);
	}
}
