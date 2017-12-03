package com.vmetry.test;

import java.util.Scanner;

public class ConditionalOperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Value of A");
		a = inputReader.nextInt();
		System.out.println("Enter the Value of B");
		b = inputReader.nextInt();
		c = ((a + b) > b) ? (a + b) : b;
		System.out.println("Which Value (A+B) or B is greater:" + c);

	}

}
