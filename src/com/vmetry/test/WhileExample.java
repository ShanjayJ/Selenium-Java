package com.vmetry.test;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Value of i");
		i = inputReader.nextInt();
		System.out.println("Enter the Value of sum");
		sum = inputReader.nextInt();
		while (i <= 5) {
			sum += i;
			i++;

			System.out.println(i);
		}
		System.out.println("Sum:" + sum);
	}

}
