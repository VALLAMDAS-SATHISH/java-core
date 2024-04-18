package com.learning.core.day1session2;

import java.util.Scanner;

public class D01P04_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input array
		System.out.print("Enter numbers separated by spaces: ");
		String[] input = scanner.nextLine().split(" ");

		// Value of k
		System.out.print("Enter the value of k: ");
		int k = scanner.nextInt();

		// Find combinations
		findCombinations(input, k);

		scanner.close();
	}

	public static void findCombinations(String[] input, int k) {
		findCombinationsUtil(input, k, 0, new StringBuilder(), 0);
	}

	private static void findCombinationsUtil(String[] input, int k, int start, StringBuilder sb, int count) {
		if (count == k) {
			System.out.println(sb.toString());
			return;
		}

		for (int i = start; i < input.length; i++) {
			sb.append(input[i]);
			sb.append(",");
			findCombinationsUtil(input, k, i + 1, sb, count + 1);
			sb.delete(sb.length() - input[i].length() - 1, sb.length()); // Backtrack
		}
	}
	
	
}