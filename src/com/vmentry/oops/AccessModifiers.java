package com.vmentry.oops;

public class AccessModifiers {
	private String name, gender;
	final String institute = "Vmetry";
	public int age;
	protected float sal;
	boolean isMarried;

	/*
	 * public AccessModifiers() { institute = "Vmetry"; }
	 */

	public AccessModifiers(String myName, String myGender, int myAge, float mySal, boolean myMarried) {
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
