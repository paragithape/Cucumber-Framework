package org.pageObjectModel;

import org.Utilities.BaseUtility;
import org.openqa.selenium.WebDriver;

public class Ex1 {
	public static WebDriver driver;
	public static void main(String[] args) {
		BaseUtility obj = new BaseUtility();
		obj.startUp("https://www.google.com");
		Ex1.driver = BaseUtility.driver;
		
		GoogleDashboardPage gdPage = new GoogleDashboardPage(driver);
		gdPage.searchText("Test");
		gdPage.printNumberOfLinks();
	}
}