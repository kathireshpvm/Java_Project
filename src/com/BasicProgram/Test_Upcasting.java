package com.BasicProgram;

public class Test_Upcasting extends Test_Up {
	public void mul() {
System.out.println("Multiplication");
	}
@Override
public void add() {
	super.add();
	System.out.println("Modified");
}
public static void main(String[] args) {
	Test_Up tp = new Test_Upcasting();
	tp.add();
	tp.sub();
}
}
