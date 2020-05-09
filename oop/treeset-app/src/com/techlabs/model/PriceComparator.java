package com.techlabs.model;

import java.util.Comparator;

public class PriceComparator implements Comparator<LineItem> {
	@Override
	public int compare(LineItem o1, LineItem o2) {
		return Double.valueOf(o1.getPrice()).compareTo(Double.valueOf(o2.getPrice()));
	}
}
