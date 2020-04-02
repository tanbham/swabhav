package com.techlabs.serialization.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techlabs.account.Account;

public class SerializeTest {
	public static void main(String args[]) throws IOException {
		Account acc1 = new Account(101,"abc",1000);
		acc1.deposit(5000);
		acc1.deposit(7000);
		
		FileOutputStream fileOut = new FileOutputStream("account.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        
        out.writeObject(acc1);
        out.close();
        fileOut.close();
        
        System.out.println("Serialized data is stored in account.ser file");
	}
}
