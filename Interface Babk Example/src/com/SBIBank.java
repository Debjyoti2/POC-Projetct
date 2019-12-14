package com;

public class SBIBank implements BankUtility{

	@Override
	public void calculateAsset() {
		
		System.out.println("Asset of SBi is 200B$");
	}

	@Override
	public void calculateDeposit() {
		
		System.out.println("Deposit of SBi is 400B$");
	}
	
	@Override
	public void calculateWithdraw() {
		
		System.out.println("Withdraw of SBi is 600B$");
	}
	
	
}
