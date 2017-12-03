package com.vmetry.test;

import java.util.Scanner;

public class IfElseConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the value of A:");
		a = S1.nextInt();
		System.out.println("Enter the value of B:");
		b = S1.nextInt();
		if (a > b) {
			System.out.println("A is greater than B.");
		} else {
			System.out.println("B is greater than A.");

		}

	}

}
