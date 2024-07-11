package org.testngPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {
	@Test(dataProvider="getData")
	public void testMethod(String uName, String password) {
		System.out.println("****");
		System.out.println("Username: "+uName);
		System.out.println("Password: "+password);
		System.out.println("****");
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "10";
		data[0][1] = "adminPWD";
		
		data[1][0] = "username1";
		data[1][1] = "password1";
		
		data[2][0] = "First123";
		data[2][1] = "Pass@123";
		return data;
	}
}
//excel
//properties file
//sql
//dataprovider
//parameters in testng file
//jenkins