package com;

public class NamePrint extends Confedential{
	
	// i have to write this method as i have extends the abstract class so i have to write all the abstract method in that class
	public void printName() {
		
		System.out.println("name is kittu::");  
	}
	
	public static void printAbtsName() {
		System.out.println("name is do not need to create obj as static method::");
	}
	
	public static void main (String args[]) {
		
		NamePrint pt = new NamePrint();
		pt.printName();
		printAbtsName(); // static method does not reuire and object to make
	}

}
