package com.vmentry.oops;

public class InheritanceParent {
	public String name;
	private int age;
	protected float sal;
	boolean isMarried;

	public InheritanceParent(String pName, int pAge, float pSal, boolean pisMarried) {
		name = pName;
		age = pAge;
		sal = pSal;
		isMarried = pisMarried;

	}

	protected void displayParentData() {
		System.out.println("NAME:" + name);
		System.out.println("AGE" + age);
		System.out.println("SALARY:" + sal);
		System.out.println("isMarried" + isMarried);

	}

}
