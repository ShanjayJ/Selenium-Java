package com.vmetry.test;

import java.util.Scanner;

public class PerformPatternReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Matrix Number");
		n = inputReader.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
