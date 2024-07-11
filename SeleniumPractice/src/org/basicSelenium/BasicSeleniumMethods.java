package org.basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumMethods {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		
		String title = driver.getTitle();
		System.out.println("Title = "+title);
		if(title.equals("ToolsQA")) {
			System.out.println("Title matches!!");
		} else {
			System.out.println("Title is not matching.");
		}
		
		String currUrl = driver.getCurrentUrl();
		System.out.println("Current URL : "+currUrl);
		
		WebElement noBtn = driver.findElement(By.xpath("//label[text()='No']/preceding::input[1]"));
		String value = noBtn.getAttribute("class");
		if(value.endsWith("disabled")) {
			System.out.println("No button is disabled.");
		} else {
			System.out.println("No button is NOT disabled.");
		}
	}

}
