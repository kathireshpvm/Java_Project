package com.jumping.statement;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number.......");
		int i = s.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("value of i = 1");
			break;
		case 2:
			System.out.println("value of i = 2");
			break;
		case 3:
			System.out.println("value of i = 3");
			break;
		case 4:
			System.out.println("value of i = 4");
			break;
		case 5:
			System.out.println("value of i = 5");
			break;
		default:
			System.out.println("Invalid");
			break;
		
		
		}
	}
}
