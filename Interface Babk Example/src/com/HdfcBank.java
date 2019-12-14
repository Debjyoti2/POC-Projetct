package com;

public class HdfcBank implements BankUtility{
	
	@Override
	public void calculateAsset() {
		
		System.out.println("Asset of HDFC is 20B$");
	}

	@Override
	public void calculateDeposit() {
		
		System.out.println("Deposit of HDFC is 40B$");
	}
	
	@Override
	public void calculateWithdraw() {
		
		System.out.println("Withdraw of HDFC is 60B$");
	}
	
}
