package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input:");
		String dictionaryInput = scanner.nextLine();
		String[] dictionary = dictionaryInput.split("\\s+");

		System.out.print("Enter pattern to search: ");
		String pattern = scanner.next();

		findAndPrintMatchingStrings(dictionary, pattern);

		scanner.close();
	}

	public static void findAndPrintMatchingStrings(String[] dictionary, String pattern) {
		boolean found = false;
		System.out.println("\nOutput:");
		for (String word : dictionary) {
			if (word.contains(pattern)) {
				System.out.print(word + " ");
				found = true;
			}
		}
		if (!found) {
			System.out.print("No matches found.");
		}
	}
}
