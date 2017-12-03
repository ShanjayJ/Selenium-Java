package com.vmetry.test;

import java.util.Scanner;

public class FindPersonWithInputUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		String a[];
		String b;
		boolean presence = false;

		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the name to be found:");
		b = inputReader.nextLine();
		System.out.println("Enter the no of names:");
		size = inputReader.nextInt();
		a = new String[size];
		System.out.println("Enter the names");

		for (int i = 0; i < a.length; i++) {

			a[i] = inputReader.nextLine();
		}

		for (int i = 0; i < a.length; i++) {

			if (a[i].equalsIgnoreCase(b)) {
				presence = true;
				break;
			}
		}
		if (presence == true) {
			System.out.println("Person Exists in the account");
		} else {
			System.out.println("This person not present.");
		}

	}

}
