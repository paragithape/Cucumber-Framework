package org.basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("google is launched");
		driver.navigate().to("https://demoqa.com/tool-tips");
		System.out.println("demoqa is launched");
		
		driver.navigate().back();
		System.out.println("Navigated back to google");
		
		driver.navigate().forward();
		System.out.println("Navigated to demoQA site again");
		
		driver.navigate().refresh();
		System.out.println("page is refreshed");
	}
}