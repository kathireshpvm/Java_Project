package com.scanner.concept;

import java.util.Scanner;

public class Scanner_Class {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String1....");
		String nextLine = s.nextLine();
		System.out.println(nextLine);
		
		
		System.out.println("Enter the String....");
		String next = s.next();
		System.out.println(next);
		
		System.out.println("Enter the Number....");
		int nextInt = s.nextInt();
		System.out.println(nextInt);
		
		System.out.println("Enter the Decimal value");
		float nextFloat = s.nextFloat();
		System.out.println(nextFloat);
		
			}
}
