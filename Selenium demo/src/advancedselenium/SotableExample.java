package advancedselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SotableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\sugannat\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> sort=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li")); 
		
		WebElement fromElement=sort.get(6);
		WebElement toElement=sort.get(0);
		
		Actions actions=new Actions(driver);
		
		actions.clickAndHold(fromElement);
		actions.moveToElement(toElement);
		actions.release(toElement);
		actions.build().perform();
	}

}
