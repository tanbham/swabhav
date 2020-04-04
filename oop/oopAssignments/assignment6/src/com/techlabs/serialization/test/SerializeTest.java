package com.techlabs.serialization.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techlabs.account.Account;

public class SerializeTest {
	public static void main(String args[]) throws IOException {
		Account arr[] = new Account[2];
		
		arr[0] = new Account(101,"abc",1000);
		arr[1] = new Account(102,"def",2000);
		
		FileOutputStream fileOut = new FileOutputStream("account.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        
        out.writeObject(arr);
        out.close();
        fileOut.close();
        
        System.out.println("Serialized data is stored in account.ser file");
	}
}
