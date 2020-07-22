package com.test.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.excel.utility.Xls_Reader;

public class TestUtil {

static String projectPath = System.getProperty("user.dir");
	
	public static String TESTDATA_SHEET_PATH = projectPath+"/src/com/testdata/testdata1.xlsx";

	static Workbook book;
	static Sheet sheet;
	static Xls_Reader reader;


	
	//do not use this method
	public static ArrayList<Object[]>  getDataFromExcel(){
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader(TESTDATA_SHEET_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int rowNum = 2; rowNum  <= reader.getRowCount("RegTestData"); rowNum++) {
			
			String firstName 		= reader.getCellData("RegTestData", "firstName", rowNum);
			String lastName  		= reader.getCellData("RegTestData", "lastName", rowNum);
			String address1  		= reader.getCellData("RegTestData", "address1", rowNum);
			String address2  		= reader.getCellData("RegTestData", "address2", rowNum);
			String city 	 		= reader.getCellData("RegTestData", "city", rowNum);
			String state	 		= reader.getCellData("RegTestData", "state", rowNum);
			String zipcode 	 		= reader.getCellData("RegTestData", "zipcode", rowNum);
			String dayphone1 		= reader.getCellData("RegTestData", "dayphone1", rowNum);
			String dayphone2 		= reader.getCellData("RegTestData", "dayphone2", rowNum);
			String dayphone3 		= reader.getCellData("RegTestData", "dayphone3", rowNum);
			String dayphone4 		= reader.getCellData("RegTestData", "dayphone4", rowNum);
			String emailAddress 	= reader.getCellData("RegTestData", "emailAddress", rowNum);
////			String userid 			= reader.getCellData("RegTestData", "userid", rowNum);
////			String PASSWORD 		= reader.getCellData("RegTestData", "PASSWORD", rowNum);
			String SECRET_ANSWER 	= reader.getCellData("RegTestData", "SECRET_ANSWER", rowNum);
			String birthdate2 		= reader.getCellData("RegTestData", "birthdate2", rowNum);
			String birthdate1 		= reader.getCellData("RegTestData", "birthdate1", rowNum);
			String birthdate3 		= reader.getCellData("RegTestData", "birthdate3", rowNum);
			
			Object ob[] = {firstName,lastName,address1,address2,city, state, zipcode, dayphone1, dayphone2, dayphone3, dayphone4, emailAddress,
				 SECRET_ANSWER, birthdate2, birthdate1, birthdate3};
			
			myData.add(ob);
		}
		return myData;
	}






	
	//this one is naveen way
	public static Object[][] getTestData(String sheetName)  {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//		System.out.println(sheet.getLastRowNum() + "--------" +
//		sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				//System.out.println(data[i][k]);
			}
		}
		return data;
	}
	


}

