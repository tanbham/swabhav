package com.techlabs.model;

import java.util.Comparator;

public class QuantityComparator implements Comparator<LineItem>{

	@Override
	public int compare(LineItem o1, LineItem o2) {
		return Integer.valueOf(o1.getQuantity()).compareTo(Integer.valueOf(o2.getQuantity()));
	}

}
