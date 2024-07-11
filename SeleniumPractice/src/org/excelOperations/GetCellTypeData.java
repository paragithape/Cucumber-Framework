package org.excelOperations;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellTypeData {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"G:\\Acceleration\\May_Batch_Selenium\\excelFiles\\NewTestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 = wb.getSheet("CellTypeRows");
			System.out.println(s1);
			Row r1 = s1.getRow(1);
			Cell c1 = r1.getCell(1);
			double cellValue = c1.getNumericCellValue();	//getStringCellValue();
			System.out.println("Cell data[1,1] = "+cellValue);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}