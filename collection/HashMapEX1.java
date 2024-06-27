package com.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashMap to store employee IDs (Integer) and employee names (String)
		Map<Integer, String> emp= new HashMap<Integer, String>();  
		
		 // Add some employee ID and name pairs to the HashMap
		emp.put(101, "Sagar");
		emp.put(102, "Vaishnavi");
		emp.put(103, "Atharva");
		emp.put(104, "Yash");
		emp.put(105, "Prathamesh");
		
		// Display the contents of the HashMap
		System.out.println("Employee Details:");
		for(Integer empId : emp.keySet())   // Iterate over all keys (employee IDs)
		{
			
			System.out.println("Employee ID:"+empId+", Employee Name:"+emp.get(empId));  // Print key-value pairs
        }
			
		}
		
	}


