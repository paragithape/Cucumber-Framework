package org.seleniumPractice;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UseBaseUtility
{
//	public static WebDriver driver;
//	public static void main(String[] args)
//	{
//		BaseUtility obj = new BaseUtility();
//		driver = obj.startUp("https://www.google.com");
//		driver.findElement(By.xpath("//*[@aria-label='Search']")).sendKeys("Test");
//	}
	
	//another way
//	public static WebDriver driver;
	public static void main(String[] args)
	{
		BaseUtility obj = new BaseUtility();
		obj.startUp("https://www.google.com");
//		driver = BaseUtility.driver;
		BaseUtility.driver.findElement(By.xpath("//*[@aria-label='Search']")).sendKeys("Test");
	}
}
