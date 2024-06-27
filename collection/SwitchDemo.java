package com.example;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,ans,choice = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wlcome to online Calculator!!!");
		System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Divison");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Enter 2 numbers");
				a=sc.nextInt();
				b=sc.nextInt();
				ans = a+b;
				System.out.println("The Addition is :"+ans);
				break;
				
			case 2:
				System.out.println("Enter 2 numbers");
				a=sc.nextInt();
				b=sc.nextInt();
				ans = a-b;
				System.out.println("The Subtraction is :"+ans);
				break;
				
			case 3:
				System.out.println("Enter 2 numbers");
				a=sc.nextInt();
				b=sc.nextInt();
				ans = a*b;
				System.out.println("The Multiplication is :"+ans);
				break;
				
				
			case 4:
				System.out.println("Enter 2 numbers");
				a=sc.nextInt();
				b=sc.nextInt();
				ans = a/b;
				System.out.println("The Division is :"+ans);
				break;
				
			default:
				System.out.println("Enter a Valid choice!!!");
				break;
				
		}
		
			
		
	}

}
