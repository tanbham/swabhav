package com.techlabs.products;

public class Product {

	public Product(String tupple) {
		String a[] = tupple.split(",");
		if(a.length == 4) {
			double discount = calculatePriceAfterDiscount(a);
			displayItems(a,discount);
		}
	}

	private double calculatePriceAfterDiscount(String[] a) {
		double disc = Double.parseDouble(a[2]) - (Double.parseDouble(a[2]) * Double.parseDouble(a[3])) / 100;
		return disc;
	}

	private void displayItems(String[] a, double discount) {
		
		for(String i : a) {
			System.out.print(i+"\t");
		}
		System.out.println("\t"+discount);
		//System.out.println();
	}

}
