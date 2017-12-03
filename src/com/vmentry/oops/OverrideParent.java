package com.vmentry.oops;

public class OverrideParent {
	public String name;
	public final String org = "AON";
	private int age;
	protected float sal;
	boolean isMarried;

	public OverrideParent(String pName, int pAge, float pSal, boolean pisMarried) {
		name = pName;
		age = pAge;
		sal = pSal;
		isMarried = pisMarried;

	}

	protected void displayData() {
		System.out.println("Organization:" + org);
		System.out.println("NAME:" + name);
		System.out.println("AGE" + age);
		System.out.println("SALARY:" + sal);
		System.out.println("isMarried" + isMarried);

	}

}
