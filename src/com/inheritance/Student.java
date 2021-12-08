package com.inheritance;

public class Student extends Dept {

	public void stuName() {
		System.out.println("kathiresh");
	}

	public void stuId() {
		System.out.println("26");
	}

public static void main(String[] args) {
	Student s = new Student();
			s.collegeName();
	s.collegeCode();
	s.collegeRank();
	s.stuName();
	s.stuId();
	s.hostelName();
	s.deptName();
}
}
