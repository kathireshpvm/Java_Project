package com.jumping.statement;

public class Jumping {
	public static void main(String[] args) {
		
		for (int i = 1; i <=20; i++) {
			//System.out.println(i);   12 also print in break
			if (i==12) {
				break;	// Break OR Continue			
			}
			System.out.println(i);
		}
	}
}
