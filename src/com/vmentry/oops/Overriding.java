package com.vmentry.oops;

import java.util.Scanner;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, addr, workingloc;
		int age;
		float sal;
		boolean married;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Name:");
		name = inputReader.nextLine();
		System.out.println("Enter the Address:");
		addr = inputReader.nextLine();
		System.out.println("Enter the Working Location:");
		workingloc = inputReader.nextLine();
		System.out.println("Enter the Age:");
		age = inputReader.nextInt();
		System.out.println("Enter the Salary:");
		sal = inputReader.nextFloat();
		System.out.println("Enter the Marital Status:");
		married = inputReader.nextBoolean();
		OverrideChild child = new OverrideChild(name, age, sal, married, addr, workingloc);
		child.displayData();
//		 OverrideParent parent = new OverrideChild(name, age, sal, married, addr,
//		 workingloc);
//		parent.displayparentData();

	}

}
