package org.excelOperations;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NoOfRowsCells {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"G:\\Acceleration\\May_Batch_Selenium\\excelFiles\\TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 = wb.getSheet("UserCredentials");
			int noOfRows = s1.getLastRowNum();
//			s1.getPhysicalNumberOfRows();
			System.out.println("Number of Rows = "+noOfRows);
			int noOfColumns = s1.getRow(noOfRows).getLastCellNum();
//			s1.getRow(noOfRows).getPhysicalNumberOfCells();
			System.out.println("Number of Columns in Last row = "+noOfColumns);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}