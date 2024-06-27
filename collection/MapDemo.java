package com.example;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> user = new HashMap<Integer,String>();
		
		user.put(101, "Sagar");
		user.put(102, "Yash");
		user.put(103, "Atharva");
		user.put(102, "Prathamesh");
		
		System.out.println(user);
		
	}

}
