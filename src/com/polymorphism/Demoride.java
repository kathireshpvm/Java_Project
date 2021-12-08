package com.polymorphism;

public class Demoride extends Demo{
	
	@Override
	public void property(String pro) {
		super.property("chips");   //parent class reference
		System.out.println("Child Property : "+pro);
	}
public static void main(String[] args) {
	
	//Demoride d = new Demoride();
	//d.property("toys");
	
	Demo d = new Demoride();  //upcasting
	d.property("land");
	
	//Demoride d =(Demoride) new Demo();  //downcasting
	//d.property("car");
}
}
