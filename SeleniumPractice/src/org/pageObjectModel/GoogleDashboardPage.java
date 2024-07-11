package org.pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class GoogleDashboardPage {
	WebDriver driver;
//		WebElement srcField=driver.findElement(By.xpath("//input[@title='Search']"));
	//Page Object Model
	@FindBy(xpath="(//input[@type='submit'][@aria-label='Google Search'])[2]")
	private WebElement searchBtn;
	
	@FindBy(css = "input[title='Search']")
	private WebElement searchField;
	
	@FindBys(@FindBy(xpath = "//a[@class='gb_f']"))
	private List<WebElement> linkOnPage;
	
	public WebElement getSearchBtn() {
		searchBtn.click();
		return searchBtn;
	}
	public void searchText(String s) {
		searchField.sendKeys(s);
	}
	public void printNumberOfLinks()
	{
		printAllTextFromList(linkOnPage, "Links");
//		System.out.println("number of links = "+linkOnPage.size());
//		for(int i=0; i <linkOnPage.size(); i++) {
//			System.out.println(linkOnPage.get(i).getText());
//		}
	}
	public void printAllTextFromList(List<WebElement> obj, String text)
	{
		System.out.println("number of "+text+" = "+obj.size());
		for(int i=0; i <obj.size(); i++) {
			System.out.println(text+" : "+obj.get(i).getText());
		}
	}
	public GoogleDashboardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
//		PageFactory.initElements(driver, GoogleDashboardPage.class);
	}
}