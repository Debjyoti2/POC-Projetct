package com;

public class ExceptionExample {

	public void returnName(String name, Integer empId) {
		String FinalName="";
		
		try {
			 FinalName= Integer.valueOf(name).toString() + empId;
			 System.out.println("FinalName1 is  :  " + FinalName);
			
		}catch(Exception e){
			 System.out.println("Exception occoured Name can not be printed");
		}
		
	}
	
	public void returnNameWithoutException(String name,Integer empId) {
		String FinalName="";
		FinalName= name + empId;
		System.out.println("FinalName2 is  :  " + FinalName);
	}
	
	
}
