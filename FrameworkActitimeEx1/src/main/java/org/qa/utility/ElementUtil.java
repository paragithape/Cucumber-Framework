package org.qa.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	public static ElementUtil eu = new ElementUtil();
	public void waitForPageLoad(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(new ExpectedCondition<Boolean>()
	    {
	        public Boolean apply(WebDriver wdriver)
	        {
	            return ((JavascriptExecutor) driver).executeScript(
	                "return document.readyState").equals("complete");
	        }
	    });
		
	    /*Wait<WebDriver> wait = new WebDriverWait(driver, 30);
	    wait.until(new Function<WebDriver, Boolean>() {
	        public Boolean apply(WebDriver driver) {
	            System.out.println("Current Window State       : "
	                + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
	            return String
	                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
	                .equals("complete");
	        }
	    });*/
	}
}
