package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\sugannat\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https:\\www.google.co.in");
		//driver.quit();
		driver.findElement(By.name("q")).sendKeys("Agni"+Keys.ENTER);

	}

}
