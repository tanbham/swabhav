package com.techlabs.products;

import java.io.File;
import java.util.Scanner;

public class ProductTest {
	public static void main(String args[]) throws Exception {
		File file = new File("products_updated.csv");
		Product products[] = new Product[10];
		
		Scanner sc = new Scanner(file);
		int i = 0;
		sc.next();
		
		System.out.println("ID\t"+"NAME\t"+"PRICE\t"+"DISCOUNT\t"+"AFTER Discount");
		while(sc.hasNext()) {
			String tupple = sc.nextLine();
			products[i] = new Product(tupple);
			i++;
		}
	}	
}
