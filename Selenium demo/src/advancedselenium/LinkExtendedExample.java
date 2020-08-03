package advancedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExtendedExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\sugannat\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");

		WebElement homepage=driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		WebElement brokenLink=driver.findElement(By.linkText("Find Where"));
		brokenLink.click();
		String title=driver.getTitle();
		if (title.contains("404")) {
			System.out.println("link is broken");
			
			
		}
		
		//WebElement homepage1=driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		driver.navigate().back();
		
		
	}

}
