package org.excelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelEx1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"G:\\Acceleration\\May_Batch_Selenium\\excelFiles\\NewTestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 = wb.getSheet("WriteOperation");
			s1.getRow(1).createCell(3).setCellValue("PASS");
			FileOutputStream fos = new FileOutputStream(
					"G:\\Acceleration\\May_Batch_Selenium\\excelFiles\\NewTestData.xlsx");
			wb.write(fos);
			fos.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}