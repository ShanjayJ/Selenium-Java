package com.vmetry.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public ExcelConfig(String excelpath) {
		// TODO Auto-generated constructor stub

		try {
			File fl = new File(excelpath);

			fis = new FileInputStream(fl);

			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}
	}
	
	public String getdata (int sheetnum , int row ,int column) {
		sheet1 = wb.getSheetAt(sheetnum);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}

}
