package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05_1 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking input from the user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Displaying the length of the string
	        System.out.println("Length of the string: " + input.length());

	        // Converting the string to uppercase and displaying
	        String uppercaseString = input.toUpperCase();
	        System.out.println("Uppercase string: " + uppercaseString);

	        // Checking if the string is a palindrome
	        String reversedString = new StringBuilder(input).reverse().toString();
	        if (input.equalsIgnoreCase(reversedString)) {
	            System.out.println("It is a Palindrome");
	        } else {
	            System.out.println("It is not a Palindrome");
	        }

	        scanner.close();
	    }
	}

