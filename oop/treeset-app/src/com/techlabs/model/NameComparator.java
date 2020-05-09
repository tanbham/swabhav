package com.techlabs.model;

import java.util.Comparator;

public class NameComparator implements Comparator<LineItem>{

	@Override
	public int compare(LineItem o1, LineItem o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
