package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scanner.nextLine();

		if (canBeSplit(input)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean canBeSplit(String input) {
		if (input.length() < 4) {
			return false;
		}

		char[] chars = new char[256]; // Assuming ASCII characters
		int distinctCount = 0;

		for (char c : input.toCharArray()) {
			if (chars[c] == 0) {
				distinctCount++;
				chars[c] = 1;
			}
		}

		return distinctCount >= 4;
	}
}
