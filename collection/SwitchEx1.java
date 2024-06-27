package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc =new Scanner(System.in);
		ArrayList<String> vegies =new ArrayList<String>();
		int choice;
		
		while (true) {
			System.out.println("====================");
			System.out.println("Vegetable Store");
			System.out.println("1.Add Vegetables \n2.View all vegtables \n3.Remove a vegetable \n4.Exit");
			System.out.println("Enter your choice ");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				
				case 1:
					System.out.println("Enetr Vegetable names:");
					String vegetable = sc.nextLine();
					vegies.add(vegetable);
					System.out.println("Vegetable Added");
					break;
					
				case 2:
					System.out.println("Vegetables are:");
					if(vegies.isEmpty()) {
						System.out.println("No vegetables to show");
					}
					else {
						for(int i=0;i<vegies.size();i++) {
							System.out.println(i+1+"." + vegies.get(i));
							
						}
					}
					break;
					
				case 3:
					if(vegies.isEmpty()) {
						System.out.println("No vegetable to remove");
					}
					else {
						for (int i=0;i<vegies.size();i++) {
							System.out.println(i+1+"." + vegies.get(i));
						}
					System.out.println("Select the Vegetable number to remove:");
						int vegietoremove = sc.nextInt();
						
						if(vegietoremove > 0 && vegietoremove <= vegies.size()) {
							vegies.remove(vegietoremove-1);
							System.out.println("Vegetable Removed");
						}
					}
					break;
					
				case 4:
					System.exit(0);
					
				default :
					System.out.println("Invalid choice!!!!");
					
			
			}
		}
		
	}

}
