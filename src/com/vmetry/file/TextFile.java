package com.vmetry.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {

	static File fl;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		fl = new File("F:\\Java Files\\File\\Batch7.txt");
		writeData();
		readData();
	}

	public static void readData() throws IOException {
		FileReader fr = new FileReader(fl);
		BufferedReader br = new BufferedReader(fr);
		String data;
		data = br.readLine();
		while ((data) != null) {
			System.out.println(data);
		}
		br.close();

	}

	public static void writeData() throws IOException {
		Scanner inputReader = new Scanner(System.in);
		FileWriter fw = new FileWriter(fl);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("Enter the data you wanna to store.");
		String data;
		data = inputReader.nextLine();
		while (!((data).equals("$"))) {
			bw.write(data);
			bw.newLine();
		}
		bw.close();
		inputReader.close();
	}

}
