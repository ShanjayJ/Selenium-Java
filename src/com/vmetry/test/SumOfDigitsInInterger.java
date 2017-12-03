package com.vmetry.test;

import java.util.Scanner;

public class SumOfDigitsInInterger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  , m, sum = 0 ;
		
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Integer Number:");
		m = inputReader.nextInt();
		
		while(m > 0)
        {
            n = m % 10;
            m = m / 10;
            sum = sum + n;
        }
	   
		System.out.println("Sum of Digits of the integer is:" +sum);

	}

}
