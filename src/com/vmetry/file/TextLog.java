package com.vmetry.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TextLog {

	static File fl;
	static Logger log;

	static {
		PropertyConfigurator.configure("F:\\Java Files\\Source code\\Selinium Java\\Config Files\\log4j.properties");
		log = Logger.getLogger(TextFile.class.getName());
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		log.debug("File Declared");
		fl = new File("F:\\Java Files\\File\\Batch7.txt");
		log.info("File Instance Instanciated");
		log.warn("Calling Write Data");
		writeData();
		log.warn("Calling Read Data");
		readData();
	}

	public static void readData() throws IOException {
		FileReader fr = new FileReader(fl);
		BufferedReader br = new BufferedReader(fr);
		log.error("Iam in Read data");
		String data;
		while ((data = br.readLine()) != null) {
			System.out.println(data);
		}
		log.warn("Closing Stearm From Read Data");
		br.close();

	}

	public static void writeData() throws IOException {
		Scanner inputReader = new Scanner(System.in);
		FileWriter fw = new FileWriter(fl);
		BufferedWriter bw = new BufferedWriter(fw);
		log.fatal("Iam in Write data");
		System.out.println("Enter the data you wanna to store.");
		String data;
		while (!((data = inputReader.nextLine()).equals("$"))) {
			bw.write(data);
			bw.newLine();
		}
		log.warn("Calling Stream from write data");
		bw.close();
		inputReader.close();
	}

}
