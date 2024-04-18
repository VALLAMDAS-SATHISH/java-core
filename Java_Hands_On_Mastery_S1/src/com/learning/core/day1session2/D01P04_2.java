package com.learning.core.day1session2;

import java.util.Scanner;

public class D01P04_2 {

	public static void main(String[] args) {

		// Create a Scanner object for user input
		Scanner scanner = new Scanner(System.in);

		// Define the array with default values
		int[] A = { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0 };

		// Check if the user wants to input values
		System.out.print("Do you want to input values manually? (yes/no): ");
		String inputChoice = scanner.next();

		// If user wants to input values manually
		if (inputChoice.equalsIgnoreCase("yes")) {
			// Take input from the user
			System.out.println("Enter 18 integers separated by spaces:");
			for (int i = 0; i < 18; i++) {
				A[i] = scanner.nextInt();
			}
		}

		// Compute sum of elements from index 0 to 14 and store it at element 15
		int sum = 0;
		for (int i = 0; i < 15; i++) {
			sum += A[i];
		}
		A[15] = sum;

		// Compute average of all numbers and store it at element 16
		double average = (double) sum / 18;
		A[16] = (int) Math.round(average);

		// Identify the smallest value from the array and store it at element 17
		int min = A[0];
		for (int i = 1; i < 18; i++) {
			if (A[i] < min) {
				min = A[i];
			}
		}
		A[17] = min;

		// Print output
		System.out.println("Output: " + A[15] + " " + A[16]+" "+A[17]);

		// Close the scanner
		scanner.close();
	}
}

// INPUT : 2 4 5 6 4 5 7 3 2 3 4 7 1 2 3 0 0 0
// OUTPUT: 58 3 0
