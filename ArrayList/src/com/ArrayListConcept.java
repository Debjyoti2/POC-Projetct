package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;

public class ArrayListConcept {

	ArrayList<String> myArrayList = new ArrayList<String>(); 
	ArrayList<Integer> myArrayInt = new ArrayList<Integer>();

	//ArrayList<AnyVo> myArryaList = new ArrayList<AnyVo>();
	
	public static void main(String[] args) {
	    // Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    Map<String,Object> myHashMap = new WeakHashMap<String,Object>();
	    myHashMap.put("A", 1);
	    
	    
	    Integer a = (Integer) myHashMap.get("A");
	    System.out.println(a);
	    
	    
	    //foreach loop or for loop of hashmap
	    
	    for(String str: capitalCities.keySet()) {
	    	System.out.println(str);
	    }
	    
	    
	    LinkedList<String> myLinkedList = new LinkedList<String>();
	    myLinkedList.add("A");
	    myLinkedList.add("B");
	    
	    
	    
	    
	  }
}
