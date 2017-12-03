package com.vmetry.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
    
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class:");
	}
	
	
	public void method2() {
		System.out.println("Method2:");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite:");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class:");
	}
	
	@Test
	public void testCase1() {
		System.out.println("TestCase 1:");
		method2();
	}
	

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method:");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite:");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test:");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test Case 2:");
		method1();
	}
	
	public void method1() {
		System.out.println("Method 1:");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test:");
	}
}
