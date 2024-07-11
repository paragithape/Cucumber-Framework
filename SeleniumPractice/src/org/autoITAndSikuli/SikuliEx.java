package org.autoITAndSikuli;

import java.io.IOException;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class SikuliEx {
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
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		Screen scn = new Screen();
		try {
			scn.find(projectPath+"\\sikuliImages\\fileUploadTextField.PNG");
			Thread.sleep(2000);
			scn.type(projectPath+"\\sikuliImages\\fileUploadTextField.PNG", "G:\\Acceleration\\FileOperations\\Example1.txt");
			Thread.sleep(2000);
			scn.click("G:\\Acceleration\\May_Batch_Selenium\\sikuliImages\\openButton.PNG");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}