package org.seleniumPractice;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) throws InterruptedException {
		BaseUtility obj = new BaseUtility();
//		obj.startUp("https://www.google.com");
////		Thread.sleep(5000);
//		WebDriverWait wait = new WebDriverWait(BaseUtility.driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		
		//now go to facebook
		obj.startUp("https://www.facebook.com");
		WebDriverWait wait = new WebDriverWait(BaseUtility.driver, 30);
		//code for username, password and click login button
		
		//wait for getting profile image
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("profile object")));
		BaseUtility.driver.findElement(By.xpath("profile object")).click();
		
		BaseUtility.driver.findElement(By.xpath(""));
		
	}
}
//Thread.sleep(2000)
//create separate methods for multiple wait