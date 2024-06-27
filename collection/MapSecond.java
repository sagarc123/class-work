package com.example;

import java.util.HashMap;
import java.util.Map;

public class MapSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> emp = new HashMap<String, Integer>();
		
		emp.put("Sagar", 2721);
		emp.put("Atharva", 23341);
		System.out.println("Map: "+emp);
		
		System.out.println("Keys: "+emp.keySet());
		
		System.out.println("Value: "+emp.values());
		
		System.out.println("Entries: "+emp.entrySet());
		
		int value = emp.remove("Atharva");
		System.out.println("Removed Value: "+value);
		
		System.out.println("Map: "+emp);
		
	}

}
