package com.vmetry.test;

import java.util.Scanner;

public class IfConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sal;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Value of Salary");
		sal = inputReader.nextInt();
		if (sal >= 25000.00) {
			System.out.print("You are eligible for the new Credit card.");
			System.out.println("Your request has been accepted");

		}

	}

}
