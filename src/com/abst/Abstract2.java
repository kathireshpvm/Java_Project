package com.abst;

public class Abstract2 extends Abstract1 {
	
	@Override
	public void Password() {
System.out.println("Ab@123");		
	}
	public static void main(String[] args) {
	Abstract2 a = new Abstract2();
	a.mailId();
	a.Password();
	a.userName();
}
}
