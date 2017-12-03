package com.vmetry.java;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][], rows = 0, cols = 0, sum = 0;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Total Rows");
		rows = inputReader.nextInt();
		System.out.println("Enter the Total columns");
		cols = inputReader.nextInt();

		a = new int[rows][cols];
		System.out.println("Enter the array elements:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = inputReader.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum += a[i][j];
			}
		}
		System.out.println("Sum:" + sum);
		System.out.println("Array Size:" + a.length);

	}

}
