package com.vmentry.oops;

public class BioConstructor {

	String name, gender, institute;
	int age;
	float sal;
	boolean isMarried;

	public BioConstructor() {
		institute = "Vmetry";
	}

	public BioConstructor(String myName, String myGender, int myAge, float mySal, boolean myMarried) {

		this();
		name = myName;
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
		System.out.println("Institute:" + institute);
		System.out.println();

	}

}
