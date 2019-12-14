package com;

public abstract class BankUtility {

	
	public void depositInADay(String bankName, Integer branchA, Integer branchB) {
		
		Integer totalDeposit = branchA +  branchB;
		System.out.println("Deposit in a Day for Bank ::" +  bankName + "is ::" + totalDeposit);
	}
	
    public void withDrawInADay(String bankName, Integer branchA, Integer branchB) {
		
		Integer totalwithDraw = branchA +  branchB;
		System.out.println("Deposit in a Day for Bank ::" +  bankName + "is ::" + totalwithDraw);
	}
    
    public abstract void calculateInterest(Integer x, Integer y);
    
    public abstract void sharePrice (Integer baseShare);
	
	
}
