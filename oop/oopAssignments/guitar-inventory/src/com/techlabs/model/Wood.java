package com.techlabs.model;

public enum Wood {
	INDIAN, AFRICAN, ALDER;
	
	public String toString() {
		String s = "";
		switch(this) {
		case INDIAN : s = "Indian";
		break;
		case AFRICAN : s = "African";
		break;
		case ALDER : s = "Alder";
		break;
		}
		return s;
	}
}
