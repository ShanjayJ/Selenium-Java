package com.vmetry.java;

import java.util.Scanner;

public class AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Inputs:");
		a = inputReader.nextInt();
		b = inputReader.nextInt();
		a += b;
		System.out.println("Assignment Addition:" + a);
		a -= b;
		System.out.println("Assignment Subtraction:" + a);
		a *= b;
		System.out.println("Assignment Multiplication:" + a);
		a /= b;
		System.out.println("Assignment Division:" + a);
		a %= b;
		System.out.println("Assignment Modulus:" + a);

	}

}
