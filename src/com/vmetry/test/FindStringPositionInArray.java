package com.vmetry.test;

import java.util.Scanner;

public class FindStringPositionInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		char ch, s;
		int pos = 0;

		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Text Here:");
		str = inputReader.nextLine();
		System.out.println("Enter the string to search");
		s = inputReader.next(".").charAt(0);

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == s) {
				pos = i + 1;
				System.out.println("Postition is:" + pos);
				break;
			}
		}
	}

}
