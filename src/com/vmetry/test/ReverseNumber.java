package com.vmetry.test;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		n = S1.nextInt();
		doReverse(n);

	}

	public static void doReverse(int x) {
		for (int i = x; i >= 1; i--) {
			System.out.println();
			System.out.print(i);

		}
		System.out.println();
	}

}