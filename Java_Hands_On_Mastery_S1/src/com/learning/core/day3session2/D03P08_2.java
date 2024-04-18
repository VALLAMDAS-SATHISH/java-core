package com.learning.core.day3session2;

import java.util.HashMap;
import java.util.Scanner;

public class D03P08_2 {
	public static void main(String[] args) {
		// Creating a HashMap to store phone book details
		HashMap<String, String> phoneBook = new HashMap<>();

		// Predefined information of 5 phone book details
		phoneBook.put("John", "1234567890");
		phoneBook.put("Alice", "2345678901");
		phoneBook.put("Bob", "3456789012");
		phoneBook.put("Joseph", "4567890123");
		phoneBook.put("Emily", "5678901234");

		// Scanner object to take input from the user
		Scanner scanner = new Scanner(System.in);

		// Input name to search for
		System.out.print("Enter the name to search for: ");
		String nameToSearch = scanner.nextLine();

		// Performing search operation
		if (phoneBook.containsKey(nameToSearch)) {
			String phoneNumber = phoneBook.get(nameToSearch);
			System.out.println("Phone number of " + nameToSearch + " is: " + phoneNumber);
		} else {
			System.out.println(nameToSearch + "'s phone number not found in the phone book.");
		}

		// Closing the scanner
		scanner.close();
	}
}
