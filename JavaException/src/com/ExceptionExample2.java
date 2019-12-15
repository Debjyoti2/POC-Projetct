package com;

public class ExceptionExample2 {
	
	public void returnName(String name, Integer empId) {
		String FinalName="";
		
		 FinalName= Integer.valueOf(name).toString() + empId;
		 System.out.println("FinalName1 is  :  " + FinalName);
		
	}
	
	public void returnNameWithoutException(String name,Integer empId) {
		String FinalName="";
		FinalName= name + empId;
		System.out.println("FinalName2 is  :  " + FinalName);
	}
	
}
