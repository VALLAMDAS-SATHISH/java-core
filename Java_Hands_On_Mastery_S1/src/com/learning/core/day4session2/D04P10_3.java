package com.learning.core.day4session2;

import java.util.Scanner;

public class D04P10_3 {

	public static boolean linearSearch(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		int[] elements = new int[n];
		System.out.print("Enter the elements separated by space: ");
		for (int i = 0; i < n; i++) {
			elements[i] = scanner.nextInt();
		}

		System.out.print("Enter the element to search: ");
		int searchElement = scanner.nextInt();

		if (linearSearch(elements, searchElement)) {
			System.out.println("Element is Present");
		} else {
			System.out.println("Element is not Present");
		}

		scanner.close();
	}
}
