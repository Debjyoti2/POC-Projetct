package com;

public class RunClass {

	public static void main (String args[]) {
		
		BankUtility util = new HdfcBank();
		util.calculateAsset();
		util.calculateDeposit();
		util.calculateWithdraw();
		
		BankUtility util2 = new SBIBank();
		util2.calculateAsset();
		util2.calculateDeposit();
		util2.calculateWithdraw();
		
	}
	
}
