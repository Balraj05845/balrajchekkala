package com.vtiger.genericUtilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelFileUtility { //excel fetching data

	public String readDataFromExcell(String sheetName,int rowNum,int cellNum) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL 5290\\eclipse-workspace\\hybrid\\src\\test\\resources\\balu.testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	
}
