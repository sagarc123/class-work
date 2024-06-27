//Q.1)WAP To sort array element Given by user in Descending order.
package com.example;

import java.util.Scanner;

public class DescendingSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	    // Declare variables
        int len, key, temp, a[];
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

        // Sort the array in descending order using bubble sort
        for (int i = 0; i < len; i++) 
        {
            for (int j = i + 1; j < len; j++) 
            {
                if (a[i] < a[j]) 
                { // If the current element is less than the next element
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

	}
}