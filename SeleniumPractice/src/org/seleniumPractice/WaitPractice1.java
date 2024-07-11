package org.seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitPractice1 {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicite wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("");
		//login code
		//logout code	//exception because, taking time to load
		//implicite wait
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//login code
		//
		//
		//
		//
		//logout code
		
		
	}
}