//Q.1) WAP to implement Linear search.
package com.example;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	     // Declare variables
        int i, len, key, arr[];
        
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the length of the array
        System.out.println("Enter Array length: ");
        len = input.nextInt(); // Reads the length of the array
        arr = new int[len]; // Initialize the array with the specified length

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + len + " elements");
        for (i = 0; i < len; i++) 
        {
            arr[i] = input.nextInt(); // Reads each element and stores it in the array
        }

        // Prompt the user to enter the search key value
        System.out.println("Enter the search key value: ");
        key = input.nextInt(); // Read the search key

        // Perform linear search to find the key in the array
        for (i = 0; i < len; i++) 
        {
            if (arr[i] == key) 
            {
                // If the key is found, print its location
                System.out.println(key + " is present at location " + (i + 1));
                break; // Exit the loop as we found the key
            }
        }

        // If the key was not found in the array, print a message
        if (i == len)
            System.out.println(key + " doesn't exist in array.");
        
			}
		
	}


