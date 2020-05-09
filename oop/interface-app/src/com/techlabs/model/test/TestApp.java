package com.techlabs.model.test;

import com.techlabs.model.Boy;
import com.techlabs.model.IEmotionable;
import com.techlabs.model.IMannerable;
import com.techlabs.model.Man;

public class TestApp {
	public static void main(String args[]) {
		Man man = new Man();
		Boy boy = new Boy();
		
		atPartyHall(man);
		atPartyHall(boy);
		//atMovieHall(man);
		atMovieHall(boy);
	}

	private static void atMovieHall(IEmotionable obj) {
		System.out.println("At movie hall");
		obj.laugh();
		obj.cry();
		
	}

	private static void atPartyHall(IMannerable obj) {
		System.out.println("At party hall");
		obj.depart();
		obj.wish();
	}
}
