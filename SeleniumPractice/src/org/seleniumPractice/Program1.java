package org.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		System.out.println("Program Ends");
		
		driver.findElement(By.xpath("//*[@aria-label='Search']")).sendKeys("Test");
		
//		driver.close();//will close only current instance
//		driver.quit();//will close all instances opened
	}
}