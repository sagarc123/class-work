package com.example;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a TreeMap to store student names (String) and their marks (Integer)
				Map<String, Integer> stud= new TreeMap<String, Integer>();  
				
				 // Add some student names and their marks  to the TreeMap
				stud.put("Sagar",80);
				stud.put("Vaishnavi",59);
				stud.put("Atharva",70);
				stud.put("Yash",30);
				stud.put("Prathamesh",90);
				
				
				System.out.println(stud);  // Print the contents of the TreeMap
				
				 // Create another TreeMap to store more students and their marks
				TreeMap<String, Integer> morestud = new TreeMap<String, Integer>();
		       
				// Add more student names and their marks to the second TreeMap
				stud.put("Sahil", 70);
				stud.put("Supriya", 80);
				
				
				stud.putAll(morestud); // Copy all mappings from morestud to stud
				System.out.println(stud); // Print the updated contents of the TreeMap
				
				 // Print all students and their marks in a formatted way
				System.out.println("==================");
				System.out.println("Students Result:");
				for(String name : stud.keySet())   
				{
					 // Iterate over the keys (student names) and print each name with its corresponding mark
					System.out.println("Student Name:"+name+", Percentage:"+stud.get(name)+"%");  
		        }
				
	}

}
