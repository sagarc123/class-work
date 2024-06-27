//Q.2)WAP to implement Binary Search
package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
    // Method to perform binary search
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Find the middle element

            // Check if the key is present at mid
            if (arr[mid] == key) 
            {
                return mid; // Return the index of the key
            }

            // If the key is greater, ignore the left half
            if (arr[mid] < key) 
            {
                left = mid + 1;
            } 
            else 
            {
                // If the key is smaller, ignore the right half
                right = mid - 1;
            }
        }

        return -1; // Key not found
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		   // Declare variables
        int len, key, arr[];
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the length of the array
        System.out.println("Enter Array length: ");
        len = input.nextInt(); // Read the length of the array
        arr = new int[len]; // Initialize the array with the specified length

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + len + " elements");
        for (int i = 0; i < len; i++) 
        {
            arr[i] = input.nextInt(); // Read each element and store it in the array
        }

        // Sort the array before performing binary search
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Prompt the user to enter the search key value
        System.out.println("Enter the search key value: ");
        key = input.nextInt(); // Read the search key

        // Perform binary search
        int result = binarySearch(arr, key);

        // Print the result of the search
        if (result == -1) {
            System.out.println(key + " doesn't exist in array."); // Key not found
        } 
        else 
        {
            System.out.println(key + " is present at location " + (result + 1)); // Key found (1-based index)
        }

		  
	
	}

}
