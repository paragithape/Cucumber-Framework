package org.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementPractice {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
//		WebElement advDownArrow = driver.findElement(By.xpath("//img[@alt='adplus-dvertising']"));
//		advDownArrow.click();
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		
		//following will perform operation on first element
//		driver.findElement(By.cssSelector("#userName-wrapper input")).sendKeys("TEST");
		
		//Multiple webelements
		List<WebElement> multipleNames = driver.findElements(By.cssSelector("#userName-wrapper input"));
		for(int i=0; i <multipleNames.size(); i++) {
			multipleNames.get(i).sendKeys("test");
		}
		
		
//		driver.close();//will close only current instance
//		driver.quit();//will close all instances opened
		System.out.println("Program Ends");
	}
}