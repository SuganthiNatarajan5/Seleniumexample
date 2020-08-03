package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\sugannat\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.findElement(By.linkText("Go to Home Page")).click();
	}

}
