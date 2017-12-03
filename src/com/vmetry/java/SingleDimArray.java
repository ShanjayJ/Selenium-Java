package com.vmetry.java;

import java.util.Scanner;

public class SingleDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[], size , sum = 0;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		size = inputReader.nextInt();
		
		a = new int[size];
		System.out.println("Enter the array elements:");
		
		
		for (int i = 0; i < a.length; i++) {
			a[i] = inputReader.nextInt();
		}
		
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Sum:" + sum);

	}

}
