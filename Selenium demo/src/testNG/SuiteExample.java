package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void launchBrowser()
	{
		startTime=System.currentTimeMillis();
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\sugannat\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
	}
	@Test
	public void openGoogle()
	{
		driver.get("http://www.google.co.in");
		System.out.println("google");
	}
	@Test
	public void openYahoo()
	{
		driver.get("http://www.yahoo.com");
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
		endTime=System.currentTimeMillis();
		Long totalTime=endTime-startTime;
		System.out.println("total time"+totalTime);
	}
	
}
