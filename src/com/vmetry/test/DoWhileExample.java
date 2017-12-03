package com.vmetry.test;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Value of i");
		i = inputReader.nextInt();
		System.out.println("Enter the Value of sum");
		sum = inputReader.nextInt();
		do {
			sum += i;
			i++;
			System.out.println(i);
		} while (i <= 5);
		System.out.println("Sum" + sum);
	}

}
