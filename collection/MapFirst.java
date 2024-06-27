package com.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Map<String, String> map = new HashMap<String, String>();
		map.put("actor", "Brad Pitt");
		map.put("ceo", "Sundar Pichai");
		map.put("accountant", "Sagar");
		map.put("clerk", "Yash");
		
		System.out.println(map.get("doctor"));
		
		Set<String> designation =map.keySet();
		for(String key:designation) {
			System.out.println(map.get(key));
		}
		
		for(String key:designation) {
			System.out.println(key+" "+map.get(key));
		}
		
	}

}
