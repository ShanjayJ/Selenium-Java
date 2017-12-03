package com.vmetry.java;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender;
		int age;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter Your Gender:");
		System.out.println("Enter the Age:");
		gender = inputReader.nextLine();
		age = inputReader.nextInt();
		if (gender.equalsIgnoreCase("Male") && age >= 60) {
			System.out.println("You are eligible for the discount.");
			System.out.println("Have a safe journey Sir.");
		} else if (gender.equalsIgnoreCase("Female") && age >= 58) {
			System.out.println("you are eligible for discount");
			System.out.println("Have a safe journey Mam.");
		} else {
			System.out.println("You are not eligible for Discount. Ordinary Customer");

		}

	}

}
