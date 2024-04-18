package com.learning.core.day1session2;

import java.util.Scanner;

public class D01P04_3 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the size of the array
	        System.out.println("Enter the size of the array:");
	        int N = scanner.nextInt();

	        // Input the elements of the array
	        int[] arr = new int[N];
	        System.out.println("Enter the elements of the array:");
	        int max = Integer.MIN_VALUE;
	        for (int i = 0; i < N; i++) {
	            arr[i] = scanner.nextInt();
	            max = Math.max(max, arr[i]);
	        }

	        // Using Arrays
	        int[] count = new int[max + 1];
	        int repeatingIndex = -1;
	        for (int i = N - 1; i >= 0; i--) {
	            if (count[arr[i]] != 0) {
	                repeatingIndex = count[arr[i]] - 1;
	            } else {
	                count[arr[i]] = i + 1;
	            }
	        }

	        // Output the index of the first repeating element
	        if (repeatingIndex != -1) {
	            System.out.println("Index of the first repeating element: " + repeatingIndex);
	        } else {
	            System.out.println("No repeating element found.");
	        }

	        scanner.close();
	    }
	}