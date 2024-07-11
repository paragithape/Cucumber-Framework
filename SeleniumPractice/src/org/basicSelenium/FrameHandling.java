package org.basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		Thread.sleep(2000);
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text = "+text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text = "+text);
		
		driver.switchTo().defaultContent();
	}
}