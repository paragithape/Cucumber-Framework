package org.handlingAlerts;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPractice2 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BaseUtility obj = new BaseUtility();
		obj.startUp("https://demoqa.com/alerts");
		driver = BaseUtility.driver;
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.alertIsPresent());
		AlertPractice2 obj1 = new AlertPractice2();
		if(obj1.isAlertPresent())
		{
			//second way to handle alert
			String alertText = driver.switchTo().alert().getText();
			System.out.println("Alert Text = "+alertText);
			driver.switchTo().alert().accept();
		}
	}
	public boolean isAlertPresent() {
		boolean flag= false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			flag = true;
		} catch(Exception e) {
//			flag=false;
		}
		return flag;
	}
}