package org.propertiesFileOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		//excel file
		//properties file
		//database - sql
		//testng.xml
		//dataprovider
		
		FileInputStream fis = new FileInputStream("G:\\Acceleration\\May_Batch_Selenium\\propertiesFiles\\TestData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String fName = prop.getProperty("firstName");
		System.out.println(fName);
		System.out.println(prop.getProperty("lastName"));
	}
}