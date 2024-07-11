package org.autoITAndSikuli;

import java.io.IOException;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoItEx1 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		BaseUtility obj = new BaseUtility();
		obj.startUp("https://demoqa.com/automation-practice-form");
		driver = BaseUtility.driver;
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(2000);
//		ele.click();
		js.executeScript("arguments[0].click();", ele);
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("G:\\Acceleration\\May_Batch_Selenium\\autoIt_Files\\fileUpload_Ex1.exe");
	}
}