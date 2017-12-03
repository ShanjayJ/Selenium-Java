package com.vmetry.java;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		boolean and, or, not;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the inputs:");
		a = inputReader.nextInt();
		b = inputReader.nextInt();
		c = inputReader.nextInt();
		and = (a > b) && (a < c);
		or = (a == b) || (b > c);
		not = !(c == b);
		System.out.println("AND:" + and);
		System.out.println("OR:" + or);
		System.out.println("NOT:" + not);
	}

}
