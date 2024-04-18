package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05_5 {

	public static boolean canFormCircle(String[] strings) {
		boolean[] visited = new boolean[strings.length];
		return canFormCircle(strings, strings[0], visited, 1);
	}

	private static boolean canFormCircle(String[] strings, String current, boolean[] visited, int count) {
		if (count == strings.length && current.charAt(current.length() - 1) == strings[0].charAt(0))
			return true;

		for (int i = 0; i < strings.length; i++) {
			if (!visited[i] && current.charAt(current.length() - 1) == strings[i].charAt(0)) {
				visited[i] = true;
				if (canFormCircle(strings, strings[i], visited, count + 1))
					return true;
				visited[i] = false;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of strings: ");
		int n = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		System.out.println("Enter the strings separated by space:");
		String[] strings = scanner.nextLine().split("\\s+");

		if (canFormCircle(strings)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
