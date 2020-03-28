package com.techlabs.abstracts;

public class ICICIBank extends GeneralBank {
	
	@Override
	public double getSavingInterestRate() {
		return 4;
	}

	@Override
	public double getFixedDepositInterestRate() {
		return 8.5;
	}

}
