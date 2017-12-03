package com.vmentry.oops;

public class bio {
	String name, gender;
	int age;
	float sal;
	boolean isMarried;

	public void setData(String myGender, int myAge, float mySal, boolean myMarried) {
		// TODO Auto-generated method stud
		gender = myGender;
		age = myAge;
		sal = mySal;
		isMarried = myMarried;

	}

	public void displayData() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Gender:" + gender);
		System.out.println("Salary:" + sal);
		System.out.println("Is Married:" + isMarried);
		System.out.println();

	}
}
