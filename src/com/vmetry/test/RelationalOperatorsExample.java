package com.vmetry.test;

import java.util.Scanner;

public class RelationalOperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Boolean grt, grtEql, less, lessEql, equalTo, notEql;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Value of A");
		a = inputReader.nextInt();
		System.out.println("Enter the Value of B");
		b = inputReader.nextInt();
		grt = a > b;
		grtEql = (a >= b);
		less = (a < b);
		lessEql = (a <= b);
		equalTo = (a == b);
		notEql = (a != b);
		System.out.println("is A Greater than B:" + grt);
		System.out.println("is A Greater than or equal to B:" + grtEql);
		System.out.println("is A Lesser than B:" + less);
		System.out.println("is A Lesser than or equal to B:" + lessEql);
		System.out.println("Is A Equal to B:" + equalTo);
		System.out.println("Is A not equal to B:" + notEql);

	}

}
