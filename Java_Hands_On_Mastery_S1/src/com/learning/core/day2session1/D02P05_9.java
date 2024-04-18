package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scanner.nextLine();
		String output = replaceSpaces(input);
		System.out.println("Output: " + output);
		scanner.close();
	}

	public static String replaceSpaces(String input) {
		// Using built-in replaceAll method
		return input.replaceAll(" ", "%20");
	}
}
