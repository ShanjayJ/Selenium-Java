package com.vmetry.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDateExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File fl = new File("F:\\Java Files\\Source code\\Selinium Java\\Config Files\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(fl);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0)		;
		
		String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data1);
		
        String data2 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data2);
		
		wb.close();
		
	}

}
