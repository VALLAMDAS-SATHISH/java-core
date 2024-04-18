package com.learning.core.day1session2;

import java.util.Scanner;

public class D01P04_1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Accepting user input
		System.out.print("Enter two numbers in the range 1 to 40 seprated by spaces: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		// Defining array
		int[] array= {7,25,5,19,30};
		// checking for bingo
		boolean foundNum1=false;
		boolean foundNum2=false;
		for(int i=0;i<array.length;i++) {
			if(array[i]==num1) {
              foundNum1=true;
			}
			if(array[i]==num2) {
				foundNum2=true;
			}
		}
		//Display the result
		if(foundNum1 && foundNum2) {
			System.out.println("Bingo");
		}else {
			System.out.println("Not Found ");
		}
	}
	

}
