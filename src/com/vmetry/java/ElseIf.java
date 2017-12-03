package com.vmetry.java;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Age:");
		age = inputReader.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible to Vote.");
		} else {
			System.out.println("You are not eligibile to Vote.");
		}

	}

}
