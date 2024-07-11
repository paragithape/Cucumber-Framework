package org.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownWithoutSelect {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		
		driver.findElement(By.xpath("//div[@id='withOptGroup']//input")).sendKeys("Group 1, option 2",Keys.TAB);
		
		System.out.println("Program Ends");
	}
}