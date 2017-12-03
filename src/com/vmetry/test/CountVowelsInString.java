package com.vmetry.test;

import java.util.Scanner;

public class CountVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		char ch;
		int count = 0, digits = 0, blanks = 0;

		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Text Here:");
		str = inputReader.nextLine();

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
			} else if (Character.isDigit(ch)) {

				digits++;
			} else if (Character.isSpace(ch)) {

				blanks++;
			}
		}
		System.out.println("Number Of Vowels are:" + count);
		System.out.println("Number of Digits are:" + digits);
		System.out.println("Number of Blank Places are:" + blanks);
	}
}
