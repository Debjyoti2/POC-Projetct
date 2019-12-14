package com;

public class HdfcBank extends BankUtility {

   @Override
   public void calculateInterest (Integer x,Integer y) {
	  float z= x%y*2;
	  System.out.println("Interest rate for HDFC bank is : " + z);
	   
   }
   @Override
   public void sharePrice(Integer a) {
	   Integer s= a*20;
	   System.out.println("sharePrice for HDFC bank is : " + s);
   }
   
   
   public static void main(String args[]) {
	   
	   HdfcBank hdfc = new HdfcBank();
	   hdfc.depositInADay("HDFC", 10000, 20000);
	   hdfc.withDrawInADay("HDFC", 2000, 1000);
	   hdfc.calculateInterest(20, 3);
	   hdfc.sharePrice(20);
	   
	   
	   
   }
	
}
