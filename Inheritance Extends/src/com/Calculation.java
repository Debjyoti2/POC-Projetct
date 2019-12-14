package com;

public class Calculation extends MathUtility{

	
	public Integer multiply(Integer a,Integer b) {
		
		Integer c= a*b;
		return c;
		
		
	}
	
	public static void main(String args[]) {
		
		Calculation cal = new Calculation();
		
		System.out.println("addition of 2 & 5 is : " + cal.addition(2, 5));
		System.out.println("substraction of 20 & 5 is : " + cal.substraction(20, 5));
		System.out.println("multiply of 20 & 5 is : " + cal.multiply(20, 5));
		
	}
	
}
