package com;

//java constructor is used to initialize an object
public class Employee {

	 public String emp_id;
	 public String name;
	 public String nameId;
	
	
	Employee(String emp_id1,String name1){
		this.emp_id= emp_id1;
		this.name=name1;
		this.nameId= emp_id1 + name1;
		
	}
}
