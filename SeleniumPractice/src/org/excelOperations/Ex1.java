package org.excelOperations;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"G:\\Acceleration\\May_Batch_Selenium\\excelFiles\\TestData.xls");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 = wb.getSheet("UserCredentials");
			Row r1 = s1.getRow(0);
			Cell c1 = r1.getCell(0);
			String cellValue = c1.getStringCellValue();
			System.out.println("Cell data[0,0] = "+cellValue);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}