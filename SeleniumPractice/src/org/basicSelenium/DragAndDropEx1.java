package org.basicSelenium;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDropEx1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		WebElement src = driver.findElement(By.xpath("//div[@id='todrag']//span[3]"));
		WebElement des = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
                + "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
                + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
                + "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
                + "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
                + "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
                + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
                + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
                + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
                + "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
                + "var dropEvent = createEvent('drop');\n"
                + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
                + "var dragEndEvent = createEvent('dragend');\n"
                + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
                + "var source = arguments[0];\n" + "var destination = arguments[1];\n"
                + "simulateHTML5DragAndDrop(source,destination);", src, des);
	}
}
		
		
//		new Actions(driver).dragAndDrop(src, des).release().build().perform();
//	    Robot robot = new Robot();
//	    robot.keyPress(KeyEvent.VK_ESCAPE);
//	    robot.keyRelease(KeyEvent.VK_ESCAPE);
		
//		Actions act = new Actions(driver);
//		act.clickAndHold(src).pause(2000).moveToElement(des).release().build().perform();
		
		
//		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", src);
//		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", des);
//		src.click();
//		des.click();
//		Actions act = new Actions(driver);
		
//		int x = 50;//des.getLocation().x;
//        int y = 50;//des.getLocation().y;
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(src)
//                .pause(Duration.ofSeconds(1))
//                .clickAndHold(src)
//                .pause(Duration.ofSeconds(1))
//                .moveByOffset(x, y)
//                .moveToElement(des)
//                .moveByOffset(x,y)
//                .pause(Duration.ofSeconds(1))
//                .release().build().perform();
		
		
		
//		act.dragAndDrop(src, des).build().perform();
		
//		js.executeScript("$(arguments[0]).simulate('drag-n-drop',{dragTarget:arguments[1],interpolation:{stepWidth:100,stepDelay:50}});", src, des);
		
//		javaScript = javaScript + "arguments[0].simulateDragDrop({ dropTarget: arguments[1] });";
//		js.executeScript("arguments[0].simulateDragDrop({ dropTarget: arguments[1] });",src,des);
		
//		js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
//                + "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
//                + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
//                + "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
//                + "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
//                + "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
//                + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
//                + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
//                + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
//                + "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
//                + "var dropEvent = createEvent('drop');\n"
//                + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
//                + "var dragEndEvent = createEvent('dragend');\n"
//                + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
//                + "var source = arguments[0];\n" + "var destination = arguments[1];\n"
//                + "simulateHTML5DragAndDrop(source,destination);", src, des);
		
		
//		act.contextClick(des).perform();
		
//		int x=des.getLocation().getX();
//		int y=des.getLocation().getY();
//		System.out.println("x= "+x+" and y = "+y);
////		des.click();
//		Thread.sleep(2000);
		
//		act.dragAndDropBy(src, 100, 100).build().perform();
//		act.click();
//		act.dragAndDrop(src, des).build().perform();
//		act.clickAndHold(src).moveToElement(des).release().build().perform();

//		System.out.println("des is displayed : "+des.isDisplayed());

//		act.moveToElement(src).pause(Duration.ofSeconds(5)).moveByOffset(50, 50)
//		act.clickAndHold(src)//.pause(Duration.ofSeconds(5))//.moveByOffset(100, 50)
//		.moveToElement(des)//.pause(Duration.ofSeconds(5))
//		.release().build().perform();
		
//		Actions builder = new Actions(driver);
//		Action dragAndDrop =
//		builder.clickAndHold(src).moveToElement(des).release(des).build();
//		Thread.sleep(2000);
//		dragAndDrop.perform();
		
