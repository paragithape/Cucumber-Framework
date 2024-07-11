package org.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		
		WebElement colorMenuDDL = driver.findElement(By.cssSelector("#oldSelectMenu"));
		Select slt = new Select(colorMenuDDL);
//		slt.selectByVisibleText("Voilet");
		slt.selectByValue("8");	//select Indigo
		
		slt.getFirstSelectedOption();//this method returns selected element
		System.out.println("selected option : "+slt.getFirstSelectedOption().getText());
		
//		selectByIndex(5)	//this is assignment
		
		List<WebElement> colorDDLOptions = slt.getOptions();
		for(int i=0; i<colorDDLOptions.size(); i++) {
//			System.out.println(colorDDLOptions.get(i).getText());
			if(colorDDLOptions.get(i).getText().equals("Purple")) {
				slt.selectByVisibleText("Purple");
				System.out.println("selected option : "+slt.getFirstSelectedOption().getText());
				break;
			}
		}
		
		
		
		
		System.out.println("Program Ends");
	}
}