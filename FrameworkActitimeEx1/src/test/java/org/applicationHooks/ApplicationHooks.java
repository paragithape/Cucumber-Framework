package org.applicationHooks;

//import java.io.File;
//import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.io.FileHandler;
import org.qa.factory.DriverFactory;
import org.qa.utility.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	private DriverFactory df;
	private WebDriver driver;
	private ConfigReader cr;
	Properties prop;
	
	@Before(order=0)
	public void getProperty()
	{
		cr = new ConfigReader();
		prop = cr.init_prop();
	}
	@Before(order=1)
	public void launchBrowser()
	{
		String browserName = prop.getProperty("browser");
		df = new DriverFactory();
		driver = df.init_driver(browserName);
	}
	@After(order=0)
	public void quitBrowser()
	{
		driver.quit();
	}
	@After(order=1)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
			/*try {
				//code for taking screenshot
				File scn = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scn, new File(System.getProperty("user.dir")
						+"\\screenshots\\fileName.pn"));
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		}
	}
}
