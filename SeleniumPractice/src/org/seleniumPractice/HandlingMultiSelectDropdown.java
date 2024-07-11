package org.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		
		WebElement colorMenuDDL = driver.findElement(By.cssSelector("#cars"));
		Select slt = new Select(colorMenuDDL);
		//we don't have selectAll method
		List<WebElement> multiSel = slt.getOptions();
		for(int i=0; i<multiSel.size(); i++) {
			slt.selectByIndex(i);
		}
		
		slt.deselectAll();
//		slt.deselectByIndex(1);
//		slt.deselectByValue("audi");
//		slt.deselectByVisibleText("Opel");
		
		
//		slt.selectByVisibleText("Volvo");
//		slt.selectByVisibleText("Audi");
	}
}