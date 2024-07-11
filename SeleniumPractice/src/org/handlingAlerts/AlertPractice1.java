package org.handlingAlerts;

import org.Utilities.BaseUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPractice1 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BaseUtility obj = new BaseUtility();
		obj.startUp("https://demoqa.com/alerts");
		driver = BaseUtility.driver;
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();
		Alert a = driver.switchTo().alert();
		System.out.println("alert text = "+a.getText());
//		Thread.sleep(2000);
		a.sendKeys("This is alert!!!");
		a.accept();
//		a.dismiss();
		
		//second way to handle alert
//		driver.switchTo().alert().getText();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
	}
}