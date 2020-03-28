package com.techlabs.abstracts.test;

import com.techlabs.abstracts.GeneralBank;
import com.techlabs.abstracts.ICICIBank;
import com.techlabs.abstracts.KotMBank;

public class BankTest {
	public static void main(String args[]) {
		ICICIBank i = new ICICIBank();
		KotMBank k = new KotMBank();
		GeneralBank g = new KotMBank();
		GeneralBank g1 = new ICICIBank();
		
		System.out.println("Fixed Deposit Interest of ICICI = "+i.getFixedDepositInterestRate()+"%\n"+"Saving Deposit Interest of ICICI = "+ i.getSavingInterestRate()+"%");
		System.out.println();
		
		System.out.println("Fixed Deposit Interest of Kotak = "+k.getFixedDepositInterestRate()+"%\n"+"Saving Deposit Interest of Kotak = "+ k.getSavingInterestRate()+"%");
		System.out.println();
		
		System.out.println("Fixed Deposit Interest of Kotak = "+g.getFixedDepositInterestRate()+"%\n"+"Saving Deposit Interest of Kotak = "+ g.getSavingInterestRate()+"%");
		System.out.println();
		
		System.out.println("Fixed Deposit Interest of ICICI = "+g1.getFixedDepositInterestRate()+"%\n"+"Saving Deposit Interest of ICICI = "+ g1.getSavingInterestRate()+"%");
		System.out.println();
	}
}
