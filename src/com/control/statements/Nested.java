package com.control.statements;

public class Nested {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(i + " "); // j,print
			}
			System.out.println();
		}
	}
}
// matrix fromat 
//1 2 3
//1 2 3
//1 2 3