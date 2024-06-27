package com.example;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> studlist = new LinkedHashSet<String>();
		
		studlist.add("Atharva");
		studlist.add("Yash");
		studlist.add("Aayush");
		studlist.add("Prathamesh");
		
		System.out.println("The student list are:"+studlist);
		
		Iterator<String> iterator = studlist.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		studlist.remove("Prathamesh");
		System.out.println("The elements removed are:"+studlist);
		

	}

}
