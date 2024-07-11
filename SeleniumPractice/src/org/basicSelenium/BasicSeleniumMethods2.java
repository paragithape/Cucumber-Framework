package org.basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumMethods2 {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		
		driver.findElement(By.cssSelector("#yesRadio")).click();
		WebElement selectedAnswer = driver.findElement(By.cssSelector(".text-success"));
		String text = selectedAnswer.getText();
		System.out.println("Selected Radio button is : "+text);
	}

}
