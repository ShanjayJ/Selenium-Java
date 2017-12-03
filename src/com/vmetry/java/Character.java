package com.vmetry.java;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char val;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter Your Val:");
		val = inputReader.next(".").charAt(0);
		System.out.println("VAL:" + val);
		switch (val) {
		case ('a'):
		case ('A'):
			System.out.println("It is a vowel.");
			break;
		case 'e':
		case 'E':
			System.out.println("It is a vowel.");
			break;
		case 'i':
		case 'I':
			System.out.println("It is a vowel.");
			break;
		case 'o':
		case 'O':
			System.out.println("It is a vowel.");
			break;
		case 'u':
		case 'U':
			System.out.println("It is a vowel.");
			break;

		default:
			System.out.println("It is not a vowel.");
			break;
		}

	}

}
