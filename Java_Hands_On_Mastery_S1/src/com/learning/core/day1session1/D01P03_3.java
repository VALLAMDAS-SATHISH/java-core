package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks obtained by students: ");
		
		int percentage=sc.nextInt();
		if(percentage>=60) {
			System.out.println("Grade A");
		}else if(percentage>=45) {
			System.out.println("Grade B");
		}else if(percentage>=35) {
			System.out.println("Grade C");
		}else {
			System.out.println("Fail");
		}
		
	}
}
