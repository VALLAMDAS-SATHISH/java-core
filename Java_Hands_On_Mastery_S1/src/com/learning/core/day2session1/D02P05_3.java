package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05_3 {
	// Function to print all subsequences of a string
	static void printSubsequences(String str) {
		int n = str.length();

		// Total possible subsequences = 2^n
		int total = (int) Math.pow(2, n);

		// Run loop for total iterations
		for (int i = 1; i < total; i++) {
			StringBuilder subsequence = new StringBuilder();

			// Check bits of i to form a subsequence
			for (int j = 0; j < n; j++) {
				// If jth bit of i is set, add corresponding character to the subsequence
				if ((i & (1 << j)) != 0) {
					subsequence.append(str.charAt(j));
				}
			}
			// Print the subsequence
			System.out.print(subsequence + ", ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();

		System.out.println("Subsequences of the string " + str + " are:");
		printSubsequences(str);
		scanner.close();
	}
}
