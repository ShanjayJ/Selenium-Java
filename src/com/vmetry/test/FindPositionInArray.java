package com.vmetry.test;

import java.util.Scanner;

public class FindPositionInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[], size = 0, n = 0, find = 0;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		size = inputReader.nextInt();

		a = new int[size];
		System.out.println("Enter the array elements:");

		for (int i = 0; i < a.length; i++) {
			a[i] = inputReader.nextInt();
		}
		System.out.println("Enter the number for which position is to be found");
		n = inputReader.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				find = i + 1;
				break;
			}

		}
		System.out.println("Position of the Number is:" + find);
	}
}
