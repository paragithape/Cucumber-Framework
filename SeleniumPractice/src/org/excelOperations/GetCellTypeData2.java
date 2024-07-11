package org.excelOperations;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellTypeData2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"G:\\Acceleration\\May_Batch_Selenium\\excelFiles\\NewTestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 = wb.getSheet("CellTypeRows");
			System.out.println(s1);
			int lastRowNumber = s1.getLastRowNum();
//			Row r1 = null;
//			Cell c1 = null;
			int lastCellNum = 0;
			for(int i=0; i<lastRowNumber; i++)
			{
				lastCellNum = s1.getRow(i).getLastCellNum();
				for(int j=0; j<lastCellNum; j++)
				{
					CellType cType = s1.getRow(i).getCell(j).getCellType();
					//System.out.println(cType);
					switch(cType)
					{
						case STRING: System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
						break;
						case NUMERIC: System.out.println(s1.getRow(i).getCell(j).getNumericCellValue());
						break;
						case FORMULA: System.out.println(s1.getRow(i).getCell(j).getCellFormula());
						break;
						case BLANK: System.out.println("This is empty Cell");
						break;
						case BOOLEAN: System.out.println(s1.getRow(i).getCell(j).getBooleanCellValue());
						break;
//						case Date: System.out.println(s1.getRow(i).getCell(j).getDateCellValue());
//						break;
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}