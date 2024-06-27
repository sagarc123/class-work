//Write a program to implement set operation using HashSet and 
//LinkedHassSet to add the list of favourite fruits and vegetables
//perform minimum four operations of the set on mentioned set.
package com.example;

//import packages for hash set and linked hash set
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Set <String> fruits=new HashSet<String>();       // Instantiate an object of HashSet 
		Set <String> vegies=new LinkedHashSet<String>();      // Instantiate an object of LinkedHashSet 
		
		
		//1. add() 
		//It will add the values using the object for HashSet
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Dragon Fruit");
		fruits.add("Avacado");
		
		//It will add the values using the object for LinkedHashSet
		vegies.add("Brinjal");
		vegies.add("Cauliflower");
		vegies.add("Asparagus");
		vegies.add("Karela");
		
		
		//Prints all the values from both HashSet and LinkedHashSet
		System.out.println("Fruits are:"+fruits);
		System.out.println("Vegetables are:"+vegies);
		
		//2. isEmpty()
		System.out.println("Is vegetables list empty: "+vegies.isEmpty());    //Used to check if the Set is empty or not
		
		//3. remove()
		vegies.remove("Karela");     	//Used to remove any value from a Set
		System.out.println("The elements removed are:"+vegies);
		
		//4. contains()
		//Used to check if the provided value exists in the set or not 
		System.out.println("Does Fruits have apple: "+fruits.contains("Apple"));    
		System.out.println("Does vegetables have karela: "+vegies.contains("Karela"));
		
	}

}
