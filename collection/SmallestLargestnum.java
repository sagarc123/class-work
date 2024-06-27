//Q.2)WAP to fing second smallest and second largest element in an array 
package com.example;

import java.util.Scanner;

public class SmallestLargestnum 
{
			public static void main(String[] args) 
			{
				   // Declare variables
		        int len, temp, a[];
		        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user

		        // Prompt the user to enter the length of the array
		        System.out.println("Enter Array length: ");
		        len = sc.nextInt(); // Read the length of the array
		        a = new int[len]; // Initialize the array with the specified length

		        // Prompt the user to enter the elements of the array
		        System.out.println("Enter " + len + " elements");
		        for (int i = 0; i < len; i++) 
		        {
		            a[i] = sc.nextInt(); // Read each element and store it in the array
		        }

		        // Sort the array in ascending order using bubble sort
		        for (int i = 0; i < len; i++) 
		        {
		            for (int j = i + 1; j < len; j++) 
		            {
		                if (a[i] > a[j]) 
		                { // If the current element is greater than the next element
		                    temp = a[i]; // Swap the elements
		                    a[i] = a[j];
		                    a[j] = temp;
		                }
		            }
		        }

		        // Print the sorted elements
		        System.out.println("THE SORTED ELEMENTS ARE:");
		        for (int i = 0; i < len; i++) 
		        { 
		            System.out.println(a[i]);
		        }

		        // Print the second largest and second smallest elements
		        System.out.println("The Second largest element: " + a[len-2]); 
		        System.out.println("The Second smallest element: " + a[1]); 

			}
		

	}


