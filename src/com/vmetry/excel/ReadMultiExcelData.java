package com.vmetry.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultiExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File fl = new File("F:\\Java Files\\Source code\\Selinium Java\\Config Files\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(fl);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);
		int rownum = sheet1.getLastRowNum();
		System.out.println("Total Rows:" + rownum);

		for (int i = 0; i < rownum; i++) {
			System.out.println("RowNum" + sheet1.getLastRowNum());
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data"+(i+1)+":" + data);
			
			
			wb.close();

		}

	}

}
