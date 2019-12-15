package com;

//java constructor is used to initialize an object
public class Employee {

	 int emp_id;
	 String name;
	 //String nameId;
	
	
	Employee(int emp_id,String name){
		emp_id= this.emp_id;
		name=this.name;
		//nameId= this.emp_id.toString() + this.emp_name;
		
	}
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee(1,"deepak");
		System.out.println("emp 1 is: " + e1.emp_id + e1.name);
	}
	
	
}
