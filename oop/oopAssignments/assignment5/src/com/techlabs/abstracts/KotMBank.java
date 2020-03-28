package com.techlabs.abstracts;

public class KotMBank extends GeneralBank{
	
	@Override
	public double getSavingInterestRate() {
		return 6;
	}

	@Override
	public double getFixedDepositInterestRate() {
		return 9;
	}

}
