package com.techlabs.model;

public enum Type {
	ACOUSTICS , ELECTRIC;
	
	public String toString() {
		String s = "";
		switch(this) {
		case ACOUSTICS: s = "Acoustics";
		break;
		
		case ELECTRIC : s =  "Electric";
		break;
		}
		return s;
	}
}
