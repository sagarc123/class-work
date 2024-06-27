package com.example;

import java.util.Map;
import java.util.TreeMap;

public class MapThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		treeMap.put("B", 7);
		treeMap.put("D", 4);
		treeMap.put("E", 2);
		treeMap.put("C", 3);
		treeMap.put("A", 1);
		
		System.out.println(treeMap);
		
		int valueA = treeMap.get("A");
		System.out.println("Value of A:" + valueA);
		
		treeMap.remove("B");
		
		for(String key:treeMap.keySet()) {
			System.out.println("Key: "+key+", Value:"+treeMap.get(key));
		}
	}

}
