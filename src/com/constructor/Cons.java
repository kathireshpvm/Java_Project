package com.constructor;

public class Cons {

	public Cons() {
		this('A');//---.CURRENT CLASS REFERENCE
		System.out.println("Default constructor");
	}
	public Cons(int a) {
		this("Java");
		System.out.println("Number : "+a);
	}
	public Cons(String s) {
		System.out.println("String : "+s);
	}
	public Cons(char c) {
		this(23);
		System.out.println("Character : "+c);
	}

	public static void main(String[] args) {
		Cons c = new Cons();
//		Cons c1 = new Cons(23);
//		Cons c2 = new Cons("Java");
//		Cons c3 = new Cons('M');
	}
}
