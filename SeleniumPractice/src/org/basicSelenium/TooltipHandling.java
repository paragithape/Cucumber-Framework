package org.basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipHandling {

	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		Thread.sleep(2000);
		WebElement hoverMeBtn = driver.findElement(By.id("toolTipButton"));
		
		Actions act = new Actions(driver);
		act.moveToElement(hoverMeBtn).perform();
		Thread.sleep(2000);
		String tooltip = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		System.out.println("Tooltip = "+tooltip);
//		act.clickAndHold(hoverMeBtn).moveToElement(hoverMeBtn).release().build().perform();
	}
}
//isDisplayed()
//isEnabled()
//isSelected()