package com.example;

import java.util.Scanner;

public class ArrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[5];
		int i;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Five numbers:");
		for(i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		int j,temp;
		
		//bubble sort
		for(i=0;i<5;i++) {
			for(j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		System.out.println("You have entered:");
		
		for(i=0;i<5;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
			
			
		}
		
		int min = arr[0];
		for(i=1;i<5;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The minimum value is:"+min);
		
		
		int max = arr[0];
		for(i=1;i<5;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("The maximum value is:"+max);
		
	}

}
