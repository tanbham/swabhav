package com.techlabs.writefile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String args[]) throws IOException{
		for(int i=0 ; i<2 ; i++) {
			writeInFile("hey Tanmay\n");
		}		
	}

	private static void writeInFile(String string) throws IOException{
		FileWriter writer = new FileWriter("index.txt",true);
		writer.write(string);
		writer.close();
	}
	
}
