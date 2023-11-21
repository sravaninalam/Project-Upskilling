package com.cg.junit;

public class Bank{
	private int amount = 10000;
	public boolean withdraw(int amoutToWithdraw) throws  InsufficientFundsException {
			
		if(amoutToWithdraw > amount) {
			 throw new  InsufficientFundsException();
		}
		amount -= amoutToWithdraw;
		return true;
	}

public static void main() {
}
}