package com.vmetry.test;

import java.util.Scanner;

public class LogicalOperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		boolean and, or, not;
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the value of A:");
		a = S1.nextInt();
		System.out.println("Enter the value of B:");
		b = S1.nextInt();
		System.out.println("Enter the value of c:");
		c = S1.nextInt();
		and = ((a > b) && (a > c));
		or = (a > b || a > c);
		not = !(a > b);
		System.out.println("And:" + and);
		System.out.println("OR:" + or);
		System.out.println("NOT:" + not);

	}

}
