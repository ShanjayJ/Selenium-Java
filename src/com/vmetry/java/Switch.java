package com.vmetry.java;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter Your Val:");
		val = inputReader.nextLine();
		switch (val) {
		case ("a"):
		case ("A"):
			System.out.println("It is a vowel.");
			break;
		case "e":
		case "E":
			System.out.println("It is a vowel.");
			break;
		case "i":
		case "I":
			System.out.println("It is a vowel.");
			break;
		case "o":
		case "O":
			System.out.println("It is a vowel.");
			break;
		case "u":
		case "U":
			System.out.println("It is a vowel.");
			break;

		default:
			System.out.println("It is not a vowel.");
			break;
		}

	}

}
