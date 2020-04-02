package com.techlabs.account;

import java.io.Serializable;

public class Account implements Serializable {
		private String name;
		private int accNo;
		private double balance;
		private int minBalance;
		private static int totalNoOfTransactions;
		
		
		static {
			totalNoOfTransactions = 0;
		}
		
		public Account(int accNo , String name , int minBalance) {
			this.accNo = accNo;
			this.name = name;
			this.minBalance = minBalance;
		}
		
		public void deposit(double money) {
			balance = balance + money;
			totalNoOfTransactions++;
		}
		
		public void withdraw(double amt) {
			if(balance - amt > minBalance) {
				balance = balance - amt;
				totalNoOfTransactions++;
			}
			else {
				totalNoOfTransactions++;
				System.out.println("Cannot withdraw more than "+minBalance);
			}
		}
		
		public double getBalance() {
			return balance;
		}
		
		public int getTotalNoOfTransactions() {
			return totalNoOfTransactions;
		}
		
		public int getAccNo() {
			return accNo;
		}
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + accNo;
			long temp;
			temp = Double.doubleToLongBits(balance);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + minBalance;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Account other = (Account) obj;
			if (accNo != other.accNo)
				return false;
			if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
				return false;
			if (minBalance != other.minBalance)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public String toString() {
			System.out.println(super.toString());
			String str = String.format("Acc No = " +accNo+ "\nName = " +name+ "\nBalance = " +balance);
			return str;
		}
}
