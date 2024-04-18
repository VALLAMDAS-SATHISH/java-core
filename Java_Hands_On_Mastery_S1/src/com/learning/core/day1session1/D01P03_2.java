package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03_2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number betweeb 1 to 7 a day of the week:");
		int dayNum=sc.nextInt();
		
			if(dayNum==1) {
				System.out.println("Monday");
			}else if(dayNum==2) {
				System.out.println("Tuesday");
			}else if(dayNum==3) {
				System.out.println("Wednesday");
			}else if(dayNum==4) {
				System.out.println("Thrusday");
			}else if(dayNum==5) {
				System.out.println("Friday");
			}else if(dayNum==6) {
				System.out.println("Saturday");
			}else if(dayNum==7) {
				System.out.println("Sunday");
			}
			else {
				System.out.println("Invalid Input");
			}
		}
	}

