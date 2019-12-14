package com;

// static class can be called without creating a object of that class
public class StaticPublicClass {

	
	public static void printName() {
		System.out.println("My name is kittu");
	}
	
	public void printNamePublic() {
		System.out.println("My name is kittu in public");
	}
	
	public static void main(String[] args) {

	    printName();
	    
	    //printNamePublic(); giving error
	    
	    StaticPublicClass cls = new StaticPublicClass();
	    cls.printNamePublic();
			

		}
}
