package com.learning.core.day3session1;

import java.util.ArrayList;
import java.util.Scanner;

public class D03P07_1 {

	public static void main(String[] args) {
		// Create an ArrayList to store student names
		ArrayList<String> studentNames = new ArrayList<>();

		// Get input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the list of student names separated by spaces: ");
		String inputNames = scanner.nextLine();

		// Split the input string into an array of names
		String[] namesArray = inputNames.split("\\s+");

		// Add each name to the ArrayList
		for (String name : namesArray) {
			studentNames.add(name);
		}

		// Get the name to search for
		System.out.print("Enter the name to search for: ");
		String searchName = scanner.nextLine();

		// Check if the name exists in the list
		if (studentNames.contains(searchName)) {
			System.out.println("Found.");
		} else {
			System.out.println("Not found.");
		}

		// Close the scanner
		scanner.close();
	}
}
