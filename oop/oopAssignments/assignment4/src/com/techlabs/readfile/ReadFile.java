package com.techlabs.readfile;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String args[]) throws IOException{
		readFromFile();
	}
	
	private static void readFromFile() throws IOException {
		FileReader reader = new FileReader("index.txt");
		int character;
		
		while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();
	}
}
