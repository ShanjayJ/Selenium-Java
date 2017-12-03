package com.vmetry.test;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		age = inputReader.nextInt();
		if ((age > 0) && (age < 10)) {
			System.out.println("He is a child");
		} else if (age >= 10 && age < 20) {
			System.out.println("He is a Beginner");
		} else if (age >= 20 && age < 30) {
			System.out.println("He is a Junior");
		} else if (age >= 30 && age < 40) {
			System.out.println("He is a Adult");
		} else if (age >= 40 && age < 50) {
			System.out.println("He is a Senior.");
		} else if (age >= 50) {
			System.out.println("He is a Super senior.");
		} else {
			System.out.println("Please enter a valid age.");
		}
	}

}
