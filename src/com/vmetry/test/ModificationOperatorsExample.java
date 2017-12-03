package com.vmetry.test;

import java.util.Scanner;

public class ModificationOperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, a, b, c, d;
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the value of I:");
		i = S1.nextInt();
		a = ++i;
		b = i++;
		c = --i;
		d = i--;
		System.out.println("Pre Increment:" + a);
		System.out.println("POST Increment:" + b);
		System.out.println("Pre Decrement:" + c);
		System.out.println("Post Decrement:" + d);

	}

}
