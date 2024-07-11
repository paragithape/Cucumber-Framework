package org.basicSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#windowButton")).click();
		System.out.println("\"This is test\"");
		driver.findElement(By.xpath("//button[@id='windowButton']"));
		
		String parentWin = driver.getWindowHandle();
		System.out.println(" Window id = "+parentWin);
		
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("number of windows : "+allWinIds.size());
		
		Iterator<String> itr = allWinIds.iterator();
		
		String parentWin_1 = itr.next();
		if(parentWin.equals(parentWin_1)) {
			System.out.println("Parent window id matching");
		} else {
			System.out.println("Parent window id NOT matching");
		}
		
		String childWinId = itr.next();
		System.out.println("Child win id = "+childWinId);
		driver.switchTo().window(childWinId);	// to switch on child window
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text present on child window : "+text);
		driver.close();		//this will close only child window
		
		driver.switchTo().window(parentWin);
		driver.close();
		//if you don't want to write close() 2 times then use driver.quit()
	}
}