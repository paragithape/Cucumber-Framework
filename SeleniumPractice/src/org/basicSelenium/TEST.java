package org.basicSelenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST {

	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		driver.findElement(By.xpath("//div[@class='_3OO5Xc']/input")).sendKeys("Iphone 11");
		driver.findElement(By.xpath("//div[@class='col-12-12 _2oO9oE']/button/*")).click();
		Thread.sleep(5000);
		boolean visible = driver.findElement(By.xpath("//span[text()='Next']")).isDisplayed();
//		WebDriverWait wait = new WebDriverWait(driver, 30);

		while (visible == true)
		{
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_2MImiq']/nav/a[@class='_1LKTO3']")));
			List<WebElement> list = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			System.out.println("000000");
			System.out.println(visible);
			int size = list.size();
			for (int i=0; i<size;i++)
			{
				try {
					System.out.println(driver.findElements(By.xpath("//div[@class='_4rR01T']")).get(i).getText());
					System.out.println(driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).get(i).getText());
				} catch (StaleElementReferenceException e) {
					driver.navigate().refresh();
					System.out.println(driver.findElements(By.xpath("//div[@class='_4rR01T']")).get(i).getText());
					System.out.println(driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).get(i).getText());
				}
				size = driver.findElements(By.xpath("//div[@class='_4rR01T']")).size();
			}
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
	}
}
