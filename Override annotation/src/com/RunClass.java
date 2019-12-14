package com;

public class RunClass {

	public static void main(String[] args) {

       
       
       new Child().showFamilyName("Kittu");
		
		

	}

}


// two method same name but different param is method overloading

// if two method same name but present in 2 diff classes then,
//in child class method use annotation @override to override child class method 
//now if i create any obj of child class and call this method it will overide parent class method and execute child class method