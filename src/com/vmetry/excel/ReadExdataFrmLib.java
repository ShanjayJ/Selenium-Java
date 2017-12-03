package com.vmetry.excel;

import com.vmetry.lib.ExcelConfig;

public class ReadExdataFrmLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcelConfig excel = new ExcelConfig("F:\\Java Files\\Source code\\Selinium Java\\Config Files\\TestData.xlsx");
		String data = excel.getdata(1, 0, 0);
		System.out.println(data);

	}

}
