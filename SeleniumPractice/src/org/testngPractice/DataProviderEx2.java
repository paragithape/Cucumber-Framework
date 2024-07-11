package org.testngPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx2 {
	@Test(dataProvider="SURAJ")
	public void testMethod(String uName, String password) {
		System.out.println("****");
		System.out.println("Username: "+uName);
		System.out.println("Password: "+password);
		System.out.println("****");
	}
	@DataProvider(name="SURAJ")
	public Object[][] getData123() {
		Object[][] data = new Object[3][2];
		data[0][0] = "11";
		data[0][1] = "22";
		
		data[1][0] = "33";
		data[1][1] = "44";
		
		data[2][0] = "55";
		data[2][1] = "66";
		return data;
	}
}