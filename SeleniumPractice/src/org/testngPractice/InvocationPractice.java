package org.testngPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationPractice {
	@Test(invocationCount=3, threadPoolSize = 2)
	public void testMethod() {
		System.out.println("Test method");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.close();
	}
//	@Test(invocationCount=3)//, threadPoolSize = 5)
//	public void testMethod() {
//		System.out.println("Test method");
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path: "+projectPath);
//
//		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com");
//	}
}
