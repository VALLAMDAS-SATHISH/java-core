package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();
		System.out.print("Enter the value of 'n': ");
		int n = scanner.nextInt();

		String result = countLastNVowels(inputString, n);
		System.out.println("Output:");
		System.out.println(result);
	}

	public static String countLastNVowels(String inputString, int n) {
		String vowels = "aeiouAEIOU";
		StringBuilder lastNVowels = new StringBuilder();

		for (int i = inputString.length() - 1, count = 0; i >= 0 && count < n; i--) {
			char currentChar = inputString.charAt(i);
			if (vowels.indexOf(currentChar) != -1) {
				lastNVowels.insert(0, currentChar);
				count++;
			}
		}

		if (lastNVowels.length() < n) {
			return "Mismatch in Vowel Count";
		} else {
			return lastNVowels.toString();
		}
	}
}
