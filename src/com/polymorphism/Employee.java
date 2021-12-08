package com.polymorphism;

public class Employee {

	public void employee_Details() {
		System.out.println("Employee Details");

	}
	public void employee_Details(String myname,String wifename) {            //Datatype count
		System.out.println("Employee name is :"+myname+" "+wifename);       //concatenation

	}
	public void employee_Details(int age,double salary) {			   //datatype order		
		System.out.println("Employee age is :"+age);
		System.out.println("Employee salary is :"+salary);

	}
	public void employee_Details(char initial) {                         //datatype
		System.out.println("Employee initial is :"+initial);

	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.employee_Details();
		e.employee_Details("Kathiresh", "menaga");
		e.employee_Details(29, 15000);
		e.employee_Details('M');
	}
}
