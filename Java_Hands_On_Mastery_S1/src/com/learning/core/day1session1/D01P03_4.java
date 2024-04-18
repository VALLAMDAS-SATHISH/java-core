package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int number=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=number;i++) {
			factorial*=i;
			
		}
		System.out.println("Factorial of "+number+" is "+factorial);
	}
}
