package com.vmentry.oops;

public class ThisChildExample extends ThisProfessionalBase{
	String name, gender;
	int age;
	float sal;
	boolean isMarried;

	public ThisChildExample(String org , String desgn,String name,String gender, int age, float mySal, boolean isMarried) {
		// TODO Auto-generated method stud
		super(org, desgn);
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.isMarried = isMarried;
		sal = mySal;

	}

	public void displayBasicDetails() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Gender:" + gender);
		System.out.println("Is Married:" + isMarried);
		System.out.println();
		super.displayProfessionalDetails();
		this.displayProfessionalDetails();

	}
	
	public void displayProfessionalDetails() {
		System.out.println("Salary:" + sal);
	} 
	
	/*public void displayBasicDetails() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Gender:" + gender);
		System.out.println("Is Married:" + isMarried);
		System.out.println();
		displayProfessionalDetails();

	}
	
	public static void displayProfessionalDetails() {
		System.out.println("Salary:" + sal);
	}*/
}

