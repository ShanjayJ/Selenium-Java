package com.vmetry.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	static File fl;
	static Properties prop;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		fl = new File("F:\\Java Files\\File\\Batch7.properties");
		prop = new Properties();
		writedata();
		readdata();

	}

	public static void readdata() throws IOException {
		FileInputStream fis = new FileInputStream(fl);
		prop.load(fis);
		System.out.println("Name:" + prop.getProperty("Name"));
		System.out.println("Age:" + prop.getProperty("Age"));
		System.out.println("Gender:" + prop.getProperty("Gender"));
		System.out.println("Native:" + prop.getProperty("Native"));
		System.out.println("Salary:" + prop.getProperty("Salary"));

	}

	public static void writedata() throws IOException {
		FileOutputStream fos = new FileOutputStream(fl);
		prop.setProperty("Name", "Shanjay");
		prop.setProperty("Age", "25");
		prop.setProperty("Gender", "Male");
		prop.setProperty("Native", "Chennai");
		prop.setProperty("Salary", "30000.00");
		prop.store(fos, "Written by Sanjay");
		System.out.println("Data Written Sucessfully");

	}

}
