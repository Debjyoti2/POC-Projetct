package com;

public class Car extends Vehicle{
	
	public void start(){
		
		System.out.println("Start the Car by key");
	}
	
	public void vehiCleName(){
		
		System.out.println("Start the Car by kick");
	}

	
	public static void main(String args[]) {
		Car c = new Car();
		c.start();
		c.vehiCleName();
	}
}
