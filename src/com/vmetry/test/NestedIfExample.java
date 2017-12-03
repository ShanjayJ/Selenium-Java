package com.vmetry.test;

import java.util.Scanner;

public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the value of A:");
		a = S1.nextInt();
		System.out.println("Enter the value of B:");
		b = S1.nextInt();
		System.out.println("Enter the value of c:");
		c = S1.nextInt();
		if (a > b && a > c) {
			System.out.println("A is greater.");
		} else if (b > a && b > c) {
			System.out.println("B is greater:");
		} else {
			System.out.println("C is greater.");
		}

	}

}
