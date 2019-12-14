package com;

public class AxisBank extends BankUtility{

	   @Override
	   public void calculateInterest (Integer x,Integer y) {
		  float z= x-y*2000;
		  System.out.println("Interest rate for Axis bank is : " + z);
		   
	   }
	   @Override
	   public void sharePrice(Integer a) {
		   Integer s= a*2000;
		   System.out.println("sharePrice for Axis bank is : " + s);
	   }
	   
	   
	   public static void main(String args[]) {
		   
		   AxisBank axis = new AxisBank();
		   axis.depositInADay("HDFC", 100, 200);
		   axis.withDrawInADay("HDFC", 20, 10);
		   axis.calculateInterest(2000, 3);
		   axis.sharePrice(180);
		   
		   
		   
	   }
	
	
}
