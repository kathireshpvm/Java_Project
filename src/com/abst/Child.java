package com.abst;

public class Child implements Interface1,Interface2 {

	@Override
	public void person3() {
		System.out.println("kathir");
		
	}

	@Override
	public void person4() {
		System.out.println("menaga");
		
	}

	@Override
	public void person1() {
		System.out.println("dhiya");
		
	}

	@Override
	public void person2() {
		System.out.println("sree");
		
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.person1();
		c.person2();
		c.person3();
		c.person4();
		
		}

}
