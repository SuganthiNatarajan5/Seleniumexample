package advancedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\sugannat\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calender=driver.findElement(By.id("datepicker"));
		calender.click();
		
		WebElement nextButton=driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		
		WebElement dateGive=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		
		dateGive.click();
	}

}
