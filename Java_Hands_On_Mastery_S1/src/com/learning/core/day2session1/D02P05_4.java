package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05_4 {

	// Function to check if a string is palindrome
	static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	// Function to find the minimum number of deletions to make a string palindrome
	// using brute force
	static int minDeletionsToPalindrome(String s) {
		int minDeletions = Integer.MAX_VALUE;

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String substring = s.substring(i, j);
				if (!isPalindrome(substring)) {
					minDeletions = Math.min(minDeletions, j - i);
				}
			}
		}

		return minDeletions;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scanner.nextLine();
		scanner.close();

		System.out.println(minDeletionsToPalindrome(s)); // Output: Minimum deletions
	}
}
