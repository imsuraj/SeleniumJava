package com.datadriventest;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {
	public static void main(String[] args) {
		//get test data from excel
		Xls_Reader reader = new Xls_Reader("/Users/Suraj/JavaProjects/Selenium/src/com/testdata/HalfEbayTestData.xlsx");

		//int rowCount = reader.getRowCount("RegTestData");

		if (!reader.isSheetExist("HomePage")) {

			reader.addSheet("HomePage");
		}
		
		int colCount = reader.getColumnCount("RegTestData");
		System.out.println(colCount);
		
		System.out.println(reader.getCellRowNum("RegTestData", "firstName", "Suraj "));
	}

}
