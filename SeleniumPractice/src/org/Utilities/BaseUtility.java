package org.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtility {
	public static WebDriver driver;
	public void startUp(String url) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	public void checkFramePresentAndSwitch(String xpath) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
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
//	public WebDriver startUp(String url) {
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path: "+projectPath);
//		
//		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get(url);
//		return driver;
//	}
}
//BaseUtility obj = new BaseUtility();
//obj.startUp("https://www.google.com");
//obj.addition(10,20);