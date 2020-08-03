package advancedselenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\sugannat\\Desktop\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement input=driver.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(4000);
		
	List<WebElement> optionsList=driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
	for (WebElement webElement : optionsList) {
		if (webElement.getText().equals("Web Services")) {
			webElement.click();
			
		}
	}
	
		
		
		
	}

}
