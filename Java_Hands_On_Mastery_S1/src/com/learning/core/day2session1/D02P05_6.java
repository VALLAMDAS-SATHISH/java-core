package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05_6 {

	public static int longestPrefixSuffix(String s) {
		int n = s.length();
		for (int len = n - 1; len > 0; len--) {
			boolean isPrefixSuffix = true;
			for (int i = 0; i < len; i++) {
				if (s.charAt(i) != s.charAt(n - len + i)) {
					isPrefixSuffix = false;
					break;
				}
			}
			if (isPrefixSuffix)
				return len;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		scanner.close();

		System.out.println("Output: " + longestPrefixSuffix(input));
	}
}
