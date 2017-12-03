package com.vmetry.test;

import java.io.InputStreamReader;
import java.util.Scanner;

public class SumOfEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int sum = 0; for (int i = 0; i <= 100; i += 2) { System.out.println(i); sum
		 * += i;
		 * 
		 * } System.out.println("SUM is:" + sum);
		 */

		int n, sum = 0;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Number:");
		n = inputReader.nextInt();
		evenNum(n);
		evenSum(n);

	}

	public static void evenNum(int x) {
		for (int i = 2; i <= x; i += 2) {
			System.out.println();
			System.out.print(i);
		}
	}

	public static void evenSum(int x) {
		int sum = 0;
		for (int i = 0; i <= x; i += 2) {
			sum += i;
		}
		System.out.println(" ");
		System.out.println("Sum:" + sum);
	}
}
