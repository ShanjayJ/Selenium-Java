package com.vmetry.test;

import java.util.Scanner;

public class PerformPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Matrix Number");
		n = inputReader.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
