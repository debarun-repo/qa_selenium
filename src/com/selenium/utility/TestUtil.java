package com.selenium.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {

	public static ArrayList<String> getDataFromExcel() throws IOException {
		ArrayList<String> myData = new ArrayList<String>();

		File file = new File("C:\\debarun_workspace\\MySelenium\\src\\com\\selenium\\data\\LoginDetails.xlsx");
		FileInputStream fs = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		for (int i = 2; i <=rowCount; i++) {
			Row row = sheet.getRow(i);
			String name = row.getCell(0).getStringCellValue();
			String password = row.getCell(1).getStringCellValue();
			myData.add(name);
			myData.add(password);

		}
		return myData;
	}

}
